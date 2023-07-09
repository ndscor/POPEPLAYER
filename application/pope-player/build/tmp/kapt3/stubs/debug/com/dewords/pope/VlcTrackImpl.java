package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u000e0\u000eH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/VlcTrackImpl;", "Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "track", "Lorg/videolan/libvlc/MediaPlayer$TrackDescription;", "(Lorg/videolan/libvlc/MediaPlayer$TrackDescription;)V", "Lorg/videolan/libvlc/interfaces/IMedia$Track;", "(Lorg/videolan/libvlc/interfaces/IMedia$Track;)V", "mediaTrack", "mediaplayerTrack", "getFrameRateDen", "", "getFrameRateNum", "getHeight", "getId", "", "getName", "kotlin.jvm.PlatformType", "getProjection", "getWidth", "pope-player_debug"})
public final class VlcTrackImpl implements com.dewords.pope.gui.dialogs.adapters.VlcTrack {
    private org.videolan.libvlc.interfaces.IMedia.Track mediaTrack;
    private org.videolan.libvlc.MediaPlayer.TrackDescription mediaplayerTrack;
    
    public VlcTrackImpl(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.TrackDescription track) {
        super();
    }
    
    public VlcTrackImpl(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia.Track track) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public int getWidth() {
        return 0;
    }
    
    @java.lang.Override()
    public int getHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public int getProjection() {
        return 0;
    }
    
    @java.lang.Override()
    public int getFrameRateDen() {
        return 0;
    }
    
    @java.lang.Override()
    public int getFrameRateNum() {
        return 0;
    }
}