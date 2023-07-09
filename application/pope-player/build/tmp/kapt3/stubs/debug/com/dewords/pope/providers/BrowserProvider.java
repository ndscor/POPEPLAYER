package com.dewords.pope.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0002\u0089\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u0007H\u0016J\u0014\u0010L\u001a\u00020\u001a2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u001d\u0010M\u001a\u00020\u001a2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020\rJ\u0011\u0010P\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070S2\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\u001f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070S2\u0006\u0010\b\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010NJ\b\u0010U\u001a\u00020\rH\u0004J\u0016\u0010V\u001a\u00020\u001a2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070SH\u0016J\b\u0010X\u001a\u00020\u001aH\u0016J-\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\\\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010]J\u001b\u0010^\u001a\u0004\u0018\u00010\u00072\u0006\u0010K\u001a\u00020[H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010_J\"\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010aj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`b2\u0006\u0010c\u001a\u00020\u000bJ\u0018\u0010d\u001a\u00020\t2\u0006\u0010e\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020\u000bH\u0016J\u0010\u0010g\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\rH\u0016J\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001052\u0006\u0010\b\u001a\u00020\tH\u0004J\u000e\u0010i\u001a\u00020\r2\u0006\u0010K\u001a\u00020jJ\u000e\u0010k\u001a\u00020\r2\u0006\u0010K\u001a\u00020jJ\b\u0010l\u001a\u00020\u001aH\u0014J\u0006\u0010m\u001a\u00020\rJ\u000e\u0010n\u001a\u00020\r2\u0006\u0010o\u001a\u00020jJ\u0017\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010o\u001a\u00020jH\u0002\u00a2\u0006\u0002\u0010rJ\u001f\u0010s\u001a\u00020\u001a2\u0010\b\u0002\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010SH\u0010\u00a2\u0006\u0002\buJ#\u0010v\u001a\u00020\u001a2\u0010\b\u0002\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010SH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010wJ\b\u0010x\u001a\u00020\u001aH\u0016J\u0011\u0010y\u001a\u00020\u001aH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\b\u0010z\u001a\u00020\u001aH\u0016J\u0018\u0010{\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001052\u0006\u0010\b\u001a\u00020\tH\u0004J-\u0010|\u001a\u0004\u0018\u00010\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010}\u001a\u00020~2\u0006\u0010\\\u001a\u00020\rH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u007fJ\u0017\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00020j\u00a2\u0006\u0003\u0010\u0081\u0001J\u0015\u0010\n\u001a\u00020\u001a2\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000705J\t\u0010\u0083\u0001\u001a\u00020\u001aH\u0016J\u000f\u0010\u0084\u0001\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020\rJ+\u0010\u0085\u0001\u001a\u00020\r\"\u0005\b\u0000\u0010\u0086\u0001*\t\u0012\u0005\u0012\u0003H\u0086\u00010\u00102\b\u0010\u0087\u0001\u001a\u0003H\u0086\u0001H\u0002\u00a2\u0006\u0003\u0010\u0088\u0001R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R/\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0015j\u0002`\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R#\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0.0-\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070504X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\r0-\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0010\u0010B\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/dewords/pope/providers/BrowserProvider;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/dewords/poperesources/util/HeaderProvider;", "context", "Landroid/content/Context;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "url", "", "sort", "", "desc", "", "(Landroid/content/Context;Lorg/videolan/tools/livedata/LiveDataset;Ljava/lang/String;IZ)V", "browserActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/providers/BrowserAction;", "getBrowserActor$annotations", "()V", "completionHandler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "getContext", "()Landroid/content/Context;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "getCoroutineContextProvider", "()Lorg/videolan/tools/CoroutineContextProvider;", "getDataset", "()Lorg/videolan/tools/livedata/LiveDataset;", "getDesc", "()Z", "setDesc", "(Z)V", "descriptionUpdate", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "getDescriptionUpdate", "()Landroidx/lifecycle/MutableLiveData;", "discoveryJob", "Lkotlinx/coroutines/Job;", "foldersContentMap", "Landroidx/collection/SimpleArrayMap;", "", "loading", "getLoading", "mediabrowser", "Lorg/videolan/libvlc/util/MediaBrowser;", "getMediabrowser", "()Lorg/videolan/libvlc/util/MediaBrowser;", "setMediabrowser", "(Lorg/videolan/libvlc/util/MediaBrowser;)V", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary$pope_player_debug", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "parsingJob", "showAll", "getSort", "()I", "setSort", "(I)V", "getUrl", "()Ljava/lang/String;", "addMedia", "media", "browse", "browseImpl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "browseRoot", "browseRootImpl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "browseUrl", "", "browseUrlImpl", "clearListener", "computeHeaders", "value", "fetch", "filesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lorg/videolan/libvlc/interfaces/IMedia;", "interact", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findMedia", "(Lorg/videolan/libvlc/interfaces/IMedia;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "nbOfDigits", "getDescription", "folderCount", "mediaFileCount", "getFlags", "getList", "hasMedias", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "hasSubfolders", "initBrowser", "isComparatorAboutFilename", "isFolderEmpty", "mw", "parseMediaSize", "", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)Ljava/lang/Long;", "parseSubDirectories", "list", "parseSubDirectories$pope_player_debug", "parseSubDirectoriesImpl", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "refreshImpl", "release", "removeList", "requestBrowsing", "eventListener", "Lorg/videolan/libvlc/util/MediaBrowser$EventListener;", "(Ljava/lang/String;Lorg/videolan/libvlc/util/MediaBrowser$EventListener;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveList", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)Lkotlin/Unit;", "files", "stop", "updateShowAllFiles", "post", "E", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "Companion", "pope-player_debug"})
public abstract class BrowserProvider extends com.dewords.poperesources.util.HeaderProvider implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    private int sort;
    private boolean desc;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.libvlc.util.MediaBrowser mediabrowser;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    private kotlinx.coroutines.Job parsingJob;
    private kotlinx.coroutines.Job discoveryJob;
    private final androidx.collection.SimpleArrayMap<org.videolan.medialibrary.media.MediaLibraryItem, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> foldersContentMap = null;
    private boolean showAll;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> descriptionUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.interfaces.Medialibrary medialibrary = null;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> completionHandler = null;
    private final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.providers.BrowserAction> browserActor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.providers.BrowserProvider.Companion Companion = null;
    private static final kotlin.Lazy browserHandler$delegate = null;
    private static final java.util.Map<java.lang.String, java.util.List<org.videolan.medialibrary.media.MediaLibraryItem>> prefetchLists = null;
    
    public BrowserProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> dataset, @org.jetbrains.annotations.Nullable()
    java.lang.String url, int sort, boolean desc) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.media.MediaLibraryItem> getDataset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
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
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.util.MediaBrowser getMediabrowser() {
        return null;
    }
    
    public final void setMediabrowser(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.util.MediaBrowser p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.CoroutineContextProvider getCoroutineContextProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> getDescriptionUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary$pope_player_debug() {
        return null;
    }
    
    public final boolean isComparatorAboutFilename() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Comparator<org.videolan.medialibrary.media.MediaLibraryItem> getComparator(int nbOfDigits) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getBrowserActor$annotations() {
    }
    
    protected void initBrowser() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object requestBrowsing(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.util.MediaBrowser.EventListener eventListener, boolean interact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public void fetch() {
    }
    
    protected void browse(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object browseImpl(@org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Sort the files using the comparator. If the comparator is null (UPnP) it keeps the
     * files order (or reverse it in desc mode)
     *
     * @param files the files to sort
     */
    public final void sort(@org.jetbrains.annotations.NotNull()
    java.util.List<org.videolan.medialibrary.media.MediaLibraryItem> files) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object browseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem>> continuation) {
        return null;
    }
    
    private final java.lang.Object browseUrlImpl(java.lang.String url, kotlin.coroutines.Continuation<? super java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object refreshImpl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final java.lang.Object filesFlow(java.lang.String url, boolean interact, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends org.videolan.libvlc.interfaces.IMedia>> continuation) {
        return null;
    }
    
    public void addMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem media) {
    }
    
    public void refresh() {
    }
    
    public void computeHeaders(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> value) {
    }
    
    public void parseSubDirectories$pope_player_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> list) {
    }
    
    private final java.lang.Object parseSubDirectoriesImpl(java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Long parseMediaSize(org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
        return null;
    }
    
    public final boolean hasSubfolders(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return false;
    }
    
    public final boolean hasMedias(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getDescription(int folderCount, int mediaFileCount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object findMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia media, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.videolan.medialibrary.media.MediaLibraryItem> continuation) {
        return null;
    }
    
    public final boolean browseRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object browseRootImpl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public int getFlags(boolean interact) {
        return 0;
    }
    
    public void stop() {
    }
    
    protected final boolean clearListener() {
        return false;
    }
    
    public void release() {
    }
    
    public final void updateShowAllFiles(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<org.videolan.medialibrary.media.MediaLibraryItem> getList(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<org.videolan.medialibrary.media.MediaLibraryItem> removeList(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
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
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    private final <E extends java.lang.Object>boolean post(kotlinx.coroutines.channels.SendChannel<? super E> $this$post, E element) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/providers/BrowserProvider$Companion;", "Lorg/videolan/tools/DependencyProvider;", "Lcom/dewords/pope/providers/BrowserProvider;", "()V", "browserHandler", "Landroid/os/Handler;", "getBrowserHandler", "()Landroid/os/Handler;", "browserHandler$delegate", "Lkotlin/Lazy;", "prefetchLists", "", "", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.DependencyProvider<com.dewords.pope.providers.BrowserProvider> {
        
        private Companion() {
            super();
        }
        
        private final android.os.Handler getBrowserHandler() {
            return null;
        }
    }
}