package com.dewords.pope.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u000eH\u0016J \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0016J\u001d\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003H\u0010\u00a2\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u000eH\u0016J-\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000eH\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/dewords/pope/providers/NetworkProvider;", "Lcom/dewords/pope/providers/BrowserProvider;", "Landroidx/lifecycle/Observer;", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "context", "Landroid/content/Context;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "(Landroid/content/Context;Lorg/videolan/tools/livedata/LiveDataset;Ljava/lang/String;)V", "browseRootImpl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetch", "getFavoritesList", "", "favs", "onChanged", "parseSubDirectories", "list", "parseSubDirectories$pope_player_debug", "refresh", "requestBrowsing", "eventListener", "Lorg/videolan/libvlc/util/MediaBrowser$EventListener;", "interact", "", "(Ljava/lang/String;Lorg/videolan/libvlc/util/MediaBrowser$EventListener;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "pope-player_debug"})
public final class NetworkProvider extends com.dewords.pope.providers.BrowserProvider implements androidx.lifecycle.Observer<java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>> {
    
    public NetworkProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        super(null, null, null, 0, false);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object browseRootImpl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void fetch() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object requestBrowsing(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.util.MediaBrowser.EventListener eventListener, boolean interact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void parseSubDirectories$pope_player_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> list) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void onChanged(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> favs) {
    }
    
    private final java.util.List<org.videolan.medialibrary.media.MediaLibraryItem> getFavoritesList(java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> favs) {
        return null;
    }
}