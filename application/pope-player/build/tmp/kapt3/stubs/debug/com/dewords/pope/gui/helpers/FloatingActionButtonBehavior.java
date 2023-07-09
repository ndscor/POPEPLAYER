package com.dewords.pope.gui.helpers;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016JH\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016J8\u0010\'\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/gui/helpers/FloatingActionButtonBehavior;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onVisibilityChangedListener", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton$OnVisibilityChangedListener;", "player", "Landroid/widget/FrameLayout;", "playerBehavior", "Lcom/dewords/pope/gui/helpers/PlayerBehavior;", "getPlayerBehavior", "()Lcom/dewords/pope/gui/helpers/PlayerBehavior;", "shouldNeverShow", "", "getShouldNeverShow", "()Z", "setShouldNeverShow", "(Z)V", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "dependency", "Landroid/view/View;", "onDependentViewChanged", "onNestedScroll", "", "coordinatorLayout", "target", "dxConsumed", "", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "type", "onStartNestedScroll", "directTargetChild", "axes", "pope-player_debug"})
public final class FloatingActionButtonBehavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior {
    private final com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener = null;
    private android.widget.FrameLayout player;
    private boolean shouldNeverShow = false;
    
    public FloatingActionButtonBehavior(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super();
    }
    
    private final com.dewords.pope.gui.helpers.PlayerBehavior<?> getPlayerBehavior() {
        return null;
    }
    
    public final boolean getShouldNeverShow() {
        return false;
    }
    
    public final void setShouldNeverShow(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull()
    android.view.View directTargetChild, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes, int type) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull()
    android.view.View dependency) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedScroll(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, @org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }
}