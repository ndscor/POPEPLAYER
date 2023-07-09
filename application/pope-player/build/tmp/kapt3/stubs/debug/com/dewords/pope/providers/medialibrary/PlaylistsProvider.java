package com.dewords.pope.providers.medialibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/dewords/pope/providers/medialibrary/PlaylistsProvider;", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Lorg/videolan/medialibrary/interfaces/media/Playlist;", "context", "Landroid/content/Context;", "model", "Lcom/dewords/pope/viewmodels/SortableModel;", "type", "Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;", "(Landroid/content/Context;Lcom/dewords/pope/viewmodels/SortableModel;Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;)V", "getType", "()Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;", "getAll", "", "()[Lorg/videolan/medialibrary/interfaces/media/Playlist;", "getPage", "loadSize", "", "startposition", "(II)[Lorg/videolan/medialibrary/interfaces/media/Playlist;", "getTotalCount", "pope-player_debug"})
public final class PlaylistsProvider extends com.dewords.pope.providers.medialibrary.MedialibraryProvider<org.videolan.medialibrary.interfaces.media.Playlist> {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.interfaces.media.Playlist.Type type = null;
    
    public PlaylistsProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.SortableModel model, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.Playlist.Type type) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.interfaces.media.Playlist.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Playlist[] getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Playlist[] getPage(int loadSize, int startposition) {
        return null;
    }
    
    @java.lang.Override()
    public int getTotalCount() {
        return 0;
    }
}