package com.dewords.pope.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.dewords.pope.database.Converters.class})
@androidx.room.Database(entities = {com.dewords.pope.database.models.MediaMetadata.class, com.dewords.pope.database.models.Person.class, com.dewords.pope.database.models.MediaPersonJoin.class, com.dewords.pope.database.models.MediaImage.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/database/MoviePediaDatabase;", "Landroidx/room/RoomDatabase;", "()V", "mediaImageDao", "Lcom/dewords/pope/database/MediaImageDao;", "mediaMedataDataFullDao", "Lcom/dewords/pope/database/MediaMetadataDataFullDao;", "mediaMetadataDao", "Lcom/dewords/pope/database/MediaMetadataDao;", "mediaPersonActorJoinDao", "Lcom/dewords/pope/database/MediaPersonJoinDao;", "personDao", "Lcom/dewords/pope/database/PersonDao;", "Companion", "pope-player_debug"})
public abstract class MoviePediaDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.database.MoviePediaDatabase.Companion Companion = null;
    
    public MoviePediaDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.database.MediaMetadataDao mediaMetadataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.database.PersonDao personDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.database.MediaPersonJoinDao mediaPersonActorJoinDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.database.MediaMetadataDataFullDao mediaMedataDataFullDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.database.MediaImageDao mediaImageDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/database/MoviePediaDatabase$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/database/MoviePediaDatabase;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.database.MoviePediaDatabase, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}