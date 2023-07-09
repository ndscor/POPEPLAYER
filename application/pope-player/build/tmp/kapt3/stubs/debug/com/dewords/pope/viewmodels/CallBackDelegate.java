package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000bB\u0005\u00a2\u0006\u0002\u0010\fJ\b\u0010\'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020&H\u0016J\b\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016J\b\u0010-\u001a\u00020&H\u0016J\b\u0010.\u001a\u00020&H\u0016J\b\u0010/\u001a\u00020&H\u0016J\b\u00100\u001a\u00020&H\u0016J\b\u00101\u001a\u00020&H\u0016J\b\u00102\u001a\u00020&H\u0016J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016J\u0010\u00106\u001a\u00020&2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020&2\u0006\u00107\u001a\u000208H\u0016J\b\u0010:\u001a\u00020&H\u0016J\b\u0010;\u001a\u00020&H\u0016J\b\u0010<\u001a\u00020&H\u0016J\b\u0010=\u001a\u00020&H\u0016J\b\u0010>\u001a\u00020&H\u0016J\b\u0010?\u001a\u00020&H\u0016J\b\u0010@\u001a\u00020&H\u0016J\b\u0010A\u001a\u00020&H\u0016J\b\u0010B\u001a\u00020&H\u0016J\b\u0010C\u001a\u00020&H\u0016J\b\u0010D\u001a\u00020&H\u0016J\b\u0010E\u001a\u00020&H\u0016J\b\u0010F\u001a\u00020&H\u0016J\b\u0010G\u001a\u00020&H\u0016J\b\u0010H\u001a\u00020&H\u0016J\b\u0010I\u001a\u00020&H\u0016J\b\u0010J\u001a\u00020&H\u0016J\b\u0010K\u001a\u00020&H\u0016J\b\u0010L\u001a\u00020&H\u0016J\b\u0010M\u001a\u00020&H\u0016J\u001a\u0010N\u001a\u00020&*\u00020O2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020&0QH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u000e\u0010$\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Lcom/dewords/pope/viewmodels/CallBackDelegate;", "Lcom/dewords/pope/viewmodels/ICallBackHandler;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$OnMedialibraryReadyListener;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$OnDeviceChangeListener;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$MediaCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$ArtistsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$AlbumsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$GenresCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$PlaylistsCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$HistoryCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$MediaGroupCb;", "Lorg/videolan/medialibrary/interfaces/Medialibrary$FoldersCb;", "()V", "albumsCb", "", "artistsCb", "deleteActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/viewmodels/MediaAction;", "foldersCb", "genresCb", "historyCb", "isInvalid", "()Z", "setInvalid", "(Z)V", "mediaCb", "mediaGroupsCb", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "value", "paused", "getPaused", "setPaused", "playlistsCb", "refreshActor", "", "onAlbumsAdded", "onAlbumsDeleted", "onAlbumsModified", "onArtistsAdded", "onArtistsDeleted", "onArtistsModified", "onDeviceChange", "onFoldersAdded", "onFoldersDeleted", "onFoldersModified", "onGenresAdded", "onGenresDeleted", "onGenresModified", "onHistoryModified", "onMediaAdded", "onMediaConvertedToExternal", "ids", "", "onMediaDeleted", "onMediaGroupsAdded", "onMediaGroupsDeleted", "onMediaGroupsModified", "onMediaModified", "onMedialibraryIdle", "onMedialibraryReady", "onPlaylistsAdded", "onPlaylistsDeleted", "onPlaylistsModified", "pause", "releaseCallbacks", "resume", "watchAlbums", "watchArtists", "watchFolders", "watchGenres", "watchHistory", "watchMedia", "watchMediaGroups", "watchPlaylists", "registerCallBacks", "Lkotlinx/coroutines/CoroutineScope;", "refresh", "Lkotlin/Function0;", "pope-player_debug"})
public final class CallBackDelegate implements com.dewords.pope.viewmodels.ICallBackHandler, org.videolan.medialibrary.interfaces.Medialibrary.OnMedialibraryReadyListener, org.videolan.medialibrary.interfaces.Medialibrary.OnDeviceChangeListener, org.videolan.medialibrary.interfaces.Medialibrary.MediaCb, org.videolan.medialibrary.interfaces.Medialibrary.ArtistsCb, org.videolan.medialibrary.interfaces.Medialibrary.AlbumsCb, org.videolan.medialibrary.interfaces.Medialibrary.GenresCb, org.videolan.medialibrary.interfaces.Medialibrary.PlaylistsCb, org.videolan.medialibrary.interfaces.Medialibrary.HistoryCb, org.videolan.medialibrary.interfaces.Medialibrary.MediaGroupCb, org.videolan.medialibrary.interfaces.Medialibrary.FoldersCb {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.interfaces.Medialibrary medialibrary = null;
    private kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> refreshActor;
    private kotlinx.coroutines.channels.SendChannel<? super com.dewords.pope.viewmodels.MediaAction> deleteActor;
    private boolean mediaCb = false;
    private boolean artistsCb = false;
    private boolean albumsCb = false;
    private boolean genresCb = false;
    private boolean playlistsCb = false;
    private boolean historyCb = false;
    private boolean mediaGroupsCb = false;
    private boolean foldersCb = false;
    private boolean paused = false;
    private boolean isInvalid = false;
    
    public CallBackDelegate() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary() {
        return null;
    }
    
    public final boolean getPaused() {
        return false;
    }
    
    public final void setPaused(boolean value) {
    }
    
    public final boolean isInvalid() {
        return false;
    }
    
    public final void setInvalid(boolean p0) {
    }
    
    /**
     * Pause the callbacks while the caller is paused to avoid unwanted refreshes
     * During this time, instead of refreshing, it's marked as invalid.
     * If invalid, a refresh is launched upon resuming
     */
    @java.lang.Override()
    public void pause() {
    }
    
    /**
     * Resumes the callback and refresh if it has been marked invalid in the meantime
     */
    @java.lang.Override()
    public void resume() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Override()
    public void registerCallBacks(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$registerCallBacks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh) {
    }
    
    @java.lang.Override()
    public void watchMedia() {
    }
    
    @java.lang.Override()
    public void watchArtists() {
    }
    
    @java.lang.Override()
    public void watchAlbums() {
    }
    
    @java.lang.Override()
    public void watchGenres() {
    }
    
    @java.lang.Override()
    public void watchPlaylists() {
    }
    
    @java.lang.Override()
    public void watchHistory() {
    }
    
    @java.lang.Override()
    public void watchMediaGroups() {
    }
    
    @java.lang.Override()
    public void watchFolders() {
    }
    
    @java.lang.Override()
    public void releaseCallbacks() {
    }
    
    @java.lang.Override()
    public void onMedialibraryReady() {
    }
    
    @java.lang.Override()
    public void onMedialibraryIdle() {
    }
    
    @java.lang.Override()
    public void onDeviceChange() {
    }
    
    @java.lang.Override()
    public void onMediaAdded() {
    }
    
    @java.lang.Override()
    public void onMediaModified() {
    }
    
    @java.lang.Override()
    public void onMediaDeleted(@org.jetbrains.annotations.NotNull()
    long[] ids) {
    }
    
    @java.lang.Override()
    public void onMediaConvertedToExternal(@org.jetbrains.annotations.NotNull()
    long[] ids) {
    }
    
    @java.lang.Override()
    public void onFoldersAdded() {
    }
    
    @java.lang.Override()
    public void onFoldersModified() {
    }
    
    @java.lang.Override()
    public void onFoldersDeleted() {
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
    
    @java.lang.Override()
    public void onHistoryModified() {
    }
    
    @java.lang.Override()
    public void onMediaGroupsAdded() {
    }
    
    @java.lang.Override()
    public void onMediaGroupsModified() {
    }
    
    @java.lang.Override()
    public void onMediaGroupsDeleted() {
    }
}