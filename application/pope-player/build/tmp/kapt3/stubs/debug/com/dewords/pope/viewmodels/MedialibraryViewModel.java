package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\'\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010 \u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0006\u0010%\u001a\u00020\u0011J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(J\u0006\u0010)\u001a\u00020\u0011J\b\u0010*\u001a\u00020\u001dH\u0014J\t\u0010+\u001a\u00020\u001dH\u0096\u0001J\b\u0010,\u001a\u00020\u001dH\u0016J\t\u0010-\u001a\u00020\u001dH\u0096\u0001J\b\u0010.\u001a\u00020\u001dH\u0016J\t\u0010/\u001a\u00020\u001dH\u0096\u0001J\u0010\u00100\u001a\u00020\u001d2\u0006\u00100\u001a\u00020(H\u0016J\t\u00101\u001a\u00020\u001dH\u0096\u0001J\t\u00102\u001a\u00020\u001dH\u0096\u0001J\t\u00103\u001a\u00020\u001dH\u0096\u0001J\t\u00104\u001a\u00020\u001dH\u0096\u0001J\t\u00105\u001a\u00020\u001dH\u0096\u0001J\t\u00106\u001a\u00020\u001dH\u0096\u0001J\t\u00107\u001a\u00020\u001dH\u0096\u0001J\t\u00108\u001a\u00020\u001dH\u0096\u0001J\u001b\u00109\u001a\u00020\u001d*\u00020:2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0;H\u0096\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/dewords/pope/viewmodels/MedialibraryViewModel;", "Lcom/dewords/pope/viewmodels/SortableModel;", "Lcom/dewords/pope/viewmodels/ICallBackHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "providers", "", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getProviders", "()[Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "canSortByAlbum", "", "canSortByArtist", "canSortByDuration", "canSortByFileNameName", "canSortByFileSize", "canSortByInsertionDate", "canSortByLastModified", "canSortByMediaNumber", "canSortByName", "canSortByPlayCount", "canSortByReleaseDate", "changeFavorite", "", "tracks", "", "favorite", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filter", "query", "", "isEmpty", "isEmptyAt", "index", "", "isFiltering", "onCleared", "pause", "refresh", "releaseCallbacks", "restore", "resume", "sort", "watchAlbums", "watchArtists", "watchFolders", "watchGenres", "watchHistory", "watchMedia", "watchMediaGroups", "watchPlaylists", "registerCallBacks", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function0;", "pope-player_debug"})
public abstract class MedialibraryViewModel extends com.dewords.pope.viewmodels.SortableModel implements com.dewords.pope.viewmodels.ICallBackHandler {
    
    public MedialibraryViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.providers.medialibrary.MedialibraryProvider<? extends org.videolan.medialibrary.media.MediaLibraryItem>[] getProviders();
    
    @java.lang.Override()
    public void refresh() {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final boolean isEmptyAt(int index) {
        return false;
    }
    
    @java.lang.Override()
    public void restore() {
    }
    
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void sort(int sort) {
    }
    
    public final boolean isFiltering() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public boolean canSortByName() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByFileNameName() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByDuration() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByInsertionDate() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByLastModified() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByReleaseDate() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByFileSize() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByArtist() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByAlbum() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByPlayCount() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByMediaNumber() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changeFavorite(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> tracks, boolean favorite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
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