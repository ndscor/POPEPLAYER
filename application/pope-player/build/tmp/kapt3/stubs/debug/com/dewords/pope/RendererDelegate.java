package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0011\u0010\u0014\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/RendererDelegate;", "Lorg/videolan/libvlc/RendererDiscoverer$EventListener;", "()V", "TAG", "", "discoverers", "Ljava/util/ArrayList;", "Lorg/videolan/libvlc/RendererDiscoverer;", "renderers", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/libvlc/RendererItem;", "getRenderers", "()Lorg/videolan/tools/livedata/LiveDataset;", "started", "", "clear", "", "onEvent", "event", "Lorg/videolan/libvlc/RendererDiscoverer$Event;", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "pope-player_debug"})
public final class RendererDelegate implements org.videolan.libvlc.RendererDiscoverer.EventListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.RendererDelegate INSTANCE = null;
    private static final java.lang.String TAG = "VLC/RendererDelegate";
    private static final java.util.ArrayList<org.videolan.libvlc.RendererDiscoverer> discoverers = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.videolan.tools.livedata.LiveDataset<org.videolan.libvlc.RendererItem> renderers = null;
    @kotlin.jvm.Volatile()
    private static volatile boolean started = false;
    
    private RendererDelegate() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<org.videolan.libvlc.RendererItem> getRenderers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object start(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void stop() {
    }
    
    private final void clear() {
    }
    
    @java.lang.Override()
    public void onEvent(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.RendererDiscoverer.Event event) {
    }
}