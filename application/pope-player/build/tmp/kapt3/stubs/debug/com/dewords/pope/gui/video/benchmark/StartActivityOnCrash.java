package com.dewords.pope.gui.video.benchmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/gui/video/benchmark/StartActivityOnCrash;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "preferences", "Landroid/content/SharedPreferences;", "uncaughtException", "", "thread", "Ljava/lang/Thread;", "throwable", "", "Companion", "pope-player_debug"})
public final class StartActivityOnCrash implements java.lang.Thread.UncaughtExceptionHandler {
    private final android.app.Activity context = null;
    private final android.content.SharedPreferences preferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.video.benchmark.StartActivityOnCrash.Companion Companion = null;
    private static final java.lang.String SHARED_PREFERENCE = "org.videolab.vlc.gui.video.benchmark.UNCAUGHT_EXCEPTIONS";
    private static final java.lang.String SHARED_PREFERENCE_STACK_TRACE = "org.videolab.vlc.gui.video.benchmark.STACK_TRACE";
    private static final int MAX_STACK_TRACE_SIZE = 131071;
    
    public StartActivityOnCrash(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super();
    }
    
    @java.lang.Override()
    public void uncaughtException(@org.jetbrains.annotations.NotNull()
    java.lang.Thread thread, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/gui/video/benchmark/StartActivityOnCrash$Companion;", "", "()V", "MAX_STACK_TRACE_SIZE", "", "SHARED_PREFERENCE", "", "SHARED_PREFERENCE_STACK_TRACE", "setUp", "", "context", "Landroid/app/Activity;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean setUp(@org.jetbrains.annotations.NotNull()
        android.app.Activity context) {
            return false;
        }
    }
}