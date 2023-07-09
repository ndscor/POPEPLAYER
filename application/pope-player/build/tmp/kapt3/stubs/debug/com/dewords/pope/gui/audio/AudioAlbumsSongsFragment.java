package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00162\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u001fH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u0010!\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0018H\u0016J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020%H\u0016J\u0010\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010@\u001a\u00020\u00182\u0006\u0010=\u001a\u00020>H\u0016J\u001a\u0010A\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010B\u001a\u00020\u0018H\u0016J\u0010\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u0016H\u0016J\b\u0010E\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioAlbumsSongsFragment;", "Lcom/dewords/pope/gui/audio/BaseAudioBrowser;", "Lcom/dewords/pope/viewmodels/mobile/AlbumSongsViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "albumsAdapter", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "audioPagerAdapter", "Lcom/dewords/pope/gui/audio/AudioPagerAdapter;", "fastScroller", "Lcom/dewords/pope/gui/view/FastScroller;", "fromAlbums", "", "hasTabs", "getHasTabs", "()Z", "lists", "", "Landroidx/recyclerview/widget/RecyclerView;", "[Landroidx/recyclerview/widget/RecyclerView;", "songsAdapter", "spacing", "", "clear", "", "getCurrentAdapter", "getCurrentRV", "getTitle", "", "onClick", "v", "Landroid/view/View;", "position", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "option", "", "onDisplaySettingChanged", "key", "value", "", "onFabPlayClick", "view", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRefresh", "onSaveInstanceState", "outState", "onTabReselected", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "onViewCreated", "setupTabLayout", "sortBy", "sort", "updateTabs", "pope-player_debug"})
public final class AudioAlbumsSongsFragment extends com.dewords.pope.gui.audio.BaseAudioBrowser<com.dewords.pope.viewmodels.mobile.AlbumSongsViewModel> implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private int spacing = 0;
    private androidx.recyclerview.widget.RecyclerView[] lists;
    private com.dewords.pope.gui.audio.AudioBrowserAdapter songsAdapter;
    private com.dewords.pope.gui.audio.AudioBrowserAdapter albumsAdapter;
    private com.dewords.pope.gui.view.FastScroller fastScroller;
    private com.dewords.pope.gui.audio.AudioPagerAdapter audioPagerAdapter;
    private final boolean hasTabs = true;
    private boolean fromAlbums = false;
    
    public AudioAlbumsSongsFragment() {
        super();
    }
    
    @java.lang.Override()
    public boolean getHasTabs() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.audio.AudioBrowserAdapter getCurrentAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDisplaySettingChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    /**
     * Setup the tabs custom views
     */
    private final void updateTabs() {
    }
    
    @java.lang.Override()
    public void setupTabLayout() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
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
    public void onTabSelected(@org.jetbrains.annotations.NotNull()
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.recyclerview.widget.RecyclerView getCurrentRV() {
        return null;
    }
    
    @java.lang.Override()
    public void onFabPlayClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}