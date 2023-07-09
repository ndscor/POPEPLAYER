package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\u0010\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)J\u0006\u0010*\u001a\u00020%J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/dewords/pope/gui/audio/AudioTipsDelegate;", "", "activity", "Lcom/dewords/pope/gui/AudioPlayerContainerActivity;", "(Lcom/dewords/pope/gui/AudioPlayerContainerActivity;)V", "audioPlayerTips", "Landroidx/constraintlayout/widget/ConstraintLayout;", "audioTipsBackground", "Landroid/view/View;", "currentAnimations", "Ljava/util/ArrayList;", "Landroid/animation/Animator;", "currentTip", "Lcom/dewords/pope/gui/audio/AudioPlayerTipsStep;", "getCurrentTip", "()Lcom/dewords/pope/gui/audio/AudioPlayerTipsStep;", "setCurrentTip", "(Lcom/dewords/pope/gui/audio/AudioPlayerTipsStep;)V", "headerLargePlayPause", "Landroid/widget/ImageView;", "headerPrevious", "helpDescription", "Landroid/widget/TextView;", "helpTitle", "initialConstraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "nextButton", "Landroid/widget/Button;", "rightGuidelineEndBound", "", "tapGestureHorizontal", "tapIndicatorPlaylist", "tapIndicatorStop", "topGuidelineEndBound", "transition", "Landroidx/transition/Fade;", "clearAllAnimations", "", "close", "init", "vsc", "Landroid/view/ViewStub;", "next", "updateBackgroundPosition", "peek", "", "pope-player_debug"})
public final class AudioTipsDelegate {
    private final com.dewords.pope.gui.AudioPlayerContainerActivity activity = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.gui.audio.AudioPlayerTipsStep currentTip;
    private androidx.constraintlayout.widget.ConstraintSet initialConstraintSet;
    private androidx.constraintlayout.widget.ConstraintLayout audioPlayerTips;
    private android.view.View audioTipsBackground;
    private android.widget.ImageView headerPrevious;
    private android.view.View tapIndicatorPlaylist;
    private android.widget.ImageView headerLargePlayPause;
    private android.view.View tapIndicatorStop;
    private android.widget.Button nextButton;
    private android.view.View tapGestureHorizontal;
    private android.widget.TextView helpTitle;
    private android.widget.TextView helpDescription;
    private float rightGuidelineEndBound = 1.0F;
    private float topGuidelineEndBound = 0.0F;
    private final androidx.transition.Fade transition = null;
    private final java.util.ArrayList<android.animation.Animator> currentAnimations = null;
    
    public AudioTipsDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.AudioPlayerContainerActivity activity) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.gui.audio.AudioPlayerTipsStep getCurrentTip() {
        return null;
    }
    
    public final void setCurrentTip(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.audio.AudioPlayerTipsStep p0) {
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    android.view.ViewStub vsc) {
    }
    
    private final void updateBackgroundPosition(int peek) {
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