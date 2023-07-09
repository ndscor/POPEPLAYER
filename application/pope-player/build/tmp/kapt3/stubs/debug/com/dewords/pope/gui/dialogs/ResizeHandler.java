package com.dewords.pope.gui.dialogs;

import java.lang.System;

/**
 * Manages the widget size UI loop
 *
 * @param owner the dialog itself
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ResizeHandler;", "Lorg/videolan/tools/WeakHandler;", "Lcom/dewords/pope/gui/dialogs/WidgetExplanationDialog;", "owner", "(Lcom/dewords/pope/gui/dialogs/WidgetExplanationDialog;)V", "currentDrawable", "", "getCurrentDrawable", "()I", "setCurrentDrawable", "(I)V", "sizeDrawables", "", "displaySizeImage", "", "drawable", "handleMessage", "msg", "Landroid/os/Message;", "pope-player_debug"})
final class ResizeHandler extends org.videolan.tools.WeakHandler<com.dewords.pope.gui.dialogs.WidgetExplanationDialog> {
    private final java.util.List<java.lang.Integer> sizeDrawables = null;
    private int currentDrawable;
    
    public ResizeHandler(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.WidgetExplanationDialog owner) {
        super(null);
    }
    
    public final int getCurrentDrawable() {
        return 0;
    }
    
    public final void setCurrentDrawable(int p0) {
    }
    
    private final void displaySizeImage(@androidx.annotation.DrawableRes()
    int drawable) {
    }
    
    @java.lang.Override()
    public void handleMessage(@org.jetbrains.annotations.NotNull()
    android.os.Message msg) {
    }
}