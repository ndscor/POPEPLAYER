package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010 J%\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\"J%\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0014\u0010$\u001a\u00020\u00162\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0016R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\'"}, d2 = {"Lcom/dewords/pope/gui/browser/BrowserContainerImpl;", "T", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "scannedDirectory", "", "mrl", "", "isRootDirectory", "isNetwork", "isFile", "inCards", "(ZLjava/lang/String;ZZZZ)V", "getInCards", "()Z", "getMrl", "()Ljava/lang/String;", "getScannedDirectory", "containerActivity", "", "getStorageDelegate", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "onClick", "", "v", "Landroid/view/View;", "position", "", "item", "(Landroid/view/View;ILjava/lang/Object;)V", "onCtxClick", "onImageClick", "onItemFocused", "(Landroid/view/View;Ljava/lang/Object;)V", "onLongClick", "(Landroid/view/View;ILjava/lang/Object;)Z", "onMainActionClick", "onUpdateFinished", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "pope-player_debug"})
public final class BrowserContainerImpl<T extends java.lang.Object> implements com.dewords.pope.gui.browser.BrowserContainer<T> {
    private final boolean scannedDirectory = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mrl = null;
    private final boolean isRootDirectory = false;
    private final boolean isNetwork = false;
    private final boolean isFile = false;
    private final boolean inCards = false;
    
    public BrowserContainerImpl(boolean scannedDirectory, @org.jetbrains.annotations.Nullable()
    java.lang.String mrl, boolean isRootDirectory, boolean isNetwork, boolean isFile, boolean inCards) {
        super();
    }
    
    @java.lang.Override()
    public boolean getScannedDirectory() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMrl() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRootDirectory() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isNetwork() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isFile() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getInCards() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Void containerActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.dewords.pope.gui.browser.IStorageFragmentDelegate getStorageDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item) {
        return false;
    }
    
    @java.lang.Override()
    public void onImageClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item) {
    }
    
    @java.lang.Override()
    public void onCtxClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item) {
    }
    
    @java.lang.Override()
    public void onUpdateFinished(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @java.lang.Override()
    public void onMainActionClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item) {
    }
    
    @java.lang.Override()
    public void onItemFocused(@org.jetbrains.annotations.NotNull()
    android.view.View v, T item) {
    }
}