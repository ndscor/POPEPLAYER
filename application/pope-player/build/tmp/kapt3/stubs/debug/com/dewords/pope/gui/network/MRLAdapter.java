package com.dewords.pope.gui.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003()*B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0014\u0010&\u001a\u00020\f2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/dewords/pope/gui/network/MRLAdapter;", "Lcom/dewords/pope/gui/DiffUtilAdapter;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "eventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/network/MrlAction;", "inCards", "", "(Lkotlinx/coroutines/channels/SendChannel;Z)V", "dummyClickListener", "Lkotlin/Function0;", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "createCB", "Lcom/dewords/pope/gui/DiffUtilAdapter$DiffCallback;", "getItemViewType", "", "position", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "onViewRecycled", "setOnDummyClickListener", "dummyClickLisener", "CardViewHolder", "DummyViewHolder", "ListViewHolder", "pope-player_debug"})
public final class MRLAdapter extends com.dewords.pope.gui.DiffUtilAdapter<org.videolan.medialibrary.interfaces.media.MediaWrapper, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.gui.network.MrlAction> eventActor = null;
    private final boolean inCards = false;
    private kotlin.jvm.functions.Function0<kotlin.Unit> dummyClickListener;
    private final kotlin.Lazy handler$delegate = null;
    
    public MRLAdapter(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.SendChannel<? super com.dewords.pope.gui.network.MrlAction> eventActor, boolean inCards) {
        super();
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.dewords.pope.gui.DiffUtilAdapter.DiffCallback<org.videolan.medialibrary.interfaces.media.MediaWrapper> createCB() {
        return null;
    }
    
    public final void setOnDummyClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dummyClickLisener) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/network/MRLAdapter$DummyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/MrlDummyItemBinding;", "(Lcom/dewords/pope/gui/network/MRLAdapter;Lcom/dewords/pope/databinding/MrlDummyItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/MrlDummyItemBinding;", "recycle", "", "pope-player_debug"})
    public final class DummyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.MrlDummyItemBinding binding = null;
        
        public DummyViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.MrlDummyItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.MrlDummyItemBinding getBinding() {
            return null;
        }
        
        public final void recycle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/network/MRLAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "binding", "Lcom/dewords/pope/databinding/MrlItemBinding;", "(Lcom/dewords/pope/gui/network/MRLAdapter;Lcom/dewords/pope/databinding/MrlItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/MrlItemBinding;", "onClick", "", "v", "Landroid/view/View;", "recycle", "pope-player_debug"})
    public final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.MrlItemBinding binding = null;
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.MrlItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.MrlItemBinding getBinding() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void recycle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/network/MRLAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lcom/dewords/pope/gui/helpers/MarqueeViewHolder;", "binding", "Lcom/dewords/pope/databinding/MrlCardItemBinding;", "(Lcom/dewords/pope/gui/network/MRLAdapter;Lcom/dewords/pope/databinding/MrlCardItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/MrlCardItemBinding;", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "onClick", "", "v", "Landroid/view/View;", "recycle", "pope-player_debug"})
    public final class CardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, com.dewords.pope.gui.helpers.MarqueeViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.MrlCardItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleView = null;
        
        public CardViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.MrlCardItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.MrlCardItemBinding getBinding() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void recycle() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
    }
}