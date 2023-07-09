package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\b\u001a\u00020\t26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u000bH&J\b\u0010\u0011\u001a\u00020\tH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\tH&J\u001b\u0010\u0017\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H&\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "", "processingFolders", "Landroidx/collection/SimpleArrayMap;", "", "Landroid/widget/CheckBox;", "getProcessingFolders", "()Landroidx/collection/SimpleArrayMap;", "addBannedFoldersCallback", "", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "folder", "", "banned", "addEntryPointsCallback", "checkBoxAction", "v", "Landroid/view/View;", "mrl", "removeEntryPointsCallback", "withAdapters", "adapters", "", "Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "([Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;)V", "withContext", "context", "Landroid/content/Context;", "pope-player_debug"})
public abstract interface IStorageFragmentDelegate {
    
    public abstract void checkBoxAction(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    java.lang.String mrl);
    
    public abstract void addEntryPointsCallback();
    
    public abstract void removeEntryPointsCallback();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.collection.SimpleArrayMap<java.lang.String, android.widget.CheckBox> getProcessingFolders();
    
    public abstract void withContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    public abstract void withAdapters(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.StorageBrowserAdapter[] adapters);
    
    public abstract void addBannedFoldersCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> callback);
}