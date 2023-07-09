package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0016\u0010$\u001a\u00020\u001a2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/gui/DebugLogActivity;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/dewords/pope/DebugLogService$Client$Callback;", "()V", "clearButton", "Landroid/widget/Button;", "clearClickListener", "Landroid/view/View$OnClickListener;", "client", "Lcom/dewords/pope/DebugLogService$Client;", "copyButton", "copyClickListener", "logAdapter", "Landroid/widget/ArrayAdapter;", "", "logList", "", "logView", "Landroid/widget/ListView;", "saveButton", "saveClickListener", "startButton", "startClickListener", "stopButton", "stopClickListener", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLog", "msg", "onSaved", "success", "", "path", "onStarted", "", "onStopped", "setOptionsButtonsEnabled", "enabled", "Companion", "pope-player_debug"})
public final class DebugLogActivity extends androidx.fragment.app.FragmentActivity implements com.dewords.pope.DebugLogService.Client.Callback {
    private com.dewords.pope.DebugLogService.Client client;
    private android.widget.Button startButton;
    private android.widget.Button stopButton;
    private android.widget.Button copyButton;
    private android.widget.Button clearButton;
    private android.widget.Button saveButton;
    private android.widget.ListView logView;
    private java.util.List<java.lang.String> logList;
    private android.widget.ArrayAdapter<java.lang.String> logAdapter;
    private final android.view.View.OnClickListener startClickListener = null;
    private final android.view.View.OnClickListener stopClickListener = null;
    private final android.view.View.OnClickListener clearClickListener = null;
    private final android.view.View.OnClickListener saveClickListener = null;
    private final android.view.View.OnClickListener copyClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.DebugLogActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/DebugLogActivity";
    
    public DebugLogActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setOptionsButtonsEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onStarted(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> logList) {
    }
    
    @java.lang.Override()
    public void onStopped() {
    }
    
    @java.lang.Override()
    public void onLog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void onSaved(boolean success, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/DebugLogActivity$Companion;", "", "()V", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}