package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H&\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/interfaces/IEventsHandler;", "T", "", "onClick", "", "v", "Landroid/view/View;", "position", "", "item", "(Landroid/view/View;ILjava/lang/Object;)V", "onCtxClick", "onImageClick", "onItemFocused", "(Landroid/view/View;Ljava/lang/Object;)V", "onLongClick", "", "(Landroid/view/View;ILjava/lang/Object;)Z", "onMainActionClick", "onUpdateFinished", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "pope-player_debug"})
public abstract interface IEventsHandler<T extends java.lang.Object> {
    
    public abstract void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item);
    
    public abstract boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item);
    
    public abstract void onImageClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item);
    
    public abstract void onCtxClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item);
    
    public abstract void onUpdateFinished(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter);
    
    public abstract void onMainActionClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, T item);
    
    public abstract void onItemFocused(@org.jetbrains.annotations.NotNull()
    android.view.View v, T item);
}