package com.dewords.pope;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/PreviewVideoInputService;", "Landroid/media/tv/TvInputService;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "factory", "Lorg/videolan/libvlc/interfaces/IMediaFactory;", "getFactory$pope_player_debug", "()Lorg/videolan/libvlc/interfaces/IMediaFactory;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "getApplicationContext", "onCreateSession", "Landroid/media/tv/TvInputService$Session;", "inputId", "", "onDestroy", "PreviewSession", "pope-player_debug"})
public final class PreviewVideoInputService extends android.media.tv.TvInputService implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.libvlc.interfaces.IMediaFactory factory = null;
    
    public PreviewVideoInputService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.libvlc.interfaces.IMediaFactory getFactory$pope_player_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.media.tv.TvInputService.Session onCreateSession(@org.jetbrains.annotations.NotNull()
    java.lang.String inputId) {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getApplicationContext() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0014\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/dewords/pope/PreviewVideoInputService$PreviewSession;", "Landroid/media/tv/TvInputService$Session;", "Lcom/dewords/pope/media/MediaPlayerEventListener;", "context", "Landroid/content/Context;", "(Lcom/dewords/pope/PreviewVideoInputService;Landroid/content/Context;)V", "height", "", "player", "Lcom/dewords/pope/media/PlayerController;", "getPlayer", "()Lcom/dewords/pope/media/PlayerController;", "player$delegate", "Lkotlin/Lazy;", "surface", "Landroid/view/Surface;", "surfaceReady", "Lkotlinx/coroutines/CompletableDeferred;", "", "width", "awaitSurface", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onEvent", "event", "Lorg/videolan/libvlc/MediaPlayer$Event;", "(Lorg/videolan/libvlc/MediaPlayer$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRelease", "onSetCaptionEnabled", "enabled", "", "onSetStreamVolume", "volume", "", "onSetSurface", "onSurfaceChanged", "format", "onTune", "uri", "Landroid/net/Uri;", "pope-player_debug"})
    final class PreviewSession extends android.media.tv.TvInputService.Session implements com.dewords.pope.media.MediaPlayerEventListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy player$delegate = null;
        private int width = 0;
        private int height = 0;
        private android.view.Surface surface;
        private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> surfaceReady;
        
        public PreviewSession(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.media.PlayerController getPlayer() {
            return null;
        }
        
        @java.lang.Override()
        public void onRelease() {
        }
        
        @java.lang.Override()
        public boolean onTune(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onSetSurface(@org.jetbrains.annotations.Nullable()
        android.view.Surface surface) {
            return false;
        }
        
        @java.lang.Override()
        public void onSurfaceChanged(int format, int width, int height) {
        }
        
        @java.lang.Override()
        public void onSetStreamVolume(float volume) {
        }
        
        @java.lang.Override()
        public void onSetCaptionEnabled(boolean enabled) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object onEvent(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.MediaPlayer.Event event, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        private final java.lang.Object awaitSurface(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
    }
}