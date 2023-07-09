package com.dewords.pope.gui.view;

import java.lang.System;

/**
 * TextView that display a custom focused/pressed state depending on the text bounds
 * It's meant to be used when the TextView width is not set to wrap_content and we want a focus
 * state
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/gui/view/FocusableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "initialize", "", "onFocusChanged", "focused", "", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "FocusDrawable", "pope-player_debug"})
public class FocusableTextView extends androidx.appcompat.widget.AppCompatTextView {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy paint$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getPaint() {
        return null;
    }
    
    public FocusableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public FocusableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public FocusableTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initialize() {
    }
    
    @java.lang.Override()
    protected void onFocusChanged(boolean focused, int direction, @org.jetbrains.annotations.Nullable()
    android.graphics.Rect previouslyFocusedRect) {
    }
    
    /**
     * Drawable responsible for drawing a pressed/focused state
     * depending on the inner text size
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/view/FocusableTextView$FocusDrawable;", "Landroid/graphics/drawable/Drawable;", "(Lcom/dewords/pope/gui/view/FocusableTextView;)V", "pressed", "", "getPressed", "()Z", "setPressed", "(Z)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "isStateful", "onStateChange", "states", "", "setAlpha", "i", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "pope-player_debug"})
    public final class FocusDrawable extends android.graphics.drawable.Drawable {
        private boolean pressed = false;
        
        public FocusDrawable() {
            super();
        }
        
        @java.lang.Override()
        public boolean isStateful() {
            return false;
        }
        
        @java.lang.Override()
        @java.lang.Deprecated()
        public int getOpacity() {
            return 0;
        }
        
        @java.lang.Override()
        public void setColorFilter(@org.jetbrains.annotations.Nullable()
        android.graphics.ColorFilter colorFilter) {
        }
        
        @java.lang.Override()
        public void setAlpha(int i) {
        }
        
        public final boolean getPressed() {
            return false;
        }
        
        public final void setPressed(boolean p0) {
        }
        
        @java.lang.Override()
        protected boolean onStateChange(@org.jetbrains.annotations.NotNull()
        int[] states) {
            return false;
        }
        
        @java.lang.Override()
        public void draw(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
    }
}