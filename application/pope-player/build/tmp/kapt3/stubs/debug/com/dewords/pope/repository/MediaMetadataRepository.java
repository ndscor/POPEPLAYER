package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 32\u00020\u0001:\u00013B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u001bJ \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u0016H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u000fH\u0007J\u0018\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001b2\u0006\u0010 \u001a\u00020\u0016H\u0007J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001b2\u0006\u0010 \u001a\u00020\u000fH\u0007J\b\u0010$\u001a\u00020\u0018H\u0007J*\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140&2\u0006\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u001bJ\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010-\u001a\u00020\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u00100\u001a\u00020\u0018H\u0007J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u00102\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/dewords/pope/repository/MediaMetadataRepository;", "Lorg/videolan/tools/IOScopedObject;", "mediaMetadataFullDao", "Lcom/dewords/pope/database/MediaMetadataDataFullDao;", "mediaMetadataDao", "Lcom/dewords/pope/database/MediaMetadataDao;", "mediaImageDao", "Lcom/dewords/pope/database/MediaImageDao;", "(Lcom/dewords/pope/database/MediaMetadataDataFullDao;Lcom/dewords/pope/database/MediaMetadataDao;Lcom/dewords/pope/database/MediaImageDao;)V", "addImagesImmediate", "", "images", "", "Lcom/dewords/pope/database/models/MediaImage;", "addMetadataImmediate", "", "mediaMetadata", "Lcom/dewords/pope/database/models/MediaMetadata;", "deleteImages", "findNextEpisode", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "showId", "", "season", "", "episode", "getAllLive", "Landroidx/lifecycle/LiveData;", "getByIds", "mlids", "getEpisodesLive", "getMediaById", "mediaId", "getMetadata", "getMetadataLive", "getMetadataLiveByML", "getMovieCount", "getMoviePagedList", "Landroidx/paging/DataSource$Factory;", "sortField", "sortType", "metadataType", "Lcom/dewords/pope/database/models/MediaMetadataType;", "getRecentlyAdded", "getTvShowEpisodes", "tvshowId", "getTvshow", "getTvshowLive", "getTvshowsCount", "searchMedia", "sanitizedQuery", "Companion", "pope-player_debug"})
public final class MediaMetadataRepository extends org.videolan.tools.IOScopedObject {
    private final com.dewords.pope.database.MediaMetadataDataFullDao mediaMetadataFullDao = null;
    private final com.dewords.pope.database.MediaMetadataDao mediaMetadataDao = null;
    private final com.dewords.pope.database.MediaImageDao mediaImageDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.MediaMetadataRepository.Companion Companion = null;
    
    public MediaMetadataRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.MediaMetadataDataFullDao mediaMetadataFullDao, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.MediaMetadataDao mediaMetadataDao, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.MediaImageDao mediaImageDao) {
        super();
    }
    
    @androidx.annotation.WorkerThread()
    public final long addMetadataImmediate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadata mediaMetadata) {
        return 0L;
    }
    
    @androidx.annotation.WorkerThread()
    public final void addImagesImmediate(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaImage> images) {
    }
    
    @androidx.annotation.WorkerThread()
    public final void deleteImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaImage> images) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getMetadataLiveByML(long mediaId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final com.dewords.pope.database.models.MediaMetadataWithImages findNextEpisode(@org.jetbrains.annotations.NotNull()
    java.lang.String showId, int season, int episode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getMetadataLive(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getEpisodesLive(@org.jetbrains.annotations.NotNull()
    java.lang.String showId) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    public final int getMovieCount() {
        return 0;
    }
    
    @androidx.annotation.WorkerThread()
    public final int getTvshowsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final com.dewords.pope.database.models.MediaMetadataWithImages getMetadata(long mediaId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final com.dewords.pope.database.models.MediaMetadataWithImages getMediaById(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.paging.DataSource.Factory<java.lang.Integer, com.dewords.pope.database.models.MediaMetadataWithImages> getMoviePagedList(@org.jetbrains.annotations.NotNull()
    java.lang.String sortField, @org.jetbrains.annotations.NotNull()
    java.lang.String sortType, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataType metadataType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getAllLive() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.database.models.MediaMetadataWithImages getTvshow(@org.jetbrains.annotations.NotNull()
    java.lang.String showId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getTvshowLive(@org.jetbrains.annotations.NotNull()
    java.lang.String showId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getByIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> mlids) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getRecentlyAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages> searchMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String sanitizedQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages> getTvShowEpisodes(@org.jetbrains.annotations.NotNull()
    java.lang.String tvshowId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/MediaMetadataRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/MediaMetadataRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.MediaMetadataRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}