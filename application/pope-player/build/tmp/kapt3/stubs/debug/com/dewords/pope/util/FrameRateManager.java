package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/dewords/pope/util/FrameRateManager;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "service", "Lcom/dewords/pope/PlaybackService;", "(Landroidx/fragment/app/FragmentActivity;Lcom/dewords/pope/PlaybackService;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "displayListener", "Landroid/hardware/display/DisplayManager$DisplayListener;", "getService", "()Lcom/dewords/pope/PlaybackService;", "getDisplayManager", "Landroid/hardware/display/DisplayManager;", "matchFrameRate", "", "surfaceView", "Landroid/view/SurfaceView;", "window", "Landroid/view/Window;", "setFrameRateM", "videoFrameRate", "", "setFrameRateR", "surface", "Landroid/view/Surface;", "setFrameRateS", "pope-player_debug"})
public final class FrameRateManager {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.PlaybackService service = null;
    private final android.hardware.display.DisplayManager.DisplayListener displayListener = null;
    
    public FrameRateManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    /**
     * Retrieve the [DisplayManager]
     *
     * @return the current [DisplayManager]
     */
    private final android.hardware.display.DisplayManager getDisplayManager() {
        return null;
    }
    
    public final void matchFrameRate(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceView surfaceView, @org.jetbrains.annotations.NotNull()
    android.view.Window window) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.R)
    public final void setFrameRateR(float videoFrameRate, @org.jetbrains.annotations.NotNull()
    android.view.Surface surface) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.S)
    public final void setFrameRateS(float videoFrameRate, @org.jetbrains.annotations.NotNull()
    android.view.Surface surface) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void setFrameRateM(float videoFrameRate, @org.jetbrains.annotations.NotNull()
    android.view.Window window) {
    }
}