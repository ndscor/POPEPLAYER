package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00c6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SB\u0005\u00a2\u0006\u0002\u0010\u0004JA\u0010\u0017\u001a\u00020\u001826\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00180\u001aH\u0096\u0001J\t\u0010 \u001a\u00020\u0018H\u0096\u0001J\u0019\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0011H\u0096\u0001J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u0011H\u0016J\b\u0010*\u001a\u00020\u001eH\u0014J\u001c\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020\u00182\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001c\u00103\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u00104\u001a\u0004\u0018\u000105H\u0016J&\u00106\u001a\u0004\u0018\u00010#2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0012\u0010@\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010B\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0016J\b\u0010C\u001a\u00020\u0018H\u0016J\b\u0010D\u001a\u00020\u0018H\u0016J\u001a\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\t\u0010G\u001a\u00020\u0018H\u0096\u0001J\b\u0010H\u001a\u00020\u0018H\u0002J\u0010\u0010I\u001a\u00020\u00182\u0006\u0010J\u001a\u00020KH\u0002J\u001c\u0010L\u001a\u00020\u00182\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00160NH\u0096\u0001\u00a2\u0006\u0002\u0010OJ\u0011\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020RH\u0096\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/dewords/pope/gui/browser/MLStorageBrowserFragment;", "Lcom/dewords/pope/gui/BaseFragment;", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "()V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "localEntry", "Lcom/dewords/pope/gui/view/TitleListView;", "localViewModel", "Lcom/dewords/pope/viewmodels/browser/BrowserModel;", "networkEntry", "networkMonitor", "Lorg/videolan/tools/NetworkMonitor;", "networkViewModel", "processingFolders", "Landroidx/collection/SimpleArrayMap;", "", "Landroid/widget/CheckBox;", "getProcessingFolders", "()Landroidx/collection/SimpleArrayMap;", "storageBrowserAdapter", "Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;", "addBannedFoldersCallback", "", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "folder", "", "banned", "addEntryPointsCallback", "checkBoxAction", "v", "Landroid/view/View;", "mrl", "getBrowserContainer", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "isNetwork", "getTitle", "hasFAB", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "position", "", "option", "", "onDestroyActionMode", "onOptionsItemSelected", "onPrepareOptionsMenu", "onStart", "onStop", "onViewCreated", "view", "removeEntryPointsCallback", "showAddDirectoryDialog", "updateNetworkEmptyView", "emptyLoading", "Lcom/dewords/pope/gui/view/EmptyLoadingStateView;", "withAdapters", "adapters", "", "([Lcom/dewords/pope/gui/browser/StorageBrowserAdapter;)V", "withContext", "context", "Landroid/content/Context;", "Companion", "pope-player_debug"})
public final class MLStorageBrowserFragment extends com.dewords.pope.gui.BaseFragment implements com.dewords.pope.gui.browser.IStorageFragmentDelegate, com.dewords.pope.gui.dialogs.CtxActionReceiver {
    private com.dewords.pope.gui.view.TitleListView localEntry;
    private com.dewords.pope.gui.view.TitleListView networkEntry;
    private org.videolan.tools.NetworkMonitor networkMonitor;
    private com.dewords.pope.viewmodels.browser.BrowserModel localViewModel;
    private com.dewords.pope.viewmodels.browser.BrowserModel networkViewModel;
    private com.dewords.pope.gui.browser.StorageBrowserAdapter storageBrowserAdapter;
    private androidx.appcompat.app.AlertDialog alertDialog;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.browser.MLStorageBrowserFragment.Companion Companion = null;
    
    public MLStorageBrowserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
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
    protected boolean hasFAB() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
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
    
    private final void updateNetworkEmptyView(com.dewords.pope.gui.view.EmptyLoadingStateView emptyLoading) {
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
    
    private final void showAddDirectoryDialog() {
    }
    
    private final com.dewords.pope.gui.browser.BrowserContainer<org.videolan.medialibrary.media.MediaLibraryItem> getBrowserContainer(boolean isNetwork) {
        return null;
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/browser/MLStorageBrowserFragment$Companion;", "", "()V", "newInstance", "Lcom/dewords/pope/gui/browser/MLStorageBrowserFragment;", "onboarding", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.browser.MLStorageBrowserFragment newInstance(boolean onboarding) {
            return null;
        }
    }
}