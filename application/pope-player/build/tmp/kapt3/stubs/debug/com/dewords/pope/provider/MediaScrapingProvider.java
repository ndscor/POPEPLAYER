package com.dewords.pope.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150.2\u0006\u0010/\u001a\u00020\u001d\u00a2\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R,\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\'0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010*\u00a8\u00062"}, d2 = {"Lcom/dewords/pope/provider/MediaScrapingProvider;", "Lcom/dewords/poperesources/util/HeaderProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "desc", "", "getDesc", "()Z", "setDesc", "(Z)V", "value", "isRefreshing", "setRefreshing", "loading", "Landroidx/lifecycle/MutableLiveData;", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "pagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "setPagedList", "(Landroidx/lifecycle/LiveData;)V", "settings", "Landroid/content/SharedPreferences;", "sort", "", "getSort", "()I", "setSort", "(I)V", "sortKey", "", "getSortKey", "()Ljava/lang/String;", "sortQuery", "Lkotlin/Pair;", "getSortQuery", "setSortQuery", "(Landroidx/lifecycle/MutableLiveData;)V", "completeHeaders", "", "list", "", "startposition", "([Lcom/dewords/pope/database/models/MediaMetadataWithImages;I)V", "refresh", "pope-player_debug"})
public abstract class MediaScrapingProvider extends com.dewords.poperesources.util.HeaderProvider {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    private final android.content.SharedPreferences settings = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    private int sort;
    private boolean desc;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> sortQuery;
    private boolean isRefreshing = false;
    
    public MediaScrapingProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dewords.pope.database.models.MediaMetadataWithImages>> getPagedList();
    
    public abstract void setPagedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.dewords.pope.database.models.MediaMetadataWithImages>> p0);
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected java.lang.String getSortKey() {
        return null;
    }
    
    public final int getSort() {
        return 0;
    }
    
    public final void setSort(int p0) {
    }
    
    public final boolean getDesc() {
        return false;
    }
    
    public final void setDesc(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> getSortQuery() {
        return null;
    }
    
    public final void setSortQuery(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Boolean>> p0) {
    }
    
    public final boolean isRefreshing() {
        return false;
    }
    
    private final void setRefreshing(boolean value) {
    }
    
    public final void sort(int sort) {
    }
    
    public final boolean refresh() {
        return false;
    }
    
    public final void completeHeaders(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataWithImages[] list, int startposition) {
    }
}