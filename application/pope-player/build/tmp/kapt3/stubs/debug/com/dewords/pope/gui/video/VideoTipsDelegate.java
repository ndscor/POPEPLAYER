package com.dewords.pope.gui.video;

import java.lang.System;

/**
 * Delegate to manage the video tips workflow.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00105\u001a\u000206H\u0002J\u0006\u00107\u001a\u000206J2\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00162\b\b\u0002\u0010;\u001a\u00020<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0016H\u0002J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00160@H\u0002\u00a2\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u000206J\u0006\u0010C\u001a\u000206J\u0012\u0010D\u001a\u0002062\b\u0010E\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020/2\u0006\u0010I\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/dewords/pope/gui/video/VideoTipsDelegate;", "Landroid/view/View$OnClickListener;", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "currentAnimations", "Ljava/util/ArrayList;", "Landroid/animation/Animator;", "currentControl", "", "getCurrentControl", "()Ljava/lang/Integer;", "setCurrentControl", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "currentTip", "Lcom/dewords/pope/gui/video/VideoPlayerTipsStep;", "getCurrentTip", "()Lcom/dewords/pope/gui/video/VideoPlayerTipsStep;", "setCurrentTip", "(Lcom/dewords/pope/gui/video/VideoPlayerTipsStep;)V", "doubleTapCenter", "Landroid/view/View;", "doubleTapLeft", "doubleTapRight", "helpDescription", "Landroid/widget/TextView;", "helpTitle", "initialConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "nextButton", "Landroid/widget/Button;", "overlayTipsLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "seekForwardFirst", "Landroid/widget/ImageView;", "seekForwardSecond", "seekRewindFirst", "seekRewindSecond", "tapGesture", "tapGestureHorizontal", "tapIndicatorAdvanced", "tapIndicatorOrientation", "tapIndicatorPlay", "tapIndicatorRatio", "tapIndicatorTracks", "tipsBrightnessProgress", "Lcom/dewords/pope/gui/view/PlayerProgress;", "tipsBrightnessText", "tipsVolumeProgress", "tipsVolumeText", "transition", "Landroidx/transition/Fade;", "clearAllAnimations", "", "close", "doubleTap", "Landroid/animation/AnimatorSet;", "view", "repeat", "", "firstSeek", "secondSeek", "getTapIndicators", "", "()[Landroid/view/View;", "init", "next", "onClick", "v", "swipe", "Landroid/animation/ObjectAnimator;", "progress", "textView", "pope-player_debug"})
public final class VideoTipsDelegate implements android.view.View.OnClickListener {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.gui.video.VideoPlayerTipsStep currentTip;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer currentControl;
    private androidx.constraintlayout.widget.ConstraintSet initialConstraintSet;
    private final androidx.transition.Fade transition = null;
    private final java.util.ArrayList<android.animation.Animator> currentAnimations = null;
    private com.dewords.pope.gui.view.PlayerProgress tipsBrightnessProgress;
    private com.dewords.pope.gui.view.PlayerProgress tipsVolumeProgress;
    private androidx.constraintlayout.widget.ConstraintLayout overlayTipsLayout;
    private android.view.View tapIndicatorTracks;
    private android.view.View tapIndicatorOrientation;
    private android.view.View tapIndicatorPlay;
    private android.view.View tapIndicatorRatio;
    private android.view.View tapIndicatorAdvanced;
    private android.view.View tapGesture;
    private android.widget.Button nextButton;
    private android.widget.TextView tipsBrightnessText;
    private android.widget.TextView tipsVolumeText;
    private android.view.View doubleTapCenter;
    private android.view.View doubleTapLeft;
    private android.view.View doubleTapRight;
    private android.widget.ImageView seekRewindFirst;
    private android.widget.ImageView seekRewindSecond;
    private android.widget.ImageView seekForwardFirst;
    private android.widget.ImageView seekForwardSecond;
    private android.view.View tapGestureHorizontal;
    private android.widget.TextView helpTitle;
    private android.widget.TextView helpDescription;
    
    public VideoTipsDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.gui.video.VideoPlayerTipsStep getCurrentTip() {
        return null;
    }
    
    public final void setCurrentTip(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.video.VideoPlayerTipsStep p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentControl() {
        return null;
    }
    
    public final void setCurrentControl(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    /**
     * Init the tips:
     * - Inflate the views
     * - Initialize some views
     * - Start the tips
     */
    public final void init() {
    }
    
    /**
     * Get all the tap indicators
     * @return the list of all the tap indicators
     */
    private final android.view.View[] getTapIndicators() {
        return null;
    }
    
    /**
     * Get a double tap anim, with a seek animation if needed
     * @param view: the view to animate
     * @param repeat: should the animation take care of the loop. If set to false, the animation won't loop
     * @param firstSeek: if a seek animation has to be added, the first view to animate
     * @param secondSeek: if a seek animation has to be added, the second view to animate
     * @return the [AnimatorSet]
     */
    private final android.animation.AnimatorSet doubleTap(android.view.View view, boolean repeat, android.view.View firstSeek, android.view.View secondSeek) {
        return null;
    }
    
    /**
     * Start and get the swipe animation. Animates the [PlayerProgress] and updates the [TextView] as well
     * @param progress: the progress view to animate during the swipe
     * @param textView: the textview the update during the swipe
     * @return the generated [ObjectAnimator]
     */
    private final android.animation.ObjectAnimator swipe(com.dewords.pope.gui.view.PlayerProgress progress, android.widget.TextView textView) {
        return null;
    }
    
    /**
     * Load the next tip screen depending on the currentTip
     */
    public final void next() {
    }
    
    /**
     * Clear all the launched animations
     */
    private final void clearAllAnimations() {
    }
    
    /**
     * Close the tips, cancel all the animations, relaunch the playback
     */
    public final void close() {
    }
    
    /**
     * Click listener for the tap indicators
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}