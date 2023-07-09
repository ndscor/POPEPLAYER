package com.dewords.pope.gui.dialogs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.dewords.pope.R
import com.dewords.pope.StartActivity
import com.dewords.pope.databinding.DialogExtDeviceBinding
import com.dewords.pope.gui.helpers.MedialibraryUtils
import com.dewords.poperesources.EXTRA_PATH

private const val TAG = "VLC/DeviceDialog"

class DeviceDialog : DialogFragment() {

    private lateinit var path : String
    private lateinit var uuid : String
    private var scan = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, 0)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog?.setTitle(getString(R.string.device_dialog_title))
        val binding = DialogExtDeviceBinding.inflate(inflater, container, false)
        binding.handler = clickHandler
        if (scan) binding.extDeviceScan.visibility = View.VISIBLE
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            delay(30_000L)
            dismissAllowingStateLoss()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        activity?.finish()
    }


    fun setDevice(path: String, uuid: String, scan: Boolean) {
        this.path = path
        this.uuid = uuid
        this.scan = scan
    }

    private val clickHandler = object : ExtDeviceHandler {
        override fun browse(v: View) {
            context?.applicationContext?.let {
                it.startActivity(Intent(it, StartActivity::class.java).putExtra(EXTRA_PATH, path).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            }
            dismiss()
        }

        override fun scan(v: View) {
            context?.let {
                MedialibraryUtils.addDevice(path, it.applicationContext)
                it.startActivity(Intent(it, StartActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            }
            dismiss()
        }

        override fun cancel(v: View) {
            dismiss()
        }

    }
}

interface ExtDeviceHandler {
    fun browse(v: View)
    fun scan(v: View)
    fun cancel(v: View)
}