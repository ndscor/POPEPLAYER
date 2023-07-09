package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\u001a\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/viewmodels/ICallBackHandler;", "", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "pause", "", "releaseCallbacks", "resume", "watchAlbums", "watchArtists", "watchFolders", "watchGenres", "watchHistory", "watchMedia", "watchMediaGroups", "watchPlaylists", "registerCallBacks", "Lkotlinx/coroutines/CoroutineScope;", "refresh", "Lkotlin/Function0;", "pope-player_debug"})
public abstract interface ICallBackHandler {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary();
    
    public abstract void registerCallBacks(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$registerCallBacks, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> refresh);
    
    public abstract void releaseCallbacks();
    
    public abstract void watchMedia();
    
    public abstract void watchArtists();
    
    public abstract void watchAlbums();
    
    public abstract void watchGenres();
    
    public abstract void watchPlaylists();
    
    public abstract void watchHistory();
    
    public abstract void watchMediaGroups();
    
    public abstract void watchFolders();
    
    public abstract void pause();
    
    public abstract void resume();
}