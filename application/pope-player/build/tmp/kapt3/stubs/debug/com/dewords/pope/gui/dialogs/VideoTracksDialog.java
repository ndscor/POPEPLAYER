package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u0003345B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u001a\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 H\u0002\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J&\u0010(\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00172\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001a\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u00066"}, d2 = {"Lcom/dewords/pope/gui/dialogs/VideoTracksDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "binding", "Lcom/dewords/pope/databinding/PlayerOverlayTracksBinding;", "menuItemListener", "Lkotlin/Function1;", "Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$VideoTrackOption;", "", "getMenuItemListener", "()Lkotlin/jvm/functions/Function1;", "setMenuItemListener", "(Lkotlin/jvm/functions/Function1;)V", "trackSelectionListener", "Lkotlin/Function2;", "", "Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$TrackType;", "getTrackSelectionListener", "()Lkotlin/jvm/functions/Function2;", "setTrackSelectionListener", "(Lkotlin/jvm/functions/Function2;)V", "generateOptionItem", "parent", "Landroid/view/ViewGroup;", "title", "icon", "", "optionId", "generateSeparator", "margin", "", "generateTrackList", "", "Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "trackList", "([Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;)[Lcom/dewords/pope/gui/dialogs/adapters/VlcTrack;", "getDefaultState", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onServiceChanged", "service", "Lcom/dewords/pope/PlaybackService;", "onViewCreated", "view", "Companion", "TrackType", "VideoTrackOption", "pope-player_debug"})
public final class VideoTracksDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private com.dewords.pope.databinding.PlayerOverlayTracksBinding binding;
    public kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.VideoTracksDialog.VideoTrackOption, kotlin.Unit> menuItemListener;
    public kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.dewords.pope.gui.dialogs.VideoTracksDialog.TrackType, kotlin.Unit> trackSelectionListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.VideoTracksDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/SavePlaylistDialog";
    
    public VideoTracksDialog() {
        super();
    }
    
    @java.lang.Override()
    public int getDefaultState() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean needToManageOrientation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.dewords.pope.gui.dialogs.VideoTracksDialog.VideoTrackOption, kotlin.Unit> getMenuItemListener() {
        return null;
    }
    
    public final void setMenuItemListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.VideoTracksDialog.VideoTrackOption, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.String, com.dewords.pope.gui.dialogs.VideoTracksDialog.TrackType, kotlin.Unit> getTrackSelectionListener() {
        return null;
    }
    
    public final void setTrackSelectionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.dewords.pope.gui.dialogs.VideoTracksDialog.TrackType, kotlin.Unit> p0) {
    }
    
    private final void onServiceChanged(com.dewords.pope.PlaybackService service) {
    }
    
    /**
     * Create a track list containing a fake "Disable track" track
     *
     * @param trackList the base track list
     * @return a complete track list
     */
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final com.dewords.pope.gui.dialogs.adapters.VlcTrack[] generateTrackList(com.dewords.pope.gui.dialogs.adapters.VlcTrack[] trackList) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void generateSeparator(android.view.ViewGroup parent, boolean margin) {
    }
    
    private final void generateOptionItem(android.view.ViewGroup parent, java.lang.String title, @androidx.annotation.DrawableRes()
    int icon, com.dewords.pope.gui.dialogs.VideoTracksDialog.VideoTrackOption optionId) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$TrackType;", "", "(Ljava/lang/String;I)V", "VIDEO", "AUDIO", "SPU", "pope-player_debug"})
    public static enum TrackType {
        /*public static final*/ VIDEO /* = new VIDEO() */,
        /*public static final*/ AUDIO /* = new AUDIO() */,
        /*public static final*/ SPU /* = new SPU() */;
        
        TrackType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$VideoTrackOption;", "", "(Ljava/lang/String;I)V", "SUB_DELAY", "SUB_PICK", "SUB_DOWNLOAD", "AUDIO_DELAY", "pope-player_debug"})
    public static enum VideoTrackOption {
        /*public static final*/ SUB_DELAY /* = new SUB_DELAY() */,
        /*public static final*/ SUB_PICK /* = new SUB_PICK() */,
        /*public static final*/ SUB_DOWNLOAD /* = new SUB_DOWNLOAD() */,
        /*public static final*/ AUDIO_DELAY /* = new AUDIO_DELAY() */;
        
        VideoTrackOption() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$Companion;", "Lorg/videolan/tools/DependencyProvider;", "", "()V", "TAG", "", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.DependencyProvider<java.lang.Object> {
        
        private Companion() {
            super();
        }
    }
}