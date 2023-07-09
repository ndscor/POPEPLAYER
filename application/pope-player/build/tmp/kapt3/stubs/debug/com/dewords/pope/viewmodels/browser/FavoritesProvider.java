package com.dewords.pope.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/FavoritesProvider;", "Lcom/dewords/pope/providers/BrowserProvider;", "context", "Landroid/content/Context;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Lorg/videolan/tools/livedata/LiveDataset;Lkotlinx/coroutines/CoroutineScope;)V", "browserFavRepository", "Lcom/dewords/pope/repository/BrowserFavRepository;", "browseRootImpl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestBrowsing", "url", "", "eventListener", "Lorg/videolan/libvlc/util/MediaBrowser$EventListener;", "interact", "", "(Ljava/lang/String;Lorg/videolan/libvlc/util/MediaBrowser$EventListener;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public final class FavoritesProvider extends com.dewords.pope.providers.BrowserProvider {
    private final com.dewords.pope.repository.BrowserFavRepository browserFavRepository = null;
    
    public FavoritesProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super(null, null, null, 0, false);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object requestBrowsing(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.util.MediaBrowser.EventListener eventListener, boolean interact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object browseRootImpl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}