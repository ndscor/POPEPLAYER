package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/SimpleAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/gui/SimpleAdapter$ViewHolder;", "handler", "Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "(Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;)V", "getHandler", "()Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "inflater", "Landroid/view/LayoutInflater;", "isEmpty", "", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ClickHandler", "ViewHolder", "pope-player_debug"})
public final class SimpleAdapter extends androidx.recyclerview.widget.ListAdapter<org.videolan.medialibrary.media.MediaLibraryItem, com.dewords.pope.gui.SimpleAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.gui.SimpleAdapter.ClickHandler handler = null;
    private android.view.LayoutInflater inflater;
    
    public SimpleAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.SimpleAdapter.ClickHandler handler) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.SimpleAdapter.ClickHandler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.SimpleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.SimpleAdapter.ViewHolder holder, int position) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "", "onClick", "", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public static abstract interface ClickHandler {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem item);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/SimpleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "handler", "Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "binding", "Lcom/dewords/pope/databinding/SimpleItemBinding;", "(Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;Lcom/dewords/pope/databinding/SimpleItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/SimpleItemBinding;", "pope-player_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.SimpleItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.SimpleAdapter.ClickHandler handler, @org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.SimpleItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.SimpleItemBinding getBinding() {
            return null;
        }
    }
}