package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r\u001a\u001f\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0007\u001a\n\u0010 \u001a\u00020\u0001*\u00020!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"enableMarqueeEffect", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "handler", "Landroid/os/Handler;", "fillActionMode", "context", "Landroid/content/Context;", "mode", "Landroidx/appcompat/view/ActionMode;", "multiSelectHelper", "Lorg/videolan/tools/MultiSelectHelper;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "(Landroid/content/Context;Landroidx/appcompat/view/ActionMode;Lorg/videolan/tools/MultiSelectHelper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvIconRes", "", "mediaLibraryItem", "isSelected", "v", "Landroid/view/View;", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "launchMarquee", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "selectedElevation", "selectedPadding", "setEllipsizeModeByPref", "t", "Landroid/widget/TextView;", "activated", "applyTheme", "Lcom/dewords/pope/gui/BaseActivity;", "pope-player_debug"})
public final class UiToolsKt {
    
    /**
     * Set the alignment mode of the specified TextView with the desired align
     * mode from preferences.
     *
     *
     * See @array/list_title_alignment_values
     *
     * @param t         Reference to the textview
     * @param activated is the ellipsize mode activated
     */
    @androidx.databinding.BindingAdapter(value = {"ellipsizeMode"})
    public static final void setEllipsizeModeByPref(@org.jetbrains.annotations.NotNull()
    android.widget.TextView t, boolean activated) {
    }
    
    public static final void enableMarqueeEffect(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    android.os.Handler handler) {
    }
    
    private static final void launchMarquee(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.LinearLayoutManager layoutManager, android.os.Handler handler) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selected"})
    public static final void isSelected(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedPadding"})
    public static final void selectedPadding(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSelected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedElevation"})
    public static final void selectedElevation(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSelected) {
    }
    
    public static final void applyTheme(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.BaseActivity $this$applyTheme) {
    }
    
    public static final int getTvIconRes(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem mediaLibraryItem) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object fillActionMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.media.MediaLibraryItem> multiSelectHelper, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}