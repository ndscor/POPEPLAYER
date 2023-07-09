package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/util/PlaylistFilterDelegate;", "Lcom/dewords/pope/util/FilterDelegate;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "dataset", "Landroidx/lifecycle/MutableLiveData;", "", "(Landroidx/lifecycle/MutableLiveData;)V", "filteringJob", "", "charSequence", "", "(Ljava/lang/CharSequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public final class PlaylistFilterDelegate extends com.dewords.pope.util.FilterDelegate<org.videolan.medialibrary.interfaces.media.MediaWrapper> {
    
    public PlaylistFilterDelegate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<? extends java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>> dataset) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object filteringJob(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence charSequence, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper>> continuation) {
        return null;
    }
}