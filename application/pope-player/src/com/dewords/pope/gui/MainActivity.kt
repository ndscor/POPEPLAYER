/*****************************************************************************
 * MainActivity.java
 *
 * Copyright © 2011-2019 VLC authors and VideoLAN
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston MA 02110-1301, USA.
 */

package com.dewords.pope.gui

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.app.UiModeManager
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.view.ActionMode
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceManager
import com.dewords.pope.R
import com.dewords.pope.StartActivity
import com.dewords.pope.gui.audio.AudioBrowserFragment
import com.dewords.pope.gui.browser.BaseBrowserFragment
import com.dewords.pope.gui.dialogs.AllAccessPermissionDialog
import com.dewords.pope.gui.dialogs.NotificationPermissionManager
import com.dewords.pope.gui.helpers.INavigator
import com.dewords.pope.gui.helpers.Navigator
import com.dewords.pope.gui.helpers.UiTools
import com.dewords.pope.gui.helpers.UiTools.isTablet
import com.dewords.pope.gui.preferences.PreferencesActivity
import com.dewords.pope.gui.video.VideoGridFragment
import com.dewords.pope.interfaces.Filterable
import com.dewords.pope.interfaces.IRefreshable
import com.dewords.pope.media.MediaUtils
import com.dewords.pope.reloadLibrary
import com.dewords.pope.util.Permissions
import com.dewords.pope.util.Util
import com.dewords.pope.util.WidgetMigration
import com.dewords.pope.util.getScreenWidth
import com.dewords.poperesources.*
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.videolan.libvlc.util.AndroidUtil
import org.videolan.medialibrary.interfaces.Medialibrary
import org.videolan.tools.*
import java.util.concurrent.TimeUnit

private const val TAG = "VLC/MainActivity"

class MainActivity : ContentActivity(),
        INavigator by Navigator()
{
    var refreshing: Boolean = false
        set(value) {
            field = value
        }


    private lateinit var mediaLibrary: Medialibrary
    private var scanNeeded = false
    private lateinit var toolbarIcon: ImageView

    override fun getSnackAnchorView(overAudioPlayer:Boolean): View? {
        val view = super.getSnackAnchorView(overAudioPlayer)
        return if (view?.id == android.R.id.content && !isTablet()) {if(overAudioPlayer) findViewById(android.R.id.content) else findViewById(R.id.appbar)} else view
    }

        @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Util.checkCpuCompatibility(this)

        /*** Start initializing the UI  */
        setContentView(R.layout.main)
            val uiModeManager = this.getSystemService(UI_MODE_SERVICE)

            if (uiModeManager == UiModeManager.MODE_NIGHT_YES) {
                this.window.statusBarColor = 0xFFFFFF


            } else if (uiModeManager == UiModeManager.MODE_NIGHT_NO) {
                this.window.statusBarColor = 0x000000

            }



            initAudioPlayerContainerActivity()
        setupNavigation(savedInstanceState)

        prepareActionBar()
            prepareBottomBar()
        scanNeeded = savedInstanceState == null && settings.getBoolean(KEY_MEDIALIBRARY_AUTO_RESCAN, true)
        mediaLibrary = Medialibrary.getInstance()

        WidgetMigration.launchIfNeeded(this)
        NotificationPermissionManager.launchIfNeeded(this)
    }

    override fun onResume() {
        super.onResume()
        prepareActionBar()
        prepareBottomBar()
        //Only the partial permission is granted for Android 11+
        if (!settings.getBoolean(PERMISSION_NEVER_ASK, false) && settings.getLong(PERMISSION_NEXT_ASK, 0L) < System.currentTimeMillis() && Permissions.canReadStorage(this) && !Permissions.hasAllAccess(this)) {
            UiTools.snackerMessageInfinite(this, getString(R.string.partial_content))?.setAction(R.string.more) {
                AllAccessPermissionDialog.newInstance().show(supportFragmentManager, AllAccessPermissionDialog::class.simpleName)
            }?.show()
            settings.putSingle(PERMISSION_NEXT_ASK, System.currentTimeMillis() + TimeUnit.DAYS.toMillis(2))
        }
        configurationChanged(getScreenWidth())
    }

    private fun prepareActionBar() {

        val sharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(this)
        // enter the key from your xml and the default value
        // enter the key from your xml and the default value
        val value = sharedPreferences.getBoolean("pref_sync", false)

        if (value) {
            setstatusbar()
            val color: Int = PreferencesActivity.Companion.getPrimaryColor()
            val mToolbar = findViewById<Toolbar>(R.id.main_toolbar)
            val appBarLayout = findViewById<AppBarLayout>(R.id.appbar)
            appBarLayout.setBackgroundColor(color)
            mToolbar.setBackgroundColor(color)
            appBarLayout.setBackgroundColor(color)

        } else {


        }

        toolbarIcon = findViewById(R.id.toolbar_icon)



        updateIncognitoModeIcon()
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
            setDisplayShowTitleEnabled(false)
        }
    }


    private fun prepareBottomBar() {

        val sharedPreferences: SharedPreferences =
            PreferenceManager.getDefaultSharedPreferences(this)
        // enter the key from your xml and the default value
        // enter the key from your xml and the default value
        val value = sharedPreferences.getBoolean("pref_sync", false)

        if (value) {
            val color: Int = PreferencesActivity.Companion.getBottomColor()
            val mBottomBar = findViewById<BottomNavigationView>(R.id.navigation)
            mBottomBar.setBackgroundColor(color)

        } else {


        }

    }



        override fun onStart() {
        super.onStart()
        if (mediaLibrary.isInitiated) {
            /* Load media items from database and storage */
            if (scanNeeded && Permissions.canReadStorage(this) && !mediaLibrary.isWorking) this.reloadLibrary()
        }
    }

    override fun onStop() {
        super.onStop()
        if (changingConfigurations == 0) {
            /* Check for an ongoing scan that needs to be resumed during onResume */
            scanNeeded = mediaLibrary.isWorking
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        val current = currentFragment
        supportFragmentManager.putFragment(outState, "current_fragment", current!!)
        outState.putInt(EXTRA_TARGET, currentFragmentId)
        super.onSaveInstanceState(outState)
    }

    override fun onRestart() {
        super.onRestart()
        /* Reload the latest preferences */
        reloadPreferences()
    }

    @TargetApi(Build.VERSION_CODES.N)
    override fun onBackPressed() {


        /* Close playlist search if open or Slide down the audio player if it is shown entirely. */
        if (isAudioPlayerReady && (audioPlayer.backPressed() || slideDownAudioPlayer()))
            return

        // If it's the directory view, a "backpressed" action shows a parent.
        val fragment = currentFragment
        if (fragment is BaseBrowserFragment && fragment.goBack()) {
            return
        }
        if (AndroidUtil.isNougatOrLater && isInMultiWindowMode) {
            UiTools.confirmExit(this)
            return
        }
        finish()
    }

    override fun startSupportActionMode(callback: ActionMode.Callback): ActionMode? {
        appBarLayout.setExpanded(true)
        return super.startSupportActionMode(callback)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.findItem(R.id.ml_menu_refresh)?.isVisible = Permissions.canReadStorage(this)
        menu?.findItem(R.id.incognito_mode)?.isChecked = Settings.getInstance(this).getBoolean(KEY_INCOGNITO, false)
        return super.onPrepareOptionsMenu(menu)
    }

    /**
     * Handle onClick form menu buttons
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId != R.id.ml_menu_filter) UiTools.setKeyboardVisibility(appBarLayout, false)

        // Handle item selection
        return when (item.itemId) {
            // Refresh
            R.id.ml_menu_refresh -> {
                if (Permissions.canReadStorage(this)) forceRefresh()
                true
            }
            R.id.incognito_mode -> {
                Settings.getInstance (this).putSingle(KEY_INCOGNITO, !Settings.getInstance(this).getBoolean(KEY_INCOGNITO, false))
                item.isChecked = !item.isChecked
                updateIncognitoModeIcon()
                true
            }
            android.R.id.home ->
                // Slide down the audio player or toggle the sidebar
                slideDownAudioPlayer()
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun updateIncognitoModeIcon() {
        val incognito = Settings.getInstance (this).getBoolean(KEY_INCOGNITO, false)
        toolbarIcon.setImageDrawable(ContextCompat.getDrawable(this, if (incognito) R.drawable.ic_incognito else R.mipmap.pope_launcher))

    }

    override fun onMenuItemActionExpand(item: MenuItem): Boolean {
        return if (currentFragment is Filterable) {
            (currentFragment as Filterable).allowedToExpand()
        } else false
    }

    fun forceRefresh() {
        forceRefresh(currentFragment)
    }

    private fun forceRefresh(current: Fragment?) {
        if (!mediaLibrary.isWorking) {
            if (current != null && current is IRefreshable)
                (current as IRefreshable).refresh()
            else
                reloadLibrary()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        if (VLCBilling.getInstance(this.application).iabHelper.handleActivityResult(requestCode, resultCode, data)) return
        if (requestCode == ACTIVITY_RESULT_PREFERENCES) {
            when (resultCode) {
                RESULT_RESCAN -> this.reloadLibrary()
                RESULT_RESTART, RESULT_RESTART_APP -> {
                    val intent = Intent(this@MainActivity, if (resultCode == RESULT_RESTART_APP) StartActivity::class.java else MainActivity::class.java)
                    finish()
                    startActivity(intent)
                }
                RESULT_UPDATE_SEEN_MEDIA -> for (fragment in supportFragmentManager.fragments)
                    if (fragment is VideoGridFragment)
                        fragment.updateSeenMediaMarker()
                RESULT_UPDATE_ARTISTS -> {
                    val fragment = currentFragment
                    if (fragment is AudioBrowserFragment) fragment.viewModel.refresh()
                }
            }
        } else if (requestCode == ACTIVITY_RESULT_OPEN && resultCode == Activity.RESULT_OK) {
            MediaUtils.openUri(this, data!!.data)
        } else if (requestCode == ACTIVITY_RESULT_SECONDARY) {
            if (resultCode == RESULT_RESCAN) {
                forceRefresh(currentFragment)
            } else {
                scanNeeded = false
            }
        }
    }

    // Note. onKeyDown will not occur while moving within a list
    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_SEARCH) {
            toolbar.menu.findItem(R.id.ml_menu_filter).expandActionView()
        }
        return super.onKeyDown(keyCode, event)
    }
}
