package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J.\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerScreenshotDelegate;", "", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "container", "Landroid/widget/FrameLayout;", "flash", "Landroid/view/View;", "screenshotActions", "screenshotImageBackground", "screenshotImageView", "Landroid/widget/ImageView;", "screenshotShare", "hide", "", "initScreenshot", "takeScreenshot", "dst", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "surfaceBounds", "", "width", "", "height", "pope-player_debug"})
public final class VideoPlayerScreenshotDelegate {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    private android.view.View screenshotImageBackground;
    private android.widget.FrameLayout screenshotActions;
    private android.view.View flash;
    private android.view.View screenshotShare;
    private android.widget.ImageView screenshotImageView;
    private android.widget.FrameLayout container;
    
    public VideoPlayerScreenshotDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    /**
     * Inflates the screenshot layout and retrieve the views
     */
    private final void initScreenshot() {
    }
    
    /**
     * Display the screenshot that has just been taken
     *
     * @param dst the screenshot file
     * @param bitmap the screenshot bitmap
     * @param surfaceBounds the surface view bounds
     * @param width the screenshot width
     * @param height the screenshot height
     */
    public final void takeScreenshot(@org.jetbrains.annotations.NotNull()
    java.io.File dst, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    int[] surfaceBounds, int width, int height) {
    }
    
    /**
     * Hides the screenshot UI
     */
    public final void hide() {
    }
}