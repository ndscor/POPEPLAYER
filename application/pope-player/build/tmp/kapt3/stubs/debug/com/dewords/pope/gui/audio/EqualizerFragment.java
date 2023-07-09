package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0003KLMB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J$\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u00106\u001a\u00020\u001eH\u0016J \u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001cH\u0016J\u001a\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u000101H\u0017J\b\u0010?\u001a\u00020\u001eH\u0002JH\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\n2\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020\nH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/dewords/pope/gui/audio/EqualizerFragment;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "Lcom/google/android/material/slider/Slider$OnChangeListener;", "()V", "adapter", "Landroid/widget/ArrayAdapter;", "", "allSets", "", "bandCount", "", "binding", "Lcom/dewords/pope/databinding/EqualizerBinding;", "customCount", "eqBandsViews", "Ljava/util/ArrayList;", "Lcom/dewords/pope/gui/view/EqualizerBar;", "equalizer", "Lorg/videolan/libvlc/MediaPlayer$Equalizer;", "newPresetName", "presetCount", "revertPos", "savePos", "setListener", "Landroid/widget/AdapterView$OnItemSelectedListener;", "state", "Lcom/dewords/pope/gui/audio/EqualizerFragment$EqualizerState;", "updateAlreadyHandled", "", "createDeleteCustomSetSnacker", "", "createSaveCustomSetDialog", "positionToSave", "displayedByUser", "onPause", "fillViews", "Lkotlinx/coroutines/Job;", "getDefaultState", "getEqualizerType", "position", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onResume", "onValueChange", "slider", "Lcom/google/android/material/slider/Slider;", "value", "", "fromUser", "onViewCreated", "view", "revertCustomSetChanges", "save", "ctx", "Landroid/content/Context;", "input", "Landroid/widget/EditText;", "oldName", "temporarySet", "saveEqualizer", "Landroidx/appcompat/app/AlertDialog;", "updateEqualizer", "pos", "BandListener", "Companion", "EqualizerState", "pope-player_debug"})
public final class EqualizerFragment extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment implements com.google.android.material.slider.Slider.OnChangeListener {
    private org.videolan.libvlc.MediaPlayer.Equalizer equalizer;
    private int customCount = 0;
    private int presetCount = 0;
    private java.util.List<java.lang.String> allSets;
    private android.widget.ArrayAdapter<java.lang.String> adapter;
    private int revertPos = 0;
    private int savePos = 0;
    private boolean updateAlreadyHandled = false;
    private com.dewords.pope.databinding.EqualizerBinding binding;
    private final com.dewords.pope.gui.audio.EqualizerFragment.EqualizerState state = null;
    private final java.lang.String newPresetName = null;
    private int bandCount = -1;
    private final java.util.ArrayList<com.dewords.pope.gui.view.EqualizerBar> eqBandsViews = null;
    private final android.widget.AdapterView.OnItemSelectedListener setListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.audio.EqualizerFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/EqualizerFragment";
    private static final int TYPE_PRESET = 0;
    private static final int TYPE_CUSTOM = 1;
    private static final int TYPE_NEW = 2;
    
    public EqualizerFragment() {
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
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job fillViews() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void createSaveCustomSetDialog(int positionToSave, boolean displayedByUser, boolean onPause) {
    }
    
    private final void save(android.content.Context ctx, android.widget.EditText input, java.lang.String oldName, org.videolan.libvlc.MediaPlayer.Equalizer temporarySet, boolean onPause, boolean displayedByUser, int positionToSave, androidx.appcompat.app.AlertDialog saveEqualizer) {
    }
    
    private final void createDeleteCustomSetSnacker() {
    }
    
    private final void revertCustomSetChanges() {
    }
    
    private final kotlinx.coroutines.Job updateEqualizer(int pos) {
        return null;
    }
    
    private final int getEqualizerType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onValueChange(@org.jetbrains.annotations.NotNull()
    com.google.android.material.slider.Slider slider, float value, boolean fromUser) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/gui/audio/EqualizerFragment$BandListener;", "Lcom/dewords/pope/interfaces/OnEqualizerBarChangeListener;", "index", "", "(Lcom/dewords/pope/gui/audio/EqualizerFragment;I)V", "oldBands", "", "onProgressChanged", "", "value", "", "fromUser", "", "onStartTrackingTouch", "pope-player_debug"})
    final class BandListener implements com.dewords.pope.interfaces.OnEqualizerBarChangeListener {
        private final int index = 0;
        private java.util.List<java.lang.Integer> oldBands;
        
        public BandListener(int index) {
            super();
        }
        
        @java.lang.Override()
        public void onProgressChanged(float value, boolean fromUser) {
        }
        
        @java.lang.Override()
        public void onStartTrackingTouch() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/gui/audio/EqualizerFragment$EqualizerState;", "", "(Lcom/dewords/pope/gui/audio/EqualizerFragment;)V", "deleteButtonVisibility", "Landroidx/databinding/ObservableBoolean;", "getDeleteButtonVisibility", "()Landroidx/databinding/ObservableBoolean;", "setDeleteButtonVisibility", "(Landroidx/databinding/ObservableBoolean;)V", "revertButtonVisibility", "getRevertButtonVisibility", "setRevertButtonVisibility", "saveButtonVisibility", "getSaveButtonVisibility", "setSaveButtonVisibility", "saved", "", "getSaved$pope_player_debug", "()Z", "setSaved$pope_player_debug", "(Z)V", "update", "", "newPos", "", "newSaved", "pope-player_debug"})
    public final class EqualizerState {
        private boolean saved = true;
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ObservableBoolean saveButtonVisibility;
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ObservableBoolean revertButtonVisibility;
        @org.jetbrains.annotations.NotNull()
        private androidx.databinding.ObservableBoolean deleteButtonVisibility;
        
        public EqualizerState() {
            super();
        }
        
        public final boolean getSaved$pope_player_debug() {
            return false;
        }
        
        public final void setSaved$pope_player_debug(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ObservableBoolean getSaveButtonVisibility() {
            return null;
        }
        
        public final void setSaveButtonVisibility(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableBoolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ObservableBoolean getRevertButtonVisibility() {
            return null;
        }
        
        public final void setRevertButtonVisibility(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableBoolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.databinding.ObservableBoolean getDeleteButtonVisibility() {
            return null;
        }
        
        public final void setDeleteButtonVisibility(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ObservableBoolean p0) {
        }
        
        public final void update(int newPos, boolean newSaved) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/gui/audio/EqualizerFragment$Companion;", "", "()V", "TAG", "", "TYPE_CUSTOM", "", "TYPE_NEW", "TYPE_PRESET", "equalizerPresets", "", "getEqualizerPresets", "()[Ljava/lang/String;", "newInstance", "Lcom/dewords/pope/gui/audio/EqualizerFragment;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String[] getEqualizerPresets() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.audio.EqualizerFragment newInstance() {
            return null;
        }
    }
}