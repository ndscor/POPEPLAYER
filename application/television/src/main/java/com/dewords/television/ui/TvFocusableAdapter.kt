package com.dewords.television.ui

import com.dewords.poperesources.interfaces.FocusListener

/**
 * Callback used when the adapter is used in a [FocusableRecyclerView]
 */
interface TvFocusableAdapter {
    fun setOnFocusChangeListener(focusListener: FocusListener?)
}