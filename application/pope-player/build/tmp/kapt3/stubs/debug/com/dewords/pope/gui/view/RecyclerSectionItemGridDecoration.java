package com.dewords.pope.gui.view;

import java.lang.System;

@android.annotation.SuppressLint(value = {"LongLogTag"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J(\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020 H\u0002J \u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/gui/view/RecyclerSectionItemGridDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "headerOffset", "", "space", "sideSpace", "sticky", "", "nbColumns", "provider", "Lcom/dewords/poperesources/util/HeaderProvider;", "(IIIZILcom/dewords/poperesources/util/HeaderProvider;)V", "header", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "isList", "()Z", "setList", "(Z)V", "drawHeader", "", "c", "Landroid/graphics/Canvas;", "child", "fixLayoutSize", "view", "parent", "Landroid/view/ViewGroup;", "getItemOffsets", "outRect", "Landroid/graphics/Rect;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "inflateHeaderView", "onDrawOver", "Companion", "pope-player_debug"})
public final class RecyclerSectionItemGridDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final int headerOffset = 0;
    private final int space = 0;
    private final int sideSpace = 0;
    private final boolean sticky = false;
    private final int nbColumns = 0;
    private final com.dewords.poperesources.util.HeaderProvider provider = null;
    private android.view.View headerView;
    private android.widget.TextView header;
    private boolean isList = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.view.RecyclerSectionItemGridDecoration.Companion Companion = null;
    
    public RecyclerSectionItemGridDecoration(int headerOffset, int space, int sideSpace, boolean sticky, int nbColumns, @org.jetbrains.annotations.NotNull()
    com.dewords.poperesources.util.HeaderProvider provider) {
        super();
    }
    
    public final boolean isList() {
        return false;
    }
    
    public final void setList(boolean p0) {
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void drawHeader(android.graphics.Canvas c, android.view.View child, android.view.View headerView) {
    }
    
    private final android.view.View inflateHeaderView(androidx.recyclerview.widget.RecyclerView parent) {
        return null;
    }
    
    /**
     * Measures the header view to make sure its size is greater than 0 and will be drawn
     * https://yoda.entelect.co.za/view/9627/how-to-android-recyclerview-item-decorations
     */
    private final void fixLayoutSize(android.view.View view, android.view.ViewGroup parent) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/view/RecyclerSectionItemGridDecoration$Companion;", "", "()V", "getItemSize", "", "screenWidth", "nbColumns", "spacing", "sideSpacing", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getItemSize(int screenWidth, int nbColumns, int spacing, int sideSpacing) {
            return 0;
        }
    }
}