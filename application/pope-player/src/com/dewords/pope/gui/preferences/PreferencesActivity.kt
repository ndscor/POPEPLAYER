/*****************************************************************************
 * PreferencesActivity.java
 *
 * Copyright © 2011-2014 VLC authors and VideoLAN
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

package com.dewords.pope.gui.preferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Switch
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.fragment.app.FragmentActivity
import com.dewords.pope.PlaybackService
import com.dewords.pope.R
import com.dewords.pope.VLCApplication.Companion.sInstance
import com.dewords.pope.gui.BaseActivity
import com.dewords.pope.gui.preferences.search.PreferenceItem
import com.dewords.pope.gui.preferences.search.PreferenceParser
import com.dewords.pope.gui.preferences.search.PreferenceSearchActivity
import com.dewords.pope.interfaces.SystemBarTintManager
import com.dewords.pope.interfaces.Utils
import com.dewords.poperesources.ACTIVITY_RESULT_PREFERENCES
import com.dewords.poperesources.util.parcelable
import com.google.android.material.appbar.AppBarLayout
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.videolan.tools.RESULT_RESTART
import org.videolan.tools.RESULT_RESTART_APP
import org.videolan.tools.RESULT_UPDATE_ARTISTS


const val EXTRA_PREF_END_POINT = "extra_pref_end_point"
class PreferencesActivity : BaseActivity() {


    private val searchRequestCode = 167
    private var mAppBarLayout: AppBarLayout? = null
    override val displayTitle = true
    override fun getSnackAnchorView(overAudioPlayer:Boolean): View? = findViewById(android.R.id.content)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.preferences_activity)



        val sharedPreferences: SharedPreferences =
                androidx.preference.PreferenceManager.getDefaultSharedPreferences(this)
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


        setSupportActionBar(findViewById<View>(R.id.main_toolbar) as Toolbar)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_placeholder, PreferencesFragment().apply { if (intent.hasExtra(EXTRA_PREF_END_POINT)) arguments = bundleOf(EXTRA_PREF_END_POINT to intent.parcelable(EXTRA_PREF_END_POINT)) })
                    .commit()
        }
        mAppBarLayout = findViewById(R.id.appbar)
        mAppBarLayout!!.post { ViewCompat.setElevation(mAppBarLayout!!, resources.getDimensionPixelSize(R.dimen.default_appbar_elevation).toFloat()) }
    }


    override fun setstatusbar() {
        val color: Int = Utils.getStatusBarColor(getStatusbarcolor())
        if (Utils.hasLollipop()) {
            window.statusBarColor = color
        } else if (Utils.hasKitKat()) {
            val systemBarTintManager = SystemBarTintManager(this)
            systemBarTintManager.setTintColor(Utils.getStatusBarColor(color))
            systemBarTintManager.isStatusBarTintEnabled = true
        }
    }



    fun changeActionBarColor(newColor: Int) {


        val sharedPreferences: SharedPreferences =
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(this)
        // enter the key from your xml and the default value
        // enter the key from your xml and the default value
        val value = sharedPreferences.getBoolean("pref_sync", false)

        if (value) {
            setUpStatusBar()
            val color: Int = getPrimaryColor()
            val mToolbar = findViewById<Toolbar>(R.id.main_toolbar)
            val appBarLayout = findViewById<AppBarLayout>(R.id.appbar)
            appBarLayout.setBackgroundColor(color)
            mToolbar.setBackgroundColor(color)
            appBarLayout.setBackgroundColor(color)

        } else {


        }

    }

    fun changeStatusbar(newColor: Int) {
        window.statusBarColor = newColor
    }

    fun changebottombar(newColor: Int) {
        window.navigationBarColor = newColor
    }



    fun setUpStatusBar() {
        val color = Utils.getStatusBarColor(getStatusbarcolor(this))
        if (Utils.hasLollipop()) {
            window.statusBarColor = color
        } else if (Utils.hasKitKat()) {
            val systemBarTintManager = SystemBarTintManager(this)
            systemBarTintManager.setTintColor(color)
            systemBarTintManager.isStatusBarTintEnabled = true
        }
    }

    internal fun expandBar() {
        mAppBarLayout!!.setExpanded(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.activity_prefs, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                if (!supportFragmentManager.popBackStackImmediate())
                    finish()
                return true
            }
            R.id.menu_pref_search -> {
                startActivityForResult(Intent(this, PreferenceSearchActivity::class.java), searchRequestCode)
            }
        }
        return super.onOptionsItemSelected(item)
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == searchRequestCode && resultCode == RESULT_OK) {
            data?.extras?.parcelable<PreferenceItem>(EXTRA_PREF_END_POINT)?.let {
                supportFragmentManager.popBackStack()
                supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_placeholder, PreferencesFragment().apply { arguments = bundleOf(EXTRA_PREF_END_POINT to it) })
                        .commit()
            }
        }

    }

    fun exitAndRescan() {
        setRestart()
        val intent = intent
        finish()
        startActivity(intent)
    }

    fun setRestart() {
        setResult(RESULT_RESTART)
    }

    fun setRestartApp() {
        setResult(RESULT_RESTART_APP)
    }

    fun updateArtists() {
        setResult(RESULT_UPDATE_ARTISTS)
    }

    fun detectHeadset(detect: Boolean) {
        val le = PlaybackService.headSetDetection
        if (le.hasObservers()) le.value = detect
    }

    companion object {
        /**
         * Launch the preferences and redirect to a given preference
         * @param activity The calling activity
         * @param prefKey The preference key to redirect to
         * @throws NoSuchElementException if the key is not found
         */

        const val KEY_THEME_STYLE: String = "themeStyle"

        const val KEY_PRIMARY_COLOR = "tool_bar"
        const val KEY_STATUS_COLOR = "status_bar"
        const val KEY_ACCENT_COLOR = "accentColor"
        const val KEY_BOTTOM_COLOR = "bottomColor"

        private var oldBackground: Drawable? = null


        fun setAccentColor(color: Int) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(sInstance.baseContext)
            val editor = preferences.edit()
            editor.putInt(KEY_ACCENT_COLOR, color)
            editor.commit()
        }


        fun getStatusbarcolor(context: Context?): Int {
            val newColor = ContextCompat.getColor(context!!, R.color.primaryColor)
            return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(KEY_STATUS_COLOR, newColor)
        }

        fun getStatusbarcolor(): Int {
            return PreferenceManager.getDefaultSharedPreferences(sInstance.baseContext)
                .getInt(KEY_STATUS_COLOR, Color.parseColor("#0288D1"))
        }



        fun getPrimaryColor(context: Context?): Int {
            val newColor = ContextCompat.getColor(context!!, R.color.primaryColor)
            return PreferenceManager.getDefaultSharedPreferences(context)
                .getInt(KEY_PRIMARY_COLOR, newColor)
        }

        fun getPrimaryColor(): Int {
            return PreferenceManager.getDefaultSharedPreferences(sInstance.baseContext)
                .getInt(KEY_PRIMARY_COLOR, Color.parseColor("#0288D1"))
        }

        fun getBottomColor(): Int {
            return PreferenceManager.getDefaultSharedPreferences(sInstance.baseContext)
                .getInt(KEY_BOTTOM_COLOR, Color.parseColor("#0288D1"))
        }



        fun getAccentColor(): Int {
            return PreferenceManager.getDefaultSharedPreferences(sInstance.baseContext)
                .getInt(KEY_ACCENT_COLOR, Color.parseColor("#EF3A0F"))
        }




        suspend fun launchWithPref(activity: FragmentActivity, prefKey:String) {
            val pref = withContext(Dispatchers.IO) {
                PreferenceParser.parsePreferences(activity)
            }.first { it.key == prefKey }
            val intent = Intent(activity, PreferencesActivity::class.java)
            intent.putExtra(EXTRA_PREF_END_POINT, pref)
            activity.startActivityForResult(intent, ACTIVITY_RESULT_PREFERENCES)
        }
    }
}
