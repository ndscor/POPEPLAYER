package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\t\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0011\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0013\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0014\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0015\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0016\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0017\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0018\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u0019\u001a\u00020\u000fH\u0096\u0001J\t\u0010\u001a\u001a\u00020\u000fH\u0096\u0001J\u001b\u0010\u001b\u001a\u00020\u000f*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001eH\u0096\u0001R\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/viewmodels/MedialibraryModel;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/viewmodels/BaseModel;", "Lcom/dewords/pope/viewmodels/ICallBackHandler;", "context", "Landroid/content/Context;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Landroid/content/Context;Lorg/videolan/tools/CoroutineContextProvider;)V", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "onCleared", "", "pause", "releaseCallbacks", "resume", "watchAlbums", "watchArtists", "watchFolders", "watchGenres", "watchHistory", "watchMedia", "watchMediaGroups", "watchPlaylists", "registerCallBacks", "Lkotlinx/coroutines/CoroutineScope;", "refresh", "Lkotlin/Function0;", "pope-player_debug"})
public abstract class MedialibraryModel<T extends org.videolan.medialibrary.media.MediaLibraryItem> extends com.dewords.pope.viewmodels.BaseModel<T> implements com.dewords.pope.viewmodels.ICallBackHandler {
    
    public MedialibraryModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super(null, null);
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary() {
        return null;
    }
    
    /**
     * Pause the callbacks while the caller is paused to avoid unwanted refreshes
     * During this time, instead of refreshing, it's marked as invalid.
     * If invalid, a refresh is launched upon resuming
     */
    @java.lang.Override()
    public void pause() {
    }
    
    @java.lang.Override()
    public void registerCallBacks(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$registerCallBacks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh) {
    }
    
    @java.lang.Override()
    public void releaseCallbacks() {
    }
    
    /**
     * Resumes the callback and refresh if it has been marked invalid in the meantime
     */
    @java.lang.Override()
    public void resume() {
    }
    
    @java.lang.Override()
    public void watchAlbums() {
    }
    
    @java.lang.Override()
    public void watchArtists() {
    }
    
    @java.lang.Override()
    public void watchFolders() {
    }
    
    @java.lang.Override()
    public void watchGenres() {
    }
    
    @java.lang.Override()
    public void watchHistory() {
    }
    
    @java.lang.Override()
    public void watchMedia() {
    }
    
    @java.lang.Override()
    public void watchMediaGroups() {
    }
    
    @java.lang.Override()
    public void watchPlaylists() {
    }
}