package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/dewords/pope/repository/MediaResolverApi;", "", "()V", "getMedia", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "showId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaCast", "Lcom/dewords/pope/models/resolver/ResolverCasting;", "resolverId", "searchMedia", "Lcom/dewords/pope/models/resolver/ResolverResult;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMediaBatch", "", "Lcom/dewords/pope/models/resolver/ResolverBatchResult;", "filesToIndex", "Ljava/util/HashMap;", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchTitle", "query", "pope-player_debug"})
public abstract class MediaResolverApi {
    
    public MediaResolverApi() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMediaBatch(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Long, android.net.Uri> filesToIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends com.dewords.pope.models.resolver.ResolverBatchResult>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String showId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.resolver.ResolverMedia> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.resolver.ResolverResult> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMediaCast(@org.jetbrains.annotations.NotNull()
    java.lang.String resolverId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.resolver.ResolverCasting> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMedia(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.models.resolver.ResolverResult> continuation);
}