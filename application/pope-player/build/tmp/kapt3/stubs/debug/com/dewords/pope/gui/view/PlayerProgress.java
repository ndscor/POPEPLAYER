package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J8\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020!H\u0002J\u000e\u00107\u001a\u00020,2\u0006\u0010)\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/dewords/pope/gui/view/PlayerProgress;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundColor", "boostColor", "clip", "Landroid/graphics/Region;", "clippingPath", "Landroid/graphics/Path;", "firstClippingRegion", "isDouble", "", "()Z", "setDouble", "(Z)V", "paintBackground", "Landroid/graphics/Paint;", "paintProgress", "path", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "progressColor", "progressPercent", "", "getProgressPercent", "()F", "progressWidth", "rectProgress", "Landroid/graphics/RectF;", "secondClippingRegion", "shadowColor", "value", "yOffset", "initialize", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "roundedRectanglePath", "left", "top", "right", "bottom", "rx", "ry", "setValue", "pope-player_debug"})
public final class PlayerProgress extends android.view.View {
    private boolean isDouble = false;
    private int value = 50;
    private final int progressColor = 0;
    private final int boostColor = 0;
    private final int shadowColor = 0;
    private final int backgroundColor = 0;
    private final android.graphics.Paint paintProgress = null;
    private final android.graphics.Paint paintBackground = null;
    private final android.graphics.RectF rectProgress = null;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Path path;
    private final int progressWidth = 0;
    private final int yOffset = 0;
    private final android.graphics.Region clip = null;
    private final android.graphics.Region firstClippingRegion = null;
    private final android.graphics.Region secondClippingRegion = null;
    private final android.graphics.Path clippingPath = null;
    
    public final boolean isDouble() {
        return false;
    }
    
    public final void setDouble(boolean p0) {
    }
    
    private final float getProgressPercent() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Path getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    android.graphics.Path p0) {
    }
    
    public PlayerProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PlayerProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PlayerProgress(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initialize() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    public final void setValue(int value) {
    }
    
    private final void roundedRectanglePath(float left, float top, float right, float bottom, float rx, float ry) {
    }
}