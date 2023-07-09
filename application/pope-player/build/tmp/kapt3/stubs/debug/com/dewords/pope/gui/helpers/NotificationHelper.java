package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J,\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0007J\u0084\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\tJ.\u0010)\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/dewords/pope/gui/helpers/NotificationHelper;", "", "()V", "TAG", "", "VLC_DEBUG_CHANNEL", "notificationIntent", "Landroid/content/Intent;", "buildCustomButtonPendingIntent", "Landroid/app/PendingIntent;", "ctx", "Landroid/content/Context;", "actionId", "buildMediaButtonPendingIntent", "enabledActions", "", "action", "allowIntent", "", "createDebugServcieChannel", "", "appCtx", "createNotificationChannels", "createPlaybackNotification", "Landroid/app/Notification;", "video", "title", "artist", "album", "cover", "Landroid/graphics/Bitmap;", "playing", "pausable", "seekable", "speed", "", "podcastMode", "seekInCompactView", "sessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "spi", "createScanNotification", "progressText", "paused", "max", "", "progress", "pope-player_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.NotificationHelper INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/NotificationHelper";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VLC_DEBUG_CHANNEL = "vlc_debug";
    private static final android.content.Intent notificationIntent = null;
    
    private NotificationHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification createPlaybackNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, boolean video, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String artist, @org.jetbrains.annotations.NotNull()
    java.lang.String album, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap cover, boolean playing, boolean pausable, boolean seekable, float speed, boolean podcastMode, boolean seekInCompactView, long enabledActions, @org.jetbrains.annotations.Nullable()
    android.support.v4.media.session.MediaSessionCompat.Token sessionToken, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent spi) {
        return null;
    }
    
    private final android.app.PendingIntent buildMediaButtonPendingIntent(android.content.Context ctx, long enabledActions, long action, boolean allowIntent) {
        return null;
    }
    
    private final android.app.PendingIntent buildCustomButtonPendingIntent(android.content.Context ctx, java.lang.String actionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Notification createScanNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String progressText, boolean paused, int max, int progress) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    public final void createNotificationChannels(@org.jetbrains.annotations.NotNull()
    android.content.Context appCtx) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    public final void createDebugServcieChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context appCtx) {
    }
}