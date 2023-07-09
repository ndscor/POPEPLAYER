package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/helpers/AudioUtil;", "", "()V", "TAG", "", "fetchBitmapFromContentResolver", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "path", "fetchCoverBitmap", "requestedPath", "width", "", "getCoverFromMediaStore", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "readCoverBitmap", "writeBitmap", "", "bitmap", "setRingtone", "Landroidx/fragment/app/FragmentActivity;", "song", "pope-player_debug"})
public final class AudioUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.AudioUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/AudioUtil";
    
    private AudioUtil() {
        super();
    }
    
    public final void setRingtone(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$setRingtone, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper song) {
    }
    
    private final java.lang.String getCoverFromMediaStore(android.content.Context context, org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void writeBitmap(android.graphics.Bitmap bitmap, java.lang.String path) throws java.io.IOException {
    }
    
    /**
     * Load cover art from the published ArtworkProvider using a ContentResolver.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap fetchBitmapFromContentResolver(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final android.graphics.Bitmap readCoverBitmap(@org.jetbrains.annotations.Nullable()
    java.lang.String requestedPath, int width) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final android.graphics.Bitmap fetchCoverBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.String requestedPath, int width) {
        return null;
    }
}