package com.dewords.pope.models.identify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\b\u0010\u0007\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/models/identify/IdentifyBatchResult;", "Lcom/dewords/pope/models/resolver/ResolverBatchResult;", "id", "", "lucky", "Lcom/dewords/pope/models/identify/MoviepediaMedia;", "(Ljava/lang/String;Lcom/dewords/pope/models/identify/MoviepediaMedia;)V", "getId", "()Ljava/lang/String;", "getLucky", "()Lcom/dewords/pope/models/identify/MoviepediaMedia;", "component1", "component2", "copy", "equals", "", "other", "", "", "getMedia", "hashCode", "", "toString", "pope-player_debug"})
public final class IdentifyBatchResult extends com.dewords.pope.models.resolver.ResolverBatchResult {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final com.dewords.pope.models.identify.MoviepediaMedia lucky = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.models.identify.IdentifyBatchResult copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lucky")
    com.dewords.pope.models.identify.MoviepediaMedia lucky) {
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
    
    public IdentifyBatchResult(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lucky")
    com.dewords.pope.models.identify.MoviepediaMedia lucky) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.MoviepediaMedia component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.models.identify.MoviepediaMedia getLucky() {
        return null;
    }
    
    @java.lang.Override()
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.dewords.pope.models.identify.MoviepediaMedia getMedia() {
        return null;
    }
}