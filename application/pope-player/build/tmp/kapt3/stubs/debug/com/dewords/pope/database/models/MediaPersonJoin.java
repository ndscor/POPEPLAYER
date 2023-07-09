package com.dewords.pope.database.models;

import java.lang.System;

@androidx.room.Entity(tableName = "media_person_join", primaryKeys = {"mediaId", "personId", "type"}, foreignKeys = {@androidx.room.ForeignKey(entity = com.dewords.pope.database.models.MediaMetadata.class, childColumns = {"mediaId"}, parentColumns = {"moviepedia_id"}), @androidx.room.ForeignKey(entity = com.dewords.pope.database.models.Person.class, childColumns = {"personId"}, parentColumns = {"moviepedia_id"})})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/database/models/MediaPersonJoin;", "", "mediaId", "", "personId", "type", "Lcom/dewords/pope/database/models/PersonType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/dewords/pope/database/models/PersonType;)V", "getMediaId", "()Ljava/lang/String;", "getPersonId", "getType", "()Lcom/dewords/pope/database/models/PersonType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pope-player_debug"})
public final class MediaPersonJoin {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mediaId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String personId = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.database.models.PersonType type = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaPersonJoin copy(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.PersonType type) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MediaPersonJoin(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.PersonType type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPersonId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.PersonType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.PersonType getType() {
        return null;
    }
}