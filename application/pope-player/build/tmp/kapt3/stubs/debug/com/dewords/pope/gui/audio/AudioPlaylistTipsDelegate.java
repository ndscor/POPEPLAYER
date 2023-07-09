package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020)J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u000103J \u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001aH\u0002J\u0006\u00108\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioPlaylistTipsDelegate;", "", "activity", "Lcom/dewords/pope/gui/AudioPlayerContainerActivity;", "(Lcom/dewords/pope/gui/AudioPlayerContainerActivity;)V", "audioPlaylistTips", "Landroidx/constraintlayout/widget/ConstraintLayout;", "currentAnimations", "Ljava/util/ArrayList;", "Landroid/animation/Animator;", "currentTip", "Lcom/dewords/pope/gui/audio/AudioPlaylistTipsStep;", "getCurrentTip", "()Lcom/dewords/pope/gui/audio/AudioPlaylistTipsStep;", "setCurrentTip", "(Lcom/dewords/pope/gui/audio/AudioPlaylistTipsStep;)V", "helpDescription", "Landroid/widget/TextView;", "helpTitle", "initialConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "middleGuidelineEndBound", "", "nextButton", "Landroid/widget/Button;", "plTipsTimeline", "Landroid/widget/SeekBar;", "rightGuidelineEndBound", "secondItemBinding", "Lcom/dewords/pope/databinding/PlaylistItemBinding;", "tapGestureHorizontal", "Landroid/view/View;", "tapIndicatorForward", "tapIndicatorRearrange", "tapIndicatorRewind", "thirdItemBinding", "tracksContainer", "Landroid/widget/LinearLayout;", "transition", "Landroidx/transition/Fade;", "clearAllAnimations", "", "close", "dragAndDrop", "Landroid/animation/AnimatorSet;", "indicatorView", "draggedView", "getItemColor", "", "init", "vsc", "Landroid/view/ViewStub;", "longTapSeek", "rewindIndicator", "forwardIndicator", "seekView", "next", "pope-player_debug"})
public final class AudioPlaylistTipsDelegate {
    private final com.dewords.pope.gui.AudioPlayerContainerActivity activity = null;
    private com.dewords.pope.databinding.PlaylistItemBinding thirdItemBinding;
    private com.dewords.pope.databinding.PlaylistItemBinding secondItemBinding;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.gui.audio.AudioPlaylistTipsStep currentTip;
    private androidx.constraintlayout.widget.ConstraintSet initialConstraintSet;
    private final androidx.transition.Fade transition = null;
    private final java.util.ArrayList<android.animation.Animator> currentAnimations = null;
    private androidx.constraintlayout.widget.ConstraintLayout audioPlaylistTips;
    private android.widget.LinearLayout tracksContainer;
    private android.widget.Button nextButton;
    private android.view.View tapIndicatorRearrange;
    private android.view.View tapGestureHorizontal;
    private android.view.View tapIndicatorRewind;
    private android.view.View tapIndicatorForward;
    private android.widget.SeekBar plTipsTimeline;
    private android.widget.TextView helpTitle;
    private android.widget.TextView helpDescription;
    private float rightGuidelineEndBound = 1.0F;
    private float middleGuidelineEndBound = 0.5F;
    
    public AudioPlaylistTipsDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.AudioPlayerContainerActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.gui.audio.AudioPlaylistTipsStep getCurrentTip() {
        return null;
    }
    
    public final void setCurrentTip(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.audio.AudioPlaylistTipsStep p0) {
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    android.view.ViewStub vsc) {
    }
    
    private final int getItemColor() {
        return 0;
    }
    
    /**
     * Start and get the drag and drop animation.
     * @param indicatorView: the tap indicator view
     * @param draggedView: the view that has to be dragged
     * @return the generated [ObjectAnimator]
     */
    private final android.animation.AnimatorSet dragAndDrop(android.view.View indicatorView, android.view.View draggedView) {
        return null;
    }
    
    /**
     * Start and get the long tap to seek animation.
     * @param rewindIndicator: the tap indicator view for the rewind action
     * @param forwardIndicator: the tap indicator view for the forward action
     * @param seekView: the seekbar that has to be animated
     * @return the generated [ObjectAnimator]
     */
    private final android.animation.AnimatorSet longTapSeek(android.view.View rewindIndicator, android.view.View forwardIndicator, android.widget.SeekBar seekView) {
        return null;
    }
    
    /**
     * Load the next tip screen depending on the currentTip
     */
    public final void next() {
    }
    
    /**
     * Close the tips, cancel all the animations, relaunch the playback
     */
    public final void close() {
    }
    
    /**
     * Clear all the launched animations
     */
    private final void clearAllAnimations() {
    }
}