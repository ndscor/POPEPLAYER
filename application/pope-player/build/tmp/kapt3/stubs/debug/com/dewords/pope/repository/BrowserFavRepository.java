package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J+\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010&\u001a\u00020\'2\u0006\u0010\u001f\u001a\u00020 H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007*\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00070\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\nR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/dewords/pope/repository/BrowserFavRepository;", "", "browserFavDao", "Lcom/dewords/pope/database/BrowserFavDao;", "(Lcom/dewords/pope/database/BrowserFavDao;)V", "browserFavorites", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dewords/pope/mediadb/models/BrowserFav;", "getBrowserFavorites", "()Lkotlinx/coroutines/flow/Flow;", "browserFavorites$delegate", "Lkotlin/Lazy;", "localFavorites", "Landroidx/lifecycle/LiveData;", "getLocalFavorites", "()Landroidx/lifecycle/LiveData;", "localFavorites$delegate", "networkFavorites", "Landroidx/lifecycle/MediatorLiveData;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getNetworkFavorites", "()Landroidx/lifecycle/MediatorLiveData;", "networkFavorites$delegate", "networkFavs", "getNetworkFavs", "networkFavs$delegate", "networkMonitor", "Lorg/videolan/tools/NetworkMonitor;", "addLocalFavItem", "", "uri", "Landroid/net/Uri;", "title", "", "iconUrl", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addNetworkFavItem", "browserFavExists", "", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBrowserFav", "isFavNetwork", "searchUri", "filterNetworkFavs", "Companion", "pope-player_debug"})
public final class BrowserFavRepository {
    private final com.dewords.pope.database.BrowserFavDao browserFavDao = null;
    private final org.videolan.tools.NetworkMonitor networkMonitor = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy networkFavs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy browserFavorites$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy localFavorites$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy networkFavorites$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.BrowserFavRepository.Companion Companion = null;
    
    public BrowserFavRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.BrowserFavDao browserFavDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dewords.pope.mediadb.models.BrowserFav>> getNetworkFavs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dewords.pope.mediadb.models.BrowserFav>> getBrowserFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.mediadb.models.BrowserFav>> getLocalFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addNetworkFavItem(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addLocalFavItem(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String iconUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper>> getNetworkFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object browserFavExists(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isFavNetwork(@org.jetbrains.annotations.NotNull()
    android.net.Uri searchUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteBrowserFav(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> filterNetworkFavs(java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> $this$filterNetworkFavs) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/BrowserFavRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/BrowserFavRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.BrowserFavRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}