package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0002J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010 \u001a\u00020\u00132\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020#0\"R\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J0\u0010 \u001a\u00020\u00132\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020#0\"R\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000fH\u0016J\u001a\u0010&\u001a\u00020\u00132\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020#0\"R\u00020\u0001H\u0016J\u0019\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "Lcom/dewords/pope/gui/browser/BaseBrowserAdapter;", "browserContainer", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Lcom/dewords/pope/gui/browser/BrowserContainer;)V", "bannedFolders", "", "", "getBannedFolders", "()Ljava/util/List;", "setBannedFolders", "(Ljava/util/List;)V", "customDirsLocation", "mediaDirsLocation", "", "updateJob", "Lkotlinx/coroutines/Job;", "checkBoxAction", "", "v", "Landroid/view/View;", "mrl", "hasDiscoveredChildren", "", "path", "itemFocusChanged", "position", "", "hasFocus", "bindingContainer", "Lcom/dewords/pope/gui/browser/BrowserItemBindingContainer;", "onBindViewHolder", "holder", "Lcom/dewords/pope/gui/browser/BaseBrowserAdapter$ViewHolder;", "Landroidx/databinding/ViewDataBinding;", "payloads", "", "onViewRecycled", "updateListState", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMediaDirs", "pope-player_debug"})
public final class StorageBrowserAdapter extends com.dewords.pope.gui.browser.BaseBrowserAdapter {
    private java.util.List<java.lang.String> mediaDirsLocation;
    private java.util.List<java.lang.String> customDirsLocation;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> bannedFolders;
    private kotlinx.coroutines.Job updateJob;
    
    public StorageBrowserAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BrowserContainer<org.videolan.medialibrary.media.MediaLibraryItem> browserContainer) {
        super(null, 0, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getBannedFolders() {
        return null;
    }
    
    public final void setBannedFolders(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder<androidx.databinding.ViewDataBinding> holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder<androidx.databinding.ViewDataBinding> holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    /**
     * Manages the item visibility on focus changes
     *
     * @param position the item position
     * @param hasFocus true if the item has focus
     * @param bindingContainer the [BrowserItemBindingContainer] associated with the item
     */
    @java.lang.Override()
    public void itemFocusChanged(int position, boolean hasFocus, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BrowserItemBindingContainer bindingContainer) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder<androidx.databinding.ViewDataBinding> holder) {
    }
    
    private final boolean hasDiscoveredChildren(java.lang.String path) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateListState(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void updateMediaDirs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void checkBoxAction(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    java.lang.String mrl) {
    }
}