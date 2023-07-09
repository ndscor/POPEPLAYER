package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J@\u0010\u001a\u001a\u00020\u001026\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u000eH\u0016J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u000eH\u0016J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u000eH\u0016J\u0018\u0010+\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u000eH\u0016J\u0018\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020\u0010H\u0016J\u001b\u0010/\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R@\u0010\b\u001a4\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00062"}, d2 = {"Lcom/dewords/pope/gui/browser/StorageFragmentDelegate;", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "Lorg/videolan/medialibrary/interfaces/EntryPointsEventsCb;", "()V", "adapters", "", "Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "[Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "bannedFolderCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "folder", "", "banned", "", "context", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "processingFolders", "Landroidx/collection/SimpleArrayMap;", "Landroid/widget/CheckBox;", "getProcessingFolders", "()Landroidx/collection/SimpleArrayMap;", "addBannedFoldersCallback", "callback", "addEntryPointsCallback", "checkBoxAction", "v", "Landroid/view/View;", "mrl", "onDiscoveryCompleted", "onDiscoveryFailed", "entryPoint", "onDiscoveryProgress", "onDiscoveryStarted", "onEntryPointAdded", "success", "onEntryPointBanned", "onEntryPointRemoved", "entrypoint", "onEntryPointUnbanned", "processEvent", "cbp", "removeEntryPointsCallback", "withAdapters", "([Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;)V", "withContext", "pope-player_debug"})
public final class StorageFragmentDelegate implements com.dewords.pope.gui.browser.IStorageFragmentDelegate, org.videolan.medialibrary.interfaces.EntryPointsEventsCb {
    private com.dewords.pope.gui.browser.StorageBrowserAdapter[] adapters;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final androidx.collection.SimpleArrayMap<java.lang.String, android.widget.CheckBox> processingFolders = null;
    private final android.os.Handler handler = null;
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> bannedFolderCallback;
    
    public StorageFragmentDelegate() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.collection.SimpleArrayMap<java.lang.String, android.widget.CheckBox> getProcessingFolders() {
        return null;
    }
    
    @java.lang.Override()
    public void withContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void withAdapters(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.StorageBrowserAdapter[] adapters) {
    }
    
    @java.lang.Override()
    public void addBannedFoldersCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void addEntryPointsCallback() {
    }
    
    @java.lang.Override()
    public void removeEntryPointsCallback() {
    }
    
    @java.lang.Override()
    public void checkBoxAction(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    java.lang.String mrl) {
    }
    
    private final void processEvent(android.widget.CheckBox cbp, java.lang.String mrl) {
    }
    
    @java.lang.Override()
    public void onEntryPointBanned(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint, boolean success) {
    }
    
    @java.lang.Override()
    public void onEntryPointUnbanned(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint, boolean success) {
    }
    
    @java.lang.Override()
    public void onEntryPointAdded(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint, boolean success) {
    }
    
    @java.lang.Override()
    public void onEntryPointRemoved(@org.jetbrains.annotations.NotNull()
    java.lang.String entrypoint, boolean success) {
    }
    
    @java.lang.Override()
    public void onDiscoveryStarted() {
    }
    
    @java.lang.Override()
    public void onDiscoveryProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
    
    @java.lang.Override()
    public void onDiscoveryCompleted() {
    }
    
    @java.lang.Override()
    public void onDiscoveryFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String entryPoint) {
    }
}