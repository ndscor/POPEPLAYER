package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u00072\u00020\b2\b\u0012\u0004\u0012\u00020\u00060\t:\u0002\u008f\u0001B\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020$H\u0002J\u0010\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020 H\u0016J\u0016\u0010D\u001a\u00020@2\u0006\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020.J\b\u0010G\u001a\u00020@H$J\b\u0010H\u001a\u00020@H\u0016J\b\u0010I\u001a\u00020JH$J\b\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020.H\u0014J\b\u0010N\u001a\u00020.H\u0016J\u0019\u0010O\u001a\u00020$2\u0006\u0010A\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010PJ\u0010\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010RH\u0016J\b\u0010S\u001a\u00020\u0002H\u0016J\b\u0010T\u001a\u00020 H\u0016J\u0006\u0010U\u001a\u00020.J\u0018\u0010V\u001a\u00020.2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0012H\u0016J \u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u0006H\u0016J\u0012\u0010_\u001a\u00020@2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0018\u0010b\u001a\u00020.2\u0006\u0010W\u001a\u00020X2\u0006\u0010c\u001a\u00020dH\u0016J&\u0010e\u001a\u0004\u0018\u00010\\2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010i2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0018\u0010j\u001a\u00020@2\u0006\u0010]\u001a\u00020^2\u0006\u0010k\u001a\u00020lH\u0016J \u0010m\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u0006H\u0016J\b\u0010n\u001a\u00020@H\u0016J\u0012\u0010o\u001a\u00020@2\b\u0010W\u001a\u0004\u0018\u00010XH\u0016J\u0010\u0010p\u001a\u00020@2\u0006\u0010q\u001a\u00020\\H\u0016J \u0010r\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u0006H\u0016J\u0018\u0010s\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Y\u001a\u00020\u0006H\u0016J \u0010t\u001a\u00020.2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u0006H\u0016J \u0010u\u001a\u00020@2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010Y\u001a\u00020\u0006H\u0016J\u0010\u0010v\u001a\u00020.2\u0006\u0010Y\u001a\u00020\u0012H\u0016J\u0018\u0010w\u001a\u00020.2\u0006\u0010W\u001a\u00020X2\u0006\u0010c\u001a\u00020dH\u0016J\u0010\u0010x\u001a\u00020@2\u0006\u0010c\u001a\u00020dH\u0016J\b\u0010y\u001a\u00020@H\u0016J\u0010\u0010z\u001a\u00020@2\u0006\u0010{\u001a\u00020aH\u0016J\b\u0010|\u001a\u00020@H\u0016J\b\u0010}\u001a\u00020@H\u0016J\u0014\u0010~\u001a\u00020@2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u007fH\u0016J\u001b\u0010\u0080\u0001\u001a\u00020@2\u0006\u0010q\u001a\u00020\\2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0013\u0010\u0081\u0001\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010$H\u0002J\t\u0010\u0082\u0001\u001a\u00020@H\u0016J\t\u0010\u0083\u0001\u001a\u00020@H\u0016J\u0011\u0010\u0084\u0001\u001a\u00020.2\u0006\u0010Y\u001a\u00020\u0006H\u0014J\t\u0010\u0085\u0001\u001a\u00020@H\u0014J\u0012\u0010\u0086\u0001\u001a\u00020@2\u0007\u0010\u0087\u0001\u001a\u00020.H\u0016J\t\u0010\u0088\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020@2\u0007\u0010\u008a\u0001\u001a\u00020^H\u0016J\n\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0002J\t\u0010\u008d\u0001\u001a\u00020@H\u0014J\t\u0010\u008e\u0001\u001a\u00020@H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0014\u0010)\u001a\u00020*X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020.X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00100\"\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u00010 X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020.X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0016\u0010=\u001a\u0004\u0018\u00010 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0090\u0001"}, d2 = {"Lcom/dewords/pope/gui/browser/BaseBrowserFragment;", "Lcom/dewords/pope/gui/browser/MediaBrowserFragment;", "Lcom/dewords/pope/viewmodels/browser/BrowserModel;", "Lcom/dewords/pope/interfaces/IRefreshable;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/dewords/pope/interfaces/IEventsHandler;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "Lcom/dewords/pope/gui/browser/PathAdapterListener;", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "()V", "adapter", "Lcom/dewords/pope/gui/browser/BaseBrowserAdapter;", "getAdapter", "()Lcom/dewords/pope/gui/browser/BaseBrowserAdapter;", "setAdapter", "(Lcom/dewords/pope/gui/browser/BaseBrowserAdapter;)V", "addPlaylistFolderOnly", "Landroid/view/MenuItem;", "binding", "Lcom/dewords/pope/databinding/DirectoryBrowserBinding;", "getBinding", "()Lcom/dewords/pope/databinding/DirectoryBrowserBinding;", "setBinding", "(Lcom/dewords/pope/databinding/DirectoryBrowserBinding;)V", "browserFavRepository", "Lcom/dewords/pope/repository/BrowserFavRepository;", "getBrowserFavRepository", "()Lcom/dewords/pope/repository/BrowserFavRepository;", "setBrowserFavRepository", "(Lcom/dewords/pope/repository/BrowserFavRepository;)V", "categoryTitle", "", "getCategoryTitle", "()Ljava/lang/String;", "currentMedia", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getCurrentMedia", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setCurrentMedia", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "handler", "Lcom/dewords/pope/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "getHandler", "()Lcom/dewords/pope/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "inCards", "", "getInCards", "()Z", "isRootDirectory", "setRootDirectory", "(Z)V", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mrl", "getMrl", "setMrl", "(Ljava/lang/String;)V", "needToRefreshMeta", "scannedDirectory", "getScannedDirectory", "subTitle", "getSubTitle", "addToScannedFolders", "", "mw", "backTo", "tag", "browse", "media", "save", "browseRoot", "clear", "createFragment", "Landroidx/fragment/app/Fragment;", "currentContext", "Landroid/content/Context;", "defineIsRoot", "enableSearchOption", "getMediaWithMeta", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMultiHelper", "Lorg/videolan/tools/MultiSelectHelper;", "getPathOperationDelegate", "getTitle", "goBack", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "onClick", "v", "Landroid/view/View;", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "option", "", "onCtxClick", "onDestroy", "onDestroyActionMode", "onFabPlayClick", "view", "onImageClick", "onItemFocused", "onLongClick", "onMainActionClick", "onOptionsItemSelected", "onPrepareActionMode", "onPrepareOptionsMenu", "onRefresh", "onSaveInstanceState", "outState", "onStart", "onStop", "onUpdateFinished", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onViewCreated", "playAll", "refresh", "registerSwiperRefreshlayout", "removeItem", "setBreadcrumb", "setSearchVisibility", "visible", "showRoot", "sortBy", "sort", "toggleFavorite", "Lkotlinx/coroutines/Job;", "updateEmptyView", "updateFab", "BrowserFragmentHandler", "pope-player_debug"})
public abstract class BaseBrowserFragment extends com.dewords.pope.gui.browser.MediaBrowserFragment<com.dewords.pope.viewmodels.browser.BrowserModel> implements com.dewords.pope.interfaces.IRefreshable, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem>, com.dewords.pope.gui.dialogs.CtxActionReceiver, com.dewords.pope.gui.browser.PathAdapterListener, com.dewords.pope.gui.browser.BrowserContainer<org.videolan.medialibrary.media.MediaLibraryItem> {
    private android.view.MenuItem addPlaylistFolderOnly;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.gui.browser.BaseBrowserFragment.BrowserFragmentHandler handler = null;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mrl;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.interfaces.media.MediaWrapper currentMedia;
    private boolean isRootDirectory = false;
    private final boolean scannedDirectory = false;
    private final boolean inCards = false;
    protected com.dewords.pope.gui.browser.BaseBrowserAdapter adapter;
    protected com.dewords.pope.databinding.DirectoryBrowserBinding binding;
    protected com.dewords.pope.repository.BrowserFavRepository browserFavRepository;
    private boolean needToRefreshMeta = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subTitle = null;
    
    public BaseBrowserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.gui.browser.BaseBrowserFragment.BrowserFragmentHandler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMrl() {
        return null;
    }
    
    public void setMrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.videolan.medialibrary.interfaces.media.MediaWrapper getCurrentMedia() {
        return null;
    }
    
    protected final void setCurrentMedia(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper p0) {
    }
    
    @java.lang.Override()
    public boolean isRootDirectory() {
        return false;
    }
    
    public void setRootDirectory(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getScannedDirectory() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getInCards() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.gui.browser.BaseBrowserAdapter getAdapter() {
        return null;
    }
    
    protected final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.BaseBrowserAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getCategoryTitle();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.databinding.DirectoryBrowserBinding getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.DirectoryBrowserBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.repository.BrowserFavRepository getBrowserFavRepository() {
        return null;
    }
    
    protected final void setBrowserFavRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.repository.BrowserFavRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.fragment.app.Fragment createFragment();
    
    protected abstract void browseRoot();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    protected boolean defineIsRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void sortBy(int sort) {
    }
    
    public void registerSwiperRefreshlayout() {
    }
    
    @java.lang.Override()
    protected void setBreadcrumb() {
    }
    
    @java.lang.Override()
    public void backTo(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context currentContext() {
        return null;
    }
    
    @java.lang.Override()
    public boolean showRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.viewmodels.browser.BrowserModel getPathOperationDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public org.videolan.tools.MultiSelectHelper<com.dewords.pope.viewmodels.browser.BrowserModel> getMultiHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getSubTitle() {
        return null;
    }
    
    public final boolean goBack() {
        return false;
    }
    
    public final void browse(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, boolean save) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    /**
     * Update views visibility and emptiness info
     */
    protected void updateEmptyView() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void onFabPlayClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    protected boolean removeItem(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
        return false;
    }
    
    private final void playAll(org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
    }
    
    @java.lang.Override()
    public boolean enableSearchOption() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void addToScannedFolders(org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
    }
    
    private final kotlinx.coroutines.Job toggleFavorite() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCtxClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    /**
     * Get the media metadata from ML if needed
     * This is useful in case a playback has already been running since this fragment has been started
     * As the ML events are not listened to refresh the browser content, it will reload the ML metadata
     * for this media to ensure the progress (and other metadata) are up to date
     *
     * @param mw the [MediaWrapper] to look into
     * @return a [MediaWrapper] with up to date ML metadata
     */
    private final java.lang.Object getMediaWithMeta(org.videolan.medialibrary.interfaces.media.MediaWrapper mw, kotlin.coroutines.Continuation<? super org.videolan.medialibrary.interfaces.media.MediaWrapper> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
    }
    
    @java.lang.Override()
    public void onImageClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onMainActionClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onUpdateFinished(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @java.lang.Override()
    public void onItemFocused(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    private final void updateFab() {
    }
    
    @java.lang.Override()
    public void setSearchVisibility(boolean visible) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/gui/browser/BaseBrowserFragment$BrowserFragmentHandler;", "Lorg/videolan/tools/WeakHandler;", "Lcom/dewords/pope/gui/browser/BaseBrowserFragment;", "owner", "(Lcom/dewords/pope/gui/browser/BaseBrowserFragment;)V", "enqueuingSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "handleMessage", "", "msg", "Landroid/os/Message;", "pope-player_debug"})
    public static final class BrowserFragmentHandler extends org.videolan.tools.WeakHandler<com.dewords.pope.gui.browser.BaseBrowserFragment> {
        private com.google.android.material.snackbar.Snackbar enqueuingSnackbar;
        
        public BrowserFragmentHandler(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.browser.BaseBrowserFragment owner) {
            super(null);
        }
        
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
    }
}