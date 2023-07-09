package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001eH\u0016J\u001f\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001bH\u0007J\b\u0010&\u001a\u00020\"H\u0014J\u001c\u0010\'\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0014J\u0016\u0010(\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0007R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0017X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/gui/DiffUtilAdapter;", "D", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "<set-?>", "", "dataset", "getDataset", "()Ljava/util/List;", "diffCallback", "Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "getDiffCallback", "()Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "diffCallback$delegate", "Lkotlin/Lazy;", "updateActor", "Lkotlinx/coroutines/channels/SendChannel;", "getUpdateActor$annotations", "createCB", "detectMoves", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "internalUpdate", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "onUpdateFinished", "prepareList", "update", "DiffCallback", "pope-player_debug"})
public abstract class DiffUtilAdapter<D extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends D> dataset;
    private final kotlin.Lazy diffCallback$delegate = null;
    private final kotlinx.coroutines.channels.SendChannel<java.util.List<? extends D>> updateActor = null;
    
    public DiffUtilAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<D> getDataset() {
        return null;
    }
    
    private final com.dewords.pope.gui.DiffUtilAdapter.DiffCallback<D> getDiffCallback() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getUpdateActor$annotations() {
    }
    
    protected void onUpdateFinished() {
    }
    
    @androidx.annotation.MainThread()
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends D> list) {
    }
    
    @androidx.annotation.MainThread()
    private final java.lang.Object internalUpdate(java.util.List<? extends D> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.util.List<D> prepareList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends D> list) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public final boolean isEmpty() {
        return false;
    }
    
    public D getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    protected boolean detectMoves() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected com.dewords.pope.gui.DiffUtilAdapter.DiffCallback<D> createCB() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\"\u0010\u0015\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "D", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "()V", "newList", "", "getNewList", "()Ljava/util/List;", "setNewList", "(Ljava/util/List;)V", "oldList", "getOldList", "setOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "update", "", "pope-player_debug"})
    public static class DiffCallback<D extends java.lang.Object> extends androidx.recyclerview.widget.DiffUtil.Callback {
        public java.util.List<? extends D> oldList;
        public java.util.List<? extends D> newList;
        
        public DiffCallback() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<D> getOldList() {
            return null;
        }
        
        public final void setOldList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<D> getNewList() {
            return null;
        }
        
        public final void setNewList(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> p0) {
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends D> newList) {
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}