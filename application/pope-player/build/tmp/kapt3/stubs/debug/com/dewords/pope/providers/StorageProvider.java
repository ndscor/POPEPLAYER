package com.dewords.pope.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0012\u0010\n\u001a\u00060\u000bj\u0002`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/providers/StorageProvider;", "Lcom/dewords/pope/providers/FileBrowserProvider;", "context", "Landroid/content/Context;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "(Landroid/content/Context;Lorg/videolan/tools/livedata/LiveDataset;Ljava/lang/String;)V", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "browseRootImpl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeHeaders", "value", "", "findMedia", "Lorg/videolan/medialibrary/media/Storage;", "media", "Lorg/videolan/libvlc/interfaces/IMedia;", "(Lorg/videolan/libvlc/interfaces/IMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDescription", "folderCount", "", "mediaFileCount", "getFlags", "interact", "", "pope-player_debug"})
public final class StorageProvider extends com.dewords.pope.providers.FileBrowserProvider {
    private final java.lang.StringBuilder sb = null;
    
    public StorageProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        super(null, null, null, false, false, 0, false);
    }
    
    @java.lang.Override()
    public int getFlags(boolean interact) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object browseRootImpl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDescription(int folderCount, int mediaFileCount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object findMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia media, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.videolan.medialibrary.media.Storage> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void computeHeaders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> value) {
    }
}