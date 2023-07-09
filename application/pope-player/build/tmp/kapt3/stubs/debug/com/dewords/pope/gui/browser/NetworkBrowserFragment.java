package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0000H\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\u001a\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010-\u001a\u00020\u0011H\u0016J\b\u0010.\u001a\u00020\u0011H\u0014R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/dewords/pope/gui/browser/NetworkBrowserFragment;", "Lcom/dewords/pope/gui/browser/BaseBrowserFragment;", "Lcom/dewords/pope/util/IDialogManager;", "()V", "categoryTitle", "", "getCategoryTitle", "()Ljava/lang/String;", "dialogsDelegate", "Lcom/dewords/pope/util/DialogDelegate;", "isFile", "", "()Z", "isNetwork", "networkMonitor", "Lorg/videolan/tools/NetworkMonitor;", "browseRoot", "", "containerActivity", "Landroidx/fragment/app/FragmentActivity;", "createFragment", "dialogCanceled", "dialog", "Lorg/videolan/libvlc/Dialog;", "fireDialog", "getStorageDelegate", "Lcom/dewords/pope/gui/browser/IStorageFragmentDelegate;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCtxAction", "position", "", "option", "", "onPrepareOptionsMenu", "onStart", "onViewCreated", "view", "Landroid/view/View;", "refresh", "updateEmptyView", "pope-player_debug"})
public final class NetworkBrowserFragment extends com.dewords.pope.gui.browser.BaseBrowserFragment implements com.dewords.pope.util.IDialogManager {
    private final com.dewords.pope.util.DialogDelegate dialogsDelegate = null;
    private org.videolan.tools.NetworkMonitor networkMonitor;
    private final boolean isNetwork = true;
    private final boolean isFile = false;
    
    public NetworkBrowserFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.dewords.pope.gui.browser.NetworkBrowserFragment createFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getCategoryTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
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
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void fireDialog(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void dialogCanceled(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
    }
    
    @java.lang.Override()
    protected void browseRoot() {
    }
    
    /**
     * Update views visibility and emptiness info
     */
    @java.lang.Override()
    protected void updateEmptyView() {
    }
}