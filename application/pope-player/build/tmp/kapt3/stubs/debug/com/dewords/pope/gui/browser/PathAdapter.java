package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/dewords/pope/gui/browser/PathAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/pope/gui/browser/PathAdapter$ViewHolder;", "browser", "Lcom/dewords/pope/gui/browser/PathAdapterListener;", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "(Lcom/dewords/pope/gui/browser/PathAdapterListener;Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "getBrowser", "()Lcom/dewords/pope/gui/browser/PathAdapterListener;", "browserTitle", "", "getMedia", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "otgDevice", "pathOperationDelegate", "Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "segments", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareSegments", "uri", "Landroid/net/Uri;", "ViewHolder", "pope-player_debug"})
public final class PathAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.pope.gui.browser.PathAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.gui.browser.PathAdapterListener browser = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.interfaces.media.MediaWrapper media = null;
    private final com.dewords.pope.viewmodels.browser.IPathOperationDelegate pathOperationDelegate = null;
    private final java.lang.String browserTitle = null;
    private final java.lang.String otgDevice = null;
    private final java.util.List<java.lang.String> segments = null;
    
    public PathAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.PathAdapterListener browser, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.browser.PathAdapterListener getBrowser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.browser.PathAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.PathAdapter.ViewHolder holder, int position) {
    }
    
    /**
     * Splits an [Uri] in a list of string used as the adapter items
     * Each item is a string representing a valid path
     *
     * @param uri the [Uri] that has to be split
     * @return a list of strings representing the items
     */
    private final java.util.List<java.lang.String> prepareSegments(android.net.Uri uri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/browser/PathAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "root", "Landroid/widget/TextView;", "(Lcom/dewords/pope/gui/browser/PathAdapter;Landroid/widget/TextView;)V", "getRoot", "()Landroid/widget/TextView;", "pope-player_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView root = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.widget.TextView root) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRoot() {
            return null;
        }
    }
}