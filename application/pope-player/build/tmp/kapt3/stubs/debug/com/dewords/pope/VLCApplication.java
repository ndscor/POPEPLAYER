package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0097\u0001J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0017J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u00130\u0013H\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u00140\u0014H\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u00150\u0015H\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u00160\u0016H\u0097\u0001J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0019\u0010\u0018\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u00150\u0015H\u0097\u0001J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\r\u0010\u001c\u001a\u00020\n*\u00020\u001dH\u0096\u0001R\u0012\u0010\u0005\u001a\u00020\u0006X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/VLCApplication;", "Landroidx/multidex/MultiDexApplication;", "Lorg/videolan/libvlc/Dialog$Callbacks;", "Lcom/dewords/pope/AppDelegate;", "()V", "appContextProvider", "Lcom/dewords/poperesources/AppContextProvider;", "getAppContextProvider", "()Lcom/dewords/poperesources/AppContextProvider;", "onCanceled", "", "p0", "Lorg/videolan/libvlc/Dialog;", "kotlin.jvm.PlatformType", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onDisplay", "Lorg/videolan/libvlc/Dialog$ErrorMessage;", "Lorg/videolan/libvlc/Dialog$LoginDialog;", "Lorg/videolan/libvlc/Dialog$ProgressDialog;", "Lorg/videolan/libvlc/Dialog$QuestionDialog;", "onLowMemory", "onProgressUpdate", "onTrimMemory", "level", "", "setupApplication", "Landroid/content/Context;", "Companion", "pope-player_debug"})
public final class VLCApplication extends androidx.multidex.MultiDexApplication implements org.videolan.libvlc.Dialog.Callbacks, com.dewords.pope.AppDelegate {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.VLCApplication.Companion Companion = null;
    private static com.dewords.pope.VLCApplication sInstance;
    
    public VLCApplication() {
        super();
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    /**
     * Called when the overall system is running low on memory
     */
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onTrimMemory(int level) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.poperesources.AppContextProvider getAppContextProvider() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onCanceled(org.videolan.libvlc.Dialog p0) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onDisplay(org.videolan.libvlc.Dialog.ErrorMessage p0) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onDisplay(org.videolan.libvlc.Dialog.LoginDialog p0) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onDisplay(org.videolan.libvlc.Dialog.ProgressDialog p0) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onDisplay(org.videolan.libvlc.Dialog.QuestionDialog p0) {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onProgressUpdate(org.videolan.libvlc.Dialog.ProgressDialog p0) {
    }
    
    @java.lang.Override()
    public void setupApplication(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setupApplication) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/VLCApplication$Companion;", "", "()V", "<set-?>", "Lcom/dewords/pope/VLCApplication;", "sInstance", "getSInstance", "()Lcom/dewords/pope/VLCApplication;", "setSInstance", "(Lcom/dewords/pope/VLCApplication;)V", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.VLCApplication getSInstance() {
            return null;
        }
        
        private final void setSInstance(com.dewords.pope.VLCApplication p0) {
        }
    }
}