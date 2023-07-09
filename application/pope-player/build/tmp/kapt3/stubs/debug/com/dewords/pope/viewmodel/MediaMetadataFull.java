package com.dewords.pope.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\t\u00a8\u0006 "}, d2 = {"Lcom/dewords/pope/viewmodel/MediaMetadataFull;", "", "()V", "actors", "", "Lcom/dewords/pope/database/models/Person;", "getActors", "()Ljava/util/List;", "setActors", "(Ljava/util/List;)V", "directors", "getDirectors", "setDirectors", "metadata", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "getMetadata", "()Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "setMetadata", "(Lcom/dewords/pope/database/models/MediaMetadataWithImages;)V", "musicians", "getMusicians", "setMusicians", "producers", "getProducers", "setProducers", "seasons", "Lcom/dewords/pope/viewmodel/Season;", "getSeasons", "setSeasons", "writers", "getWriters", "setWriters", "pope-player_debug"})
public final class MediaMetadataFull {
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.database.models.MediaMetadataWithImages metadata;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.viewmodel.Season> seasons;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.database.models.Person> actors;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.database.models.Person> writers;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.database.models.Person> producers;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.database.models.Person> musicians;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.dewords.pope.database.models.Person> directors;
    
    public MediaMetadataFull() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.database.models.MediaMetadataWithImages getMetadata() {
        return null;
    }
    
    public final void setMetadata(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.database.models.MediaMetadataWithImages p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.viewmodel.Season> getSeasons() {
        return null;
    }
    
    public final void setSeasons(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.viewmodel.Season> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.database.models.Person> getActors() {
        return null;
    }
    
    public final void setActors(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.database.models.Person> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.database.models.Person> getWriters() {
        return null;
    }
    
    public final void setWriters(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.database.models.Person> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.database.models.Person> getProducers() {
        return null;
    }
    
    public final void setProducers(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.database.models.Person> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.database.models.Person> getMusicians() {
        return null;
    }
    
    public final void setMusicians(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.database.models.Person> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.dewords.pope.database.models.Person> getDirectors() {
        return null;
    }
    
    public final void setDirectors(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.database.models.Person> p0) {
    }
}