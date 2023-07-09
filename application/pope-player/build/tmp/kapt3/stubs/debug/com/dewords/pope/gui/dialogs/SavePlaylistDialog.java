package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0016J/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002\u00a2\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0013H\u0016J\u0010\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020/H\u0016J\u0010\u00101\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u000107H\u0016J&\u00108\u001a\u0004\u0018\u00010/2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\"\u0010=\u001a\u00020\u00132\u0006\u00102\u001a\u00020>2\u0006\u0010?\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u000207H\u0016J\u001a\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u000107H\u0016J#\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020#2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002\u00a2\u0006\u0002\u0010IJ\b\u0010J\u001a\u00020)H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0013@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u001cR$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006L"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SavePlaylistDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/TextView$OnEditorActionListener;", "Lcom/dewords/pope/gui/SimpleAdapter$ClickHandler;", "()V", "adapter", "Lcom/dewords/pope/gui/SimpleAdapter;", "alreadyAdding", "Ljava/util/concurrent/atomic/AtomicBoolean;", "binding", "Lcom/dewords/pope/databinding/DialogPlaylistBinding;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "value", "", "filesText", "setFilesText", "(Ljava/lang/String;)V", "", "isLoading", "setLoading", "(Z)V", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "newTracks", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "nonDuplicateTracks", "getNonDuplicateTracks", "()[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setNonDuplicateTracks", "([Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "selectedPlaylist", "Lorg/videolan/medialibrary/interfaces/media/Playlist;", "getSelectedPlaylist", "()Lorg/videolan/medialibrary/interfaces/media/Playlist;", "setSelectedPlaylist", "(Lorg/videolan/medialibrary/interfaces/media/Playlist;)V", "addToNewPlaylist", "", "getDefaultState", "", "currentTracks", "([Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "onClick", "v", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onEditorAction", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "onSaveInstanceState", "outState", "onViewCreated", "view", "savePlaylist", "playlist", "tracks", "(Lorg/videolan/medialibrary/interfaces/media/Playlist;[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "updateEmptyView", "Companion", "pope-player_debug"})
public final class SavePlaylistDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment implements android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener, com.dewords.pope.gui.SimpleAdapter.ClickHandler {
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.interfaces.media.Playlist selectedPlaylist;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.interfaces.media.MediaWrapper[] nonDuplicateTracks;
    private boolean isLoading = false;
    private java.lang.String filesText = "";
    private com.dewords.pope.databinding.DialogPlaylistBinding binding;
    private com.dewords.pope.gui.SimpleAdapter adapter;
    private org.videolan.medialibrary.interfaces.media.MediaWrapper[] newTracks;
    private org.videolan.medialibrary.interfaces.Medialibrary medialibrary;
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    private final java.util.concurrent.atomic.AtomicBoolean alreadyAdding = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.SavePlaylistDialog.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/SavePlaylistDialog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_NEW_TRACKS = "PLAYLIST_NEW_TRACKS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_FOLDER = "PLAYLIST_FROM_FOLDER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SUB_FOLDERS = "PLAYLIST_FOLDER_ADD_SUBFOLDERS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_PLAYLIST = "SELECTED_PLAYLIST";
    
    public SavePlaylistDialog() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.Playlist getSelectedPlaylist() {
        return null;
    }
    
    public final void setSelectedPlaylist(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.Playlist p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper[] getNonDuplicateTracks() {
        return null;
    }
    
    public final void setNonDuplicateTracks(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper[] p0) {
    }
    
    private final void setLoading(boolean value) {
    }
    
    private final void setFilesText(java.lang.String value) {
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
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void updateEmptyView() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.NotNull()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void addToNewPlaylist() {
    }
    
    private final void savePlaylist(org.videolan.medialibrary.interfaces.media.Playlist playlist, org.videolan.medialibrary.interfaces.media.MediaWrapper[] tracks) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    private final org.videolan.medialibrary.interfaces.media.MediaWrapper[] getNonDuplicateTracks(org.videolan.medialibrary.interfaces.media.MediaWrapper[] currentTracks, org.videolan.medialibrary.interfaces.media.MediaWrapper[] newTracks) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/gui/dialogs/SavePlaylistDialog$Companion;", "Lorg/videolan/tools/DependencyProvider;", "", "()V", "KEY_FOLDER", "", "KEY_NEW_TRACKS", "KEY_SUB_FOLDERS", "SELECTED_PLAYLIST", "TAG", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.DependencyProvider<java.lang.Object> {
        
        private Companion() {
            super();
        }
    }
}