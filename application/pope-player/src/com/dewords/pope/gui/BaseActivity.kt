package com.dewords.pope.gui

import android.Manifest
import android.app.Activity
import android.app.UiModeManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.DocumentsContract
import android.util.TypedValue
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.BaseContextWrappingDelegate
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.window.layout.WindowInfoTracker
import androidx.window.layout.WindowLayoutInfo
import com.dewords.pope.R
import com.dewords.pope.gui.helpers.UiTools
import com.dewords.pope.gui.helpers.applyTheme
import com.dewords.pope.gui.preferences.PreferencesActivity
import com.dewords.pope.interfaces.SystemBarTintManager
import com.dewords.pope.interfaces.Utils
import com.dewords.pope.media.MediaUtils
import com.dewords.pope.util.FileUtils
import com.google.android.material.snackbar.Snackbar
import org.videolan.resources.AppContextProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.videolan.tools.KeyHelper
import org.videolan.tools.Settings
import org.videolan.tools.getContextWithLocale
import org.videolan.tools.setGone


abstract class BaseActivity : AppCompatActivity() {

    open fun getPermissionsToRequest(): Array<String> {
        return arrayOf()
    }


    private var hadPermissions: Boolean = false
    private lateinit var permissions: Array<String>
    private var permissionDeniedMessage: String? = null




    private var currentNightMode: Int = 0
    private var startColor: Int = 0
    lateinit var settings: SharedPreferences
    var windowLayoutInfo: WindowLayoutInfo? = null
    open val displayTitle = false
    open fun forcedTheme():Int? = null
    abstract fun getSnackAnchorView(overAudioPlayer:Boolean = false): View?
    private var baseContextWrappingDelegate: AppCompatDelegate? = null
    private var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            FileUtils.getUri(result.data?.data)?.let { MediaUtils.openMediaNoUi(it) }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        settings = Settings.getInstance(this)
        /* Theme must be applied before super.onCreate */
        applyTheme()
        permissions = getPermissionsToRequest()
        hadPermissions = hasPermissions()
        permissionDeniedMessage = null
        val uiModeManager = this.getSystemService(UI_MODE_SERVICE)


        if (uiModeManager == UiModeManager.MODE_NIGHT_YES) {
            this.window.statusBarColor = 0xFFFFFF


        } else if (uiModeManager == UiModeManager.MODE_NIGHT_NO) {
            this.window.statusBarColor = 0x000000

        }



        super.onCreate(savedInstanceState)
        if (UiTools.currentNightMode != resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            UiTools.invalidateBitmaps()
            UiTools.currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        }

        lifecycleScope.launch(Dispatchers.Main) {
            lifecycle.repeatOnLifecycle(Lifecycle.State.RESUMED) {
                WindowInfoTracker.getOrCreate(this@BaseActivity)
                        .windowLayoutInfo(this@BaseActivity)
                        .collect { layoutInfo ->
                            windowLayoutInfo = layoutInfo
                        }
            }
        }
    }


    override fun onResume() {
        super.onResume()
        val hasPermissions = hasPermissions()
        if (hasPermissions != hadPermissions) {
            hadPermissions = hasPermissions
            if (VersionUtils.hasMarshmallow()) {
                onHasPermissionsChanged(hasPermissions)
            }
        }
    }


    protected fun hasPermissions(): Boolean {
        for (permission in permissions) {
            if (ActivityCompat.checkSelfPermission(this,
                    permission) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
        return true
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray,
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST) {
            for (grantResult in grantResults) {
                if (grantResult != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(
                            this@BaseActivity, Manifest.permission.READ_EXTERNAL_STORAGE,
                        ) || ActivityCompat.shouldShowRequestPermissionRationale(
                            this@BaseActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        )
                    ) {
                        // User has deny from permission dialog
                        snackBarContainer?.let {
                            Snackbar.make(
                                it,
                                permissionDeniedMessage!!,
                                Snackbar.LENGTH_SHORT
                            )
                                .setAction(R.string.action_grant) { requestPermissions() }
                                .show()
                        }
                    } else {
                        // User has deny permission and checked never show permission dialog so you can redirect to Application settings page
                        snackBarContainer?.let {
                            Snackbar.make(
                                it,
                                permissionDeniedMessage!!,
                                Snackbar.LENGTH_INDEFINITE
                            )
                                .setAction(R.string.action_settings) {
                                    val intent = Intent()
                                    intent.action = android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                                    val uri = Uri.fromParts(
                                        "package",
                                        this@BaseActivity.packageName,
                                        null
                                    )
                                    intent.data = uri
                                    startActivity(intent)
                                }.show()
                        }
                    }
                    return
                }
            }
            hadPermissions = true
            onHasPermissionsChanged(true)


        }
    }

    protected open fun onHasPermissionsChanged(hasPermissions: Boolean) {
        // implemented by sub classes
    }




    open fun setstatusbar() {
        val color: Int = Utils.getStatusBarColor(PreferencesActivity.getPrimaryColor())
        if (Utils.hasLollipop()) {

        } else if (Utils.hasKitKat()) {
            val systemBarTintManager = SystemBarTintManager(this)
            systemBarTintManager.setTintColor(Utils.getStatusBarColor(color))
            systemBarTintManager.isStatusBarTintEnabled = true
        }
    }


    private val snackBarContainer: View?
        get() = getSnackAnchorView()




    protected open fun requestPermissions() {
        ActivityCompat.requestPermissions(this, permissions, PERMISSION_REQUEST)
    }


    companion object {
        const val PERMISSION_REQUEST = 100
    }


    @RequiresApi(Build.VERSION_CODES.O)
    fun openFile(pickerInitialUri: Uri) {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
                addCategory(Intent.CATEGORY_OPENABLE)
                type = "*/*"
                putExtra(DocumentsContract.EXTRA_INITIAL_URI, pickerInitialUri)
            }
            resultLauncher.launch(intent)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        if (displayTitle) {
            findViewById<View>(R.id.toolbar_icon).setGone()
            findViewById<View>(R.id.toolbar_vlc_title).setGone()
        }
    }

    override fun getDelegate() = baseContextWrappingDelegate
            ?: BaseContextWrappingDelegate(super.getDelegate()).apply { baseContextWrappingDelegate = this }

    override fun createConfigurationContext(overrideConfiguration: Configuration) = super.createConfigurationContext(overrideConfiguration).getContextWithLocale(AppContextProvider.locale)

    override fun getApplicationContext(): Context {
        return super.getApplicationContext().getContextWithLocale(AppContextProvider.locale)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        KeyHelper.manageModifiers(event)
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        KeyHelper.manageModifiers(event)
        return super.onKeyUp(keyCode, event)
    }

    override fun onSupportActionModeStarted(mode: androidx.appcompat.view.ActionMode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            val typedValue = TypedValue()
            theme.resolveAttribute(R.attr.actionModeBackground, typedValue, true)
        }
        super.onSupportActionModeStarted(mode)
    }

    override fun onSupportActionModeFinished(mode: androidx.appcompat.view.ActionMode) {
        super.onSupportActionModeFinished(mode)
    }
}
