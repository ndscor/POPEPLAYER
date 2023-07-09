package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/dewords/pope/viewmodels/PreferenceSearchModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lcom/dewords/pope/gui/preferences/search/PreferenceItem;", "getDataset", "()Lorg/videolan/tools/livedata/LiveDataset;", "filtered", "getFiltered", "showTranslations", "Landroidx/lifecycle/MutableLiveData;", "", "getShowTranslations", "()Landroidx/lifecycle/MutableLiveData;", "filter", "", "query", "", "getSummary", "item", "getTitle", "score", "", "switchTranslations", "Factory", "pope-player_debug"})
public final class PreferenceSearchModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<com.dewords.pope.gui.preferences.search.PreferenceItem> dataset = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<com.dewords.pope.gui.preferences.search.PreferenceItem> filtered = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showTranslations = null;
    
    public PreferenceSearchModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<com.dewords.pope.gui.preferences.search.PreferenceItem> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<com.dewords.pope.gui.preferences.search.PreferenceItem> getFiltered() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowTranslations() {
        return null;
    }
    
    /**
     * Filter the preference list with a query. The result is then stored in the [filtered] livedata
     * @param query the query used to filter
     */
    public final void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.preferences.search.PreferenceItem item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.preferences.search.PreferenceItem item) {
        return null;
    }
    
    /**
     * Determinate a score for [item] to sort the results for a [query]:
     * - Having a word starting with [query] in [item] title grants 1000 points
     * - Having a word starting with [query] in [item] description grants 100 points
     * - [item] title contains [query] grants 10 points
     *
     * @param item: the item to calculate to score for
     * @param query: the query used to calculate the score
     *
     * @return a score
     */
    private final int score(com.dewords.pope.gui.preferences.search.PreferenceItem item, java.lang.String query) {
        return 0;
    }
    
    public final void switchTranslations(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/viewmodels/PreferenceSearchModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.content.Context context = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
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