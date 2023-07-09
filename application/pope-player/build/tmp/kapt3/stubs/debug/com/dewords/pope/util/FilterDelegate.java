package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0004J\u0018\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011H\u0002R\"\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/dewords/pope/util/FilterDelegate;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "", "dataset", "Landroidx/lifecycle/MutableLiveData;", "", "(Landroidx/lifecycle/MutableLiveData;)V", "getDataset", "()Landroidx/lifecycle/MutableLiveData;", "sourceSet", "filter", "", "charSequence", "", "(Ljava/lang/CharSequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filteringJob", "", "initSource", "publish", "list", "pope-player_debug"})
public class FilterDelegate<T extends org.videolan.medialibrary.media.MediaLibraryItem> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<? extends java.util.List<T>> dataset = null;
    private java.util.List<? extends T> sourceSet;
    
    public FilterDelegate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<? extends java.util.List<? extends T>> dataset) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<? extends java.util.List<T>> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<T> initSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object filter(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence charSequence, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object filteringJob(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence charSequence, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<T>> continuation) {
        return null;
    }
    
    private final void publish(java.util.List<T> list) {
    }
}