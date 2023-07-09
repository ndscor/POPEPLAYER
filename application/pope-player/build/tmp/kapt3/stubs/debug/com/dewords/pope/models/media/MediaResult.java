package com.dewords.pope.models.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0001H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\u0085\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u00c6\u0001J\u0013\u00103\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0007H\u00d6\u0001J\t\u00106\u001a\u00020\tH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u00067"}, d2 = {"Lcom/dewords/pope/models/media/MediaResult;", "", "date", "Ljava/util/Date;", "followed", "", "globalRating", "", "imageEndpoint", "", "images", "Lcom/dewords/pope/models/identify/Images;", "mediaId", "showId", "showTitle", "summary", "title", "type", "wished", "(Ljava/util/Date;ZILjava/lang/String;Lcom/dewords/pope/models/identify/Images;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getDate", "()Ljava/util/Date;", "getFollowed", "()Z", "getGlobalRating", "()I", "getImageEndpoint", "()Ljava/lang/String;", "getImages", "()Lcom/dewords/pope/models/identify/Images;", "getMediaId", "getShowId", "getShowTitle", "getSummary", "getTitle", "getType", "getWished", "()Ljava/lang/Object;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "pope-player_debug"})
public final class MediaResult {
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "date")
    private final java.util.Date date = null;
    @com.squareup.moshi.Json(name = "followed")
    private final boolean followed = false;
    @com.squareup.moshi.Json(name = "globalRating")
    private final int globalRating = 0;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "imageEndpoint")
    private final java.lang.String imageEndpoint = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "images")
    private final com.dewords.pope.models.identify.Images images = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "mediaId")
    private final java.lang.String mediaId = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "showId")
    private final java.lang.String showId = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "showTitle")
    private final java.lang.String showTitle = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "summary")
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "wished")
    private final java.lang.Object wished = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.models.media.MediaResult copy(@org.jetbrains.annotations.Nullable()
    java.util.Date date, boolean followed, int globalRating, @org.jetbrains.annotations.NotNull()
    java.lang.String imageEndpoint, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.models.identify.Images images, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    java.lang.String showId, @org.jetbrains.annotations.NotNull()
    java.lang.String showTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.Object wished) {
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
    
    public MediaResult(@org.jetbrains.annotations.Nullable()
    java.util.Date date, boolean followed, int globalRating, @org.jetbrains.annotations.NotNull()
    java.lang.String imageEndpoint, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.models.identify.Images images, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    java.lang.String showId, @org.jetbrains.annotations.NotNull()
    java.lang.String showTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.Object wished) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getFollowed() {
        return false;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getGlobalRating() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.Images component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.Images getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShowTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWished() {
        return null;
    }
}