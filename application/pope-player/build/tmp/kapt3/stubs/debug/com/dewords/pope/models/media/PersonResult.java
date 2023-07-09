package com.dewords.pope.models.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\tH\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u00c6\u0003J\u00eb\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010?\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020BH\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010%R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010%R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010%R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010%R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b\u00a8\u0006D"}, d2 = {"Lcom/dewords/pope/models/media/PersonResult;", "", "backdrop", "", "birthdate", "Ljava/util/Date;", "deathdate", "genre", "hasImage", "", "imageEndpoint", "imdbId", "imdbidMatched", "isActorOf", "", "isDirectorOf", "isMusicianOf", "isProducerOf", "isStarringIn", "isWriterOf", "name", "personId", "picto", "poster", "square", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackdrop", "()Ljava/lang/String;", "getBirthdate", "()Ljava/util/Date;", "getDeathdate", "getGenre", "getHasImage", "()Z", "getImageEndpoint", "getImdbId", "getImdbidMatched", "()Ljava/util/List;", "getName", "getPersonId", "getPicto", "getPoster", "getSquare", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "pope-player_debug"})
public final class PersonResult {
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "backdrop")
    private final java.lang.String backdrop = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "birthdate")
    private final java.util.Date birthdate = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "deathdate")
    private final java.util.Date deathdate = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "genre")
    private final java.lang.String genre = null;
    @com.squareup.moshi.Json(name = "hasImage")
    private final boolean hasImage = false;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "imageEndpoint")
    private final java.lang.String imageEndpoint = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "imdbId")
    private final java.lang.String imdbId = null;
    @com.squareup.moshi.Json(name = "imdbid_matched")
    private final boolean imdbidMatched = false;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_actor_of")
    private final java.util.List<java.lang.Object> isActorOf = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_director_of")
    private final java.util.List<java.lang.String> isDirectorOf = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_musician_of")
    private final java.util.List<java.lang.Object> isMusicianOf = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_producer_of")
    private final java.util.List<java.lang.Object> isProducerOf = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_starring_in")
    private final java.util.List<java.lang.Object> isStarringIn = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "is_writer_of")
    private final java.util.List<java.lang.Object> isWriterOf = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "personId")
    private final java.lang.String personId = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "picto")
    private final java.lang.String picto = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "poster")
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "square")
    private final java.lang.String square = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.models.media.PersonResult copy(@org.jetbrains.annotations.NotNull()
    java.lang.String backdrop, @org.jetbrains.annotations.NotNull()
    java.util.Date birthdate, @org.jetbrains.annotations.NotNull()
    java.util.Date deathdate, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, boolean hasImage, @org.jetbrains.annotations.NotNull()
    java.lang.String imageEndpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId, boolean imdbidMatched, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isActorOf, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> isDirectorOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isMusicianOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isProducerOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isStarringIn, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isWriterOf, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    java.lang.String picto, @org.jetbrains.annotations.NotNull()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String square) {
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
    
    public PersonResult(@org.jetbrains.annotations.NotNull()
    java.lang.String backdrop, @org.jetbrains.annotations.NotNull()
    java.util.Date birthdate, @org.jetbrains.annotations.NotNull()
    java.util.Date deathdate, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, boolean hasImage, @org.jetbrains.annotations.NotNull()
    java.lang.String imageEndpoint, @org.jetbrains.annotations.NotNull()
    java.lang.String imdbId, boolean imdbidMatched, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isActorOf, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> isDirectorOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isMusicianOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isProducerOf, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isStarringIn, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> isWriterOf, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String personId, @org.jetbrains.annotations.NotNull()
    java.lang.String picto, @org.jetbrains.annotations.NotNull()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String square) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackdrop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getBirthdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDeathdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenre() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getHasImage() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getImdbidMatched() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> isActorOf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> isDirectorOf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> isMusicianOf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> isProducerOf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> isStarringIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> isWriterOf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPersonId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPicto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSquare() {
        return null;
    }
}