package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 E2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007:\u0002EFB\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0014J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020+H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0016J\u001c\u00102\u001a\u00020%2\n\u00103\u001a\u00060\u0003R\u00020\u00002\u0006\u00104\u001a\u00020+H\u0016J*\u00102\u001a\u00020%2\n\u00103\u001a\u00060\u0003R\u00020\u00002\u0006\u00104\u001a\u00020+2\f\u00105\u001a\b\u0012\u0004\u0012\u00020706H\u0016J\u001c\u00108\u001a\u00060\u0003R\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020+H\u0016J\u0010\u0010<\u001a\u00020%2\u0006\u00104\u001a\u00020+H\u0016J\u0018\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020+H\u0016J\u0018\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020+H\u0016J\b\u0010C\u001a\u00020%H\u0014J\u0014\u0010D\u001a\u00020%2\n\u00103\u001a\u00060\u0003R\u00020\u0000H\u0016R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006G"}, d2 = {"Lcom/dewords/pope/gui/HistoryAdapter;", "Lcom/dewords/pope/gui/DiffUtilAdapter;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "Lcom/dewords/pope/gui/HistoryAdapter$ViewHolder;", "Lorg/videolan/tools/MultiSelectAdapter;", "Lcom/dewords/pope/gui/helpers/IEventsSource;", "Lcom/dewords/pope/gui/helpers/Click;", "Lcom/dewords/pope/interfaces/SwipeDragHelperAdapter;", "inCards", "", "listEventsHandler", "Lcom/dewords/pope/interfaces/IListEventsHandler;", "(ZLcom/dewords/pope/interfaces/IListEventsHandler;)V", "events", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "eventsChannel", "Lkotlinx/coroutines/channels/Channel;", "getEventsChannel", "()Lkotlinx/coroutines/channels/Channel;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "layoutInflater", "Landroid/view/LayoutInflater;", "multiSelectHelper", "Lorg/videolan/tools/MultiSelectHelper;", "getMultiSelectHelper", "()Lorg/videolan/tools/MultiSelectHelper;", "setMultiSelectHelper", "(Lorg/videolan/tools/MultiSelectHelper;)V", "updateEvt", "Landroidx/lifecycle/LiveData;", "", "getUpdateEvt", "()Landroidx/lifecycle/LiveData;", "createCB", "Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "getItemCount", "", "getItemId", "", "arg0", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemDismiss", "onItemMove", "fromPosition", "toPosition", "onItemMoved", "dragFrom", "dragTo", "onUpdateFinished", "onViewRecycled", "Companion", "ViewHolder", "pope-player_debug"})
public final class HistoryAdapter extends com.dewords.pope.gui.DiffUtilAdapter<org.videolan.medialibrary.interfaces.media.MediaWrapper, com.dewords.pope.gui.HistoryAdapter.ViewHolder> implements org.videolan.tools.MultiSelectAdapter<org.videolan.medialibrary.interfaces.media.MediaWrapper>, com.dewords.pope.gui.helpers.IEventsSource<com.dewords.pope.gui.helpers.Click>, com.dewords.pope.interfaces.SwipeDragHelperAdapter {
    private final boolean inCards = false;
    private final com.dewords.pope.interfaces.IListEventsHandler listEventsHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Unit> updateEvt = null;
    private android.view.LayoutInflater layoutInflater;
    @org.jetbrains.annotations.NotNull()
    private org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.interfaces.media.MediaWrapper> multiSelectHelper;
    private final kotlin.Lazy handler$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.HistoryAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/HistoryAdapter";
    
    public HistoryAdapter() {
        super();
    }
    
    public HistoryAdapter(boolean inCards, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.IListEventsHandler listEventsHandler) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getUpdateEvt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.interfaces.media.MediaWrapper> getMultiSelectHelper() {
        return null;
    }
    
    public final void setMultiSelectHelper(@org.jetbrains.annotations.NotNull()
    org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.interfaces.media.MediaWrapper> p0) {
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.HistoryAdapter.ViewHolder holder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.HistoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.HistoryAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.HistoryAdapter.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public long getItemId(int arg0) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onUpdateFinished() {
    }
    
    @java.lang.Override()
    public void onItemMove(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public void onItemDismiss(int position) {
    }
    
    @java.lang.Override()
    public void onItemMoved(int dragFrom, int dragTo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.dewords.pope.gui.DiffUtilAdapter.DiffCallback<org.videolan.medialibrary.interfaces.media.MediaWrapper> createCB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dewords.pope.gui.helpers.Click> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.channels.Channel<com.dewords.pope.gui.helpers.Click> getEventsChannel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/gui/HistoryAdapter$ViewHolder;", "Lcom/dewords/pope/gui/helpers/SelectorViewHolder;", "Landroidx/databinding/ViewDataBinding;", "Lcom/dewords/pope/gui/helpers/MarqueeViewHolder;", "binding", "(Lcom/dewords/pope/gui/HistoryAdapter;Landroidx/databinding/ViewDataBinding;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "isSelected", "", "onClick", "", "v", "Landroid/view/View;", "onImageClick", "onLongClick", "recycle", "pope-player_debug"})
    public final class ViewHolder extends com.dewords.pope.gui.helpers.SelectorViewHolder<androidx.databinding.ViewDataBinding> implements com.dewords.pope.gui.helpers.MarqueeViewHolder {
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView titleView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
        
        public final boolean onLongClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
            return false;
        }
        
        public final void onImageClick(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
        
        @java.lang.Override()
        protected boolean isSelected() {
            return false;
        }
        
        public final void recycle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/HistoryAdapter$Companion;", "", "()V", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}