package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H$J\b\u0010%\u001a\u00020\rH\u0016J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0002J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\rH&J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020,H\u0016J&\u00101\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0018\u00108\u001a\u00020#2\u0006\u00100\u001a\u00020,2\u0006\u00109\u001a\u00020.H\u0016J\u001a\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0006H\u0002J\b\u0010=\u001a\u00020.H\u0016J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/dewords/pope/gui/dialogs/PickTimeFragment;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnFocusChangeListener;", "()V", "formatTime", "", "hours", "getHours", "()Ljava/lang/String;", "setHours", "(Ljava/lang/String;)V", "mTextColor", "", "maxTimeSize", "getMaxTimeSize", "()I", "setMaxTimeSize", "(I)V", "minutes", "getMinutes", "setMinutes", "pickedRawTime", "playbackService", "Lcom/dewords/pope/PlaybackService;", "getPlaybackService", "()Lcom/dewords/pope/PlaybackService;", "setPlaybackService", "(Lcom/dewords/pope/PlaybackService;)V", "seconds", "getSeconds", "setSeconds", "tvTimeToJump", "Landroid/widget/TextView;", "deleteLastNumber", "", "executeAction", "getDefaultState", "getLastNumbers", "rawTime", "getTimeInMillis", "", "getTitle", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFocusChange", "hasFocus", "onViewCreated", "view", "removeLastNumbers", "showDeleteCurrent", "updateValue", "value", "Companion", "pope-player_debug"})
public abstract class PickTimeFragment extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener {
    private int mTextColor = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String hours = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minutes = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String seconds = "";
    private java.lang.String formatTime = "";
    private java.lang.String pickedRawTime = "";
    private int maxTimeSize = 6;
    private android.widget.TextView tvTimeToJump;
    public com.dewords.pope.PlaybackService playbackService;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.PickTimeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/PickTimeFragment";
    public static final long MILLIS_IN_MICROS = 1000L;
    public static final long SECONDS_IN_MICROS = 1000000L;
    public static final long MINUTES_IN_MICROS = 60000000L;
    public static final long HOURS_IN_MICROS = 3600000000L;
    
    public PickTimeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHours() {
        return null;
    }
    
    public final void setHours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinutes() {
        return null;
    }
    
    public final void setMinutes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeconds() {
        return null;
    }
    
    public final void setSeconds(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMaxTimeSize() {
        return 0;
    }
    
    public final void setMaxTimeSize(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.PlaybackService getPlaybackService() {
        return null;
    }
    
    public final void setPlaybackService(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService p0) {
    }
    
    public abstract int getTitle();
    
    public boolean showDeleteCurrent() {
        return false;
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
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.NotNull()
    android.view.View v, boolean hasFocus) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final java.lang.String getLastNumbers(java.lang.String rawTime) {
        return null;
    }
    
    private final java.lang.String removeLastNumbers(java.lang.String rawTime) {
        return null;
    }
    
    private final void deleteLastNumber() {
    }
    
    private final void updateValue(java.lang.String value) {
    }
    
    public final long getTimeInMillis() {
        return 0L;
    }
    
    protected abstract void executeAction();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/gui/dialogs/PickTimeFragment$Companion;", "", "()V", "HOURS_IN_MICROS", "", "MILLIS_IN_MICROS", "MINUTES_IN_MICROS", "SECONDS_IN_MICROS", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}