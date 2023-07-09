package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/util/DialogDelegate;", "Lcom/dewords/pope/util/IDialogDelegate;", "()V", "observeDialogs", "", "lco", "Landroidx/lifecycle/LifecycleOwner;", "manager", "Lcom/dewords/pope/util/IDialogManager;", "DialogsListener", "pope-player_debug"})
public final class DialogDelegate implements com.dewords.pope.util.IDialogDelegate {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.DialogDelegate.DialogsListener DialogsListener = null;
    private static final videolan.org.commontools.LiveEvent<com.dewords.pope.util.DialogEvt> dialogEvt = null;
    private static int dialogCounter = 0;
    
    public DialogDelegate() {
        super();
    }
    
    @java.lang.Override()
    public void observeDialogs(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lco, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.util.IDialogManager manager) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/util/DialogDelegate$DialogsListener;", "Lorg/videolan/libvlc/Dialog$Callbacks;", "()V", "dialogCounter", "", "getDialogCounter", "()I", "setDialogCounter", "(I)V", "dialogEvt", "Lvideolan/org/commontools/LiveEvent;", "Lcom/dewords/pope/util/DialogEvt;", "onCanceled", "", "dialog", "Lorg/videolan/libvlc/Dialog;", "onDisplay", "Lorg/videolan/libvlc/Dialog$ErrorMessage;", "Lorg/videolan/libvlc/Dialog$LoginDialog;", "Lorg/videolan/libvlc/Dialog$ProgressDialog;", "Lorg/videolan/libvlc/Dialog$QuestionDialog;", "onProgressUpdate", "pope-player_debug"})
    public static final class DialogsListener implements org.videolan.libvlc.Dialog.Callbacks {
        
        private DialogsListener() {
            super();
        }
        
        public final int getDialogCounter() {
            return 0;
        }
        
        public final void setDialogCounter(int p0) {
        }
        
        @java.lang.Override()
        public void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.Dialog.ProgressDialog dialog) {
        }
        
        @java.lang.Override()
        public void onDisplay(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.Dialog.ErrorMessage dialog) {
        }
        
        @java.lang.Override()
        public void onDisplay(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.Dialog.LoginDialog dialog) {
        }
        
        @java.lang.Override()
        public void onDisplay(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.Dialog.QuestionDialog dialog) {
        }
        
        @java.lang.Override()
        public void onDisplay(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.Dialog.ProgressDialog dialog) {
        }
        
        @java.lang.Override()
        public void onCanceled(@org.jetbrains.annotations.Nullable()
        org.videolan.libvlc.Dialog dialog) {
        }
    }
}