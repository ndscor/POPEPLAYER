package com.dewords.pope.gui.helpers.hf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u0006H\u0003J\b\u0010\u0010\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/WriteExternalDelegate;", "Lcom/dewords/pope/gui/helpers/hf/BaseHeadlessFragment;", "()V", "storage", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "showHelpDialog", "Companion", "pope-player_debug"})
public final class WriteExternalDelegate extends com.dewords.pope.gui.helpers.hf.BaseHeadlessFragment {
    private java.lang.String storage;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.hf.WriteExternalDelegate.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/WriteExternal";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_STORAGE_PATH = "VLC/storage_path";
    private static final int REQUEST_CODE_STORAGE_ACCESS = 42;
    
    public WriteExternalDelegate() {
        super();
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final void showDialog() {
    }
    
    private final void showHelpDialog() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/WriteExternalDelegate$Companion;", "", "()V", "KEY_STORAGE_PATH", "", "REQUEST_CODE_STORAGE_ACCESS", "", "TAG", "askForExtWrite", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "uri", "Landroid/net/Uri;", "cb", "Ljava/lang/Runnable;", "needsWritePermission", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void askForExtWrite(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.Runnable cb) {
        }
        
        public final boolean needsWritePermission(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return false;
        }
    }
}