package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/dewords/pope/gui/dialogs/VlcLoginDialog;", "Lcom/dewords/pope/gui/dialogs/VlcDialog;", "Lorg/videolan/libvlc/Dialog$LoginDialog;", "Lcom/dewords/pope/databinding/VlcLoginDialogBinding;", "Landroid/view/View$OnFocusChangeListener;", "()V", "layout", "", "getLayout", "()I", "settings", "Landroid/content/SharedPreferences;", "onAttach", "", "context", "Landroid/content/Context;", "onFocusChange", "v", "Landroid/view/View;", "hasFocus", "", "onLogin", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "store", "pope-player_debug"})
public final class VlcLoginDialog extends com.dewords.pope.gui.dialogs.VlcDialog<org.videolan.libvlc.Dialog.LoginDialog, com.dewords.pope.databinding.VlcLoginDialogBinding> implements android.view.View.OnFocusChangeListener {
    private android.content.SharedPreferences settings;
    private final int layout = 0;
    
    public VlcLoginDialog() {
        super();
    }
    
    @java.lang.Override()
    protected int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void onLogin(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    public final boolean store() {
        return false;
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.NotNull()
    android.view.View v, boolean hasFocus) {
    }
}