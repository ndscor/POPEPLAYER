package com.dewords.pope.gui.helpers;

import java.lang.System;

/**
 * Interface describing the methods that can be triggered by key events
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/KeycodeListener;", "", "bookmark", "", "decreaseRate", "increaseRate", "isReady", "", "next", "previous", "resetRate", "seek", "delta", "", "showAdvancedOptions", "showEqualizer", "stop", "togglePlayPause", "pope-player_debug"})
public abstract interface KeycodeListener {
    
    /**
     * Get the readiness state of the callee. I not ready, no event will be triggered
     * @return true if the callee is ready
     */
    public abstract boolean isReady();
    
    /**
     * Opens the advanced options menu
     */
    public abstract void showAdvancedOptions();
    
    /**
     * Switch between the playing and pause states of the player
     */
    public abstract void togglePlayPause();
    
    /**
     * Go to the next track in the playqueue
     */
    public abstract void next();
    
    /**
     * Go to the previous track in the playqueue
     */
    public abstract void previous();
    
    /**
     * Stop the playback
     */
    public abstract void stop();
    
    /**
     * Show the equalizer dialog
     */
    public abstract void showEqualizer();
    
    /**
     * Seek to a position in a track depending on the current time
     * @param delta: the time difference that has to be added in ms
     */
    public abstract void seek(int delta);
    
    /**
     * Increase the playback speed rate
     */
    public abstract void increaseRate();
    
    /**
     * Decrease the playback speed rate
     */
    public abstract void decreaseRate();
    
    /**
     * Reset the playback speed rate
     */
    public abstract void resetRate();
    
    /**
     * Add a new bookmark at current time
     */
    public abstract void bookmark();
}