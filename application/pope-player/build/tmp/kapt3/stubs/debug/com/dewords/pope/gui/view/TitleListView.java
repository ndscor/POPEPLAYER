package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010/\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u0014H\u0002J\u001a\u00102\u001a\u00020\u00142\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\"8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b\'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b,\u0010-\u00a8\u00064"}, d2 = {"Lcom/dewords/pope/gui/view/TitleListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionButton", "Landroid/widget/ImageButton;", "getActionButton", "()Landroid/widget/ImageButton;", "actionButton$delegate", "Lkotlin/Lazy;", "actionClickListener", "Lkotlin/Function1;", "Landroid/view/View;", "", "value", "", "displayInCards", "getDisplayInCards", "()Z", "setDisplayInCards", "(Z)V", "list", "Landroidx/recyclerview/widget/RecyclerView;", "getList", "()Landroidx/recyclerview/widget/RecyclerView;", "list$delegate", "loading", "Lcom/dewords/pope/gui/view/EmptyLoadingStateView;", "getLoading", "()Lcom/dewords/pope/gui/view/EmptyLoadingStateView;", "loading$delegate", "titleContent", "getTitleContent", "()Landroid/view/View;", "titleContent$delegate", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView$delegate", "initAttributes", "initialize", "manageDisplay", "setOnActionClickListener", "listener", "pope-player_debug"})
public final class TitleListView extends androidx.constraintlayout.widget.ConstraintLayout {
    private kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> actionClickListener;
    private boolean displayInCards = true;
    private final kotlin.Lazy titleView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy list$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy actionButton$delegate = null;
    private final kotlin.Lazy titleContent$delegate = null;
    
    public final boolean getDisplayInCards() {
        return false;
    }
    
    public final void setDisplayInCards(boolean value) {
    }
    
    private final android.widget.TextView getTitleView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.view.EmptyLoadingStateView getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton getActionButton() {
        return null;
    }
    
    private final android.view.View getTitleContent() {
        return null;
    }
    
    public final void setOnActionClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
    }
    
    public TitleListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public TitleListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public TitleListView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initAttributes(android.util.AttributeSet attrs, int defStyle) {
    }
    
    private final void manageDisplay() {
    }
    
    private final void initialize() {
    }
}