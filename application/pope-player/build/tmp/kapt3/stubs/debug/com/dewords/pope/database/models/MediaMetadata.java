package com.dewords.pope.database.models;

import java.lang.System;

@androidx.room.Entity(tableName = "media_metadata", foreignKeys = {@androidx.room.ForeignKey(entity = com.dewords.pope.database.models.MediaMetadata.class, childColumns = {"show_id"}, parentColumns = {"moviepedia_id"})})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0015H\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u00ae\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\fH\u00c6\u0001\u00a2\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u000fH\u00d6\u0001J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b.\u0010 R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104\u00a8\u0006J"}, d2 = {"Lcom/dewords/pope/database/models/MediaMetadata;", "", "moviepediaId", "", "mlId", "", "type", "Lcom/dewords/pope/database/models/MediaMetadataType;", "title", "summary", "genres", "releaseDate", "Ljava/util/Date;", "countries", "season", "", "episode", "currentPoster", "currentBackdrop", "showId", "hasCast", "", "insertDate", "(Ljava/lang/String;Ljava/lang/Long;Lcom/dewords/pope/database/models/MediaMetadataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)V", "getCountries", "()Ljava/lang/String;", "getCurrentBackdrop", "setCurrentBackdrop", "(Ljava/lang/String;)V", "getCurrentPoster", "setCurrentPoster", "getEpisode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenres", "getHasCast", "()Z", "setHasCast", "(Z)V", "getInsertDate", "()Ljava/util/Date;", "getMlId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMoviepediaId", "getReleaseDate", "getSeason", "getShowId", "setShowId", "getSummary", "getTitle", "getType", "()Lcom/dewords/pope/database/models/MediaMetadataType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lcom/dewords/pope/database/models/MediaMetadataType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)Lcom/dewords/pope/database/models/MediaMetadata;", "equals", "other", "hashCode", "toString", "pope-player_debug"})
public final class MediaMetadata {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "moviepedia_id")
    @androidx.room.PrimaryKey()
    private final java.lang.String moviepediaId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ml_id")
    private final java.lang.Long mlId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "type")
    private final com.dewords.pope.database.models.MediaMetadataType type = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "summary")
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "genres")
    private final java.lang.String genres = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "releaseDate")
    private final java.util.Date releaseDate = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "countries")
    private final java.lang.String countries = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "season")
    private final java.lang.Integer season = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "episode")
    private final java.lang.Integer episode = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_poster")
    private java.lang.String currentPoster;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "current_backdrop")
    private java.lang.String currentBackdrop;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "show_id")
    private java.lang.String showId;
    @androidx.room.ColumnInfo(name = "has_cast")
    private boolean hasCast;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "insertDate")
    private final java.util.Date insertDate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaMetadata copy(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long mlId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.util.Date releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String countries, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episode, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String currentBackdrop, @org.jetbrains.annotations.Nullable()
    java.lang.String showId, boolean hasCast, @org.jetbrains.annotations.NotNull()
    java.util.Date insertDate) {
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
    
    public MediaMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId, @org.jetbrains.annotations.Nullable()
    java.lang.Long mlId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataType type, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String genres, @org.jetbrains.annotations.Nullable()
    java.util.Date releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String countries, @org.jetbrains.annotations.Nullable()
    java.lang.Integer season, @org.jetbrains.annotations.Nullable()
    java.lang.Integer episode, @org.jetbrains.annotations.NotNull()
    java.lang.String currentPoster, @org.jetbrains.annotations.NotNull()
    java.lang.String currentBackdrop, @org.jetbrains.annotations.Nullable()
    java.lang.String showId, boolean hasCast, @org.jetbrains.annotations.NotNull()
    java.util.Date insertDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMoviepediaId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMlId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaMetadataType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaMetadataType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getReleaseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPoster() {
        return null;
    }
    
    public final void setCurrentPoster(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentBackdrop() {
        return null;
    }
    
    public final void setCurrentBackdrop(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShowId() {
        return null;
    }
    
    public final void setShowId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getHasCast() {
        return false;
    }
    
    public final void setHasCast(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getInsertDate() {
        return null;
    }
}