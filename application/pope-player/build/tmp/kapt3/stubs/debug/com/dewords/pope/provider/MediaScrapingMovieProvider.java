package com.dewords.pope.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/provider/MediaScrapingMovieProvider;", "Lcom/dewords/pope/provider/MediaScrapingProvider;", "context", "Landroid/content/Context;", "mediaType", "Lcom/dewords/pope/database/models/MediaMetadataType;", "(Landroid/content/Context;Lcom/dewords/pope/database/models/MediaMetadataType;)V", "pagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "setPagedList", "(Landroidx/lifecycle/LiveData;)V", "pope-player_debug"})
public final class MediaScrapingMovieProvider extends com.dewords.pope.provider.MediaScrapingProvider {
    private final android.content.Context context = null;
    private final com.dewords.pope.database.models.MediaMetadataType mediaType = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dewords.pope.database.models.MediaMetadataWithImages>> pagedList;
    
    public MediaScrapingMovieProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataType mediaType) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dewords.pope.database.models.MediaMetadataWithImages>> getPagedList() {
        return null;
    }
    
    @java.lang.Override()
    public void setPagedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dewords.pope.database.models.MediaMetadataWithImages>> p0) {
    }
}