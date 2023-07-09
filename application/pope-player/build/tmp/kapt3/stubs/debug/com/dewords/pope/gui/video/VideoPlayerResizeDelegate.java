package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\r\u0010\u0019\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerResizeDelegate;", "", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "foldCheckbox", "Landroid/widget/CheckBox;", "notchCheckbox", "overlayDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "getOverlayDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "resizeMainView", "Landroid/view/View;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "sizeAdapter", "Lcom/dewords/pope/gui/video/SizeAdapter;", "sizeList", "Landroidx/recyclerview/widget/RecyclerView;", "displayResize", "", "hideResizeOverlay", "", "isShowing", "resizeVideo", "()Ljava/lang/Boolean;", "setVideoScale", "scale", "Lorg/videolan/libvlc/MediaPlayer$ScaleType;", "(Lorg/videolan/libvlc/MediaPlayer$ScaleType;)Lkotlin/Unit;", "showResizeOverlay", "pope-player_debug"})
public final class VideoPlayerResizeDelegate {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    private android.view.View resizeMainView;
    private android.widget.CheckBox notchCheckbox;
    private android.widget.CheckBox foldCheckbox;
    private androidx.core.widget.NestedScrollView scrollView;
    private androidx.recyclerview.widget.RecyclerView sizeList;
    private com.dewords.pope.gui.video.SizeAdapter sizeAdapter;
    
    public VideoPlayerResizeDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    private final com.dewords.pope.gui.video.VideoPlayerOverlayDelegate getOverlayDelegate() {
        return null;
    }
    
    /**
     * Check if the resize overlay is currently shown
     * @return true if it's shown
     */
    public final boolean isShowing() {
        return false;
    }
    
    /**
     * Show the resize overlay. Inflate it if it's not yet
     */
    public final void showResizeOverlay() {
    }
    
    /**
     * Hide the overlay
     */
    public final void hideResizeOverlay() {
    }
    
    /**
     * Resize the video layout to a aspect ratio. It uses the next aspect ratio in line to loop in the different aspect ratio of  [MediaPlayer.ScaleType.getMainScaleTypes()]
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean resizeVideo() {
        return null;
    }
    
    /**
     * Resize the video layout to a given aspect ratio
     * @param scale the new aspect ratio
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit setVideoScale(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.ScaleType scale) {
        return null;
    }
    
    /**
     * display the resize overlay and hide everything else
     */
    public final boolean displayResize() {
        return false;
    }
}