package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\b\u0010\u0010\u001a\u00020\u0011H&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/gui/browser/BrowserContainer;", "T", "Lcom/dewords/pope/interfaces/IEventsHandler;", "inCards", "", "getInCards", "()Z", "isFile", "isNetwork", "isRootDirectory", "mrl", "", "getMrl", "()Ljava/lang/String;", "scannedDirectory", "getScannedDirectory", "containerActivity", "Landroid/app/Activity;", "getStorageDelegate", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "pope-player_debug"})
public abstract interface BrowserContainer<T extends java.lang.Object> extends com.dewords.pope.interfaces.IEventsHandler<T> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Activity containerActivity();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.dewords.pope.gui.browser.IStorageFragmentDelegate getStorageDelegate();
    
    public abstract boolean getScannedDirectory();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getMrl();
    
    public abstract boolean isRootDirectory();
    
    public abstract boolean isNetwork();
    
    public abstract boolean isFile();
    
    public abstract boolean getInCards();
}