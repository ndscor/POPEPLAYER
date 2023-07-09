package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tH\u0016J\u0016\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0014J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0018\u0010\'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00102\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0016\u00103\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0014J\u0018\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020#H\u0016J\u0010\u00107\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\tH\u0016J\u0018\u00108\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020\u0016H\u0016J\u0018\u0010;\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0016H\u0016J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@H\u0016J\u001a\u0010A\u001a\u00020\u00162\u0006\u0010B\u001a\u00020.2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010C\u001a\u00020\u0016H\u0016J\u0010\u0010D\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u001cH\u0016J\b\u0010F\u001a\u00020\u0016H\u0002J\f\u0010G\u001a\u00020\u0016*\u00020HH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lcom/dewords/pope/gui/HistoryFragment;", "Lcom/dewords/pope/gui/browser/MediaBrowserFragment;", "Lcom/dewords/pope/viewmodels/HistoryModel;", "Lcom/dewords/pope/interfaces/IRefreshable;", "Lcom/dewords/pope/interfaces/IHistory;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/dewords/pope/interfaces/IListEventsHandler;", "()V", "cleanMenuItem", "Landroid/view/MenuItem;", "empty", "Landroid/widget/TextView;", "historyAdapter", "Lcom/dewords/pope/gui/HistoryAdapter;", "itemTouchHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "list", "Landroidx/recyclerview/widget/RecyclerView;", "multiSelectHelper", "Lorg/videolan/tools/MultiSelectHelper;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "clear", "", "clearHistory", "getMultiHelper", "getTitle", "", "isEmpty", "", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "onClick", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyActionMode", "onLongClick", "onMove", "oldPosition", "newPosition", "onOptionsItemSelected", "onPrepareActionMode", "onPrepareOptionsMenu", "onRefresh", "onRemove", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onStart", "onStartDrag", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewCreated", "view", "refresh", "setFabPlayVisibility", "enable", "updateEmptyView", "process", "Lcom/dewords/pope/gui/helpers/Click;", "pope-player_debug"})
public final class HistoryFragment extends com.dewords.pope.gui.browser.MediaBrowserFragment<com.dewords.pope.viewmodels.HistoryModel> implements com.dewords.pope.interfaces.IRefreshable, com.dewords.pope.interfaces.IHistory, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, com.dewords.pope.interfaces.IListEventsHandler {
    private android.view.MenuItem cleanMenuItem;
    private org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.interfaces.media.MediaWrapper> multiSelectHelper;
    private final com.dewords.pope.gui.HistoryAdapter historyAdapter = null;
    private androidx.recyclerview.widget.ItemTouchHelper itemTouchHelper;
    private androidx.recyclerview.widget.RecyclerView list;
    private android.widget.TextView empty;
    
    public HistoryFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setFabPlayVisibility(boolean enable) {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public org.videolan.tools.MultiSelectHelper<com.dewords.pope.viewmodels.HistoryModel> getMultiHelper() {
        return null;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    private final void updateEmptyView() {
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void clearHistory() {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    private final void process(com.dewords.pope.gui.helpers.Click $this$process) {
    }
    
    public final void onClick(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    public final void onLongClick(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    @java.lang.Override()
    public void onRemove(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onMove(int oldPosition, int newPosition) {
    }
    
    @java.lang.Override()
    public void onStartDrag(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
}