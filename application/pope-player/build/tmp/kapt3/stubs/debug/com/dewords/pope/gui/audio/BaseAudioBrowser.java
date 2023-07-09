package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e8\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u00072\u00020\bB\u0005\u00a2\u0006\u0002\u0010\tJ,\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050M2\u0006\u0010N\u001a\u00020\u0018J\u000e\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u0018J\n\u0010Q\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010R\u001a\u00020KH$J\u0010\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010TH\u0016J\u0018\u0010U\u001a\u00020\"2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0016J \u0010Z\u001a\u00020I2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0005H\u0016J\u0010\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020`H\u0016J\u0012\u0010a\u001a\u00020I2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0018\u0010d\u001a\u00020\"2\u0006\u0010V\u001a\u00020W2\u0006\u0010e\u001a\u00020fH\u0016J\u0018\u0010g\u001a\u00020I2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010h\u001a\u00020iH\u0016J \u0010j\u001a\u00020I2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0005H\u0016J\u0010\u0010k\u001a\u00020I2\u0006\u0010l\u001a\u00020WH\u0016J\u0017\u0010k\u001a\u00020I2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\bmJ \u0010n\u001a\u00020I2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0005H\u0016J\u0018\u0010o\u001a\u00020I2\u0006\u0010[\u001a\u00020\\2\u0006\u0010X\u001a\u00020\u0005H\u0016J \u0010p\u001a\u00020\"2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0005H\u0016J \u0010q\u001a\u00020I2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010X\u001a\u00020\u0005H\u0016J\u0010\u0010r\u001a\u00020\"2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010s\u001a\u00020I2\u0006\u0010t\u001a\u00020\u0018H\u0016J \u0010u\u001a\u00020I2\u0006\u0010]\u001a\u00020\u00182\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020\u0018H\u0016J\u0010\u0010y\u001a\u00020I2\u0006\u0010]\u001a\u00020\u0018H\u0016J\u0018\u0010z\u001a\u00020\"2\u0006\u0010V\u001a\u00020W2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010{\u001a\u00020IH\u0016J\b\u0010|\u001a\u00020IH\u0016J\b\u0010}\u001a\u00020IH\u0016J\u0011\u0010~\u001a\u00020I2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0016J\u0012\u0010\u0081\u0001\u001a\u00020I2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020I2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0016J\u0016\u0010\u0083\u0001\u001a\u00020I2\u000b\u0010\n\u001a\u0007\u0012\u0002\b\u00030\u0084\u0001H\u0016J\u001c\u0010\u0085\u0001\u001a\u00020I2\u0007\u0010\u0086\u0001\u001a\u00020\\2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0007\u0010\u0087\u0001\u001a\u00020IJ6\u0010\u0088\u0001\u001a\u00020I2\u0007\u0010\u0089\u0001\u001a\u00020\"2\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00050M2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u0018J\t\u0010\u008a\u0001\u001a\u00020IH\u0016J\t\u0010\u008b\u0001\u001a\u00020IH\u0002J&\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001*\t\u0012\u0004\u0012\u00020\u00050\u008f\u0001H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0090\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0080.\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00188D@DX\u0084\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u00100\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001a\u00103\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u00106R\u0014\u00107\u001a\u000208X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020CX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0091\u0001"}, d2 = {"Lcom/dewords/pope/gui/audio/BaseAudioBrowser;", "T", "Lcom/dewords/pope/viewmodels/MedialibraryViewModel;", "Lcom/dewords/pope/gui/browser/MediaBrowserFragment;", "Lcom/dewords/pope/interfaces/IEventsHandler;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "()V", "adapter", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "getAdapter", "()Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "setAdapter", "(Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;)V", "adapters", "", "getAdapters$pope_player_debug", "()[Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "setAdapters$pope_player_debug", "([Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;)V", "[Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "backgroundColor", "", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "value", "currentTab", "getCurrentTab", "setCurrentTab", "empty", "", "getEmpty", "()Z", "lastQuery", "", "getLastQuery", "()Ljava/lang/String;", "setLastQuery", "(Ljava/lang/String;)V", "layoutOnPageChangeListener", "Lcom/google/android/material/tabs/TabLayout$TabLayoutOnPageChangeListener;", "listColor", "getListColor", "setListColor", "nbColumns", "getNbColumns", "setNbColumns", "needToReopenSearch", "getNeedToReopenSearch", "setNeedToReopenSearch", "(Z)V", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListener$pope_player_debug", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "tcl", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "displayListInGrid", "", "list", "Landroidx/recyclerview/widget/RecyclerView;", "provider", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "spacing", "emptyAt", "index", "getCurrentAdapter", "getCurrentRV", "getMultiHelper", "Lorg/videolan/tools/MultiSelectHelper;", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onClick", "v", "Landroid/view/View;", "position", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCtxAction", "option", "", "onCtxClick", "onDestroyActionMode", "actionMode", "onDestroyActionMode$pope_player_debug", "onImageClick", "onItemFocused", "onLongClick", "onMainActionClick", "onOptionsItemSelected", "onPageScrollStateChanged", "state", "onPageScrolled", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPrepareActionMode", "onRefresh", "onStart", "onStop", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "onUpdateFinished", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onViewCreated", "view", "reopenSearchIfNeeded", "setupLayoutManager", "providerInCard", "setupTabLayout", "unSetTabLayout", "getTracks", "Ljava/util/ArrayList;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
public abstract class BaseAudioBrowser<T extends com.dewords.pope.viewmodels.MedialibraryViewModel> extends com.dewords.pope.gui.browser.MediaBrowserFragment<T> implements com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem>, com.dewords.pope.gui.dialogs.CtxActionReceiver, androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.google.android.material.tabs.TabLayout.OnTabSelectedListener {
    private int backgroundColor = -1;
    private int listColor = -1;
    public com.dewords.pope.gui.audio.AudioBrowserAdapter[] adapters;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.tabs.TabLayout tabLayout;
    public androidx.viewpager.widget.ViewPager viewPager;
    private int nbColumns = 2;
    private final com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener tcl = null;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.gui.audio.AudioBrowserAdapter adapter;
    private boolean needToReopenSearch = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastQuery = "";
    private com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener layoutOnPageChangeListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    
    public BaseAudioBrowser() {
        super();
    }
    
    public final int getBackgroundColor() {
        return 0;
    }
    
    public final void setBackgroundColor(int p0) {
    }
    
    public final int getListColor() {
        return 0;
    }
    
    public final void setListColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.audio.AudioBrowserAdapter[] getAdapters$pope_player_debug() {
        return null;
    }
    
    public final void setAdapters$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.tabs.TabLayout getTabLayout() {
        return null;
    }
    
    public final void setTabLayout(@org.jetbrains.annotations.Nullable()
    com.google.android.material.tabs.TabLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager.widget.ViewPager getViewPager() {
        return null;
    }
    
    public final void setViewPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager p0) {
    }
    
    public final int getNbColumns() {
        return 0;
    }
    
    public final void setNbColumns(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract androidx.recyclerview.widget.RecyclerView getCurrentRV();
    
    @org.jetbrains.annotations.Nullable()
    protected final com.dewords.pope.gui.audio.AudioBrowserAdapter getAdapter() {
        return null;
    }
    
    protected final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.audio.AudioBrowserAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.dewords.pope.gui.audio.AudioBrowserAdapter getCurrentAdapter() {
        return null;
    }
    
    public final boolean getNeedToReopenSearch() {
        return false;
    }
    
    public final void setNeedToReopenSearch(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastQuery() {
        return null;
    }
    
    public final void setLastQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    protected final int getCurrentTab() {
        return 0;
    }
    
    protected final void setCurrentTab(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getScrollListener$pope_player_debug() {
        return null;
    }
    
    public final void displayListInGrid(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView list, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter adapter, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.providers.medialibrary.MedialibraryProvider<org.videolan.medialibrary.media.MediaLibraryItem> provider, int spacing) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setupLayoutManager(boolean providerInCard, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView list, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.providers.medialibrary.MedialibraryProvider<org.videolan.medialibrary.media.MediaLibraryItem> provider, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter adapter, int spacing) {
    }
    
    public void setupTabLayout() {
    }
    
    private final void unSetTabLayout() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onTabSelected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabUnselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onTabReselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override()
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
    
    @java.lang.Override()
    public void onPageScrollStateChanged(int state) {
    }
    
    @java.lang.Override()
    public void onPageSelected(int position) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
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
    
    public final void reopenSearchIfNeeded() {
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final java.lang.Object getTracks(java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> $this$getTracks, kotlin.coroutines.Continuation<? super java.util.ArrayList<org.videolan.medialibrary.interfaces.media.MediaWrapper>> p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode actionMode) {
    }
    
    public final void onDestroyActionMode$pope_player_debug(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.gui.audio.AudioBrowserAdapter adapter) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
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
    public void onImageClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onCtxClick(@org.jetbrains.annotations.NotNull()
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
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
    }
    
    protected final boolean getEmpty() {
        return false;
    }
    
    public final boolean emptyAt(int index) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public org.videolan.tools.MultiSelectHelper<T> getMultiHelper() {
        return null;
    }
}