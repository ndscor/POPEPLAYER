package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0005J\b\u0010#\u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/dewords/pope/gui/view/EqualizerBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "band", "", "(Landroid/content/Context;F)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bandTextView", "Landroid/widget/TextView;", "bandValueTextView", "listener", "Lcom/dewords/pope/interfaces/OnEqualizerBarChangeListener;", "seekListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "verticalSeekBar", "Lcom/dewords/pope/gui/view/VerticalSeekBar;", "getProgress", "", "getValue", "init", "", "isFromUser", "", "setListener", "setNextFocusLeftId", "nextFocusLeftId", "setNextFocusRightId", "nextFocusRightId", "setProgress", "fl", "setValue", "value", "updateValueText", "Companion", "pope-player_debug"})
public final class EqualizerBar extends android.widget.LinearLayout {
    private android.widget.TextView bandValueTextView;
    private com.dewords.pope.gui.view.VerticalSeekBar verticalSeekBar;
    private android.widget.TextView bandTextView;
    private com.dewords.pope.interfaces.OnEqualizerBarChangeListener listener;
    private final android.widget.SeekBar.OnSeekBarChangeListener seekListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.view.EqualizerBar.Companion Companion = null;
    public static final int PRECISION = 10;
    public static final int RANGE = 200;
    
    @java.lang.Override()
    public void setNextFocusLeftId(int nextFocusLeftId) {
    }
    
    @java.lang.Override()
    public void setNextFocusRightId(int nextFocusRightId) {
    }
    
    private final boolean isFromUser() {
        return false;
    }
    
    public EqualizerBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float band) {
        super(null);
    }
    
    public EqualizerBar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void init(android.content.Context context, float band) {
    }
    
    private final void updateValueText() {
    }
    
    public final void setValue(float value) {
    }
    
    public final float getValue() {
        return 0.0F;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.OnEqualizerBarChangeListener listener) {
    }
    
    public final void setProgress(int fl) {
    }
    
    public final int getProgress() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/dewords/pope/gui/view/EqualizerBar$Companion;", "", "()V", "PRECISION", "", "RANGE", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}