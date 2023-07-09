package com.dewords.pope;

import java.lang.System;

/**
 * @see com.dewords.pope.viewmodels.ICallBackHandler
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/dewords/pope/IMediaBrowserCallback;", "", "registerHistoryCallback", "", "callback", "Lkotlin/Function0;", "registerMediaCallback", "removeCallbacks", "pope-player_debug"})
public abstract interface IMediaBrowserCallback {
    
    public abstract void registerHistoryCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback);
    
    public abstract void registerMediaCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback);
    
    public abstract void removeCallbacks();
}