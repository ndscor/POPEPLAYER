package com.dewords.pope.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/dewords/pope/database/MediaMetadataDao;", "", "getForMedia", "Lcom/dewords/pope/database/models/MediaMetadata;", "id", "", "insert", "mediaMetadata", "pope-player_debug"})
public abstract interface MediaMetadataDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadata mediaMetadata);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from media_metadata where ml_id = :id")
    public abstract com.dewords.pope.database.models.MediaMetadata getForMedia(long id);
}