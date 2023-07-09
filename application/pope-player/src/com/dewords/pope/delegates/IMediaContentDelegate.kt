package com.dewords.pope.delegates

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import kotlinx.coroutines.launch
import com.dewords.poperesources.ACTION_OPEN_CONTENT
import com.dewords.poperesources.EXTRA_CONTENT_ID
import org.videolan.tools.AppScope
import org.videolan.tools.localBroadcastManager
import com.dewords.pope.media.MediaUtils
import com.dewords.pope.provider.MediaScrapingTvshowProvider


internal interface IMediaContentDelegate {
    fun Context.setupContentResolvers()
}

internal class MediaContentDelegate : BroadcastReceiver(), IMediaContentDelegate {
    override fun Context.setupContentResolvers() {
        localBroadcastManager.registerReceiver(this@MediaContentDelegate, IntentFilter(ACTION_OPEN_CONTENT))
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (context == null) return
        val id = intent?.getStringExtra(EXTRA_CONTENT_ID) ?: return
        AppScope.launch {
            val provider = MediaScrapingTvshowProvider.getProviders().firstOrNull { id.startsWith(it.prefix) } ?: return@launch
            provider.getList(context, id)?.let { results ->
                MediaUtils.openList(context, results.first, results.second)
            }
        }
    }
}
