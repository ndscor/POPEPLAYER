package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u001b\u001a\u00020\u0010J\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\u0010H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/dewords/pope/viewmodels/BookmarkModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/dewords/pope/PlaybackService$Callback;", "()V", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/interfaces/media/Bookmark;", "getDataset", "()Lorg/videolan/tools/livedata/LiveDataset;", "service", "Lcom/dewords/pope/PlaybackService;", "getService", "()Lcom/dewords/pope/PlaybackService;", "setService", "(Lcom/dewords/pope/PlaybackService;)V", "addBookmark", "", "context", "Landroid/content/Context;", "delete", "bookmark", "onMediaEvent", "event", "Lorg/videolan/libvlc/interfaces/IMedia$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "onServiceChanged", "refresh", "rename", "", "name", "", "(Lorg/videolan/medialibrary/interfaces/media/Bookmark;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setup", "update", "Companion", "pope-player_debug"})
public final class BookmarkModel extends androidx.lifecycle.ViewModel implements com.dewords.pope.PlaybackService.Callback {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.interfaces.media.Bookmark> dataset = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.PlaybackService service;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.viewmodels.BookmarkModel.Companion Companion = null;
    
    public BookmarkModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.interfaces.media.Bookmark> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService p0) {
    }
    
    private final void setup(com.dewords.pope.PlaybackService service) {
    }
    
    public final void refresh() {
    }
    
    private final void onServiceChanged(com.dewords.pope.PlaybackService service) {
    }
    
    @java.lang.Override()
    public void update() {
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia.Event event) {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.Bookmark bookmark) {
    }
    
    public final void addBookmark(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object rename(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.Bookmark bookmark, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends org.videolan.medialibrary.interfaces.media.Bookmark>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/viewmodels/BookmarkModel$Companion;", "", "()V", "get", "Lcom/dewords/pope/viewmodels/BookmarkModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.viewmodels.BookmarkModel get(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity) {
            return null;
        }
    }
}