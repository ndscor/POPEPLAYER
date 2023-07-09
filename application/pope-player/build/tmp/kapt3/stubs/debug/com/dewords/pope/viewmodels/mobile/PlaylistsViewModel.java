package com.dewords.pope.viewmodels.mobile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u00170\u0016X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/dewords/pope/viewmodels/mobile/PlaylistsViewModel;", "Lcom/dewords/pope/viewmodels/MedialibraryViewModel;", "context", "Landroid/content/Context;", "type", "Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;", "(Landroid/content/Context;Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;)V", "displayModeKey", "", "getDisplayModeKey", "()Ljava/lang/String;", "provider", "Lcom/dewords/pope/providers/medialibrary/PlaylistsProvider;", "getProvider", "()Lcom/dewords/pope/providers/medialibrary/PlaylistsProvider;", "providerInCard", "", "getProviderInCard", "()Z", "setProviderInCard", "(Z)V", "providers", "", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getProviders", "()[Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "[Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "Factory", "pope-player_debug"})
public final class PlaylistsViewModel extends com.dewords.pope.viewmodels.MedialibraryViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayModeKey = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.providers.medialibrary.PlaylistsProvider provider = null;
    private boolean providerInCard = true;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.providers.medialibrary.MedialibraryProvider<? extends org.videolan.medialibrary.media.MediaLibraryItem>[] providers = null;
    
    public PlaylistsViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.Playlist.Type type) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayModeKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.providers.medialibrary.PlaylistsProvider getProvider() {
        return null;
    }
    
    public final boolean getProviderInCard() {
        return false;
    }
    
    public final void setProviderInCard(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.providers.medialibrary.MedialibraryProvider<? extends org.videolan.medialibrary.media.MediaLibraryItem>[] getProviders() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/viewmodels/mobile/PlaylistsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "context", "Landroid/content/Context;", "type", "Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;", "(Landroid/content/Context;Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;)V", "getContext", "()Landroid/content/Context;", "getType", "()Lorg/videolan/medialibrary/interfaces/media/Playlist$Type;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final org.videolan.medialibrary.interfaces.media.Playlist.Type type = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.interfaces.media.Playlist.Type type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.videolan.medialibrary.interfaces.media.Playlist.Type getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}