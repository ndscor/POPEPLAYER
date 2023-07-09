package com.dewords.pope.viewmodels.mobile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0011\u0010\u001c\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0013\u0010$\u001a\u0004\u0018\u00010%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00120\u0011X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/dewords/pope/viewmodels/mobile/PlaylistViewModel;", "Lcom/dewords/pope/viewmodels/MedialibraryViewModel;", "context", "Landroid/content/Context;", "initialPlaylist", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Landroid/content/Context;Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "playlist", "getPlaylist", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "playlistLiveData", "Landroidx/lifecycle/MutableLiveData;", "getPlaylistLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setPlaylistLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "providers", "", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "getProviders", "()[Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "[Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "tracksProvider", "Lcom/dewords/pope/providers/medialibrary/TracksProvider;", "getTracksProvider", "()Lcom/dewords/pope/providers/medialibrary/TracksProvider;", "refresh", "", "refreshPlaylistItem", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rename", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "name", "", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleFavorite", "", "Factory", "pope-player_debug"})
public final class PlaylistViewModel extends com.dewords.pope.viewmodels.MedialibraryViewModel {
    private final org.videolan.medialibrary.media.MediaLibraryItem initialPlaylist = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.providers.medialibrary.TracksProvider tracksProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.providers.medialibrary.MedialibraryProvider<? extends org.videolan.medialibrary.media.MediaLibraryItem>[] providers = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<org.videolan.medialibrary.media.MediaLibraryItem> playlistLiveData;
    
    public PlaylistViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem initialPlaylist) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.providers.medialibrary.TracksProvider getTracksProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.providers.medialibrary.MedialibraryProvider<? extends org.videolan.medialibrary.media.MediaLibraryItem>[] getProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.videolan.medialibrary.media.MediaLibraryItem> getPlaylistLiveData() {
        return null;
    }
    
    public final void setPlaylistLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<org.videolan.medialibrary.media.MediaLibraryItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaLibraryItem getPlaylist() {
        return null;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    private final java.lang.Object refreshPlaylistItem(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object rename(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object toggleFavorite(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/viewmodels/mobile/PlaylistViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "context", "Landroid/content/Context;", "playlist", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Landroid/content/Context;Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "getContext", "()Landroid/content/Context;", "getPlaylist", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final org.videolan.medialibrary.media.MediaLibraryItem playlist = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem playlist) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.medialibrary.media.MediaLibraryItem getPlaylist() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}