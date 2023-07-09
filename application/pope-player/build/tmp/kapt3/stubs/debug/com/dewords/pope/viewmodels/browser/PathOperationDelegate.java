package com.dewords.pope.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/PathOperationDelegate;", "Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "()V", "appendPathToUri", "", "path", "", "uri", "Landroid/net/Uri$Builder;", "getAndRemoveDestination", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "makePathSafe", "kotlin.jvm.PlatformType", "replaceStoragePath", "retrieveSafePath", "encoded", "setDestination", "media", "Companion", "pope-player_debug"})
public final class PathOperationDelegate implements com.dewords.pope.viewmodels.browser.IPathOperationDelegate {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.viewmodels.browser.PathOperationDelegate.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> storages = null;
    private static org.videolan.medialibrary.interfaces.media.MediaWrapper privateDestination;
    
    public PathOperationDelegate() {
        super();
    }
    
    @java.lang.Override()
    public void setDestination(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.MediaWrapper getAndRemoveDestination() {
        return null;
    }
    
    /**
     * Append a path to the Uri from a String
     * It takes care of substituting paths stored in [storages] and splitting if the substituted path contains file separators
     *
     * @param path the path to append
     * @param uri the uri the path should be appended to
     */
    @java.lang.Override()
    public void appendPathToUri(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.net.Uri.Builder uri) {
    }
    
    /**
     * Substitutes the [storages]keys by the [storages] values
     *
     * @param path the real path string
     * @return the path string with substitutions
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String replaceStoragePath(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Encodes a String to avoid false positive substitusions
     *
     * @param path the path to encode
     * @return the encoded path
     */
    @java.lang.Override()
    public java.lang.String makePathSafe(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Decodes a string previously encoded with [makePathSafe]
     *
     * @param encoded the encoded path string
     * @return the decoded path string
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String retrieveSafePath(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/PathOperationDelegate$Companion;", "", "()V", "privateDestination", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "storages", "Landroidx/collection/SimpleArrayMap;", "", "getStorages", "()Landroidx/collection/SimpleArrayMap;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.String> getStorages() {
            return null;
        }
    }
}