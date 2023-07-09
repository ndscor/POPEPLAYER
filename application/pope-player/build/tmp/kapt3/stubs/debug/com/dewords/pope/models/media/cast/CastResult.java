package com.dewords.pope.models.media.cast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0016J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00c6\u0003Jc\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003H\u00c6\u0001J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0016J\t\u0010%\u001a\u00020&H\u00d6\u0001J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003H\u0016R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/dewords/pope/models/media/cast/CastResult;", "Lcom/dewords/pope/models/resolver/ResolverCasting;", "actor", "", "Lcom/dewords/pope/models/media/cast/Actor;", "director", "Lcom/dewords/pope/models/media/cast/Director;", "musician", "Lcom/dewords/pope/models/media/cast/Musician;", "producer", "Lcom/dewords/pope/models/media/cast/Producer;", "writer", "Lcom/dewords/pope/models/media/cast/Writer;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActor", "()Ljava/util/List;", "getDirector", "getMusician", "getProducer", "getWriter", "actors", "Lcom/dewords/pope/models/media/cast/Person;", "component1", "component2", "component3", "component4", "component5", "copy", "directors", "equals", "", "other", "", "hashCode", "", "musicians", "producers", "toString", "", "writers", "pope-player_debug"})
public final class CastResult extends com.dewords.pope.models.resolver.ResolverCasting {
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "actor")
    private final java.util.List<com.dewords.pope.models.media.cast.Actor> actor = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "director")
    private final java.util.List<com.dewords.pope.models.media.cast.Director> director = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "musician")
    private final java.util.List<com.dewords.pope.models.media.cast.Musician> musician = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "producer")
    private final java.util.List<com.dewords.pope.models.media.cast.Producer> producer = null;
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "writer")
    private final java.util.List<com.dewords.pope.models.media.cast.Writer> writer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.models.media.cast.CastResult copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Actor> actor, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Director> director, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Musician> musician, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Producer> producer, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Writer> writer) {
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
    
    public CastResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Actor> actor, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Director> director, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Musician> musician, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Producer> producer, @org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.models.media.cast.Writer> writer) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Actor> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Actor> getActor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Director> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Director> getDirector() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Musician> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Musician> getMusician() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Producer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Producer> getProducer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Writer> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.models.media.cast.Writer> getWriter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.media.cast.Person> actors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.media.cast.Person> directors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.media.cast.Person> writers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.media.cast.Person> musicians() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.media.cast.Person> producers() {
        return null;
    }
}