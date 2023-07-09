package com.dewords.pope.models.identify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/models/identify/IdentifyResult;", "Lcom/dewords/pope/models/resolver/ResolverResult;", "lucky", "Lcom/dewords/pope/models/identify/MoviepediaMedia;", "results", "", "(Lcom/dewords/pope/models/identify/MoviepediaMedia;Ljava/util/List;)V", "getLucky", "()Lcom/dewords/pope/models/identify/MoviepediaMedia;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "pope-player_debug"})
public final class IdentifyResult extends com.dewords.pope.models.resolver.ResolverResult {
    @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lucky")
    private final com.dewords.pope.models.identify.MoviepediaMedia lucky = null;
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "results")
    private final java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> results = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.models.identify.IdentifyResult copy(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.models.identify.MoviepediaMedia lucky, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> results) {
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
    
    public IdentifyResult(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.models.identify.MoviepediaMedia lucky, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> results) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.MoviepediaMedia component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.MoviepediaMedia getLucky() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.dewords.pope.models.identify.MoviepediaMedia lucky() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.dewords.pope.models.identify.MoviepediaMedia> results() {
        return null;
    }
}