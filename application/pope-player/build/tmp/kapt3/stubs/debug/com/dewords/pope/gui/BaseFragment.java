package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u001fJ\b\u00103\u001a\u00020\u001fH&J\b\u00104\u001a\u00020\u0011H\u0014J\u0006\u00105\u001a\u00020-J\u0006\u00106\u001a\u00020-J\u0012\u00107\u001a\u00020-2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020<H\u0016J\u0018\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010?\u001a\u00020-H\u0016J\b\u0010@\u001a\u00020-H\u0016J\u001a\u0010A\u001a\u00020-2\u0006\u0010;\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020\u0011H\u0016J7\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020\u00112%\b\u0002\u0010F\u001a\u001f\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020-\u0018\u00010GH\u0004J\u0010\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020MH\u0004J\u0006\u0010N\u001a\u00020-J\u0006\u0010O\u001a\u00020-J\b\u0010P\u001a\u00020-H\u0002J\b\u0010Q\u001a\u00020-H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006R"}, d2 = {"Lcom/dewords/pope/gui/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/view/ActionMode$Callback;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "getActionMode", "()Landroidx/appcompat/view/ActionMode;", "setActionMode", "(Landroidx/appcompat/view/ActionMode;)V", "fabPlay", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFabPlay", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFabPlay", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "hasTabs", "", "getHasTabs", "()Z", "isMainNavigationPoint", "menu", "Landroid/view/Menu;", "getMenu", "()Landroid/view/Menu;", "value", "Lkotlinx/coroutines/Job;", "refreshJob", "setRefreshJob", "(Lkotlinx/coroutines/Job;)V", "subTitle", "", "getSubTitle", "()Ljava/lang/String;", "swipeFilter", "Landroid/view/View$OnTouchListener;", "getSwipeFilter", "()Landroid/view/View$OnTouchListener;", "swipeRefreshLayout", "Lcom/dewords/pope/gui/view/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Lcom/dewords/pope/gui/view/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Lcom/dewords/pope/gui/view/SwipeRefreshLayout;)V", "browse", "", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "scanned", "next", "backstackName", "getTitle", "hasFAB", "invalidateActionMode", "manageFabNeverShow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFabPlayClick", "view", "Landroid/view/View;", "onPrepareActionMode", "mode", "onStart", "onStop", "onViewCreated", "setFabPlayVisibility", "enable", "setRefreshing", "refreshing", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "loading", "showInfoDialog", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "startActionMode", "stopActionMode", "updateActionBar", "updateFabPlayView", "pope-player_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements androidx.appcompat.view.ActionMode.Callback {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.view.ActionMode actionMode;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.floatingactionbutton.FloatingActionButton fabPlay;
    public com.dewords.pope.gui.view.SwipeRefreshLayout swipeRefreshLayout;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnTouchListener swipeFilter = null;
    private final boolean hasTabs = false;
    private kotlinx.coroutines.Job refreshJob;
    private final boolean isMainNavigationPoint = true;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.view.ActionMode getActionMode() {
        return null;
    }
    
    public final void setActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.floatingactionbutton.FloatingActionButton getFabPlay() {
        return null;
    }
    
    public final void setFabPlay(@org.jetbrains.annotations.Nullable()
    com.google.android.material.floatingactionbutton.FloatingActionButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.view.SwipeRefreshLayout getSwipeRefreshLayout() {
        return null;
    }
    
    public final void setSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.view.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnTouchListener getSwipeFilter() {
        return null;
    }
    
    public boolean getHasTabs() {
        return false;
    }
    
    private final void setRefreshJob(kotlinx.coroutines.Job value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getSubTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.Menu getMenu() {
        return null;
    }
    
    public boolean isMainNavigationPoint() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    public void onFabPlayClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void manageFabNeverShow() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void updateFabPlayView() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    public final void startActionMode() {
    }
    
    private final void updateActionBar() {
    }
    
    protected boolean hasFAB() {
        return false;
    }
    
    public void setFabPlayVisibility(boolean enable) {
    }
    
    protected final void showInfoDialog(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    protected final void setRefreshing(boolean refreshing, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> action) {
    }
    
    public final void stopActionMode() {
    }
    
    public final void invalidateActionMode() {
    }
    
    public final void browse(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, boolean scanned, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment next, @org.jetbrains.annotations.NotNull()
    java.lang.String backstackName) {
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
}