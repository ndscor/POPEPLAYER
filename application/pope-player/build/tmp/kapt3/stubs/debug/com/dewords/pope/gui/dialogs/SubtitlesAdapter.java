package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0016\u0010\u0014\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SubtitlesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/pope/gui/dialogs/SubtitlesAdapter$ViewHolder;", "eventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/dialogs/SubtitleEvent;", "(Lkotlinx/coroutines/channels/SendChannel;)V", "dataset", "", "Lcom/dewords/pope/gui/dialogs/SubtitleItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "list", "ViewHolder", "pope-player_debug"})
public final class SubtitlesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.pope.gui.dialogs.SubtitlesAdapter.ViewHolder> {
    private final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.gui.dialogs.SubtitleEvent> eventActor = null;
    private java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem> dataset;
    
    public SubtitlesAdapter(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.SendChannel<? super com.dewords.pope.gui.dialogs.SubtitleEvent> eventActor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.dialogs.SubtitlesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.SubtitlesAdapter.ViewHolder holder, int position) {
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SubtitlesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/SubtitleDownloadItemBinding;", "(Lcom/dewords/pope/gui/dialogs/SubtitlesAdapter;Lcom/dewords/pope/databinding/SubtitleDownloadItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/SubtitleDownloadItemBinding;", "bind", "", "subtitleItem", "Lcom/dewords/pope/gui/dialogs/SubtitleItem;", "pope-player_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.SubtitleDownloadItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.SubtitleDownloadItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.SubtitleDownloadItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem) {
        }
    }
}