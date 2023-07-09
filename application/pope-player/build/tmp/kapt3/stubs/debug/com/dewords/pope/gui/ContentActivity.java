package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\u0006\u0010\u0013\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u000eH\u0002J\u0006\u0010)\u001a\u00020\u000eJ\b\u0010*\u001a\u00020\u000eH\u0002J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u0010J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/dewords/pope/gui/ContentActivity;", "Lcom/dewords/pope/gui/AudioPlayerContainerActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "Landroid/view/MenuItem$OnActionExpandListener;", "()V", "searchHiddenMenuItem", "Ljava/util/ArrayList;", "Landroid/view/MenuItem;", "searchItem", "searchView", "Landroidx/appcompat/widget/SearchView;", "showRenderers", "", "closeSearchView", "", "getCurrentQuery", "", "hideRenderers", "initAudioPlayerContainerActivity", "isSearchViewVisible", "makeRoomForSearch", "hide", "onClick", "v", "Landroid/view/View;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onMenuItemActionCollapse", "item", "onMenuItemActionExpand", "onOptionsItemSelected", "onPause", "onPostCreate", "savedInstanceState", "Landroid/os/Bundle;", "onQueryTextChange", "filterQueryString", "onQueryTextSubmit", "query", "openSearchActivity", "openSearchView", "restoreCurrentList", "setCurrentQuery", "setSearchVisibility", "visible", "setstatusbar", "Companion", "pope-player_debug"})
public class ContentActivity extends com.dewords.pope.gui.AudioPlayerContainerActivity implements androidx.appcompat.widget.SearchView.OnQueryTextListener, android.view.MenuItem.OnActionExpandListener {
    private androidx.appcompat.widget.SearchView searchView;
    private android.view.MenuItem searchItem;
    private boolean showRenderers;
    private final java.util.ArrayList<android.view.MenuItem> searchHiddenMenuItem = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.ContentActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/ContentActivity";
    
    public ContentActivity() {
        super();
    }
    
    public boolean hideRenderers() {
        return false;
    }
    
    @java.lang.Override()
    protected void initAudioPlayerContainerActivity() {
    }
    
    @java.lang.Override()
    public void setstatusbar() {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String filterQueryString) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onMenuItemActionExpand(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onMenuItemActionCollapse(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return false;
    }
    
    private final void openSearchActivity() {
    }
    
    private final void setSearchVisibility(boolean visible) {
    }
    
    private final void makeRoomForSearch(boolean hide) {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void closeSearchView() {
    }
    
    public final void openSearchView() {
    }
    
    public final boolean isSearchViewVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentQuery() {
        return null;
    }
    
    public final void setCurrentQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void restoreCurrentList() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/ContentActivity$Companion;", "", "()V", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}