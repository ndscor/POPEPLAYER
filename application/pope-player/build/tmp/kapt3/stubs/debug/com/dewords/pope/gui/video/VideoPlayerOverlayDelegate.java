package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020I2\u0007\u0010\u0083\u0001\u001a\u00020\u0012H\u0002J\u001c\u0010\u0084\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0081\u0001\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020IH\u0002J\u0013\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0012H\u0007J\u0012\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002\u00a2\u0006\u0003\u0010\u0089\u0001JA\u0010\u008a\u0001\u001a\u00030\u0086\u00012\u0010\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0013\b\u0002\u0010\u008f\u0001\u001a\f\u0012\u0005\u0012\u00030\u0086\u0001\u0018\u00010\u0090\u0001H\u0002\u00a2\u0006\u0003\u0010\u0091\u0001J,\u0010\u0092\u0001\u001a\u00030\u0086\u00012\u0010\u0010\u008b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u008c\u00012\b\u0010\u0093\u0001\u001a\u00030\u008e\u0001H\u0002\u00a2\u0006\u0003\u0010\u0094\u0001J\u0013\u0010\u0095\u0001\u001a\u00030\u0086\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\fJ\b\u0010\u0096\u0001\u001a\u00030\u0086\u0001J\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010VJ\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010VJ\b\u0010\u0099\u0001\u001a\u00030\u0086\u0001J\u001c\u0010\u009a\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u00122\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u0012J\b\u0010\u009d\u0001\u001a\u00030\u0086\u0001J\n\u0010\u009e\u0001\u001a\u00030\u0086\u0001H\u0003J\n\u0010\u009f\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u0086\u0001H\u0003J\u0007\u0010\u00a1\u0001\u001a\u00020\u0012J\u0007\u0010\u00a2\u0001\u001a\u00020\u0012J\u0007\u0010\u00a3\u0001\u001a\u00020\u0012J\u0007\u0010\u00a4\u0001\u001a\u00020\u0012J\b\u0010\u00a5\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00a6\u0001\u001a\u00030\u0086\u0001J\n\u0010\u00a7\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u00a8\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u00a9\u0001\u001a\u00030\u0086\u0001H\u0002J\n\u0010\u00aa\u0001\u001a\u00030\u0086\u0001H\u0007J\b\u0010\u00ab\u0001\u001a\u00030\u0086\u0001J\u0011\u0010\u00ac\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u0012J\b\u0010\u00ae\u0001\u001a\u00030\u0086\u0001J\u0011\u0010\u00af\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00b0\u0001\u001a\u00020IJ\u0011\u0010\u00b1\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00b2\u0001\u001a\u00020\u0012J\n\u0010\u00b3\u0001\u001a\u00030\u0086\u0001H\u0002J\'\u0010\u00b4\u0001\u001a\u00030\u0086\u00012\t\b\u0001\u0010\u00b5\u0001\u001a\u00020I2\u0007\u0010\u00b6\u0001\u001a\u00020I2\t\b\u0003\u0010\u00b7\u0001\u001a\u00020IJ\'\u0010\u00b4\u0001\u001a\u00030\u0086\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00b9\u00012\u0007\u0010\u00b6\u0001\u001a\u00020I2\n\b\u0002\u0010\u00ba\u0001\u001a\u00030\u00b9\u0001J\u0013\u0010\u00bb\u0001\u001a\u00030\u0086\u00012\t\b\u0002\u0010\u00bc\u0001\u001a\u00020\u0012J\u0011\u0010\u00bd\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00be\u0001\u001a\u00020IJ\b\u0010\u00bf\u0001\u001a\u00030\u0086\u0001J\u0011\u0010\u00c0\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00c1\u0001\u001a\u00020IJ\b\u0010\u00c2\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00c3\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00c4\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00c5\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00c6\u0001\u001a\u00030\u0086\u0001J\u0013\u0010\u00c7\u0001\u001a\u00030\u0086\u00012\t\b\u0002\u0010\u00c8\u0001\u001a\u00020\u0012J\u0011\u0010\u00c9\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00ca\u0001\u001a\u00020\u0012J\b\u0010\u00cb\u0001\u001a\u00030\u0086\u0001J\b\u0010\u00cc\u0001\u001a\u00030\u0086\u0001J\u0011\u0010\u00cd\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u00ce\u0001\u001a\u00020\u0012J\b\u0010\u00cf\u0001\u001a\u00030\u0086\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u000e\u0010*\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010+\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010\u000eR\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001d\u00105\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b6\u0010\u000eR\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010>\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010E\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010R\u000e\u0010H\u001a\u00020IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020KX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020KX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020VX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020VX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010X\u001a\u00020YX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u000e\u0010^\u001a\u00020TX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010_\u001a\u00020`X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001a\u0010k\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u000e\"\u0004\bm\u0010\u0010R\u001a\u0010n\u001a\u00020oX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010t\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0014\"\u0004\bv\u0010\u0016R\u001c\u0010w\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010@\"\u0004\by\u0010BR\u000e\u0010z\u001a\u00020{X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020{X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00d0\u0001"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "", "player", "Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "(Lcom/dewords/pope/gui/video/VideoPlayerActivity;)V", "abRepeatAddMarker", "Landroid/widget/Button;", "bookmarkListDelegate", "Lcom/dewords/pope/gui/helpers/BookmarkListDelegate;", "brightnessValueText", "Landroid/widget/TextView;", "closeButton", "Landroid/view/View;", "getCloseButton", "()Landroid/view/View;", "setCloseButton", "(Landroid/view/View;)V", "enableSubs", "", "getEnableSubs", "()Z", "setEnableSubs", "(Z)V", "value", "Landroidx/window/layout/FoldingFeature;", "foldingFeature", "getFoldingFeature", "()Landroidx/window/layout/FoldingFeature;", "setFoldingFeature", "(Landroidx/window/layout/FoldingFeature;)V", "hasPlaylist", "getHasPlaylist", "setHasPlaylist", "hingeArrowLeft", "Landroid/widget/ImageView;", "getHingeArrowLeft", "()Landroid/widget/ImageView;", "setHingeArrowLeft", "(Landroid/widget/ImageView;)V", "hingeArrowRight", "getHingeArrowRight", "setHingeArrowRight", "hingeSnackShown", "hudBackground", "getHudBackground", "hudBackground$delegate", "Lkotlin/Lazy;", "hudBinding", "Lcom/dewords/pope/databinding/PlayerHudBinding;", "getHudBinding", "()Lcom/dewords/pope/databinding/PlayerHudBinding;", "setHudBinding", "(Lcom/dewords/pope/databinding/PlayerHudBinding;)V", "hudRightBackground", "getHudRightBackground", "hudRightBackground$delegate", "hudRightBinding", "Lcom/dewords/pope/databinding/PlayerHudRightBinding;", "getHudRightBinding", "()Lcom/dewords/pope/databinding/PlayerHudRightBinding;", "setHudRightBinding", "(Lcom/dewords/pope/databinding/PlayerHudRightBinding;)V", "info", "getInfo", "()Landroid/widget/TextView;", "setInfo", "(Landroid/widget/TextView;)V", "orientationLockedBeforeLock", "overlayBackground", "overlayInfo", "getOverlayInfo", "setOverlayInfo", "overlayTimeout", "", "pauseToPlay", "Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "getPauseToPlay", "()Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;", "setPauseToPlay", "(Landroidx/vectordrawable/graphics/drawable/AnimatedVectorDrawableCompat;)V", "playToPause", "getPlayToPause", "setPlayToPause", "playerBrightnessProgress", "Lcom/dewords/pope/gui/view/PlayerProgress;", "playerOverlayBrightness", "Landroidx/constraintlayout/widget/ConstraintLayout;", "playerOverlayVolume", "playerUiContainer", "Landroid/view/ViewGroup;", "getPlayerUiContainer", "()Landroid/view/ViewGroup;", "setPlayerUiContainer", "(Landroid/view/ViewGroup;)V", "playerVolumeProgress", "playlist", "Landroidx/recyclerview/widget/RecyclerView;", "getPlaylist", "()Landroidx/recyclerview/widget/RecyclerView;", "setPlaylist", "(Landroidx/recyclerview/widget/RecyclerView;)V", "playlistAdapter", "Lcom/dewords/pope/gui/audio/PlaylistAdapter;", "getPlaylistAdapter", "()Lcom/dewords/pope/gui/audio/PlaylistAdapter;", "setPlaylistAdapter", "(Lcom/dewords/pope/gui/audio/PlaylistAdapter;)V", "playlistContainer", "getPlaylistContainer", "setPlaylistContainer", "playlistSearchText", "Lcom/google/android/material/textfield/TextInputLayout;", "getPlaylistSearchText", "()Lcom/google/android/material/textfield/TextInputLayout;", "setPlaylistSearchText", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "seekButtons", "getSeekButtons", "setSeekButtons", "subinfo", "getSubinfo", "setSubinfo", "titleConstraintSetLandscape", "Landroidx/constraintlayout/widget/ConstraintSet;", "titleConstraintSetPortrait", "volumeValueText", "wasPlaying", "applyMargin", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "view", "margin", "isEnd", "applyVerticalMargin", "dimStatusBar", "", "dim", "downloadSubtitles", "()Lkotlin/Unit;", "enterAnimate", "views", "", "translationStart", "", "endListener", "Lkotlin/Function0;", "([Landroid/view/View;FLkotlin/jvm/functions/Function0;)V", "exitAnimate", "translationEnd", "([Landroid/view/View;F)V", "fadeOutInfo", "focusPlayPause", "getOverlayBrightness", "getOverlayVolume", "hideBookmarks", "hideOverlay", "fromUser", "forceTalkback", "initInfoOverlay", "initOverlay", "initPlaylistUi", "initSeekButton", "isBookmarkShown", "isHudBindingInitialized", "isHudRightBindingInitialized", "isPlaylistAdapterInitialized", "lockScreen", "manageHinge", "manageTitleConstraints", "pickSubtitles", "resetHingeLayout", "resetHudLayout", "rotateBookmarks", "setListeners", "enabled", "showBookmarks", "showBrightnessBar", "brightness", "showControls", "show", "showHingeSnackIfNeeded", "showInfo", "textId", "duration", "subtextId", "text", "", "subText", "showOverlay", "forceCheck", "showOverlayTimeout", "timeout", "showTracks", "showVolumeBar", "volume", "toggleOverlay", "togglePlaylist", "unlockScreen", "updateHudMargins", "updateOrientationIcon", "updateOverlayPausePlay", "skipAnim", "updatePausable", "pausable", "updateRendererVisibility", "updateScreenshotButton", "updateSeekable", "seekable", "updateTitleConstraints", "pope-player_debug"})
public final class VideoPlayerOverlayDelegate {
    private final com.dewords.pope.gui.video.VideoPlayerActivity player = null;
    private androidx.constraintlayout.widget.ConstraintLayout playerOverlayBrightness;
    private android.widget.TextView brightnessValueText;
    private com.dewords.pope.gui.view.PlayerProgress playerBrightnessProgress;
    private androidx.constraintlayout.widget.ConstraintLayout playerOverlayVolume;
    private android.widget.TextView volumeValueText;
    private com.dewords.pope.gui.view.PlayerProgress playerVolumeProgress;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView info;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView subinfo;
    @org.jetbrains.annotations.Nullable()
    private android.view.View overlayInfo;
    public android.view.ViewGroup playerUiContainer;
    public com.dewords.pope.databinding.PlayerHudBinding hudBinding;
    public com.dewords.pope.databinding.PlayerHudRightBinding hudRightBinding;
    private android.view.View overlayBackground;
    private int overlayTimeout = 0;
    private boolean wasPlaying = true;
    public androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat playToPause;
    public androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat pauseToPlay;
    private final kotlin.Lazy hudBackground$delegate = null;
    private final kotlin.Lazy hudRightBackground$delegate = null;
    private android.widget.Button abRepeatAddMarker;
    private boolean seekButtons = false;
    private boolean hasPlaylist = false;
    private boolean hingeSnackShown = false;
    private boolean enableSubs = true;
    private com.dewords.pope.gui.helpers.BookmarkListDelegate bookmarkListDelegate;
    private boolean orientationLockedBeforeLock = false;
    public android.view.View closeButton;
    public android.view.View playlistContainer;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView hingeArrowRight;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView hingeArrowLeft;
    public androidx.recyclerview.widget.RecyclerView playlist;
    public com.google.android.material.textfield.TextInputLayout playlistSearchText;
    public com.dewords.pope.gui.audio.PlaylistAdapter playlistAdapter;
    @org.jetbrains.annotations.Nullable()
    private androidx.window.layout.FoldingFeature foldingFeature;
    private final androidx.constraintlayout.widget.ConstraintSet titleConstraintSetLandscape = null;
    private final androidx.constraintlayout.widget.ConstraintSet titleConstraintSetPortrait = null;
    
    public VideoPlayerOverlayDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoPlayerActivity player) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getSubinfo() {
        return null;
    }
    
    public final void setSubinfo(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getOverlayInfo() {
        return null;
    }
    
    public final void setOverlayInfo(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getPlayerUiContainer() {
        return null;
    }
    
    public final void setPlayerUiContainer(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.PlayerHudBinding getHudBinding() {
        return null;
    }
    
    public final void setHudBinding(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.PlayerHudBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.PlayerHudRightBinding getHudRightBinding() {
        return null;
    }
    
    public final void setHudRightBinding(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.PlayerHudRightBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getPlayToPause() {
        return null;
    }
    
    public final void setPlayToPause(@org.jetbrains.annotations.NotNull()
    androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat getPauseToPlay() {
        return null;
    }
    
    public final void setPauseToPlay(@org.jetbrains.annotations.NotNull()
    androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat p0) {
    }
    
    private final android.view.View getHudBackground() {
        return null;
    }
    
    private final android.view.View getHudRightBackground() {
        return null;
    }
    
    public final boolean getSeekButtons() {
        return false;
    }
    
    public final void setSeekButtons(boolean p0) {
    }
    
    public final boolean getHasPlaylist() {
        return false;
    }
    
    public final void setHasPlaylist(boolean p0) {
    }
    
    public final boolean getEnableSubs() {
        return false;
    }
    
    public final void setEnableSubs(boolean p0) {
    }
    
    public final boolean isHudBindingInitialized() {
        return false;
    }
    
    public final boolean isHudRightBindingInitialized() {
        return false;
    }
    
    public final boolean isPlaylistAdapterInitialized() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getCloseButton() {
        return null;
    }
    
    public final void setCloseButton(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getPlaylistContainer() {
        return null;
    }
    
    public final void setPlaylistContainer(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getHingeArrowRight() {
        return null;
    }
    
    public final void setHingeArrowRight(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getHingeArrowLeft() {
        return null;
    }
    
    public final void setHingeArrowLeft(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getPlaylist() {
        return null;
    }
    
    public final void setPlaylist(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPlaylistSearchText() {
        return null;
    }
    
    public final void setPlaylistSearchText(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.audio.PlaylistAdapter getPlaylistAdapter() {
        return null;
    }
    
    public final void setPlaylistAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.PlaylistAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.window.layout.FoldingFeature getFoldingFeature() {
        return null;
    }
    
    public final void setFoldingFeature(@org.jetbrains.annotations.Nullable()
    androidx.window.layout.FoldingFeature value) {
    }
    
    /**
     * Changes the device layout depending on the scree foldable status and features
     */
    public final void manageHinge() {
    }
    
    /**
     * Shows the fold layout snackbar if needed
     */
    private final void showHingeSnackIfNeeded() {
    }
    
    /**
     * Resets the layout to normal after a fold/hinge status change
     */
    private final void resetHingeLayout() {
    }
    
    public final void showTracks() {
    }
    
    public final void showInfo(@androidx.annotation.StringRes()
    int textId, int duration, @androidx.annotation.StringRes()
    int subtextId) {
    }
    
    /**
     * Show text in the info view for "duration" milliseconds
     * @param text
     * @param duration
     */
    public final void showInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration, @org.jetbrains.annotations.NotNull()
    java.lang.String subText) {
    }
    
    public final void fadeOutInfo(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void initInfoOverlay() {
    }
    
    /**
     * Show the brightness value with  bar
     * @param brightness the brightness value
     */
    public final void showBrightnessBar(int brightness) {
    }
    
    /**
     * Show the volume value with  bar
     * @param volume the volume value
     */
    public final void showVolumeBar(int volume) {
    }
    
    /**
     * Dim the status bar and/or navigation icons when needed on Android 3.x.
     * Hide it on Android 4.0 and later
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT)
    public final void dimStatusBar(boolean dim) {
    }
    
    /**
     * show overlay
     * @param forceCheck: adjust the timeout in function of playing state
     */
    public final void showOverlay(boolean forceCheck) {
    }
    
    /**
     * show overlay
     */
    public final void showOverlayTimeout(int timeout) {
    }
    
    public final void updateOverlayPausePlay(boolean skipAnim) {
    }
    
    private final void enterAnimate(android.view.View[] views, float translationStart, kotlin.jvm.functions.Function0<kotlin.Unit> endListener) {
    }
    
    private final void exitAnimate(android.view.View[] views, float translationEnd) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void initOverlay() {
    }
    
    public final void updateSeekable(boolean seekable) {
    }
    
    public final void setListeners(boolean enabled) {
    }
    
    public final void updatePausable(boolean pausable) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    public final void resetHudLayout() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void initSeekButton() {
    }
    
    public final void updateOrientationIcon() {
    }
    
    public final void updateRendererVisibility() {
    }
    
    private final void manageTitleConstraints() {
    }
    
    public final void updateTitleConstraints() {
    }
    
    public final void updateHudMargins() {
    }
    
    private final androidx.constraintlayout.widget.ConstraintLayout.LayoutParams applyMargin(android.view.View view, int margin, boolean isEnd) {
        return null;
    }
    
    private final androidx.constraintlayout.widget.ConstraintLayout.LayoutParams applyVerticalMargin(android.view.View view, int margin) {
        return null;
    }
    
    public final void updateScreenshotButton() {
    }
    
    private final void initPlaylistUi() {
    }
    
    public final void togglePlaylist() {
    }
    
    public final void showControls(boolean show) {
    }
    
    /**
     * hider overlay
     */
    public final void hideOverlay(boolean fromUser, boolean forceTalkback) {
    }
    
    public final void focusPlayPause() {
    }
    
    public final void toggleOverlay() {
    }
    
    /**
     * Lock player
     */
    public final void lockScreen() {
    }
    
    /**
     * Remove player lock
     */
    public final void unlockScreen() {
    }
    
    private final void pickSubtitles() {
    }
    
    private final kotlin.Unit downloadSubtitles() {
        return null;
    }
    
    public final void showBookmarks() {
    }
    
    public final void rotateBookmarks() {
    }
    
    public final boolean isBookmarkShown() {
        return false;
    }
    
    public final void hideBookmarks() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.constraintlayout.widget.ConstraintLayout getOverlayBrightness() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.constraintlayout.widget.ConstraintLayout getOverlayVolume() {
        return null;
    }
}