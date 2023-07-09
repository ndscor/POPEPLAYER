package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\f\u0012\u0004\u0012\u00020\f0\u000bR\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioAlbumTracksAdapter;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "type", "", "eventsHandler", "Lcom/dewords/pope/interfaces/IEventsHandler;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "listEventsHandler", "Lcom/dewords/pope/interfaces/IListEventsHandler;", "(ILcom/dewords/pope/interfaces/IEventsHandler;Lcom/dewords/pope/interfaces/IListEventsHandler;)V", "onCreateViewHolder", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "Landroidx/databinding/ViewDataBinding;", "parent", "Landroid/view/ViewGroup;", "viewType", "TrackItemViewHolder", "pope-player_debug"})
public final class AudioAlbumTracksAdapter extends com.dewords.pope.gui.audio.AudioBrowserAdapter {
    
    @kotlin.jvm.JvmOverloads()
    public AudioAlbumTracksAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler) {
        super(0, null, null, false, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AudioAlbumTracksAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.IListEventsHandler listEventsHandler) {
        super(0, null, null, false, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioAlbumTracksAdapter$TrackItemViewHolder;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "Lcom/dewords/pope/databinding/AudioAlbumTrackItemBinding;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "binding", "(Lcom/dewords/pope/gui/audio/AudioAlbumTracksAdapter;Lcom/dewords/pope/databinding/AudioAlbumTrackItemBinding;)V", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "recycle", "", "selectView", "selected", "", "setItem", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public final class TrackItemViewHolder extends com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<com.dewords.pope.databinding.AudioAlbumTrackItemBinding> {
        @org.jetbrains.annotations.NotNull()
        private android.view.View.OnTouchListener onTouchListener;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleView = null;
        
        public TrackItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.AudioAlbumTrackItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View.OnTouchListener getOnTouchListener() {
            return null;
        }
        
        public final void setOnTouchListener(@org.jetbrains.annotations.NotNull()
        android.view.View.OnTouchListener p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
        
        @java.lang.Override()
        public void selectView(boolean selected) {
        }
        
        @java.lang.Override()
        public void setItem(@org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.media.MediaLibraryItem item) {
        }
        
        @java.lang.Override()
        public void recycle() {
        }
    }
}