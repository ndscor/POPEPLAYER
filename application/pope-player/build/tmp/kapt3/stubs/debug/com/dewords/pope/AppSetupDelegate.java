package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J\f\u0010\f\u001a\u00020\r*\u00020\u000bH\u0017J\r\u0010\u000e\u001a\u00020\r*\u00020\u000bH\u0096\u0001J\r\u0010\u000f\u001a\u00020\r*\u00020\u000bH\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/AppSetupDelegate;", "Lcom/dewords/pope/AppDelegate;", "Lcom/dewords/pope/delegates/IMediaContentDelegate;", "Lcom/dewords/pope/player/delegates/IIndexersDelegate;", "()V", "appContextProvider", "Lcom/dewords/poperesources/AppContextProvider;", "getAppContextProvider", "()Lcom/dewords/poperesources/AppContextProvider;", "backgroundInit", "Lkotlinx/coroutines/Job;", "Landroid/content/Context;", "setupApplication", "", "setupContentResolvers", "setupIndexers", "pope-player_debug"})
public final class AppSetupDelegate implements com.dewords.pope.AppDelegate, com.dewords.pope.delegates.IMediaContentDelegate, com.dewords.pope.player.delegates.IIndexersDelegate {
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.poperesources.AppContextProvider appContextProvider = null;
    
    public AppSetupDelegate() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.poperesources.AppContextProvider getAppContextProvider() {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void setupApplication(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setupApplication) {
    }
    
    private final kotlinx.coroutines.Job backgroundInit(android.content.Context $this$backgroundInit) {
        return null;
    }
    
    @java.lang.Override()
    public void setupContentResolvers(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setupContentResolvers) {
    }
    
    @java.lang.Override()
    public void setupIndexers(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setupIndexers) {
    }
}