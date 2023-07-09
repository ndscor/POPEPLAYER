package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001SB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ9\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010>\u001a\u00020\u00172\b\u0010?\u001a\u0004\u0018\u00010\u00072\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJC\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ7\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u000209J\u0014\u0010L\u001a\u0002092\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020\u001dJ7\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00130Q2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\f\u0010R\u001a\u00020\u0007*\u00020\u0007H\u0002R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r0\r0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00130\u00160\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0#\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0#\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070#\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0016\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001bR\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006T"}, d2 = {"Lcom/dewords/pope/viewmodels/SubtitlesModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "mediaUri", "Landroid/net/Uri;", "name", "", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Lorg/videolan/tools/CoroutineContextProvider;)V", "apiResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/videolan/resources/opensubtitles/OpenSubtitle;", "getCoroutineContextProvider", "()Lorg/videolan/tools/CoroutineContextProvider;", "downloadedLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/dewords/pope/gui/dialogs/SubtitleItem;", "kotlin.jvm.PlatformType", "downloadingLiveData", "", "", "history", "Landroidx/lifecycle/MediatorLiveData;", "getHistory", "()Landroidx/lifecycle/MediatorLiveData;", "isApiLoading", "", "manualSearchEnabled", "Landroidx/databinding/ObservableBoolean;", "getManualSearchEnabled", "()Landroidx/databinding/ObservableBoolean;", "observableError", "Landroidx/databinding/ObservableField;", "getObservableError", "()Landroidx/databinding/ObservableField;", "observableMessage", "getObservableMessage", "observableResultDescription", "Landroid/text/Spanned;", "getObservableResultDescription", "observableSearchEpisode", "getObservableSearchEpisode", "observableSearchLanguage", "getObservableSearchLanguage", "observableSearchName", "getObservableSearchName", "observableSearchSeason", "getObservableSearchSeason", "previousSearchLanguage", "result", "getResult", "searchJob", "Lkotlinx/coroutines/Job;", "deleteSubtitle", "", "mediaPath", "idSubtitle", "getLastUsedLanguage", "getSubtitleByHash", "movieByteSize", "movieHash", "languageIds", "(JLjava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubtitleByName", "episode", "", "season", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merge", "downloadedResult", "downloadingResult", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRefresh", "saveLastUsedLanguage", "lastUsedLanguages", "search", "byFile", "updateListState", "", "getCompliantLanguageID", "Factory", "pope-player_debug"})
public final class SubtitlesModel extends androidx.lifecycle.ViewModel {
    private final android.content.Context context = null;
    private final android.net.Uri mediaUri = null;
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> observableSearchName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> observableSearchEpisode = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> observableSearchSeason = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.util.List<java.lang.String>> observableSearchLanguage = null;
    private java.util.List<java.lang.String> previousSearchLanguage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableBoolean manualSearchEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isApiLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> observableMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.Boolean> observableError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<android.text.Spanned> observableResultDescription = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.videolan.resources.opensubtitles.OpenSubtitle>> apiResultLiveData = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> downloadedLiveData = null;
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.Long, com.dewords.pope.gui.dialogs.SubtitleItem>> downloadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> result = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> history = null;
    private kotlinx.coroutines.Job searchJob;
    
    public SubtitlesModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri mediaUri, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.CoroutineContextProvider getCoroutineContextProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getObservableSearchName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getObservableSearchEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getObservableSearchSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.util.List<java.lang.String>> getObservableSearchLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getManualSearchEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isApiLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getObservableMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Boolean> getObservableError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<android.text.Spanned> getObservableResultDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> getHistory() {
        return null;
    }
    
    private final java.lang.Object merge(java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem> downloadedResult, java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem> downloadingResult, kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> continuation) {
        return null;
    }
    
    private final java.lang.Object updateListState(java.util.List<org.videolan.resources.opensubtitles.OpenSubtitle> apiResultLiveData, java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem> history, kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.gui.dialogs.SubtitleItem>> continuation) {
        return null;
    }
    
    private final java.lang.Object getSubtitleByName(java.lang.String name, java.lang.Integer episode, java.lang.Integer season, java.util.List<java.lang.String> languageIds, kotlin.coroutines.Continuation<? super java.util.List<org.videolan.resources.opensubtitles.OpenSubtitle>> continuation) {
        return null;
    }
    
    private final java.lang.Object getSubtitleByHash(long movieByteSize, java.lang.String movieHash, java.util.List<java.lang.String> languageIds, kotlin.coroutines.Continuation<? super java.util.List<org.videolan.resources.opensubtitles.OpenSubtitle>> continuation) {
        return null;
    }
    
    public final void onRefresh() {
    }
    
    public final void search(boolean byFile) {
    }
    
    public final void deleteSubtitle(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaPath, @org.jetbrains.annotations.NotNull()
    java.lang.String idSubtitle) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLastUsedLanguage() {
        return null;
    }
    
    public final void saveLastUsedLanguage(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> lastUsedLanguages) {
    }
    
    private final java.lang.String getCompliantLanguageID(java.lang.String $this$getCompliantLanguageID) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/viewmodels/SubtitlesModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "context", "Landroid/content/Context;", "mediaUri", "Landroid/net/Uri;", "name", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final android.content.Context context = null;
        private final android.net.Uri mediaUri = null;
        private final java.lang.String name = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri mediaUri, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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