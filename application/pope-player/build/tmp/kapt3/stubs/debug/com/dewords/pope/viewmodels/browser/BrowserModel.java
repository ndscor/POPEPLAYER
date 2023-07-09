package com.dewords.pope.viewmodels.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004:\u0001LB;\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bJ\u0019\u0010,\u001a\u00020-2\u0006\u0010+\u001a\u00020\b2\u0006\u0010.\u001a\u00020/H\u0096\u0001J\u0006\u00100\u001a\u00020\fJ\b\u00101\u001a\u00020\fH\u0016J\u0019\u00102\u001a\u00020\f2\u0006\u0010+\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u000e\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020\bJ\u000b\u00105\u001a\u0004\u0018\u000106H\u0096\u0001J\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b080\u0018J\u000e\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u000206J\u0011\u0010;\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0096\u0001J\b\u0010<\u001a\u00020-H\u0014J\u0006\u0010=\u001a\u00020-J\b\u0010>\u001a\u00020-H\u0016J\u0011\u0010?\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0096\u0001J\u0006\u0010@\u001a\u00020-J\u0011\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0096\u0001J\u0015\u0010C\u001a\u0004\u0018\u00010-2\u0006\u0010D\u001a\u000206\u00a2\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020-2\b\u0010D\u001a\u0004\u0018\u000106H\u0096\u0001J\u0010\u0010G\u001a\u00020-2\u0006\u0010G\u001a\u00020\u001cH\u0017J\u0006\u0010H\u001a\u00020-J\u0019\u0010I\u001a\u00020-2\u0006\u0010+\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u000e\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u00020\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006M"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/BrowserModel;", "Lcom/dewords/pope/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/viewmodels/tv/TvBrowserModel;", "Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "context", "Landroid/content/Context;", "url", "", "type", "", "showDummyCategory", "", "pickerType", "Lcom/dewords/pope/providers/PickerType;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Landroid/content/Context;Ljava/lang/String;JZLcom/dewords/pope/providers/PickerType;Lorg/videolan/tools/CoroutineContextProvider;)V", "currentItem", "getCurrentItem", "()Lorg/videolan/medialibrary/media/MediaLibraryItem;", "setCurrentItem", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;)V", "loading", "Landroidx/lifecycle/MutableLiveData;", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "nbColumns", "", "getNbColumns", "()I", "setNbColumns", "(I)V", "provider", "Lcom/dewords/pope/providers/BrowserProvider;", "getProvider", "()Lcom/dewords/pope/providers/BrowserProvider;", "getType", "()J", "getUrl", "()Ljava/lang/String;", "addCustomDirectory", "Lkotlinx/coroutines/Job;", "path", "appendPathToUri", "", "uri", "Landroid/net/Uri$Builder;", "browseRoot", "canSortByFileNameName", "customDirectoryExists", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomDirectory", "getAndRemoveDestination", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getDescriptionUpdate", "Lkotlin/Pair;", "isFolderEmpty", "mw", "makePathSafe", "onCleared", "reSort", "refresh", "replaceStoragePath", "resetSort", "retrieveSafePath", "encoded", "saveList", "media", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)Lkotlin/Unit;", "setDestination", "sort", "stop", "toggleBanState", "updateShowAllFiles", "value", "Factory", "pope-player_debug"})
public class BrowserModel extends com.dewords.pope.viewmodels.BaseModel<org.videolan.medialibrary.media.MediaLibraryItem> implements com.dewords.pope.viewmodels.tv.TvBrowserModel<org.videolan.medialibrary.media.MediaLibraryItem>, com.dewords.pope.viewmodels.browser.IPathOperationDelegate {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    private final long type = 0L;
    private final boolean showDummyCategory = false;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.media.MediaLibraryItem currentItem;
    private int nbColumns = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.providers.BrowserProvider provider = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    
    public BrowserModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String url, long type, boolean showDummyCategory, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.providers.PickerType pickerType, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final long getType() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.videolan.medialibrary.media.MediaLibraryItem getCurrentItem() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentItem(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem p0) {
    }
    
    @java.lang.Override()
    public int getNbColumns() {
        return 0;
    }
    
    @java.lang.Override()
    public void setNbColumns(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.providers.BrowserProvider getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    public final boolean browseRoot() {
        return false;
    }
    
    /**
     * Sorts again. Useful on resume
     */
    public final void reSort() {
    }
    
    /**
     * Resets the sorts info from the shared preferences for the model and provider
     */
    public final void resetSort() {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void sort(int sort) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit saveList(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return null;
    }
    
    public final boolean isFolderEmpty(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> getDescriptionUpdate() {
        return null;
    }
    
    public final void stop() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void updateShowAllFiles(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addCustomDirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteCustomDirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object customDirectoryExists(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public boolean canSortByFileNameName() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object toggleBanState(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Append a path to the Uri from a String
     * It takes care of substituting paths stored in [storages] and splitting if the substituted path contains file separators
     *
     * @param path the path to append
     * @param uri the uri the path should be appended to
     */
    @java.lang.Override()
    public void appendPathToUri(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    android.net.Uri.Builder uri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.videolan.medialibrary.interfaces.media.MediaWrapper getAndRemoveDestination() {
        return null;
    }
    
    /**
     * Encodes a String to avoid false positive substitusions
     *
     * @param path the path to encode
     * @return the encoded path
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String makePathSafe(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Substitutes the [storages]keys by the [storages] values
     *
     * @param path the real path string
     * @return the path string with substitutions
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String replaceStoragePath(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    /**
     * Decodes a string previously encoded with [makePathSafe]
     *
     * @param encoded the encoded path string
     * @return the decoded path string
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String retrieveSafePath(@org.jetbrains.annotations.NotNull()
    java.lang.String encoded) {
        return null;
    }
    
    @java.lang.Override()
    public void setDestination(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ%\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/dewords/pope/viewmodels/browser/BrowserModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "context", "Landroid/content/Context;", "url", "", "type", "", "showDummyCategory", "", "pickerType", "Lcom/dewords/pope/providers/PickerType;", "(Landroid/content/Context;Ljava/lang/String;JZLcom/dewords/pope/providers/PickerType;)V", "getContext", "()Landroid/content/Context;", "getUrl", "()Ljava/lang/String;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "pope-player_debug"})
    public static final class Factory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String url = null;
        private final long type = 0L;
        private final boolean showDummyCategory = false;
        private final com.dewords.pope.providers.PickerType pickerType = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String url, long type, boolean showDummyCategory, @org.jetbrains.annotations.NotNull()
        com.dewords.pope.providers.PickerType pickerType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}