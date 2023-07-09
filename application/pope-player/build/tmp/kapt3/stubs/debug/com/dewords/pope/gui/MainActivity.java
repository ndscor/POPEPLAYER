package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000bH\u0096\u0001J\t\u0010&\u001a\u00020\u001aH\u0096\u0001J\u0006\u0010\'\u001a\u00020$J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0011\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020,H\u0096\u0001J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020\u001aH\u0016J\"\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020$H\u0017J\u0012\u00106\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u000108H\u0015J\u0018\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020?H\u0016J\u0012\u0010A\u001a\u00020\u001a2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020$H\u0014J\b\u0010E\u001a\u00020$H\u0014J\u0010\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u000208H\u0014J\b\u0010H\u001a\u00020$H\u0014J\b\u0010I\u001a\u00020$H\u0014J\b\u0010J\u001a\u00020$H\u0002J\b\u0010K\u001a\u00020$H\u0002J\t\u0010L\u001a\u00020$H\u0096\u0001J\u0012\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020$H\u0002J\u0017\u0010R\u001a\u00020$*\u00020\u00002\b\u0010S\u001a\u0004\u0018\u000108H\u0096\u0001R\u0018\u0010\u0004\u001a\u00020\u0005X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u000f\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/dewords/pope/gui/MainActivity;", "Lcom/dewords/pope/gui/ContentActivity;", "Lcom/dewords/pope/gui/helpers/INavigator;", "()V", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "setAppbarLayout", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "currentFragmentId", "", "getCurrentFragmentId", "()I", "setCurrentFragmentId", "(I)V", "mediaLibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "navigationView", "", "Lcom/google/android/material/navigation/NavigationBarView;", "getNavigationView", "()Ljava/util/List;", "setNavigationView", "(Ljava/util/List;)V", "value", "", "refreshing", "getRefreshing", "()Z", "setRefreshing", "(Z)V", "scanNeeded", "toolbarIcon", "Landroid/widget/ImageView;", "configurationChanged", "", "size", "currentIdIsExtension", "forceRefresh", "current", "Landroidx/fragment/app/Fragment;", "getFragmentWidth", "activity", "Landroid/app/Activity;", "getSnackAnchorView", "Landroid/view/View;", "overAudioPlayer", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onMenuItemActionExpand", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onRestart", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "prepareActionBar", "prepareBottomBar", "reloadPreferences", "startSupportActionMode", "Landroidx/appcompat/view/ActionMode;", "callback", "Landroidx/appcompat/view/ActionMode$Callback;", "updateIncognitoModeIcon", "setupNavigation", "state", "pope-player_debug"})
public final class MainActivity extends com.dewords.pope.gui.ContentActivity implements com.dewords.pope.gui.helpers.INavigator {
    private boolean refreshing = false;
    private org.videolan.medialibrary.interfaces.Medialibrary mediaLibrary;
    private boolean scanNeeded = false;
    private android.widget.ImageView toolbarIcon;
    
    public MainActivity() {
        super();
    }
    
    public final boolean getRefreshing() {
        return false;
    }
    
    public final void setRefreshing(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getSnackAnchorView(boolean overAudioPlayer) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void prepareActionBar() {
    }
    
    private final void prepareBottomBar() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.view.ActionMode startSupportActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode.Callback callback) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    /**
     * Handle onClick form menu buttons
     */
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void updateIncognitoModeIcon() {
    }
    
    @java.lang.Override()
    public boolean onMenuItemActionExpand(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void forceRefresh() {
    }
    
    private final void forceRefresh(androidx.fragment.app.Fragment current) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void configurationChanged(int size) {
    }
    
    @java.lang.Override()
    public boolean currentIdIsExtension() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.appbar.AppBarLayout getAppbarLayout() {
        return null;
    }
    
    @java.lang.Override()
    public int getCurrentFragmentId() {
        return 0;
    }
    
    @java.lang.Override()
    public int getFragmentWidth(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.android.material.navigation.NavigationBarView> getNavigationView() {
        return null;
    }
    
    @java.lang.Override()
    public void reloadPreferences() {
    }
    
    @java.lang.Override()
    public void setAppbarLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout p0) {
    }
    
    @java.lang.Override()
    public void setCurrentFragmentId(int p0) {
    }
    
    @java.lang.Override()
    public void setNavigationView(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.android.material.navigation.NavigationBarView> p0) {
    }
    
    @java.lang.Override()
    public void setupNavigation(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.MainActivity $this$setupNavigation, @org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
    }
}