package com.dewords.pope.providers.medialibrary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0002YZB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010<\u001a\u000200H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J!\u0010>\u001a\u0002002\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000@2\u0006\u0010A\u001a\u00020\u000e\u00a2\u0006\u0002\u0010BJ\u0015\u0010C\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000@H&\u00a2\u0006\u0002\u0010DJ#\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000@2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH&\u00a2\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020\u000eH&J\u0006\u0010I\u001a\u00020\u0010J\u0080\u0001\u0010J\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u00062\'\u0010K\u001a#\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0L2<\u0010S\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020R0Q\u00a2\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(?\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0004\u0012\u0002000TH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010UJ\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010W\u001a\u000200J\u000e\u0010X\u001a\u0002002\u0006\u0010X\u001a\u00020\u0010J\u0010\u00103\u001a\u0002002\u0006\u00103\u001a\u00020\u000eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\'\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\'0&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006["}, d2 = {"Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "T", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/poperesources/util/HeaderProvider;", "Lcom/dewords/pope/util/SortModule;", "context", "Landroid/content/Context;", "model", "Lcom/dewords/pope/viewmodels/SortableModel;", "(Landroid/content/Context;Lcom/dewords/pope/viewmodels/SortableModel;)V", "getContext", "()Landroid/content/Context;", "dataSource", "Landroidx/paging/DataSource;", "", "desc", "", "getDesc", "()Z", "setDesc", "(Z)V", "value", "isRefreshing", "setRefreshing", "loading", "Landroidx/lifecycle/MutableLiveData;", "getLoading", "()Landroidx/lifecycle/MutableLiveData;", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getModel", "()Lcom/dewords/pope/viewmodels/SortableModel;", "onlyFavorites", "getOnlyFavorites", "setOnlyFavorites", "pagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList$delegate", "Lkotlin/Lazy;", "pagingConfig", "Landroidx/paging/PagedList$Config;", "refreshDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "", "settings", "Landroid/content/SharedPreferences;", "sort", "getSort", "()I", "setSort", "(I)V", "sortKey", "", "getSortKey", "()Ljava/lang/String;", "awaitRefresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeHeaders", "list", "", "startposition", "([Lorg/videolan/medialibrary/media/MediaLibraryItem;I)V", "getAll", "()[Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getPage", "loadSize", "(II)[Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getTotalCount", "isEmpty", "loadPagedList", "pageSizeLambda", "Lkotlin/Function1;", "Lcom/dewords/pope/PlaybackService;", "Lkotlin/ParameterName;", "name", "service", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "loadLambda", "Lkotlin/Function2;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refresh", "saveSort", "showOnlyFavs", "MLDataSource", "MLDatasourceFactory", "pope-player_debug"})
public abstract class MedialibraryProvider<T extends org.videolan.medialibrary.media.MediaLibraryItem> extends com.dewords.poperesources.util.HeaderProvider implements com.dewords.pope.util.SortModule {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.viewmodels.SortableModel model = null;
    private final android.content.SharedPreferences settings = null;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.medialibrary.interfaces.Medialibrary medialibrary = null;
    private androidx.paging.DataSource<java.lang.Integer, T> dataSource;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> refreshDeferred;
    private boolean isRefreshing = true;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sortKey = null;
    private int sort;
    private boolean desc;
    private boolean onlyFavorites;
    private final androidx.paging.PagedList.Config pagingConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy pagedList$delegate = null;
    
    public MedialibraryProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.SortableModel model) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.viewmodels.SortableModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final boolean isRefreshing() {
        return false;
    }
    
    private final void setRefreshing(boolean value) {
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
    
    public final boolean getOnlyFavorites() {
        return false;
    }
    
    public final void setOnlyFavorites(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<T>> getPagedList() {
        return null;
    }
    
    /**
     * With pagedLists when a list is over the MEDIALIBRARY_SIZE_LIMIT, media over it won't be set.
     * This method forces the initialisation of all items, and then loads the media files.
     * @param context Context
     * @param pageSizeLambda lambda for the case count in 1..MEDIALIBRARY_PAGE_SIZE
     * @param loadLambda lambda to load list to service
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadPagedList(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.PlaybackService, ? extends java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>> pageSizeLambda, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper>, ? super com.dewords.pope.PlaybackService, kotlin.Unit> loadLambda, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public abstract int getTotalCount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract T[] getPage(int loadSize, int startposition);
    
    @org.jetbrains.annotations.NotNull()
    public abstract T[] getAll();
    
    @java.lang.Override()
    public void sort(int sort) {
    }
    
    public final void saveSort() {
    }
    
    public final void showOnlyFavs(boolean showOnlyFavs) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object awaitRefresh(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final boolean refresh() {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void completeHeaders(@org.jetbrains.annotations.NotNull()
    T[] list, int startposition) {
    }
    
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider$MLDataSource;", "Landroidx/paging/PositionalDataSource;", "(Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;)V", "loadInitial", "", "params", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "callback", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "loadRange", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "pope-player_debug"})
    public final class MLDataSource extends androidx.paging.PositionalDataSource<T> {
        
        public MLDataSource() {
            super();
        }
        
        @java.lang.Override()
        public void loadInitial(@org.jetbrains.annotations.NotNull()
        androidx.paging.PositionalDataSource.LoadInitialParams params, @org.jetbrains.annotations.NotNull()
        androidx.paging.PositionalDataSource.LoadInitialCallback<T> callback) {
        }
        
        @java.lang.Override()
        public void loadRange(@org.jetbrains.annotations.NotNull()
        androidx.paging.PositionalDataSource.LoadRangeParams params, @org.jetbrains.annotations.NotNull()
        androidx.paging.PositionalDataSource.LoadRangeCallback<T> callback) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f0\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider$MLDatasourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "(Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;)V", "create", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider$MLDataSource;", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "pope-player_debug"})
    public final class MLDatasourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, T> {
        
        public MLDatasourceFactory() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.dewords.pope.providers.medialibrary.MedialibraryProvider<T>.MLDataSource create() {
            return null;
        }
    }
}