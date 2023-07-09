package com.dewords.pope.gui.video;

import java.lang.System;

/**
 * Steps for the tips
 * @param titleText: the string resource to display in the title [TextView]
 * @param descriptionText: the string resource to display in the description [TextView]
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0000R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerTipsStep;", "", "titleText", "", "descriptionText", "(Ljava/lang/String;III)V", "getDescriptionText", "()I", "setDescriptionText", "(I)V", "getTitleText", "setTitleText", "next", "CONTROLS", "BRIGHTNESS", "VOLUME", "PAUSE", "SEEK_TAP", "SEEK", "pope-player_debug"})
public enum VideoPlayerTipsStep {
    /*public static final*/ CONTROLS /* = new CONTROLS(0, 0) */,
    /*public static final*/ BRIGHTNESS /* = new BRIGHTNESS(0, 0) */,
    /*public static final*/ VOLUME /* = new VOLUME(0, 0) */,
    /*public static final*/ PAUSE /* = new PAUSE(0, 0) */,
    /*public static final*/ SEEK_TAP /* = new SEEK_TAP(0, 0) */,
    /*public static final*/ SEEK /* = new SEEK(0, 0) */;
    private int titleText;
    private int descriptionText;
    
    VideoPlayerTipsStep(@androidx.annotation.StringRes()
    int titleText, @androidx.annotation.StringRes()
    int descriptionText) {
    }
    
    public final int getTitleText() {
        return 0;
    }
    
    public final void setTitleText(int p0) {
    }
    
    public final int getDescriptionText() {
        return 0;
    }
    
    public final void setDescriptionText(int p0) {
    }
    
    /**
     * @return the next step
     */
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoPlayerTipsStep next() {
        return null;
    }
}