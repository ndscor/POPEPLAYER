package com.dewords.pope.util;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0003J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/dewords/pope/util/VLCAudioFocusHelper;", "", "service", "Lcom/dewords/pope/PlaybackService;", "(Lcom/dewords/pope/PlaybackService;)V", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "audioManager", "Landroid/media/AudioManager;", "hasAudioFocus", "", "lossTransient", "getLossTransient$pope_player_debug", "()Z", "setLossTransient$pope_player_debug", "(Z)V", "podcastPlaying", "abandonAudioFocus", "", "changeAudioFocus", "", "acquire", "changeAudioFocus$pope_player_debug", "createOnAudioFocusChangeListener", "requestAudioFocus", "pope-player_debug"})
public final class VLCAudioFocusHelper {
    private final com.dewords.pope.PlaybackService service = null;
    private android.media.AudioManager audioManager;
    private android.media.AudioFocusRequest audioFocusRequest;
    private boolean hasAudioFocus = false;
    @kotlin.jvm.Volatile()
    private volatile boolean podcastPlaying = false;
    @kotlin.jvm.Volatile()
    private volatile boolean lossTransient = false;
    private final android.media.AudioManager.OnAudioFocusChangeListener audioFocusListener = null;
    
    public VLCAudioFocusHelper(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService service) {
        super();
    }
    
    public final boolean getLossTransient$pope_player_debug() {
        return false;
    }
    
    public final void setLossTransient$pope_player_debug(boolean p0) {
    }
    
    public final void changeAudioFocus$pope_player_debug(boolean acquire) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final int abandonAudioFocus() {
        return 0;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final int requestAudioFocus() {
        return 0;
    }
    
    private final android.media.AudioManager.OnAudioFocusChangeListener createOnAudioFocusChangeListener() {
        return null;
    }
}