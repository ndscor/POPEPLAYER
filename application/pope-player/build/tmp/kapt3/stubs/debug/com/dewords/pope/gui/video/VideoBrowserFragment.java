package com.dewords.pope.gui.video;

import java.lang.System;

/**
 * Fragment containing the video viewpager
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\u0006H\u0014J\u001c\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001c\u0010.\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u001f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010/\u001a\u000200H\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u001fH\u0016J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0016J\u001a\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010D\u001a\u00020\u001fH\u0002J\b\u0010E\u001a\u00020\u001fH\u0016J\u0010\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0006H\u0016J\b\u0010H\u001a\u00020\u001fH\u0002J\b\u0010I\u001a\u00020\u001fH\u0002J\b\u0010J\u001a\u00020\u001fH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0010R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/dewords/pope/gui/video/VideoBrowserFragment;", "Lcom/dewords/pope/gui/BaseFragment;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "Lcom/dewords/pope/interfaces/Filterable;", "()V", "hasTabs", "", "getHasTabs", "()Z", "lastQuery", "", "needToReopenSearch", "value", "playlistOnlyFavorites", "getPlaylistOnlyFavorites", "setPlaylistOnlyFavorites", "(Z)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "tabLayoutMediator", "Lcom/google/android/material/tabs/TabLayoutMediator;", "videoGridOnlyFavorites", "getVideoGridOnlyFavorites", "setVideoGridOnlyFavorites", "videoPagerAdapter", "Lcom/dewords/pope/gui/video/VideoBrowserFragment$VideoPagerAdapter;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "allowedToExpand", "enableSearchOption", "filter", "", "query", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "getFilterQuery", "getPageTitle", "position", "", "getTitle", "hasFAB", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyActionMode", "onPrepareOptionsMenu", "onStart", "onStop", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "onViewCreated", "view", "reopenSearchIfNeeded", "restoreList", "setSearchVisibility", "visible", "setupTabLayout", "unSetTabLayout", "updateTabs", "VideoPagerAdapter", "pope-player_debug"})
public final class VideoBrowserFragment extends com.dewords.pope.gui.BaseFragment implements com.google.android.material.tabs.TabLayout.OnTabSelectedListener, com.dewords.pope.interfaces.Filterable {
    private com.dewords.pope.gui.video.VideoBrowserFragment.VideoPagerAdapter videoPagerAdapter;
    private final boolean hasTabs = true;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private com.google.android.material.tabs.TabLayoutMediator tabLayoutMediator;
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    private boolean needToReopenSearch = false;
    private java.lang.String lastQuery = "";
    private boolean videoGridOnlyFavorites = false;
    private boolean playlistOnlyFavorites = false;
    
    public VideoBrowserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getHasTabs() {
        return false;
    }
    
    public final boolean getVideoGridOnlyFavorites() {
        return false;
    }
    
    public final void setVideoGridOnlyFavorites(boolean value) {
    }
    
    public final boolean getPlaylistOnlyFavorites() {
        return false;
    }
    
    public final void setPlaylistOnlyFavorites(boolean value) {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode) {
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
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    /**
     * Reopens the search if the tab is changed
     */
    private final void reopenSearchIfNeeded() {
    }
    
    @java.lang.Override()
    public void onTabReselected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    private final void setupTabLayout() {
    }
    
    private final java.lang.String getPageTitle(int position) {
        return null;
    }
    
    @java.lang.Override()
    protected boolean hasFAB() {
        return false;
    }
    
    private final void unSetTabLayout() {
    }
    
    /**
     * Finds current fragment
     *
     * @return the current shown fragment
     */
    private final androidx.fragment.app.Fragment getCurrentFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFilterQuery() {
        return null;
    }
    
    @java.lang.Override()
    public boolean enableSearchOption() {
        return false;
    }
    
    @java.lang.Override()
    public void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void restoreList() {
    }
    
    @java.lang.Override()
    public void setSearchVisibility(boolean visible) {
    }
    
    @java.lang.Override()
    public boolean allowedToExpand() {
        return false;
    }
    
    private final void updateTabs() {
    }
    
    /**
     * View pager adapter hosting the video and playlist fragments
     *
     * @property fa the [FragmentActivity] to be used
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/gui/video/VideoBrowserFragment$VideoPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Lcom/dewords/pope/gui/video/VideoBrowserFragment;", "(Lcom/dewords/pope/gui/video/VideoBrowserFragment;Lcom/dewords/pope/gui/video/VideoBrowserFragment;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "pope-player_debug"})
    public final class VideoPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public VideoPagerAdapter(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.video.VideoBrowserFragment fa) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}