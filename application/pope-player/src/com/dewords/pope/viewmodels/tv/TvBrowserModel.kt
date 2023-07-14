package com.dewords.pope.viewmodels.tv

import org.videolan.resources.util.HeaderProvider

interface TvBrowserModel<T> {
    fun isEmpty() : Boolean
    var currentItem: T?
    var nbColumns: Int
    val provider: HeaderProvider
}