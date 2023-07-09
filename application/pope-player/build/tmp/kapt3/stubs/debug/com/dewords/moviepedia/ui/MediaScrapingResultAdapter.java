package com.dewords.moviepedia.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001e\u0010\u0006\u001a\u00060\u0007R\u00020\bX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/dewords/moviepedia/ui/MediaScrapingResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/moviepedia/ui/MediaScrapingResultAdapter$ViewHolder;", "layoutInflater", "Landroid/view/LayoutInflater;", "(Landroid/view/LayoutInflater;)V", "clickHandler", "Lcom/dewords/moviepedia/ui/MediaScrapingActivity$ClickHandler;", "Lcom/dewords/moviepedia/ui/MediaScrapingActivity;", "getClickHandler$pope_player_debug", "()Lcom/dewords/moviepedia/ui/MediaScrapingActivity$ClickHandler;", "setClickHandler$pope_player_debug", "(Lcom/dewords/moviepedia/ui/MediaScrapingActivity$ClickHandler;)V", "dataList", "", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "newList", "ViewHolder", "pope-player_debug"})
public final class MediaScrapingResultAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.moviepedia.ui.MediaScrapingResultAdapter.ViewHolder> {
    private final android.view.LayoutInflater layoutInflater = null;
    private java.util.List<? extends com.dewords.pope.models.resolver.ResolverMedia> dataList;
    public com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler clickHandler;
    
    public MediaScrapingResultAdapter(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler getClickHandler$pope_player_debug() {
        return null;
    }
    
    public final void setClickHandler$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.moviepedia.ui.MediaScrapingResultAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.moviepedia.ui.MediaScrapingResultAdapter.ViewHolder holder, int position) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.dewords.pope.models.resolver.ResolverMedia> newList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/moviepedia/ui/MediaScrapingResultAdapter$ViewHolder;", "Lcom/dewords/pope/gui/helpers/SelectorViewHolder;", "Lcom/dewords/pope/databinding/MoviepediaItemBinding;", "binding", "(Lcom/dewords/moviepedia/ui/MediaScrapingResultAdapter;Lcom/dewords/pope/databinding/MoviepediaItemBinding;)V", "pope-player_debug"})
    public final class ViewHolder extends com.dewords.pope.gui.helpers.SelectorViewHolder<com.dewords.pope.databinding.MoviepediaItemBinding> {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.MoviepediaItemBinding binding) {
            super(null);
        }
    }
}