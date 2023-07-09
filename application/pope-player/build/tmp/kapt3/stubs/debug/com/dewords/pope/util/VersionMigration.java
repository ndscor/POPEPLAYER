package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/util/VersionMigration;", "", "()V", "currentMajorVersion", "", "getCurrentMajorVersion", "()I", "migrateToVersion1", "", "settings", "Landroid/content/SharedPreferences;", "migrateToVersion10", "migrateToVersion11", "migrateToVersion2", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrateToVersion3", "migrateToVersion4", "migrateToVersion5", "migrateToVersion6", "migrateToVersion7", "migrateToVersion8", "migrateToVersion9", "migrateToVlc4", "migrateVersion", "pope-player_debug"})
public final class VersionMigration {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.VersionMigration INSTANCE = null;
    private static final int currentMajorVersion = 0;
    
    private VersionMigration() {
        super();
    }
    
    public final int getCurrentMajorVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object migrateVersion(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void migrateToVersion1(android.content.SharedPreferences settings) {
    }
    
    /**
     * Deletes all the video thumbnails as we change the way to name them.
     */
    private final java.lang.Object migrateToVersion2(android.content.Context context, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Deletes all the programs from the WatchNext channel on the TV Home.
     * After reindexing media ids can change, so programs now also have the uri of their media file.
     */
    private final java.lang.Object migrateToVersion3(android.content.Context context, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Migrate the video hud timeout preference to a value in seconds
     */
    private final void migrateToVersion4(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the TV Ui to make sure the preference is setup
     */
    private final void migrateToVersion5(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the Video hud timeout to the new range
     */
    private final void migrateToVersion6(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the PLAYLIST_REPEAT_MODE_KEY from the PlaylistManager to split it in two
     * audio / video separate preferences, PLAYLIST_VIDEO_REPEAT_MODE_KEY and
     * PLAYLIST_AUDIO_REPEAT_MODE_KEY, but keep the value previously set by the user
     */
    private final void migrateToVersion7(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate from having one force_play_all that was labeled as Video Playlist Mode in the settings
     * but also affected some audio in the browser to two separate settings force_play_all,
     * historically will continue forcing to play all videos, and force_play_all_audio which will
     * do the same when playing audio files. Migration to keep the previous value in both settings
     */
    private final void migrateToVersion8(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the video screenshot control setting from a boolean
     * to a multiple entry value
     */
    private final void migrateToVersion9(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the subtitle color setting
     */
    private final void migrateToVersion10(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migrate the  playlists' display in grid setting
     */
    private final void migrateToVersion11(android.content.SharedPreferences settings) {
    }
    
    /**
     * Migration to vlc 4
     * ⚠️⚠️⚠️ This should not be destructive! Any first install will run this.
     */
    private final void migrateToVlc4(android.content.SharedPreferences settings) {
    }
}