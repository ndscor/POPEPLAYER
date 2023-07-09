package com.dewords.pope.providers.medialibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010\u0017J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/providers/medialibrary/AlbumsProvider;", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Lorg/videolan/medialibrary/interfaces/media/Album;", "parent", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "context", "Landroid/content/Context;", "model", "Lcom/dewords/pope/viewmodels/SortableModel;", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;Landroid/content/Context;Lcom/dewords/pope/viewmodels/SortableModel;)V", "getParent", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "sortKey", "", "getSortKey", "()Ljava/lang/String;", "canSortByArtist", "", "canSortByDuration", "canSortByInsertionDate", "canSortByReleaseDate", "getAll", "", "()[Lorg/videolan/medialibrary/interfaces/media/Album;", "getPage", "loadSize", "", "startposition", "(II)[Lorg/videolan/medialibrary/interfaces/media/Album;", "getTotalCount", "pope-player_debug"})
public final class AlbumsProvider extends com.dewords.pope.providers.medialibrary.MedialibraryProvider<org.videolan.medialibrary.interfaces.media.Album> {
    @org.jetbrains.annotations.Nullable()
    private final org.videolan.medialibrary.media.MediaLibraryItem parent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    
    public AlbumsProvider(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem parent, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.SortableModel model) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.media.MediaLibraryItem getParent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getSortKey() {
        return null;
    }
    
    @java.lang.Override()
    public boolean canSortByDuration() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByReleaseDate() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByArtist() {
        return false;
    }
    
    @java.lang.Override()
    public boolean canSortByInsertionDate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Album[] getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Album[] getPage(int loadSize, int startposition) {
        return null;
    }
    
    @java.lang.Override()
    public int getTotalCount() {
        return 0;
    }
}