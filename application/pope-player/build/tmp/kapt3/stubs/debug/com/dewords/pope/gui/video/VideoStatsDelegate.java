package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ \u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010,\u001a\u00020\u0006J\b\u0010-\u001a\u00020\u0006H\u0002J\u0006\u0010.\u001a\u00020\u0006J\u0006\u0010/\u001a\u00020\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020!8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/dewords/pope/gui/video/VideoStatsDelegate;", "", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "scrolling", "Lkotlin/Function0;", "", "idle", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "binding", "Lcom/dewords/pope/databinding/PlayerHudBinding;", "getBinding", "()Lcom/dewords/pope/databinding/PlayerHudBinding;", "setBinding", "(Lcom/dewords/pope/databinding/PlayerHudBinding;)V", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "constraintSetLarge", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "firstTimecode", "", "getIdle", "()Lkotlin/jvm/functions/Function0;", "lastMediaUri", "Landroid/net/Uri;", "plotHandler", "Landroid/os/Handler;", "runnable", "Ljava/lang/Runnable;", "getScrolling", "started", "", "addStreamGridView", "grid", "Landroid/widget/GridLayout;", "titleString", "", "valueString", "initPlotView", "onConfigurationChanged", "setupLayout", "start", "stop", "pope-player_debug"})
public final class VideoStatsDelegate {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> scrolling = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> idle = null;
    public androidx.constraintlayout.widget.ConstraintLayout container;
    private android.net.Uri lastMediaUri;
    private boolean started = false;
    private final android.os.Handler plotHandler = null;
    private final long firstTimecode = 0L;
    public com.dewords.pope.databinding.PlayerHudBinding binding;
    private androidx.constraintlayout.widget.ConstraintSet constraintSet;
    private androidx.constraintlayout.widget.ConstraintSet constraintSetLarge;
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final java.lang.Runnable runnable = null;
    
    public VideoStatsDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> scrolling, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> idle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getScrolling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getIdle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getContainer() {
        return null;
    }
    
    public final void setContainer(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.PlayerHudBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.PlayerHudBinding p0) {
    }
    
    public final void stop() {
    }
    
    public final void start() {
    }
    
    public final void initPlotView(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.PlayerHudBinding binding) {
    }
    
    private final void addStreamGridView(android.widget.GridLayout grid, java.lang.String titleString, java.lang.String valueString) {
    }
    
    public final void onConfigurationChanged() {
    }
    
    private final void setupLayout() {
    }
}