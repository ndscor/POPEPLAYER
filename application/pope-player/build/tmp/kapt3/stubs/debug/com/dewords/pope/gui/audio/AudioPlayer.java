package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00a2\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\u0006\u0010P\u001a\u00020\rJ(\u0010Q\u001a\u00020M2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020:2\u0006\u0010V\u001a\u00020:H\u0016J\u0006\u0010W\u001a\u00020\rJ\u0011\u0010X\u001a\u00020MH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020\rH\u0002J\t\u0010[\u001a\u00020\rH\u0096\u0001J\u0006\u0010\\\u001a\u00020\rJ\u0018\u0010]\u001a\u00020M2\u0006\u0010^\u001a\u00020\r2\u0006\u0010_\u001a\u00020\rH\u0002J\t\u0010`\u001a\u00020MH\u0096\u0001J\u0013\u0010a\u001a\u00020M2\b\b\u0002\u0010b\u001a\u00020\rH\u0096\u0001J\u000e\u0010c\u001a\u00020M2\u0006\u0010d\u001a\u00020eJ\u000e\u0010f\u001a\u00020M2\u0006\u0010d\u001a\u00020eJ\u0012\u0010g\u001a\u00020M2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J&\u0010j\u001a\u0004\u0018\u00010e2\u0006\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010n2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u000e\u0010o\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\u000e\u0010q\u001a\u00020\r2\u0006\u0010p\u001a\u00020eJ\u000e\u0010r\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\u000e\u0010s\u001a\u00020\r2\u0006\u0010p\u001a\u00020eJ\u0010\u0010t\u001a\u00020M2\b\u0010p\u001a\u0004\u0018\u00010eJ\u0010\u0010u\u001a\u00020M2\b\u0010p\u001a\u0004\u0018\u00010eJ\u000e\u0010v\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\"\u0010w\u001a\u00020M2\u0006\u0010p\u001a\u00020e2\u0006\u0010x\u001a\u00020:2\b\u0010y\u001a\u0004\u0018\u00010zH\u0016J\u0010\u0010{\u001a\u00020M2\b\u0010p\u001a\u0004\u0018\u00010eJ\u000e\u0010|\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\b\u0010}\u001a\u00020MH\u0016J\u0006\u0010~\u001a\u00020MJ\u0011\u0010\u007f\u001a\u00020M2\u0007\u0010\u0080\u0001\u001a\u00020iH\u0016J\u000f\u0010\u0081\u0001\u001a\u00020M2\u0006\u0010d\u001a\u00020eJ\u0011\u0010\u0082\u0001\u001a\u00020M2\u0006\u0010x\u001a\u00020:H\u0016J\u000f\u0010\u0083\u0001\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\u0014\u0010\u0084\u0001\u001a\u00020M2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0096\u0001J\u0010\u0010\u0087\u0001\u001a\u00020M2\u0007\u0010\u0088\u0001\u001a\u00020:J\u0011\u0010\u0089\u0001\u001a\u00020\r2\b\u0010p\u001a\u0004\u0018\u00010eJ)\u0010\u008a\u0001\u001a\u00020M2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020:2\u0006\u0010V\u001a\u00020:H\u0016J\u000f\u0010\u008b\u0001\u001a\u00020M2\u0006\u0010p\u001a\u00020eJ\u001b\u0010\u008c\u0001\u001a\u00020M2\u0006\u0010p\u001a\u00020e2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u0019\u0010\u008d\u0001\u001a\u00020M2\u0006\u0010x\u001a\u00020:2\u0006\u0010y\u001a\u00020zH\u0016J\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007J\u0007\u0010\u008f\u0001\u001a\u00020MJ\t\u0010\u0090\u0001\u001a\u00020\rH\u0002J\u0011\u0010\u0091\u0001\u001a\u00020M2\b\u0010d\u001a\u0004\u0018\u00010eJ\u0007\u0010\u0092\u0001\u001a\u00020MJ\u0007\u0010\u0093\u0001\u001a\u00020MJ\u0013\u0010\u0094\u0001\u001a\u00020M2\u0007\u0010\u0095\u0001\u001a\u00020\rH\u0096\u0001J\u0012\u0010\u0096\u0001\u001a\u00020M2\u0007\u0010\u0097\u0001\u001a\u00020zH\u0002J\t\u0010\u0098\u0001\u001a\u00020MH\u0002J\n\u0010\u0099\u0001\u001a\u00020MH\u0096\u0001J\u0012\u0010\u009a\u0001\u001a\u00020MH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ\t\u0010\u009b\u0001\u001a\u00020MH\u0002J\u0013\u0010\u009c\u0001\u001a\u00020M2\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\t\u0010\u009f\u0001\u001a\u00020MH\u0002J\t\u0010\u00a0\u0001\u001a\u00020MH\u0002J\u0016\u0010\u00a1\u0001\u001a\u00020M*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u000e\u0010(\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010)\u001a\u00060*j\u0002`+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\'\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00a3\u0001"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioPlayer;", "Landroidx/fragment/app/Fragment;", "Lcom/dewords/pope/gui/audio/PlaylistAdapter$IPlayer;", "Landroid/text/TextWatcher;", "Lcom/dewords/pope/gui/audio/IAudioPlayerAnimator;", "()V", "abRepeatAddMarker", "Landroid/widget/Button;", "getAbRepeatAddMarker", "()Landroid/widget/Button;", "setAbRepeatAddMarker", "(Landroid/widget/Button;)V", "audioPlayProgressMode", "", "binding", "Lcom/dewords/pope/databinding/AudioPlayerBinding;", "bookmarkListDelegate", "Lcom/dewords/pope/gui/helpers/BookmarkListDelegate;", "bookmarkModel", "Lcom/dewords/pope/viewmodels/BookmarkModel;", "getBookmarkModel", "()Lcom/dewords/pope/viewmodels/BookmarkModel;", "setBookmarkModel", "(Lcom/dewords/pope/viewmodels/BookmarkModel;)V", "coverMediaSwitcherListener", "Lcom/dewords/pope/gui/view/AudioMediaSwitcher$AudioMediaSwitcherListener;", "ctxReceiver", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "getFoldingFeature", "()Landroidx/window/layout/FoldingFeature;", "setFoldingFeature", "(Landroidx/window/layout/FoldingFeature;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "headerMediaSwitcherListener", "hideSearchRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getHideSearchRunnable", "()Ljava/lang/Runnable;", "hideSearchRunnable$delegate", "isDragging", "lastEndsAt", "", "optionsDelegate", "Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate;", "pauseToPlay", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "pauseToPlaySmall", "playToPause", "playToPauseSmall", "playerState", "", "playlistAdapter", "Lcom/dewords/pope/gui/audio/PlaylistAdapter;", "playlistModel", "Lcom/dewords/pope/viewmodels/PlaylistModel;", "getPlaylistModel", "()Lcom/dewords/pope/viewmodels/PlaylistModel;", "setPlaylistModel", "(Lcom/dewords/pope/viewmodels/PlaylistModel;)V", "previewingSeek", "previousRepeatType", "settings", "Landroid/content/SharedPreferences;", "showRemainingTime", "timelineListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "wasPlaying", "wasShuffling", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "backPressed", "beforeTextChanged", "charSequence", "", "start", "before", "count", "clearSearch", "doUpdate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hideSearchField", "isShowingCover", "isTablet", "jump", "forward", "long", "manageHinge", "manageSearchVisibilities", "filter", "onABRepeatResetClick", "v", "Landroid/view/View;", "onABRepeatStopClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onJumpBack", "view", "onJumpBackLong", "onJumpForward", "onJumpForwardLong", "onNextClick", "onPlayPauseClick", "onPlaylistSwitchClick", "onPopupMenu", "position", "item", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "onPreviousClick", "onRepeatClick", "onResume", "onResumeToVideoClick", "onSaveInstanceState", "outState", "onSearchClick", "onSelectionSet", "onShuffleClick", "onSlide", "slideOffset", "", "onStateChanged", "newState", "onStopClick", "onTextChanged", "onTimeLabelClick", "onViewCreated", "playItem", "retrieveAbRepeatAddMarker", "setBottomMargin", "shouldHidePlayProgress", "showAdvancedOptions", "showBookmarks", "showChips", "showCover", "value", "showInfoDialog", "media", "showPlaylistTips", "switchShowCover", "updateBackground", "updatePlayPause", "updateProgress", "progress", "Lcom/dewords/pope/viewmodels/PlaybackProgress;", "updateRepeatMode", "updateShuffleMode", "setupAnimator", "LongSeekListener", "pope-player_debug"})
public final class AudioPlayer extends androidx.fragment.app.Fragment implements com.dewords.pope.gui.audio.PlaylistAdapter.IPlayer, android.text.TextWatcher, com.dewords.pope.gui.audio.IAudioPlayerAnimator {
    private com.dewords.pope.databinding.AudioPlayerBinding binding;
    private com.dewords.pope.gui.audio.PlaylistAdapter playlistAdapter;
    private android.content.SharedPreferences settings;
    private final kotlin.Lazy handler$delegate = null;
    public com.dewords.pope.viewmodels.PlaylistModel playlistModel;
    public com.dewords.pope.viewmodels.BookmarkModel bookmarkModel;
    private com.dewords.pope.gui.helpers.PlayerOptionsDelegate optionsDelegate;
    private com.dewords.pope.gui.helpers.BookmarkListDelegate bookmarkListDelegate;
    private boolean showRemainingTime = false;
    private boolean previewingSeek = false;
    private int playerState = 0;
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat pauseToPlay;
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat playToPause;
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat pauseToPlaySmall;
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat playToPauseSmall;
    public android.widget.Button abRepeatAddMarker;
    private boolean audioPlayProgressMode = false;
    private long lastEndsAt = -1L;
    private boolean isDragging = false;
    private final com.dewords.pope.gui.dialogs.CtxActionReceiver ctxReceiver = null;
    private boolean wasPlaying = true;
    private boolean wasShuffling = false;
    private int previousRepeatType = -1;
    private android.widget.SeekBar.OnSeekBarChangeListener timelineListener;
    private final com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener headerMediaSwitcherListener = null;
    private final com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener coverMediaSwitcherListener = null;
    private final kotlin.Lazy hideSearchRunnable$delegate = null;
    
    public AudioPlayer() {
        super();
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.viewmodels.PlaylistModel getPlaylistModel() {
        return null;
    }
    
    public final void setPlaylistModel(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.PlaylistModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.viewmodels.BookmarkModel getBookmarkModel() {
        return null;
    }
    
    public final void setBookmarkModel(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.BookmarkModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getAbRepeatAddMarker() {
        return null;
    }
    
    public final void setAbRepeatAddMarker(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    public final void setBottomMargin() {
    }
    
    public final boolean isTablet() {
        return false;
    }
    
    public final void showChips() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void showInfoDialog(org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
    
    @java.lang.Override()
    public void onPopupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    private final java.lang.Object doUpdate(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updatePlayPause() {
    }
    
    private final void updateShuffleMode() {
    }
    
    private final void updateRepeatMode() {
    }
    
    /**
     * Updates the text views in the player with the current progress
     * It includes the time, the length and the progress pill text and content description
     *
     * @param progress the progress to be displayed
     */
    private final void updateProgress(com.dewords.pope.viewmodels.PlaybackProgress progress) {
    }
    
    private final boolean shouldHidePlayProgress() {
        return false;
    }
    
    @java.lang.Override()
    public void onSelectionSet(int position) {
    }
    
    @java.lang.Override()
    public void playItem(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    public final void onTimeLabelClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onJumpBack(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final boolean onJumpBackLong(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
        return false;
    }
    
    public final void onJumpForward(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final boolean onJumpForwardLong(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
        return false;
    }
    
    /**
     * Jump backward or forward, with a long or small delay
     * depending on the audio control setting chosen by the user
     *
     * @param forward is the jump forward?
     * @param long has it been triggered by a long tap?
     */
    private final void jump(boolean forward, boolean p1_1663806) {
    }
    
    public final void onPlayPauseClick(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final boolean onStopClick(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
        return false;
    }
    
    public final void onNextClick(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onPreviousClick(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onRepeatClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onPlaylistSwitchClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onShuffleClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View view) {
    }
    
    public final void onResumeToVideoClick() {
    }
    
    public final void showAdvancedOptions(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    /**
     * Show bookmark and initialize the delegate if needed
     */
    public final void showBookmarks() {
    }
    
    public final void onSearchClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void onABRepeatStopClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    public final void onABRepeatResetClick(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int before, int count) {
    }
    
    public final boolean backPressed() {
        return false;
    }
    
    public final boolean clearSearch() {
        return false;
    }
    
    private final boolean hideSearchField() {
        return false;
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
    
    private final void showPlaylistTips() {
    }
    
    public final void onStateChanged(int newState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button retrieveAbRepeatAddMarker() {
        return null;
    }
    
    private final java.lang.Runnable getHideSearchRunnable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.window.layout.FoldingFeature getFoldingFeature() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isShowingCover() {
        return false;
    }
    
    /**
     * Changes the device layout depending on the screen foldable status and features
     */
    @java.lang.Override()
    public void manageHinge() {
    }
    
    @java.lang.Override()
    public void manageSearchVisibilities(boolean filter) {
    }
    
    @java.lang.Override()
    public void onSlide(float slideOffset) {
    }
    
    @java.lang.Override()
    public void setFoldingFeature(@org.jetbrains.annotations.Nullable()
    androidx.window.layout.FoldingFeature p0) {
    }
    
    @java.lang.Override()
    public void setupAnimator(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioPlayer $this$setupAnimator, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.AudioPlayerBinding binding) {
    }
    
    @java.lang.Override()
    public void showCover(boolean value) {
    }
    
    @java.lang.Override()
    public void switchShowCover() {
    }
    
    /**
     * Updates the player background with or without a blurred cover depending on the user setting
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateBackground(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00060\u0016j\u0002`\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b\u00a8\u0006$"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioPlayer$LongSeekListener;", "Landroid/view/View$OnTouchListener;", "forward", "", "(Lcom/dewords/pope/gui/audio/AudioPlayer;Z)V", "getForward", "()Z", "setForward", "(Z)V", "length", "", "getLength", "()J", "setLength", "(J)V", "possibleSeek", "", "getPossibleSeek", "()I", "setPossibleSeek", "(I)V", "seekRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getSeekRunnable", "()Ljava/lang/Runnable;", "setSeekRunnable", "(Ljava/lang/Runnable;)V", "vibrated", "getVibrated", "setVibrated", "onTouch", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "pope-player_debug"})
    final class LongSeekListener implements android.view.View.OnTouchListener {
        private boolean forward;
        private long length = -1L;
        private int possibleSeek = 0;
        private boolean vibrated = false;
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.RequiresPermission(value = "android.permission.VIBRATE")
        private java.lang.Runnable seekRunnable;
        
        public LongSeekListener(boolean forward) {
            super();
        }
        
        public final boolean getForward() {
            return false;
        }
        
        public final void setForward(boolean p0) {
        }
        
        public final long getLength() {
            return 0L;
        }
        
        public final void setLength(long p0) {
        }
        
        public final int getPossibleSeek() {
            return 0;
        }
        
        public final void setPossibleSeek(int p0) {
        }
        
        public final boolean getVibrated() {
            return false;
        }
        
        public final void setVibrated(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Runnable getSeekRunnable() {
            return null;
        }
        
        public final void setSeekRunnable(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable p0) {
        }
        
        @java.lang.Override()
        public boolean onTouch(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
    }
}