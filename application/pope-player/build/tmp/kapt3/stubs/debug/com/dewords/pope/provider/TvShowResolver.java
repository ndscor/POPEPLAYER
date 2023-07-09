package com.dewords.pope.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J5\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/provider/TvShowResolver;", "Lcom/dewords/poperesources/interfaces/IMediaContentResolver;", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "getList", "Lkotlin/Pair;", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "", "context", "Landroid/content/Context;", "id", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
final class TvShowResolver implements com.dewords.poperesources.interfaces.IMediaContentResolver {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.provider.TvShowResolver INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String prefix = "content_episode_";
    
    private TvShowResolver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>, java.lang.Integer>> continuation) {
        return null;
    }
}