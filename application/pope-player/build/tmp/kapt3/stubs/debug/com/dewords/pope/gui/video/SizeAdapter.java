package com.dewords.pope.gui.video;

import java.lang.System;

/**
 * Adapter showing the different available aspect ratios
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u00142\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000bH\u0016J\u001a\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/dewords/pope/gui/video/SizeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/pope/gui/video/SizeAdapter$ViewHolder;", "()V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "value", "", "selectedSize", "getSelectedSize", "()I", "setSelectedSize", "(I)V", "sizeSelectedListener", "Lkotlin/Function1;", "Lorg/videolan/libvlc/MediaPlayer$ScaleType;", "", "getSizeSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setSizeSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnSizeSelectedListener", "listener", "ViewHolder", "pope-player_debug"})
public final class SizeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.pope.gui.video.SizeAdapter.ViewHolder> {
    private int selectedSize;
    public kotlin.jvm.functions.Function1<? super org.videolan.libvlc.MediaPlayer.ScaleType, kotlin.Unit> sizeSelectedListener;
    private final kotlin.Lazy handler$delegate = null;
    
    public SizeAdapter() {
        super();
    }
    
    public final int getSelectedSize() {
        return 0;
    }
    
    public final void setSelectedSize(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<org.videolan.libvlc.MediaPlayer.ScaleType, kotlin.Unit> getSizeSelectedListener() {
        return null;
    }
    
    public final void setSizeSelectedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.videolan.libvlc.MediaPlayer.ScaleType, kotlin.Unit> p0) {
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.video.SizeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setOnSizeSelectedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.videolan.libvlc.MediaPlayer.ScaleType, kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.SizeAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/video/SizeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/VideoScaleItemBinding;", "(Lcom/dewords/pope/gui/video/SizeAdapter;Lcom/dewords/pope/databinding/VideoScaleItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/VideoScaleItemBinding;", "bind", "", "scaleType", "Lorg/videolan/libvlc/MediaPlayer$ScaleType;", "selected", "", "pope-player_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.databinding.VideoScaleItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.VideoScaleItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.databinding.VideoScaleItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.videolan.libvlc.MediaPlayer.ScaleType scaleType, boolean selected) {
        }
    }
}