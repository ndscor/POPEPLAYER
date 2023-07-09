package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a$\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u001a\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u0010\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u0010\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\n\u0010\u000e\u001a\u00020\t*\u00020\u000b\u001a\n\u0010\u000f\u001a\u00020\t*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\t*\u00020\u0010\u001a\f\u0010\u0012\u001a\u00020\t*\u0004\u0018\u00010\u000b\u001a\f\u0010\u0013\u001a\u00020\t*\u0004\u0018\u00010\u000b\u001a\f\u0010\u0014\u001a\u00020\t*\u0004\u0018\u00010\u000b\u001a\f\u0010\u0015\u001a\u00020\t*\u0004\u0018\u00010\u000b\u001a\f\u0010\u0016\u001a\u00020\t*\u0004\u0018\u00010\u000b\u001a\f\u0010\u0017\u001a\u00020\t*\u0004\u0018\u00010\u000b\u00a8\u0006\u0018"}, d2 = {"convertFavorite", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "browserFav", "Lcom/dewords/pope/mediadb/models/BrowserFav;", "convertFavorites", "", "kotlin.jvm.PlatformType", "browserFavs", "isSchemeHttpOrHttps", "", "scheme", "", "isSchemeStreaming", "isSchemeSupported", "isMissing", "isOTG", "Landroid/net/Uri;", "isSD", "isSchemeDistant", "isSchemeFD", "isSchemeFavoriteEditable", "isSchemeFile", "isSchemeNetwork", "isSchemeSMB", "pope-player_debug"})
public final class BrowserutilsKt {
    
    public static final boolean isSchemeStreaming(@org.jetbrains.annotations.Nullable()
    java.lang.String scheme) {
        return false;
    }
    
    public static final boolean isSchemeHttpOrHttps(@org.jetbrains.annotations.Nullable()
    java.lang.String scheme) {
        return false;
    }
    
    public static final boolean isSchemeSupported(@org.jetbrains.annotations.Nullable()
    java.lang.String scheme) {
        return false;
    }
    
    public static final boolean isSchemeNetwork(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeNetwork) {
        return false;
    }
    
    public static final boolean isSchemeFavoriteEditable(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeFavoriteEditable) {
        return false;
    }
    
    public static final boolean isSchemeFile(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeFile) {
        return false;
    }
    
    public static final boolean isOTG(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$isOTG) {
        return false;
    }
    
    public static final boolean isSD(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$isSD) {
        return false;
    }
    
    public static final boolean isSchemeSMB(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeSMB) {
        return false;
    }
    
    public static final boolean isSchemeFD(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeFD) {
        return false;
    }
    
    public static final boolean isSchemeDistant(@org.jetbrains.annotations.Nullable()
    java.lang.String $this$isSchemeDistant) {
        return false;
    }
    
    public static final boolean isMissing(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$isMissing) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> convertFavorites(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.mediadb.models.BrowserFav> browserFavs) {
        return null;
    }
    
    /**
     * Converts a [BrowserFav] to a [MediaWrapper]
     * @return a [MediaWrapper]
     */
    @org.jetbrains.annotations.Nullable()
    public static final org.videolan.medialibrary.interfaces.media.MediaWrapper convertFavorite(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.BrowserFav browserFav) {
        return null;
    }
}