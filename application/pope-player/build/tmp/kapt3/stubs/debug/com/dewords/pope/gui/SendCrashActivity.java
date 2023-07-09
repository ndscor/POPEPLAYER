package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0016\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/dewords/pope/gui/SendCrashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dewords/pope/DebugLogService$Client$Callback;", "()V", "binding", "Lcom/dewords/pope/databinding/SendCrashActivityBinding;", "client", "Lcom/dewords/pope/DebugLogService$Client;", "dbPath", "", "dbZipPath", "errCtx", "errMsg", "logMessage", "logcatZipPath", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLog", "msg", "onSaved", "success", "", "path", "onStarted", "logList", "", "onStopped", "Companion", "pope-player_debug"})
public final class SendCrashActivity extends androidx.appcompat.app.AppCompatActivity implements com.dewords.pope.DebugLogService.Client.Callback {
    private java.lang.String logMessage = "";
    private com.dewords.pope.DebugLogService.Client client;
    private com.dewords.pope.databinding.SendCrashActivityBinding binding;
    private java.lang.String dbPath;
    private java.lang.String dbZipPath;
    private java.lang.String logcatZipPath;
    private java.lang.String errMsg;
    private java.lang.String errCtx;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.SendCrashActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static kotlinx.coroutines.CompletableJob job;
    
    public SendCrashActivity() {
        super();
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
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/SendCrashActivity$Companion;", "", "()V", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "setJob", "(Lkotlinx/coroutines/CompletableJob;)V", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlinx.coroutines.CompletableJob getJob() {
            return null;
        }
        
        public final void setJob(@org.jetbrains.annotations.Nullable()
        kotlinx.coroutines.CompletableJob p0) {
        }
    }
}