package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005JA\u0010\u001d\u001a\u00020\u001e26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u001e0 H\u0096\u0001J\t\u0010%\u001a\u00020\u001eH\u0096\u0001J\u0019\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0096\u0001J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0014J\n\u0010.\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010/\u001a\u00020\rH\u0014J \u00100\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016J\u0012\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u000106H\u0016J \u00107\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016J \u00108\u001a\u00020\r2\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016J \u00109\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003H\u0016J\u0010\u0010:\u001a\u00020\r2\u0006\u00103\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u000206H\u0016J\b\u0010A\u001a\u00020\u001eH\u0016J\b\u0010B\u001a\u00020\u001eH\u0016J\u001a\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u000106H\u0017J\t\u0010E\u001a\u00020\u001eH\u0096\u0001J\b\u0010F\u001a\u00020\u001eH\u0014J\b\u0010G\u001a\u00020\u001eH\u0002J\u001c\u0010H\u001a\u00020\u001e2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0096\u0001\u00a2\u0006\u0002\u0010LJ\u0011\u0010M\u001a\u00020\u001e2\u0006\u0010N\u001a\u00020OH\u0096\u0001R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\rX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006P"}, d2 = {"Lcom/dewords/pope/gui/browser/StorageBrowserFragment;", "Lcom/dewords/pope/gui/browser/FileBrowserFragment;", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "categoryTitle", "", "getCategoryTitle", "()Ljava/lang/String;", "inCards", "", "getInCards", "()Z", "isFile", "isNetwork", "processingFolders", "Landroidx/collection/SimpleArrayMap;", "Landroid/widget/CheckBox;", "getProcessingFolders", "()Landroidx/collection/SimpleArrayMap;", "scannedDirectory", "getScannedDirectory", "setScannedDirectory", "(Z)V", "snack", "Lcom/google/android/material/snackbar/Snackbar;", "addBannedFoldersCallback", "", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "folder", "banned", "addEntryPointsCallback", "checkBoxAction", "v", "Landroid/view/View;", "mrl", "containerActivity", "Landroidx/fragment/app/FragmentActivity;", "createFragment", "Landroidx/fragment/app/Fragment;", "getStorageDelegate", "hasFAB", "onClick", "position", "", "item", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCtxClick", "onLongClick", "onMainActionClick", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "removeEntryPointsCallback", "setupBrowser", "showAddDirectoryDialog", "withAdapters", "adapters", "", "Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "([Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;)V", "withContext", "context", "Landroid/content/Context;", "pope-player_debug"})
public final class StorageBrowserFragment extends com.dewords.pope.gui.browser.FileBrowserFragment implements com.dewords.pope.gui.browser.BrowserContainer<org.videolan.medialibrary.media.MediaLibraryItem>, com.dewords.pope.gui.browser.IStorageFragmentDelegate {
    private boolean scannedDirectory = false;
    private com.google.android.material.snackbar.Snackbar snack;
    private androidx.appcompat.app.AlertDialog alertDialog;
    private final boolean inCards = false;
    private final boolean isNetwork = false;
    private final boolean isFile = true;
    
    public StorageBrowserFragment() {
        super();
    }
    
    @java.lang.Override()
    public boolean getScannedDirectory() {
        return false;
    }
    
    public void setScannedDirectory(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getInCards() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getCategoryTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.fragment.app.Fragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected boolean hasFAB() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupBrowser() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
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
    public void onCtxClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
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
    public void onMainActionClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    private final void showAddDirectoryDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.FragmentActivity containerActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.dewords.pope.gui.browser.IStorageFragmentDelegate getStorageDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isNetwork() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isFile() {
        return false;
    }
    
    @java.lang.Override()
    public void addBannedFoldersCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public void addEntryPointsCallback() {
    }
    
    @java.lang.Override()
    public void checkBoxAction(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    java.lang.String mrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.collection.SimpleArrayMap<java.lang.String, android.widget.CheckBox> getProcessingFolders() {
        return null;
    }
    
    @java.lang.Override()
    public void removeEntryPointsCallback() {
    }
    
    @java.lang.Override()
    public void withAdapters(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.StorageBrowserAdapter[] adapters) {
    }
    
    @java.lang.Override()
    public void withContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}