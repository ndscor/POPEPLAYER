package com.dewords.pope.gui.helpers;

import java.lang.System;

/**
 * @param initialInterval Initial interval in millis
 * @param normalInterval Normal interval in millis
 * @param clickListener The OnClickListener to trigger
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/OnRepeatListenerKey;", "Landroid/view/View$OnKeyListener;", "Lcom/dewords/pope/gui/helpers/OnRepeatListener;", "clickListener", "Landroid/view/View$OnClickListener;", "(Landroid/view/View$OnClickListener;)V", "initialInterval", "", "normalInterval", "speedUpDelay", "(IIILandroid/view/View$OnClickListener;)V", "onKey", "", "view", "Landroid/view/View;", "keyCode", "event", "Landroid/view/KeyEvent;", "pope-player_debug"})
public final class OnRepeatListenerKey extends com.dewords.pope.gui.helpers.OnRepeatListener implements android.view.View.OnKeyListener {
    private final int initialInterval = 0;
    private final int normalInterval = 0;
    private final int speedUpDelay = 0;
    private final android.view.View.OnClickListener clickListener = null;
    
    public OnRepeatListenerKey(int initialInterval, int normalInterval, int speedUpDelay, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener clickListener) {
        super(0, 0, 0, null);
    }
    
    /**
     * @param clickListener The OnClickListener to trigger
     */
    public OnRepeatListenerKey(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener clickListener) {
        super(0, 0, 0, null);
    }
    
    @java.lang.Override()
    public boolean onKey(@org.jetbrains.annotations.Nullable()
    android.view.View view, int keyCode, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
}