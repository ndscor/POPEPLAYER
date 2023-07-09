package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0011J\u0011\u0010\"\u001a\u00020\u001dH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/dewords/pope/viewmodels/StreamsModel;", "Lcom/dewords/pope/viewmodels/MedialibraryModel;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "context", "Landroid/content/Context;", "showDummy", "", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Landroid/content/Context;ZLorg/videolan/tools/CoroutineContextProvider;)V", "deletingMedia", "getDeletingMedia", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setDeletingMedia", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "observableSearchText", "Landroidx/databinding/ObservableField;", "", "getObservableSearchText", "()Landroidx/databinding/ObservableField;", "service", "Lcom/dewords/pope/PlaybackService;", "getService", "()Lcom/dewords/pope/PlaybackService;", "setService", "(Lcom/dewords/pope/PlaybackService;)V", "serviceCb", "Lcom/dewords/pope/PlaybackService$Callback;", "delete", "", "onServiceChanged", "rename", "media", "name", "updateList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Factory", "pope-player_debug"})
public final class StreamsModel extends com.dewords.pope.viewmodels.MedialibraryModel<org.videolan.medialibrary.interfaces.media.MediaWrapper> {
    private final boolean showDummy = false;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.interfaces.media.MediaWrapper deletingMedia;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> observableSearchText = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.PlaybackService service;
    private final com.dewords.pope.PlaybackService.Callback serviceCb = null;
    
    public StreamsModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean showDummy, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper getDeletingMedia() {
        return null;
    }
    
    public final void setDeletingMedia(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getObservableSearchText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object updateList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void rename(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void delete() {
    }
    
    private final void onServiceChanged(com.dewords.pope.PlaybackService service) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/viewmodels/StreamsModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "showDummy", "", "(Landroid/content/Context;Z)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.content.Context context = null;
        private final boolean showDummy = false;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean showDummy) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}