package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/interfaces/IPlaybackSettingsController;", "", "endPlaybackSetting", "", "showAudioDelaySetting", "showSubsDelaySetting", "DelayState", "pope-player_debug"})
public abstract interface IPlaybackSettingsController {
    
    public abstract void showAudioDelaySetting();
    
    public abstract void showSubsDelaySetting();
    
    public abstract void endPlaybackSetting();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/interfaces/IPlaybackSettingsController$DelayState;", "", "(Ljava/lang/String;I)V", "OFF", "AUDIO", "SUBS", "pope-player_debug"})
    public static enum DelayState {
        /*public static final*/ OFF /* = new OFF() */,
        /*public static final*/ AUDIO /* = new AUDIO() */,
        /*public static final*/ SUBS /* = new SUBS() */;
        
        DelayState() {
        }
    }
}