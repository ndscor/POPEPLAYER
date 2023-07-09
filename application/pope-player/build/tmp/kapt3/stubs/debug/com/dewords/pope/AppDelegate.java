package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/AppDelegate;", "", "appContextProvider", "Lcom/dewords/poperesources/AppContextProvider;", "getAppContextProvider", "()Lcom/dewords/poperesources/AppContextProvider;", "setupApplication", "", "Landroid/content/Context;", "pope-player_debug"})
public abstract interface AppDelegate {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.poperesources.AppContextProvider getAppContextProvider();
    
    public abstract void setupApplication(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setupApplication);
}