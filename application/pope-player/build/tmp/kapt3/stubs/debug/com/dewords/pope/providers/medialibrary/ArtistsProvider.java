package com.dewords.pope.providers.medialibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/providers/medialibrary/ArtistsProvider;", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Lorg/videolan/medialibrary/interfaces/media/Artist;", "context", "Landroid/content/Context;", "model", "Lcom/dewords/pope/viewmodels/SortableModel;", "showAll", "", "(Landroid/content/Context;Lcom/dewords/pope/viewmodels/SortableModel;Z)V", "getShowAll", "()Z", "setShowAll", "(Z)V", "getAll", "", "()[Lorg/videolan/medialibrary/interfaces/media/Artist;", "getPage", "loadSize", "", "startposition", "(II)[Lorg/videolan/medialibrary/interfaces/media/Artist;", "getTotalCount", "pope-player_debug"})
public final class ArtistsProvider extends com.dewords.pope.providers.medialibrary.MedialibraryProvider<org.videolan.medialibrary.interfaces.media.Artist> {
    private boolean showAll;
    
    public ArtistsProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.SortableModel model, boolean showAll) {
        super(null, null);
    }
    
    public final boolean getShowAll() {
        return false;
    }
    
    public final void setShowAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Artist[] getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.Artist[] getPage(int loadSize, int startposition) {
        return null;
    }
    
    @java.lang.Override()
    public int getTotalCount() {
        return 0;
    }
}