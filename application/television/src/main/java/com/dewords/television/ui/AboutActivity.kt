package com.dewords.television.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.dewords.poperesources.util.applyOverscanMargin
import com.dewords.television.R
import com.dewords.pope.gui.helpers.UiTools

class AboutActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        UiTools.fillAboutView(this, window.decorView.rootView)
        applyOverscanMargin(this)
        this.registerTimeView(findViewById(R.id.tv_time))
    }
}
