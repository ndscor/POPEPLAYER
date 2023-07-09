package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerOrientationDelegate;", "", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "orientationAdapter", "Lcom/dewords/pope/gui/video/OrientationAdapter;", "orientationList", "Landroidx/recyclerview/widget/RecyclerView;", "orientationMainView", "Landroid/view/View;", "overlayDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "getOverlayDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "displayOrientation", "", "hideOrientationOverlay", "", "isShowing", "showOrientationOverlay", "pope-player_debug"})
public final class VideoPlayerOrientationDelegate {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    private android.view.View orientationMainView;
    private androidx.core.widget.NestedScrollView scrollView;
    private androidx.recyclerview.widget.RecyclerView orientationList;
    private com.dewords.pope.gui.video.OrientationAdapter orientationAdapter;
    
    public VideoPlayerOrientationDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    private final com.dewords.pope.gui.video.VideoPlayerOverlayDelegate getOverlayDelegate() {
        return null;
    }
    
    /**
     * Check if the orientation overlay is currently shown
     * @return true if it's shown
     */
    public final boolean isShowing() {
        return false;
    }
    
    /**
     * Show the orientation overlay. Inflate it if it's not yet
     */
    private final void showOrientationOverlay() {
    }
    
    /**
     * Hide the overlay
     */
    public final void hideOrientationOverlay() {
    }
    
    /**
     * display the orientation overlay and hide everything else
     */
    public final boolean displayOrientation() {
        return false;
    }
}