package com.dewords.pope.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/dewords/pope/viewmodel/MediaScrapingModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apiResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dewords/pope/models/resolver/ResolverResult;", "getApiResult", "()Landroidx/lifecycle/MutableLiveData;", "exceptionLiveData", "Lvideolan/org/commontools/LiveEvent;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getExceptionLiveData", "()Lvideolan/org/commontools/LiveEvent;", "value", "Lkotlinx/coroutines/Job;", "mediaJob", "setMediaJob", "(Lkotlinx/coroutines/Job;)V", "mediaResult", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "repo", "Lcom/dewords/pope/repository/MediaResolverApi;", "searchJob", "setSearchJob", "getMedia", "", "mediaId", "", "search", "uri", "Landroid/net/Uri;", "query", "pope-player_debug"})
public final class MediaScrapingModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dewords.pope.models.resolver.ResolverResult> apiResult = null;
    private final androidx.lifecycle.MutableLiveData<com.dewords.pope.models.resolver.ResolverMedia> mediaResult = null;
    private final com.dewords.pope.repository.MediaResolverApi repo = null;
    @org.jetbrains.annotations.NotNull()
    private final videolan.org.commontools.LiveEvent<java.lang.Exception> exceptionLiveData = null;
    private kotlinx.coroutines.Job searchJob;
    private kotlinx.coroutines.Job mediaJob;
    
    public MediaScrapingModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dewords.pope.models.resolver.ResolverResult> getApiResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final videolan.org.commontools.LiveEvent<java.lang.Exception> getExceptionLiveData() {
        return null;
    }
    
    private final void setSearchJob(kotlinx.coroutines.Job value) {
    }
    
    private final void setMediaJob(kotlinx.coroutines.Job value) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    public final void getMedia(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId) {
    }
}