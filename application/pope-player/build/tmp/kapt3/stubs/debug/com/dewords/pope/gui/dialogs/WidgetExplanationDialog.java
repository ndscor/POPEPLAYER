package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0012\u0010\u0016\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001a2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/gui/dialogs/WidgetExplanationDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "binding", "Lcom/dewords/pope/databinding/DialogWidgetExplanationBinding;", "getBinding$pope_player_debug", "()Lcom/dewords/pope/databinding/DialogWidgetExplanationBinding;", "setBinding$pope_player_debug", "(Lcom/dewords/pope/databinding/DialogWidgetExplanationBinding;)V", "currentStep", "", "getCurrentStep", "()I", "setCurrentStep", "(I)V", "handler", "Lcom/dewords/pope/gui/dialogs/ResizeHandler;", "resizeAnimation", "Landroid/animation/AnimatorSet;", "animateLongTap", "", "dismiss", "displaySizeImage", "drawable", "getDefaultState", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "pope-player_debug"})
public final class WidgetExplanationDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private android.animation.AnimatorSet resizeAnimation;
    public com.dewords.pope.databinding.DialogWidgetExplanationBinding binding;
    private final com.dewords.pope.gui.dialogs.ResizeHandler handler = null;
    private int currentStep = 1;
    
    public WidgetExplanationDialog() {
        super();
    }
    
    @java.lang.Override()
    public int getDefaultState() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean needToManageOrientation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.DialogWidgetExplanationBinding getBinding$pope_player_debug() {
        return null;
    }
    
    public final void setBinding$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.DialogWidgetExplanationBinding p0) {
    }
    
    public final int getCurrentStep() {
        return 0;
    }
    
    public final void setCurrentStep(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Display a new image in the UI showing the different widget sizes
     *
     * @param drawable
     */
    private final void displaySizeImage(@androidx.annotation.DrawableRes()
    int drawable) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    /**
     * Animate the view showing how to resize a widget
     */
    private final void animateLongTap() {
    }
}