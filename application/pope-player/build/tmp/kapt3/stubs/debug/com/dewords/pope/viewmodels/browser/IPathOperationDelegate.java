package com.dewords.pope.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "", "appendPathToUri", "", "path", "", "uri", "Landroid/net/Uri$Builder;", "getAndRemoveDestination", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "makePathSafe", "replaceStoragePath", "retrieveSafePath", "encoded", "setDestination", "media", "pope-player_debug"})
public abstract interface IPathOperationDelegate {
    
    public abstract void appendPathToUri(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.net.Uri.Builder uri);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String replaceStoragePath(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String makePathSafe(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String retrieveSafePath(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded);
    
    public abstract void setDestination(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.videolan.medialibrary.interfaces.media.MediaWrapper getAndRemoveDestination();
}