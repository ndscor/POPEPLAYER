package com.dewords.pope.gui.video;

import java.lang.System;

/**
 * Delegate for delay management.
 *
 * @property player the player activity instance the delegate is attached to
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0018J\u0018\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020!H\u0016J\b\u0010,\u001a\u00020!H\u0002J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010/\u001a\u00020!H\u0016J\b\u00100\u001a\u00020!H\u0007J\b\u00101\u001a\u00020!H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/dewords/pope/gui/video/VideoDelayDelegate;", "Landroid/view/View$OnClickListener;", "Lcom/dewords/pope/interfaces/IPlaybackSettingsController;", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "audioDelay", "", "btSaveListener", "close", "Landroid/widget/ImageView;", "delayApplyAll", "Lcom/google/android/material/button/MaterialButton;", "delayApplyBt", "delayContainer", "Landroid/view/View;", "delayFirstButton", "delayInfo", "Landroid/widget/TextView;", "delayInfoContainer", "delayResetButton", "delaySecondButton", "delayTitle", "playbackSetting", "Lcom/dewords/pope/interfaces/IPlaybackSettingsController$DelayState;", "getPlaybackSetting", "()Lcom/dewords/pope/interfaces/IPlaybackSettingsController$DelayState;", "setPlaybackSetting", "(Lcom/dewords/pope/interfaces/IPlaybackSettingsController$DelayState;)V", "playbackSettingMinus", "playbackSettingPlus", "spuDelay", "delayAudioOrSpu", "", "delta", "fromCustom", "", "delayState", "delayChanged", "delayValues", "Lcom/dewords/pope/media/DelayValues;", "service", "Lcom/dewords/pope/PlaybackService;", "endPlaybackSetting", "initPlaybackSettingInfo", "onClick", "v", "showAudioDelaySetting", "showDelayControls", "showSubsDelaySetting", "pope-player_debug"})
public final class VideoDelayDelegate implements android.view.View.OnClickListener, com.dewords.pope.interfaces.IPlaybackSettingsController {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    @org.jetbrains.annotations.NotNull()
    private com.dewords.pope.interfaces.IPlaybackSettingsController.DelayState playbackSetting = com.dewords.pope.interfaces.IPlaybackSettingsController.DelayState.OFF;
    private long spuDelay = 0L;
    private long audioDelay = 0L;
    private android.widget.ImageView playbackSettingPlus;
    private android.widget.ImageView playbackSettingMinus;
    private com.google.android.material.button.MaterialButton delayFirstButton;
    private com.google.android.material.button.MaterialButton delaySecondButton;
    private com.google.android.material.button.MaterialButton delayResetButton;
    private android.view.View delayInfoContainer;
    private android.widget.TextView delayInfo;
    private android.widget.TextView delayTitle;
    private android.view.View delayContainer;
    private com.google.android.material.button.MaterialButton delayApplyAll;
    private com.google.android.material.button.MaterialButton delayApplyBt;
    private android.widget.ImageView close;
    private final android.view.View.OnClickListener btSaveListener = null;
    
    public VideoDelayDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.interfaces.IPlaybackSettingsController.DelayState getPlaybackSetting() {
        return null;
    }
    
    public final void setPlaybackSetting(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IPlaybackSettingsController.DelayState p0) {
    }
    
    /**
     * Instantiate all the views, set their click listeners and shows the view.
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void showDelayControls() {
    }
    
    /**
     * Initialize the whole delay view state
     */
    private final void initPlaybackSettingInfo() {
    }
    
    /**
     * Click listener for all the views
     *
     * @param v the view that has been clicked
     */
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    /**
     * Delay audio or spu for the video
     *
     * @param delta the delay to set
     * @param fromCustom does the delay change come from the custom buttons? If so, the delay should always be added to the previous one
     */
    public final void delayAudioOrSpu(long delta, boolean fromCustom, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IPlaybackSettingsController.DelayState delayState) {
    }
    
    /**
     * Set [playbackSetting] to the right value and shows the view
     */
    @java.lang.Override()
    public void showAudioDelaySetting() {
    }
    
    /**
     * Set [playbackSetting] to the right value and shows the view
     */
    @java.lang.Override()
    public void showSubsDelaySetting() {
    }
    
    /**
     * Close the view and remove the listeners
     */
    @java.lang.Override()
    public void endPlaybackSetting() {
    }
    
    /**
     * Setup the delay values when the livedata has changed
     *
     * @param delayValues the new values for the delay
     * @param service the playback service instance
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    public final void delayChanged(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.media.DelayValues delayValues, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService service) {
    }
}