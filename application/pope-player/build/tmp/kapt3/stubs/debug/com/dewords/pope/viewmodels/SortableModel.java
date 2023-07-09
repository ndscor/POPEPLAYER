package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0010H&J\u0006\u0010$\u001a\u00020\u0010J\b\u0010%\u001a\u00020\"H&J\u0010\u0010\u0019\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0010X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/viewmodels/SortableModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/dewords/pope/util/RefreshModel;", "Lcom/dewords/pope/util/SortModule;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "desc", "", "getDesc", "()Z", "setDesc", "(Z)V", "filterQuery", "", "getFilterQuery", "()Ljava/lang/String;", "setFilterQuery", "(Ljava/lang/String;)V", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "sort", "", "getSort", "()I", "setSort", "(I)V", "sortKey", "getSortKey", "filter", "", "query", "getKey", "restore", "pope-player_debug"})
public abstract class SortableModel extends androidx.lifecycle.ViewModel implements com.dewords.pope.util.RefreshModel, com.dewords.pope.util.SortModule {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences settings = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    private int sort;
    private boolean desc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String filterQuery;
    
    public SortableModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences getSettings() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFilterQuery() {
        return null;
    }
    
    public final void setFilterQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    @java.lang.Override()
    public void sort(int sort) {
    }
    
    public abstract void restore();
    
    public abstract void filter(@org.jetbrains.annotations.Nullable()
    java.lang.String query);
    
    public boolean canSortBy(int sort) {
        return false;
    }
    
    public boolean canSortByAlbum() {
        return false;
    }
    
    public boolean canSortByArtist() {
        return false;
    }
    
    public boolean canSortByDuration() {
        return false;
    }
    
    public boolean canSortByFileNameName() {
        return false;
    }
    
    public boolean canSortByFileSize() {
        return false;
    }
    
    public boolean canSortByInsertionDate() {
        return false;
    }
    
    public boolean canSortByLastModified() {
        return false;
    }
    
    public boolean canSortByMediaNumber() {
        return false;
    }
    
    public boolean canSortByName() {
        return false;
    }
    
    public boolean canSortByPlayCount() {
        return false;
    }
    
    public boolean canSortByReleaseDate() {
        return false;
    }
    
    public boolean canSortByTrackId() {
        return false;
    }
}