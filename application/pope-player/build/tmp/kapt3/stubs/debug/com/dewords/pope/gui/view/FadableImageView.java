package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0012\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/dewords/pope/gui/view/FadableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "fade", "", "resetFade", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBackgroundResource", "resid", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "setImageIcon", "icon", "Landroid/graphics/drawable/Icon;", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "pope-player_debug"})
public final class FadableImageView extends androidx.appcompat.widget.AppCompatImageView {
    private java.util.concurrent.atomic.AtomicBoolean animationRunning;
    
    public FadableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public FadableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public FadableImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void fade() {
    }
    
    public final void resetFade() {
    }
    
    @java.lang.Override()
    public void setBackground(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable background) {
    }
    
    @java.lang.Override()
    public void setBackgroundResource(int resid) {
    }
    
    @java.lang.Override()
    public void setImageBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bm) {
    }
    
    @java.lang.Override()
    public void setImageDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override()
    public void setImageIcon(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Icon icon) {
    }
    
    @java.lang.Override()
    public void setImageResource(int resId) {
    }
    
    @java.lang.Override()
    public void setImageURI(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
}