package com.dewords.pope.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\'J\u0016\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\'J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/database/MediaPersonJoinDao;", "", "getActorsForMedia", "", "Lcom/dewords/pope/database/models/Person;", "moviepediaId", "", "type", "Lcom/dewords/pope/database/models/PersonType;", "getActorsForMediaLive", "Landroidx/lifecycle/LiveData;", "getAll", "Lcom/dewords/pope/database/models/MediaPersonJoin;", "insertPerson", "", "person", "insertPersons", "persons", "removeAllFor", "pope-player_debug"})
public abstract interface MediaPersonJoinDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertPerson(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaPersonJoin person);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertPersons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaPersonJoin> persons);
    
    @androidx.room.Query(value = "DELETE FROM media_person_join WHERE mediaId = :moviepediaId")
    public abstract void removeAllFor(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM media_person_join")
    public abstract java.util.List<com.dewords.pope.database.models.MediaPersonJoin> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n           SELECT * FROM media_metadata_person\n           INNER JOIN media_person_join\n           ON media_metadata_person.moviepedia_id=media_person_join.personId\n           WHERE media_person_join.mediaId=:moviepediaId AND media_person_join.type=:type\n           ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.Person>> getActorsForMediaLive(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.PersonType type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n           SELECT * FROM media_metadata_person\n           INNER JOIN media_person_join\n           ON media_metadata_person.moviepedia_id=media_person_join.personId\n           WHERE media_person_join.mediaId=:moviepediaId AND media_person_join.type=:type\n           ")
    public abstract java.util.List<com.dewords.pope.database.models.Person> getActorsForMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.PersonType type);
}