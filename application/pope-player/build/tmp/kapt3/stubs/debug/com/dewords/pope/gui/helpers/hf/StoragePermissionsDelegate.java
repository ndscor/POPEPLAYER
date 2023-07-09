package com.dewords.pope.gui.helpers.hf;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\bH\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/StoragePermissionsDelegate;", "Lcom/dewords/pope/gui/helpers/hf/BaseHeadlessFragment;", "()V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "askOnlyRead", "", "askedPermission", "", "firstRun", "timeAsked", "", "upgrade", "withDialog", "write", "askAllAccessPermission", "", "intent", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestStorageAccess", "Companion", "CustomActionController", "pope-player_debug"})
public final class StoragePermissionsDelegate extends com.dewords.pope.gui.helpers.hf.BaseHeadlessFragment {
    private long timeAsked = -1L;
    private int askedPermission = -1;
    private boolean firstRun = false;
    private boolean upgrade = false;
    private boolean write = false;
    private boolean withDialog = true;
    private boolean askOnlyRead = true;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> activityResultLauncher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.hf.StoragePermissionsDelegate.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/StorageHF";
    @org.jetbrains.annotations.NotNull()
    private static final videolan.org.commontools.LiveEvent<java.lang.Boolean> storageAccessGranted = null;
    
    public StoragePermissionsDelegate() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestStorageAccess(boolean write) {
    }
    
    private final void askAllAccessPermission(android.content.Intent intent) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/StoragePermissionsDelegate$CustomActionController;", "", "onStorageAccessGranted", "", "pope-player_debug"})
    public static abstract interface CustomActionController {
        
        public abstract void onStorageAccessGranted();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ3\u0010\u0014\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u0007*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001d\u0010\u0018\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/StoragePermissionsDelegate$Companion;", "", "()V", "TAG", "", "storageAccessGranted", "Lvideolan/org/commontools/LiveEvent;", "", "getStorageAccessGranted", "()Lvideolan/org/commontools/LiveEvent;", "getAction", "Ljava/lang/Runnable;", "activity", "Landroidx/fragment/app/FragmentActivity;", "firstRun", "upgrade", "askStoragePermission", "", "write", "cb", "getStoragePermission", "withDialog", "onlyMedia", "(Landroidx/fragment/app/FragmentActivity;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWritePermission", "Landroidx/fragment/app/Fragment;", "uri", "Landroid/net/Uri;", "(Landroidx/fragment/app/Fragment;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/fragment/app/FragmentActivity;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final videolan.org.commontools.LiveEvent<java.lang.Boolean> getStorageAccessGranted() {
            return null;
        }
        
        public final void askStoragePermission(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity $this$askStoragePermission, boolean write, @org.jetbrains.annotations.Nullable()
        java.lang.Runnable cb) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
        public final java.lang.Object getStoragePermission(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity $this$getStoragePermission, boolean write, boolean withDialog, boolean onlyMedia, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p4) {
            return null;
        }
        
        private final java.lang.Runnable getAction(androidx.fragment.app.FragmentActivity activity, boolean firstRun, boolean upgrade) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getWritePermission(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity $this$getWritePermission, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getWritePermission(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment $this$getWritePermission, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
            return null;
        }
    }
}