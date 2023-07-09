package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010%2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020%2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00104\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/dewords/pope/gui/dialogs/AddToGroupDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "()V", "adapter", "Lcom/dewords/pope/gui/SimpleAdapter;", "binding", "Lcom/dewords/pope/databinding/DialogAddToGroupBinding;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "forbidNewGroup", "", "value", "isLoading", "setLoading", "(Z)V", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "newGroupListener", "Lkotlin/Function0;", "", "getNewGroupListener", "()Lkotlin/jvm/functions/Function0;", "setNewGroupListener", "(Lkotlin/jvm/functions/Function0;)V", "newTrack", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "viewModel", "Lcom/dewords/pope/viewmodels/mobile/VideosViewModel;", "addToGroup", "videoGroup", "Lorg/videolan/medialibrary/interfaces/media/VideoGroup;", "getDefaultState", "", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "onClick", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateEmptyView", "empty", "Companion", "pope-player_debug"})
public final class AddToGroupDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment implements com.dewords.pope.gui.SimpleAdapter.ClickHandler {
    private com.dewords.pope.viewmodels.mobile.VideosViewModel viewModel;
    private boolean forbidNewGroup = true;
    public kotlin.jvm.functions.Function0<kotlin.Unit> newGroupListener;
    private boolean isLoading = false;
    private com.dewords.pope.databinding.DialogAddToGroupBinding binding;
    private com.dewords.pope.gui.SimpleAdapter adapter;
    private org.videolan.medialibrary.interfaces.media.MediaWrapper[] newTrack;
    private org.videolan.medialibrary.interfaces.Medialibrary medialibrary;
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.AddToGroupDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/SavePlaylistDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TRACKS = "ADD_TO_GROUP_TRACKS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORBID_NEW_GROUP = "FORBID_NEW_GROUP";
    
    public AddToGroupDialog() {
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
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getNewGroupListener() {
        return null;
    }
    
    public final void setNewGroupListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    private final void setLoading(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
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
    
    private final void updateEmptyView(boolean empty) {
    }
    
    private final void addToGroup(org.videolan.medialibrary.interfaces.media.VideoGroup videoGroup) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dewords/pope/gui/dialogs/AddToGroupDialog$Companion;", "Lorg/videolan/tools/DependencyProvider;", "", "()V", "FORBID_NEW_GROUP", "", "KEY_TRACKS", "TAG", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.DependencyProvider<java.lang.Object> {
        
        private Companion() {
            super();
        }
    }
}