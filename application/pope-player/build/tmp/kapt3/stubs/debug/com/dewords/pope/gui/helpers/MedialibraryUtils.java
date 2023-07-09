package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u001c\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/gui/helpers/MedialibraryUtils;", "", "()V", "addDevice", "", "path", "", "context", "Landroid/content/Context;", "addDir", "isBanned", "", "uri", "Landroid/net/Uri;", "bannedFolders", "", "isScanned", "isStrictlyBanned", "removeDir", "pope-player_debug"})
public final class MedialibraryUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.MedialibraryUtils INSTANCE = null;
    
    private MedialibraryUtils() {
        super();
    }
    
    public final void removeDir(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void addDir(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void addDir(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void addDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isScanned(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return false;
    }
    
    /**
     * Return true if this uri/path is banned (because it is or a parent is)
     * @param uri the uri to test
     * return true is the uri is banned
     */
    public final boolean isBanned(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> bannedFolders) {
        return false;
    }
    
    public final boolean isBanned(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> bannedFolders) {
        return false;
    }
    
    /**
     * Return true if this uri/path is banned (but false if a parent is)
     * @param uri the uri to test
     * return true is the uri is strictly banned
     */
    public final boolean isStrictlyBanned(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> bannedFolders) {
        return false;
    }
    
    public final boolean isStrictlyBanned(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> bannedFolders) {
        return false;
    }
}