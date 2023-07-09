package com.dewords.pope;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003,-.B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0012H\u0003J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0016J\"\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0012\u0010\"\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010$\u001a\u00020\u0012H\u0016J\u0006\u0010%\u001a\u00020\u0012J\u001a\u0010&\u001a\u00020\u00122\u0006\u0010\'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010)\u001a\u00020\u0012J\u0006\u0010*\u001a\u00020\u0012J\u0012\u0010+\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/dewords/pope/DebugLogService;", "Landroid/app/Service;", "Lorg/videolan/tools/Logcat$Callback;", "Ljava/lang/Runnable;", "()V", "binder", "Lcom/dewords/pope/DebugLogService$DebugLogServiceStub;", "callbacks", "Landroid/os/RemoteCallbackList;", "Lcom/dewords/pope/IDebugLogServiceCallback;", "logList", "Ljava/util/LinkedList;", "", "logcat", "Lorg/videolan/tools/Logcat;", "saveThread", "Ljava/lang/Thread;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "clear", "forceForeground", "getApplicationContext", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onLog", "log", "onStartCommand", "", "flags", "startId", "registerCallback", "cb", "run", "save", "sendMessage", "what", "str", "start", "stop", "unregisterCallback", "Client", "Companion", "DebugLogServiceStub", "pope-player_debug"})
public final class DebugLogService extends android.app.Service implements org.videolan.tools.Logcat.Callback, java.lang.Runnable {
    private org.videolan.tools.Logcat logcat;
    private final java.util.LinkedList<java.lang.String> logList = null;
    private java.lang.Thread saveThread;
    private final android.os.RemoteCallbackList<com.dewords.pope.IDebugLogServiceCallback> callbacks = null;
    private final com.dewords.pope.DebugLogService.DebugLogServiceStub binder = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.DebugLogService.Companion Companion = null;
    private static final int MSG_STARTED = 0;
    private static final int MSG_STOPPED = 1;
    private static final int MSG_ONLOG = 2;
    private static final int MSG_SAVED = 3;
    private static final int MAX_LINES = 20000;
    
    public DebugLogService() {
        super();
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void sendMessage(int what, java.lang.String str) {
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void onLog(@org.jetbrains.annotations.NotNull()
    java.lang.String log) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    private final void forceForeground() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void start() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void stop() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void clear() {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void save() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void registerCallback(com.dewords.pope.IDebugLogServiceCallback cb) {
    }
    
    private final void unregisterCallback(com.dewords.pope.IDebugLogServiceCallback cb) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/DebugLogService$DebugLogServiceStub;", "Lcom/dewords/pope/IDebugLogService$Stub;", "service", "Lcom/dewords/pope/DebugLogService;", "(Lcom/dewords/pope/DebugLogService;)V", "clear", "", "registerCallback", "cb", "Lcom/dewords/pope/IDebugLogServiceCallback;", "save", "start", "stop", "unregisterCallback", "pope-player_debug"})
    public static final class DebugLogServiceStub extends com.dewords.pope.IDebugLogService.Stub {
        private final com.dewords.pope.DebugLogService service = null;
        
        public DebugLogServiceStub(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.DebugLogService service) {
            super();
        }
        
        @java.lang.Override()
        public void start() {
        }
        
        @java.lang.Override()
        public void stop() {
        }
        
        @java.lang.Override()
        public void clear() {
        }
        
        @java.lang.Override()
        public void save() {
        }
        
        @java.lang.Override()
        public void registerCallback(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.IDebugLogServiceCallback cb) {
        }
        
        @java.lang.Override()
        public void unregisterCallback(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.IDebugLogServiceCallback cb) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/DebugLogService$Client;", "", "mContext", "Landroid/content/Context;", "mCallback", "Lcom/dewords/pope/DebugLogService$Client$Callback;", "(Landroid/content/Context;Lcom/dewords/pope/DebugLogService$Client$Callback;)V", "mBound", "", "mHandler", "Landroid/os/Handler;", "mICallback", "Lcom/dewords/pope/IDebugLogServiceCallback$Stub;", "mIDebugLogService", "Lcom/dewords/pope/IDebugLogService;", "mServiceConnection", "Landroid/content/ServiceConnection;", "clear", "release", "", "save", "start", "stop", "Callback", "pope-player_debug"})
    public static final class Client {
        private final android.content.Context mContext = null;
        private final com.dewords.pope.DebugLogService.Client.Callback mCallback = null;
        private boolean mBound = false;
        private com.dewords.pope.IDebugLogService mIDebugLogService;
        private final android.os.Handler mHandler = null;
        private final com.dewords.pope.IDebugLogServiceCallback.Stub mICallback = null;
        private final android.content.ServiceConnection mServiceConnection = null;
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalArgumentException.class})
        public Client(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        com.dewords.pope.DebugLogService.Client.Callback mCallback) throws java.lang.IllegalArgumentException {
            super();
        }
        
        public final boolean start() {
            return false;
        }
        
        public final boolean stop() {
            return false;
        }
        
        public final boolean clear() {
            return false;
        }
        
        public final boolean save() {
            return false;
        }
        
        public final void release() {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/DebugLogService$Client$Callback;", "", "onLog", "", "msg", "", "onSaved", "success", "", "path", "onStarted", "logList", "", "onStopped", "pope-player_debug"})
        public static abstract interface Callback {
            
            public abstract void onStarted(@org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> logList);
            
            public abstract void onStopped();
            
            public abstract void onLog(@org.jetbrains.annotations.NotNull()
            java.lang.String msg);
            
            public abstract void onSaved(boolean success, @org.jetbrains.annotations.NotNull()
            java.lang.String path);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/DebugLogService$Companion;", "", "()V", "MAX_LINES", "", "MSG_ONLOG", "MSG_SAVED", "MSG_STARTED", "MSG_STOPPED", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}