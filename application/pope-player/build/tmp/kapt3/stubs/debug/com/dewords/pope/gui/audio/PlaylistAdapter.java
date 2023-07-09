package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0003:;<B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0017J\b\u0010!\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001c\u0010&\u001a\u00020#2\n\u0010\'\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010(\u001a\u00060\u0003R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0016J\u0018\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0016J\b\u00104\u001a\u00020#H\u0014J\u0010\u00105\u001a\u00020#2\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dR$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/dewords/pope/gui/audio/PlaylistAdapter;", "Lcom/dewords/pope/gui/DiffUtilAdapter;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "Lcom/dewords/pope/gui/audio/PlaylistAdapter$ViewHolder;", "Lcom/dewords/pope/interfaces/SwipeDragHelperAdapter;", "player", "Lcom/dewords/pope/gui/audio/PlaylistAdapter$IPlayer;", "(Lcom/dewords/pope/gui/audio/PlaylistAdapter$IPlayer;)V", "position", "", "currentIndex", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentPlayingVisu", "Lcom/dewords/pope/gui/view/MiniVisualizer;", "defaultCoverAudio", "Landroid/graphics/drawable/BitmapDrawable;", "defaultCoverVideo", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "mHandler", "Lcom/dewords/pope/gui/audio/PlaylistAdapter$PlaylistHandler;", "model", "Lcom/dewords/pope/viewmodels/PlaylistModel;", "createCB", "Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "getItem", "getItemCount", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "onItemDismiss", "onItemMove", "fromPosition", "toPosition", "onItemMoved", "dragFrom", "dragTo", "onUpdateFinished", "remove", "setCurrentlyPlaying", "playing", "", "setModel", "IPlayer", "PlaylistHandler", "ViewHolder", "pope-player_debug"})
public final class PlaylistAdapter extends com.dewords.pope.gui.DiffUtilAdapter<org.videolan.medialibrary.interfaces.media.MediaWrapper, com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder> implements com.dewords.pope.interfaces.SwipeDragHelperAdapter {
    private final com.dewords.pope.gui.audio.PlaylistAdapter.IPlayer player = null;
    private android.graphics.drawable.BitmapDrawable defaultCoverVideo;
    private android.graphics.drawable.BitmapDrawable defaultCoverAudio;
    private com.dewords.pope.viewmodels.PlaylistModel model;
    private com.dewords.pope.gui.view.MiniVisualizer currentPlayingVisu;
    private final kotlin.Lazy handler$delegate = null;
    private int currentIndex = 0;
    private final com.dewords.pope.gui.audio.PlaylistAdapter.PlaylistHandler mHandler = null;
    
    public PlaylistAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.PlaylistAdapter.IPlayer player) {
        super();
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    public final int getCurrentIndex() {
        return 0;
    }
    
    public final void setCurrentIndex(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.MediaWrapper getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    protected void onUpdateFinished() {
    }
    
    @androidx.annotation.MainThread()
    public final void remove(int position) {
    }
    
    @java.lang.Override()
    public void onItemMove(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public void onItemMoved(int dragFrom, int dragTo) {
    }
    
    @java.lang.Override()
    public void onItemDismiss(int position) {
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.PlaylistModel model) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.dewords.pope.gui.DiffUtilAdapter.DiffCallback<org.videolan.medialibrary.interfaces.media.MediaWrapper> createCB() {
        return null;
    }
    
    public final void setCurrentlyPlaying(boolean playing) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/gui/audio/PlaylistAdapter$IPlayer;", "", "onPopupMenu", "", "view", "Landroid/view/View;", "position", "", "item", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "onSelectionSet", "playItem", "pope-player_debug"})
    public static abstract interface IPlayer {
        
        public abstract void onPopupMenu(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position, @org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.interfaces.media.MediaWrapper item);
        
        public abstract void onSelectionSet(int position);
        
        public abstract void playItem(int position, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.interfaces.media.MediaWrapper item);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/audio/PlaylistAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/dewords/pope/gui/helpers/MarqueeViewHolder;", "v", "Landroid/view/View;", "(Lcom/dewords/pope/gui/audio/PlaylistAdapter;Landroid/view/View;)V", "binding", "Lcom/dewords/pope/databinding/PlaylistItemBinding;", "getBinding", "()Lcom/dewords/pope/databinding/PlaylistItemBinding;", "setBinding", "(Lcom/dewords/pope/databinding/PlaylistItemBinding;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "onClick", "", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "onDeleteClick", "onMoreClick", "onMoveDownClick", "onMoveUpClick", "pope-player_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements com.dewords.pope.gui.helpers.MarqueeViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.dewords.pope.databinding.PlaylistItemBinding binding;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleView = null;
        
        @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.PlaylistItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.PlaylistItemBinding p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        }
        
        public final void onMoreClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void onDeleteClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
        
        public final void onMoveUpClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
        
        public final void onMoveDownClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/audio/PlaylistAdapter$PlaylistHandler;", "Lorg/videolan/tools/WeakHandler;", "Lcom/dewords/pope/gui/audio/PlaylistAdapter;", "owner", "(Lcom/dewords/pope/gui/audio/PlaylistAdapter;)V", "from", "", "getFrom", "()I", "setFrom", "(I)V", "to", "getTo", "setTo", "handleMessage", "", "msg", "Landroid/os/Message;", "pope-player_debug"})
    static final class PlaylistHandler extends org.videolan.tools.WeakHandler<com.dewords.pope.gui.audio.PlaylistAdapter> {
        private int from = -1;
        private int to = -1;
        
        public PlaylistHandler(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.audio.PlaylistAdapter owner) {
            super(null);
        }
        
        public final int getFrom() {
            return 0;
        }
        
        public final void setFrom(int p0) {
        }
        
        public final int getTo() {
            return 0;
        }
        
        public final void setTo(int p0) {
        }
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
    }
}