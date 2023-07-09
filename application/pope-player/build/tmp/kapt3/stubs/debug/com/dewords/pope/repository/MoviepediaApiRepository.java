package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\"\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016j\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010`\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/repository/MoviepediaApiRepository;", "Lcom/dewords/pope/repository/MediaResolverApi;", "moviepediaApiService", "Lcom/dewords/pope/IMoviepediaApiService;", "(Lcom/dewords/pope/IMoviepediaApiService;)V", "getMedia", "Lcom/dewords/pope/models/identify/MoviepediaMedia;", "showId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaCast", "Lcom/dewords/pope/models/media/cast/CastResult;", "resolverId", "searchMedia", "Lcom/dewords/pope/models/resolver/ResolverResult;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMediaBatch", "", "Lcom/dewords/pope/models/resolver/ResolverBatchResult;", "uris", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchTitle", "Lcom/dewords/pope/models/identify/IdentifyResult;", "query", "Companion", "pope-player_debug"})
public final class MoviepediaApiRepository extends com.dewords.pope.repository.MediaResolverApi {
    private final com.dewords.pope.IMoviepediaApiService moviepediaApiService = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.MoviepediaApiRepository.Companion Companion = null;
    private static final com.dewords.pope.repository.MoviepediaApiRepository instance = null;
    
    public MoviepediaApiRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.IMoviepediaApiService moviepediaApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchMedia(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.resolver.ResolverResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchMediaBatch(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Long, android.net.Uri> uris, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.dewords.pope.models.resolver.ResolverBatchResult>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.identify.IdentifyResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String showId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.identify.MoviepediaMedia> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMediaCast(@org.jetbrains.annotations.NotNull()
    java.lang.String resolverId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.media.cast.CastResult> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/repository/MoviepediaApiRepository$Companion;", "", "()V", "instance", "Lcom/dewords/pope/repository/MoviepediaApiRepository;", "getInstance", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.repository.MoviepediaApiRepository getInstance() {
            return null;
        }
    }
}