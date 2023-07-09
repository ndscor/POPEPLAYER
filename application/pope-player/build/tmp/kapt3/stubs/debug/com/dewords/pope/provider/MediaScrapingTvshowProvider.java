package com.dewords.pope.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u0010\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J \u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/provider/MediaScrapingTvshowProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAllEpisodesForShow", "", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMedias", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "seasons", "Lcom/dewords/pope/viewmodel/Season;", "getAllSeasons", "tvShow", "(Lcom/dewords/pope/database/models/MediaMetadataWithImages;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirstResumableEpisode", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "mediaMetadataEpisodes", "getResumeMedias", "getResumeMediasById", "getShowIdForEpisode", "Companion", "pope-player_debug"})
public final class MediaScrapingTvshowProvider {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.provider.MediaScrapingTvshowProvider.Companion Companion = null;
    
    public MediaScrapingTvshowProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    public final com.dewords.pope.database.models.MediaMetadataWithImages getFirstResumableEpisode(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.Medialibrary medialibrary, @org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages> mediaMetadataEpisodes) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllSeasons(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataWithImages tvShow, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.viewmodel.Season>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShowIdForEpisode(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResumeMediasById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> getResumeMedias(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.viewmodel.Season> seasons) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllEpisodesForShow(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.database.models.MediaMetadataWithImages>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> getAllMedias(@org.jetbrains.annotations.Nullable()
    java.util.List<com.dewords.pope.viewmodel.Season> seasons) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/provider/MediaScrapingTvshowProvider$Companion;", "", "()V", "getProviders", "", "Lcom/dewords/poperesources/interfaces/IMediaContentResolver;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.dewords.poperesources.interfaces.IMediaContentResolver> getProviders() {
            return null;
        }
    }
}