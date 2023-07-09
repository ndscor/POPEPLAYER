package com.dewords.pope.gui.dialogs.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001,B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020\u00162\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\u001fH\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0016J\u001a\u0010*\u001a\u00020\u00162\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001d\u00a8\u0006-"}, d2 = {"Lcom/dewords/pope/gui/dialogs/adapters/TrackAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/pope/gui/dialogs/adapters/TrackAdapter$ViewHolder;", "tracks", "", "Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "selectedTrack", "trackTypePrefix", "", "([Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "getSelectedTrack", "()Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "setSelectedTrack", "(Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;)V", "trackSelectedListener", "Lkotlin/Function1;", "", "getTrackSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setTrackSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "getTrackTypePrefix", "()Ljava/lang/String;", "[Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "getItemCount", "", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnTrackSelectedListener", "listener", "ViewHolder", "pope-player_debug"})
public final class TrackAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.pope.gui.dialogs.adapters.TrackAdapter.ViewHolder> {
    private final com.dewords.pope.gui.dialogs.adapters.VlcTrack[] tracks = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.gui.dialogs.adapters.VlcTrack selectedTrack;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String trackTypePrefix = null;
    public kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.adapters.VlcTrack, kotlin.Unit> trackSelectedListener;
    private final kotlin.Lazy handler$delegate = null;
    
    public TrackAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.adapters.VlcTrack[] tracks, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.dialogs.adapters.VlcTrack selectedTrack, @org.jetbrains.annotations.NotNull()
    java.lang.String trackTypePrefix) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.gui.dialogs.adapters.VlcTrack getSelectedTrack() {
        return null;
    }
    
    public final void setSelectedTrack(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.dialogs.adapters.VlcTrack p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackTypePrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.dewords.pope.gui.dialogs.adapters.VlcTrack, kotlin.Unit> getTrackSelectedListener() {
        return null;
    }
    
    public final void setTrackSelectedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.adapters.VlcTrack, kotlin.Unit> p0) {
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.dialogs.adapters.TrackAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnTrackSelectedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.adapters.VlcTrack, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.adapters.TrackAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/dialogs/adapters/TrackAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/VideoTrackItemBinding;", "(Lcom/dewords/pope/gui/dialogs/adapters/TrackAdapter;Lcom/dewords/pope/databinding/VideoTrackItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/VideoTrackItemBinding;", "bind", "", "trackDescription", "Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "selected", "", "pope-player_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.VideoTrackItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.VideoTrackItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.VideoTrackItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.dialogs.adapters.VlcTrack trackDescription, boolean selected) {
        }
    }
}