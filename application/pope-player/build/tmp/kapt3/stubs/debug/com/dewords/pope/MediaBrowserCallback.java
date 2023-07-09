package com.dewords.pope;

import java.lang.System;

/**
 * @see com.dewords.pope.viewmodels.CallBackDelegate
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0012\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\u0006\u0010$\u001a\u00020\rJ\u0016\u0010%\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\'H\u0016J\u0016\u0010(\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\'H\u0016J\b\u0010)\u001a\u00020\rH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/MediaBrowserCallback;", "Lcom/dewords/pope/IMediaBrowserCallback;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$MediaCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$ArtistsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$AlbumsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$GenresCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$PlaylistsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$HistoryCb;", "playbackService", "Lcom/dewords/pope/PlaybackService;", "(Lcom/dewords/pope/PlaybackService;)V", "historyActor", "Lkotlinx/coroutines/channels/SendChannel;", "", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "refreshActor", "onAlbumsAdded", "onAlbumsDeleted", "onAlbumsModified", "onArtistsAdded", "onArtistsDeleted", "onArtistsModified", "onGenresAdded", "onGenresDeleted", "onGenresModified", "onHistoryModified", "onMediaAdded", "onMediaConvertedToExternal", "id", "", "onMediaDeleted", "onMediaModified", "onPlaylistsAdded", "onPlaylistsDeleted", "onPlaylistsModified", "onShuffleChanged", "registerHistoryCallback", "callback", "Lkotlin/Function0;", "registerMediaCallback", "removeCallbacks", "pope-player_debug"})
public final class MediaBrowserCallback implements com.dewords.pope.IMediaBrowserCallback, org.videolan.medialibrary.interfaces.Medialibrary.MediaCb, org.videolan.medialibrary.interfaces.Medialibrary.ArtistsCb, org.videolan.medialibrary.interfaces.Medialibrary.AlbumsCb, org.videolan.medialibrary.interfaces.Medialibrary.GenresCb, org.videolan.medialibrary.interfaces.Medialibrary.PlaylistsCb, org.videolan.medialibrary.interfaces.Medialibrary.HistoryCb {
    private final com.dewords.pope.PlaybackService playbackService = null;
    private final org.videolan.medialibrary.interfaces.Medialibrary medialibrary = null;
    private kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> historyActor;
    private kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> refreshActor;
    
    public MediaBrowserCallback(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService playbackService) {
        super();
    }
    
    @java.lang.Override()
    public void registerHistoryCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void onHistoryModified() {
    }
    
    @java.lang.Override()
    public void registerMediaCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void onMediaAdded() {
    }
    
    @java.lang.Override()
    public void onMediaDeleted(@org.jetbrains.annotations.Nullable()
    long[] id) {
    }
    
    @java.lang.Override()
    public void onMediaModified() {
    }
    
    @java.lang.Override()
    public void onMediaConvertedToExternal(@org.jetbrains.annotations.Nullable()
    long[] id) {
    }
    
    @java.lang.Override()
    public void onArtistsAdded() {
    }
    
    @java.lang.Override()
    public void onArtistsModified() {
    }
    
    @java.lang.Override()
    public void onArtistsDeleted() {
    }
    
    @java.lang.Override()
    public void onAlbumsAdded() {
    }
    
    @java.lang.Override()
    public void onAlbumsModified() {
    }
    
    @java.lang.Override()
    public void onAlbumsDeleted() {
    }
    
    @java.lang.Override()
    public void onGenresAdded() {
    }
    
    @java.lang.Override()
    public void onGenresModified() {
    }
    
    @java.lang.Override()
    public void onGenresDeleted() {
    }
    
    @java.lang.Override()
    public void onPlaylistsAdded() {
    }
    
    @java.lang.Override()
    public void onPlaylistsModified() {
    }
    
    @java.lang.Override()
    public void onPlaylistsDeleted() {
    }
    
    public final void onShuffleChanged() {
    }
    
    @java.lang.Override()
    public void removeCallbacks() {
    }
}