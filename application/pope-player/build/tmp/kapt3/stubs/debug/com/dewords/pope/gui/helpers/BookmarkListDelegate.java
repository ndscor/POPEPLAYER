package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u00102\u001a\u00020)J\u0018\u00103\u001a\u00020)2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\"\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\u001b2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u000e\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R \u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020/8F\u00a2\u0006\u0006\u001a\u0004\b0\u00101\u00a8\u0006>"}, d2 = {"Lcom/dewords/pope/gui/helpers/BookmarkListDelegate;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/dewords/pope/gui/helpers/BookmarkAdapter$IBookmarkManager;", "activity", "Landroidx/fragment/app/FragmentActivity;", "service", "Lcom/dewords/pope/PlaybackService;", "bookmarkModel", "Lcom/dewords/pope/viewmodels/BookmarkModel;", "(Landroidx/fragment/app/FragmentActivity;Lcom/dewords/pope/PlaybackService;Lcom/dewords/pope/viewmodels/BookmarkModel;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "adapter", "Lcom/dewords/pope/gui/helpers/BookmarkAdapter;", "addBookmarButton", "Landroid/widget/ImageView;", "getAddBookmarButton", "()Landroid/widget/ImageView;", "setAddBookmarButton", "(Landroid/widget/ImageView;)V", "bookmarkList", "Landroidx/recyclerview/widget/RecyclerView;", "getBookmarkList", "()Landroidx/recyclerview/widget/RecyclerView;", "setBookmarkList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "emptyView", "Landroid/view/View;", "markerContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMarkerContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMarkerContainer", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "rootView", "getRootView", "setRootView", "getService", "()Lcom/dewords/pope/PlaybackService;", "visibilityListener", "Lkotlin/Function0;", "", "getVisibilityListener", "()Lkotlin/jvm/functions/Function0;", "setVisibilityListener", "(Lkotlin/jvm/functions/Function0;)V", "visible", "", "getVisible", "()Z", "hide", "onBookmarkClick", "position", "", "bookmark", "Lorg/videolan/medialibrary/interfaces/media/Bookmark;", "onPopupMenu", "view", "setProgressHeight", "y", "", "show", "pope-player_debug"})
public final class BookmarkListDelegate implements androidx.lifecycle.LifecycleObserver, com.dewords.pope.gui.helpers.BookmarkAdapter.IBookmarkManager {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.PlaybackService service = null;
    private final com.dewords.pope.viewmodels.BookmarkModel bookmarkModel = null;
    public android.widget.ImageView addBookmarButton;
    public androidx.constraintlayout.widget.ConstraintLayout markerContainer;
    private com.dewords.pope.gui.helpers.BookmarkAdapter adapter;
    public androidx.recyclerview.widget.RecyclerView bookmarkList;
    public androidx.constraintlayout.widget.ConstraintLayout rootView;
    private android.view.View emptyView;
    public kotlin.jvm.functions.Function0<kotlin.Unit> visibilityListener;
    
    public BookmarkListDelegate(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService service, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.BookmarkModel bookmarkModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getAddBookmarButton() {
        return null;
    }
    
    public final void setAddBookmarButton(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getMarkerContainer() {
        return null;
    }
    
    public final void setMarkerContainer(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getBookmarkList() {
        return null;
    }
    
    public final void setBookmarkList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getVisibilityListener() {
        return null;
    }
    
    public final void setVisibilityListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final boolean getVisible() {
        return false;
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    @java.lang.Override()
    public void onPopupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.Bookmark bookmark) {
    }
    
    @java.lang.Override()
    public void onBookmarkClick(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.Bookmark bookmark) {
    }
    
    public final void setProgressHeight(float y) {
    }
}