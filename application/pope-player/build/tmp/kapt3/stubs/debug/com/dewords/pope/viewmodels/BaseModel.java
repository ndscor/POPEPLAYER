package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00028\u0000H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001f\u0010-\u001a\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0012\u0010\u0018\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u00105\u001a\u00020\u001fJ\b\u00106\u001a\u00020.H\u0014J\b\u00107\u001a\u00020.H\u0016J\u0013\u00108\u001a\u00020.2\u0006\u00109\u001a\u00028\u0000\u00a2\u0006\u0002\u0010:J\u0015\u0010;\u001a\u00020.2\u0006\u0010/\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010:J\b\u0010<\u001a\u00020.H\u0016J\u001f\u0010=\u001a\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0011\u0010>\u001a\u00020.H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?R3\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\'\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b#\u0010\u000fR\'\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&8DX\u0084\u0084\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\u0011\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006@"}, d2 = {"Lcom/dewords/pope/viewmodels/BaseModel;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/viewmodels/SortableModel;", "context", "Landroid/content/Context;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Landroid/content/Context;Lorg/videolan/tools/CoroutineContextProvider;)V", "categories", "Landroidx/lifecycle/LiveData;", "", "", "", "getCategories", "()Landroidx/lifecycle/LiveData;", "categories$delegate", "Lkotlin/Lazy;", "getCoroutineContextProvider", "()Lorg/videolan/tools/CoroutineContextProvider;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "getDataset", "()Lorg/videolan/tools/livedata/LiveDataset;", "filter", "Lcom/dewords/pope/util/FilterDelegate;", "getFilter", "()Lcom/dewords/pope/util/FilterDelegate;", "filter$delegate", "loading", "Landroidx/lifecycle/MutableLiveData;", "", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "sections", "getSections", "sections$delegate", "updateActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/viewmodels/Update;", "getUpdateActor$annotations", "()V", "getUpdateActor", "()Lkotlinx/coroutines/channels/SendChannel;", "updateActor$delegate", "addMedia", "", "media", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mediaList", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "isEmpty", "onCleared", "refresh", "remove", "mw", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "removeMedia", "restore", "updateItems", "updateList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public abstract class BaseModel<T extends org.videolan.medialibrary.media.MediaLibraryItem> extends com.dewords.pope.viewmodels.SortableModel {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    private final kotlin.Lazy filter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<T> dataset = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy categories$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sections$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy updateActor$delegate = null;
    
    public BaseModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.CoroutineContextProvider getCoroutineContextProvider() {
        return null;
    }
    
    private final com.dewords.pope.util.FilterDelegate<T> getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<T> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>>> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> getSections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.viewmodels.Update> getUpdateActor() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    protected static void getUpdateActor$annotations() {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    T mw) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void restore() {
    }
    
    protected void removeMedia(@org.jetbrains.annotations.NotNull()
    T media) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object addMedia(@org.jetbrains.annotations.NotNull()
    T media, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addMedia(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> mediaList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object updateItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> mediaList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}