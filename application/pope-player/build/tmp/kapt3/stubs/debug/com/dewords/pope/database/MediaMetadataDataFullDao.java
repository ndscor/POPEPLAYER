package com.dewords.pope.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nH\'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0012H\'J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0015\u001a\u00020\u0005H\'J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u0015\u001a\u00020\u0005H\'J\u0018\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u0015\u001a\u00020\u0012H\'J\b\u0010\u001a\u001a\u00020\u0007H\'J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\nH\'J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\'J\b\u0010\u001e\u001a\u00020\u0007H\'J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010 \u001a\u00020\u0005H\'\u00a8\u0006!"}, d2 = {"Lcom/dewords/pope/database/MediaMetadataDataFullDao;", "", "findNextEpisode", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "showId", "", "season", "", "episode", "getAllLive", "Landroidx/lifecycle/LiveData;", "", "getAllPaged", "Landroidx/paging/DataSource$Factory;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getByIds", "mlids", "", "getEpisodesLive", "getMedia", "id", "getMediaById", "getMediaByIdLive", "getMediaLive", "getMetadataLiveByML", "getMovieCount", "getRecentlyAdded", "getTvShowEpisodes", "tvshowId", "getTvshowsCount", "searchMedia", "sanitizedQuery", "pope-player_debug"})
public abstract interface MediaMetadataDataFullDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata where ml_id = :id")
    public abstract androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getMetadataLiveByML(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata where moviepedia_id = :id")
    public abstract androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getMediaLive(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata where show_id = :showId")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getEpisodesLive(@org.jetbrains.annotations.NotNull()
    java.lang.String showId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from media_metadata where ml_id = :id")
    public abstract com.dewords.pope.database.models.MediaMetadataWithImages getMedia(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from media_metadata where moviepedia_id = :id")
    public abstract com.dewords.pope.database.models.MediaMetadataWithImages getMediaById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata where moviepedia_id = :id")
    public abstract androidx.lifecycle.LiveData<com.dewords.pope.database.models.MediaMetadataWithImages> getMediaByIdLive(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Query(value = "select count(moviepedia_id) from media_metadata where type = 0")
    public abstract int getMovieCount();
    
    @androidx.room.Query(value = "select count(moviepedia_id) from media_metadata where type = 2")
    public abstract int getTvshowsCount();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.dewords.pope.database.models.MediaMetadataWithImages.class})
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.dewords.pope.database.models.MediaMetadataWithImages> getAllPaged(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getAllLive();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM media_metadata WHERE show_id = :showId AND ((season = :season AND episode > :episode) OR (season > :season)) ORDER BY season, episode ASC")
    public abstract com.dewords.pope.database.models.MediaMetadataWithImages findNextEpisode(@org.jetbrains.annotations.NotNull()
    java.lang.String showId, int season, int episode);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata where ml_id IN (:mlids) LIMIT 10")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getByIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> mlids);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata ORDER BY insertDate DESC LIMIT 10")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> getRecentlyAdded();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata WHERE title LIKE :sanitizedQuery")
    public abstract java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages> searchMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String sanitizedQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from media_metadata WHERE show_id = :tvshowId ORDER by season, episode")
    public abstract java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages> getTvShowEpisodes(@org.jetbrains.annotations.NotNull()
    java.lang.String tvshowId);
}