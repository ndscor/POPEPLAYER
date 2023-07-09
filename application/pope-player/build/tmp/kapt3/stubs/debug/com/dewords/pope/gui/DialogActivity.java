package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/gui/DialogActivity;", "Lcom/dewords/pope/gui/BaseActivity;", "()V", "getSnackAnchorView", "Landroid/view/View;", "overAudioPlayer", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupDeviceDialog", "setupServerDialog", "setupSubsDialog", "Companion", "pope-player_debug"})
public final class DialogActivity extends com.dewords.pope.gui.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.DialogActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static org.videolan.libvlc.Dialog dialog;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SERVER = "serverDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SUBS_DL = "subsdlDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DEVICE = "deviceDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DIALOG = "vlcDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MEDIALIST = "extra_media_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MEDIA = "extra_media";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PATH = "extra_path";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_UUID = "extra_uuid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SCAN = "extra_scan";
    
    public DialogActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getSnackAnchorView(boolean overAudioPlayer) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupDeviceDialog() {
    }
    
    private final void setupServerDialog() {
    }
    
    private final void setupSubsDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/gui/DialogActivity$Companion;", "", "()V", "EXTRA_MEDIA", "", "EXTRA_MEDIALIST", "EXTRA_PATH", "EXTRA_SCAN", "EXTRA_UUID", "KEY_DEVICE", "KEY_DIALOG", "KEY_SERVER", "KEY_SUBS_DL", "dialog", "Lorg/videolan/libvlc/Dialog;", "getDialog", "()Lorg/videolan/libvlc/Dialog;", "setDialog", "(Lorg/videolan/libvlc/Dialog;)V", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.videolan.libvlc.Dialog getDialog() {
            return null;
        }
        
        public final void setDialog(@org.jetbrains.annotations.Nullable()
        org.videolan.libvlc.Dialog p0) {
        }
    }
}