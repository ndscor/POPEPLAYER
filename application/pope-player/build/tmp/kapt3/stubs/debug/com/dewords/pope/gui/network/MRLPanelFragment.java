package com.dewords.pope.gui.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001c\u0010\"\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010\u001e2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0019\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0096\u0001J\u0012\u0010/\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u00100\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u0002012\u0006\u00102\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u000104H\u0016J \u00105\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00106\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0016J\b\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0015H\u0016J\u001a\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0011\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020=H\u0096\u0001J\b\u0010>\u001a\u00020\u0017H\u0002J\b\u0010?\u001a\u00020\u0015H\u0016J!\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020B2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010D\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0096\u0001R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/dewords/pope/gui/network/MRLPanelFragment;", "Lcom/dewords/pope/gui/BaseFragment;", "Landroid/view/View$OnKeyListener;", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/view/View$OnClickListener;", "Lcom/dewords/pope/interfaces/BrowserFragmentInterface;", "Lcom/dewords/pope/gui/network/IStreamsFragmentDelegate;", "Lcom/dewords/pope/gui/network/KeyboardListener;", "()V", "adapter", "Lcom/dewords/pope/gui/network/MRLAdapter;", "binding", "Lcom/dewords/pope/databinding/MrlPanelBinding;", "viewModel", "Lcom/dewords/pope/viewmodels/StreamsModel;", "getTitle", "", "getlistEventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/network/MrlAction;", "hideKeyboard", "", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "position", "", "option", "", "onDestroyActionMode", "onEditorAction", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "onKey", "keyCode", "onResume", "onStart", "onViewCreated", "view", "playMedia", "mw", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "processUri", "refresh", "setup", "fragment", "Landroidx/fragment/app/Fragment;", "keyboardListener", "showContext", "pope-player_debug"})
public final class MRLPanelFragment extends com.dewords.pope.gui.BaseFragment implements android.view.View.OnKeyListener, android.widget.TextView.OnEditorActionListener, android.view.View.OnClickListener, com.dewords.pope.interfaces.BrowserFragmentInterface, com.dewords.pope.gui.network.IStreamsFragmentDelegate, com.dewords.pope.gui.network.KeyboardListener {
    private com.dewords.pope.databinding.MrlPanelBinding binding;
    private com.dewords.pope.gui.network.MRLAdapter adapter;
    private com.dewords.pope.viewmodels.StreamsModel viewModel;
    
    public MRLPanelFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public boolean onKey(@org.jetbrains.annotations.NotNull()
    android.view.View v, int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final boolean processUri() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.NotNull()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public void hideKeyboard() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.channels.SendChannel<com.dewords.pope.gui.network.MrlAction> getlistEventActor() {
        return null;
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
    }
    
    @java.lang.Override()
    public void playMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
    }
    
    @java.lang.Override()
    public void setup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.StreamsModel viewModel, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.network.KeyboardListener keyboardListener) {
    }
    
    @java.lang.Override()
    public void showContext(int position) {
    }
}