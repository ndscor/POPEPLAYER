package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J?\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/MediaScraper;", "", "()V", "indexListener", "Lcom/dewords/poperesources/interfaces/IndexingListener;", "getIndexListener", "()Lcom/dewords/poperesources/interfaces/IndexingListener;", "mediaResolverApi", "Lcom/dewords/pope/repository/MediaResolverApi;", "getMediaResolverApi", "()Lcom/dewords/pope/repository/MediaResolverApi;", "mediaResolverApi$delegate", "Lkotlin/Lazy;", "indexMedialib", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "removePersonOrphans", "", "retrieveCasting", "mediaMetadata", "Lcom/dewords/pope/database/models/MediaMetadata;", "(Landroid/content/Context;Lcom/dewords/pope/database/models/MediaMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMediaMetadata", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "item", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "retrieveCast", "", "(Landroid/content/Context;Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Lcom/dewords/pope/models/resolver/ResolverMedia;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public final class MediaScraper {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.MediaScraper INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy mediaResolverApi$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.dewords.poperesources.interfaces.IndexingListener indexListener = null;
    
    private MediaScraper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.repository.MediaResolverApi getMediaResolverApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job indexMedialib(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final void removePersonOrphans(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMediaMetadata(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.models.resolver.ResolverMedia item, boolean retrieveCast, boolean removePersonOrphans, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object retrieveCasting(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadata mediaMetadata, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.poperesources.interfaces.IndexingListener getIndexListener() {
        return null;
    }
}