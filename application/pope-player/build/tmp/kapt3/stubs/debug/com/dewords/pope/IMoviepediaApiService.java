package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/IMoviepediaApiService;", "", "getMedia", "Lcom/dewords/pope/models/identify/MoviepediaMedia;", "mediaId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaCast", "Lcom/dewords/pope/models/media/cast/CastResult;", "searchMedia", "Lcom/dewords/pope/models/identify/IdentifyResult;", "body", "Lcom/dewords/pope/models/body/ScrobbleBody;", "(Lcom/dewords/pope/models/body/ScrobbleBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMediaBatch", "", "Lcom/dewords/pope/models/identify/IdentifyBatchResult;", "Lcom/dewords/pope/models/body/ScrobbleBodyBatch;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public abstract interface IMoviepediaApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "search-media/identify")
    public abstract java.lang.Object searchMedia(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dewords.pope.models.body.ScrobbleBody body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.identify.IdentifyResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "search-media/batchidentify")
    public abstract java.lang.Object searchMediaBatch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.List<com.dewords.pope.models.body.ScrobbleBodyBatch> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.models.identify.IdentifyBatchResult>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "media/{media}")
    public abstract java.lang.Object getMedia(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "media")
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.identify.MoviepediaMedia> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "media/{media}/cast")
    public abstract java.lang.Object getMediaCast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "media")
    java.lang.String mediaId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.media.cast.CastResult> continuation);
}