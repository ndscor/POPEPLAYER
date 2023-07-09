package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010*H&J\u0006\u0010+\u001a\u00020!J\u0012\u0010,\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020#H\u0016J\u0018\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\'2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00100\u001a\u000208H\u0016J\b\u00109\u001a\u00020#H\u0016J\u0010\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020#H&J\b\u0010>\u001a\u00020#H\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020.H\u0016J\b\u0010A\u001a\u00020#H\u0016J\b\u0010B\u001a\u00020#H\u0016J\u001a\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010E\u001a\u00020#H\u0002J\u0010\u0010F\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0014J\u0016\u0010G\u001a\u00020#2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002010IH\u0014J\b\u0010J\u001a\u00020#H\u0016J\u0006\u0010K\u001a\u00020#J\b\u0010L\u001a\u00020#H\u0014J\u0010\u0010M\u001a\u00020#2\u0006\u0010N\u001a\u00020!H\u0016J\u0010\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020\u0014H\u0016J\u0012\u0010Q\u001a\u00020#2\b\b\u0002\u0010R\u001a\u00020\u0014H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000@TX\u0096.\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006S"}, d2 = {"Lcom/dewords/pope/gui/browser/MediaBrowserFragment;", "T", "Lcom/dewords/pope/viewmodels/SortableModel;", "Lcom/dewords/pope/gui/BaseFragment;", "Lcom/dewords/pope/interfaces/Filterable;", "()V", "displaySettingsViewModel", "Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel;", "getDisplaySettingsViewModel", "()Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel;", "displaySettingsViewModel$delegate", "Lkotlin/Lazy;", "mediaLibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMediaLibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "setMediaLibrary", "(Lorg/videolan/medialibrary/interfaces/Medialibrary;)V", "savedSelection", "Ljava/util/ArrayList;", "", "searchButtonView", "Landroid/view/View;", "transition", "Landroidx/transition/ChangeBounds;", "<set-?>", "viewModel", "getViewModel", "()Lcom/dewords/pope/viewmodels/SortableModel;", "setViewModel", "(Lcom/dewords/pope/viewmodels/SortableModel;)V", "Lcom/dewords/pope/viewmodels/SortableModel;", "allowedToExpand", "", "clear", "", "enableSearchOption", "filter", "query", "", "getFilterQuery", "getMultiHelper", "Lorg/videolan/tools/MultiSelectHelper;", "inSearchMode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteFailed", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onDestroy", "onDisplaySettingChanged", "key", "value", "", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onPause", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRefresh", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "releaseBreadCrumb", "removeItem", "removeItems", "items", "", "restoreList", "restoreMultiSelectHelper", "setBreadcrumb", "setSearchVisibility", "visible", "sortBy", "sort", "sortMenuTitles", "index", "pope-player_debug"})
public abstract class MediaBrowserFragment<T extends com.dewords.pope.viewmodels.SortableModel> extends com.dewords.pope.gui.BaseFragment implements com.dewords.pope.interfaces.Filterable {
    private android.view.View searchButtonView;
    public org.videolan.medialibrary.interfaces.Medialibrary mediaLibrary;
    private java.util.ArrayList<java.lang.Integer> savedSelection;
    private final androidx.transition.ChangeBounds transition = null;
    private final kotlin.Lazy displaySettingsViewModel$delegate = null;
    protected T viewModel;
    
    public MediaBrowserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.interfaces.Medialibrary getMediaLibrary() {
        return null;
    }
    
    public final void setMediaLibrary(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.Medialibrary p0) {
    }
    
    private final com.dewords.pope.viewmodels.DisplaySettingsViewModel getDisplaySettingsViewModel() {
        return null;
    }
    
    /**
     * Triggered when a display setting is changed
     *
     * @param key the display settings key
     * @param value the new display settings value
     */
    public void onDisplaySettingChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public T getViewModel() {
        return null;
    }
    
    protected void setViewModel(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.videolan.tools.MultiSelectHelper<T> getMultiHelper();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void setBreadcrumb() {
    }
    
    private final void releaseBreadCrumb() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public abstract void onRefresh();
    
    public void clear() {
    }
    
    protected void removeItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> items) {
    }
    
    protected boolean removeItem(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
        return false;
    }
    
    private final void onDeleteFailed(org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    public void sortMenuTitles(int index) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public void sortBy(int sort) {
    }
    
    public final void restoreMultiSelectHelper() {
    }
    
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void restoreList() {
    }
    
    @java.lang.Override()
    public boolean enableSearchOption() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFilterQuery() {
        return null;
    }
    
    @java.lang.Override()
    public void setSearchVisibility(boolean visible) {
    }
    
    public final boolean inSearchMode() {
        return false;
    }
    
    @java.lang.Override()
    public boolean allowedToExpand() {
        return false;
    }
}