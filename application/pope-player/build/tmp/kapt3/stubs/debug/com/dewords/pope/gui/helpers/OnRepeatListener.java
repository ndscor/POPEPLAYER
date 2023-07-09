package com.dewords.pope.gui.helpers;

import java.lang.System;

/**
 * @param initialInterval Initial interval in millis
 * @param normalInterval Normal interval in millis
 * @param clickListener The OnClickListener to trigger
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/dewords/pope/gui/helpers/OnRepeatListener;", "", "initialInterval", "", "normalInterval", "speedUpDelay", "clickListener", "Landroid/view/View$OnClickListener;", "(IIILandroid/view/View$OnClickListener;)V", "downView", "Landroid/view/View;", "getDownView", "()Landroid/view/View;", "setDownView", "(Landroid/view/View;)V", "handler", "Lcom/dewords/pope/gui/helpers/OnRepeatListener$OnRepeatHandler;", "initialTime", "", "getInitialTime", "()J", "setInitialTime", "(J)V", "startRepeating", "", "view", "stopRepeating", "Companion", "OnRepeatHandler", "pope-player_debug"})
public class OnRepeatListener {
    private final int initialInterval = 0;
    private final int normalInterval = 0;
    private final int speedUpDelay = 0;
    private final android.view.View.OnClickListener clickListener = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.View downView;
    private long initialTime = -1L;
    private final com.dewords.pope.gui.helpers.OnRepeatListener.OnRepeatHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.OnRepeatListener.Companion Companion = null;
    private static final int ACTION_ONCLICK = 0;
    public static final int DEFAULT_INITIAL_DELAY = 500;
    public static final int DEFAULT_NORMAL_DELAY = 150;
    public static final int DEFAULT_SPEEDUP_DELAY = 2000;
    
    public OnRepeatListener(int initialInterval, int normalInterval, int speedUpDelay, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getDownView() {
        return null;
    }
    
    public final void setDownView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public final long getInitialTime() {
        return 0L;
    }
    
    public final void setInitialTime(long p0) {
    }
    
    public final void startRepeating(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void stopRepeating(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/helpers/OnRepeatListener$OnRepeatHandler;", "Lorg/videolan/tools/WeakHandler;", "Lcom/dewords/pope/gui/helpers/OnRepeatListener;", "owner", "(Lcom/dewords/pope/gui/helpers/OnRepeatListener;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "pope-player_debug"})
    static final class OnRepeatHandler extends org.videolan.tools.WeakHandler<com.dewords.pope.gui.helpers.OnRepeatListener> {
        
        public OnRepeatHandler(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.helpers.OnRepeatListener owner) {
            super(null);
        }
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dewords/pope/gui/helpers/OnRepeatListener$Companion;", "", "()V", "ACTION_ONCLICK", "", "DEFAULT_INITIAL_DELAY", "DEFAULT_NORMAL_DELAY", "DEFAULT_SPEEDUP_DELAY", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}