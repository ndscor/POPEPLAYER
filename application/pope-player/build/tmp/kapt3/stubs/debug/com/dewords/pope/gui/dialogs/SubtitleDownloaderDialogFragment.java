package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J$\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010/\u001a\u00020\u001bH\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020)H\u0016J\u001a\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SubtitleDownloaderDialogFragment;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "binding", "Lcom/dewords/pope/databinding/SubtitleDownloaderDialogBinding;", "downloadAdapter", "Lcom/dewords/pope/gui/dialogs/SubtitlesAdapter;", "historyAdapter", "listEventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/dialogs/SubtitleEvent;", "getListEventActor$annotations", "names", "", "", "value", "Lcom/dewords/pope/gui/dialogs/SubDownloadDialogState;", "state", "setState", "(Lcom/dewords/pope/gui/dialogs/SubDownloadDialogState;)V", "toast", "Landroid/widget/Toast;", "uris", "Landroid/net/Uri;", "viewModel", "Lcom/dewords/pope/viewmodels/SubtitlesModel;", "focusOnView", "", "scrollView", "Landroidx/core/widget/NestedScrollView;", "getDefaultState", "", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "pope-player_debug"})
public final class SubtitleDownloaderDialogFragment extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private com.dewords.pope.gui.dialogs.SubtitlesAdapter downloadAdapter;
    private com.dewords.pope.gui.dialogs.SubtitlesAdapter historyAdapter;
    private com.dewords.pope.databinding.SubtitleDownloaderDialogBinding binding;
    private java.util.List<? extends android.net.Uri> uris;
    private java.util.List<java.lang.String> names;
    private com.dewords.pope.viewmodels.SubtitlesModel viewModel;
    private android.widget.Toast toast;
    private com.dewords.pope.gui.dialogs.SubDownloadDialogState state = com.dewords.pope.gui.dialogs.SubDownloadDialogState.Download;
    private final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.gui.dialogs.SubtitleEvent> listEventActor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.SubtitleDownloaderDialogFragment.Companion Companion = null;
    
    public SubtitleDownloaderDialogFragment() {
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
    
    private final void setState(com.dewords.pope.gui.dialogs.SubDownloadDialogState value) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getListEventActor$annotations() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void focusOnView(androidx.core.widget.NestedScrollView scrollView) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SubtitleDownloaderDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/dewords/pope/gui/dialogs/SubtitleDownloaderDialogFragment;", "mediaUris", "", "Landroid/net/Uri;", "mediaTitles", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.dialogs.SubtitleDownloaderDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends android.net.Uri> mediaUris, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> mediaTitles) {
            return null;
        }
    }
}