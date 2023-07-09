package com.dewords.pope.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0016J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0014J\u001d\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H\u0010\u00a2\u0006\u0002\b\u001dR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/providers/FilePickerProvider;", "Lcom/dewords/pope/providers/FileBrowserProvider;", "context", "Landroid/content/Context;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "showDummyCategory", "", "pickerType", "Lcom/dewords/pope/providers/PickerType;", "(Landroid/content/Context;Lorg/videolan/tools/livedata/LiveDataset;Ljava/lang/String;ZLcom/dewords/pope/providers/PickerType;)V", "computeHeaders", "", "value", "", "findMedia", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "media", "Lorg/videolan/libvlc/interfaces/IMedia;", "(Lorg/videolan/libvlc/interfaces/IMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlags", "", "interact", "initBrowser", "parseSubDirectories", "list", "parseSubDirectories$pope_player_debug", "pope-player_debug"})
public final class FilePickerProvider extends com.dewords.pope.providers.FileBrowserProvider {
    private final com.dewords.pope.providers.PickerType pickerType = null;
    
    public FilePickerProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean showDummyCategory, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.providers.PickerType pickerType) {
        super(null, null, null, false, false, 0, false);
    }
    
    @java.lang.Override()
    public int getFlags(boolean interact) {
        return 0;
    }
    
    @java.lang.Override()
    protected void initBrowser() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object findMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia media, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.videolan.medialibrary.interfaces.media.MediaWrapper> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void computeHeaders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> value) {
    }
    
    @java.lang.Override()
    public void parseSubDirectories$pope_player_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> list) {
    }
}