package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0012H\u0002J\b\u0010&\u001a\u00020\'H\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0096\u0001J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020 H\u0002J\u001c\u0010/\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0016\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0013J\u0012\u00106\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001c\u00109\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J&\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0019\u0010B\u001a\u00020 2\u0006\u00105\u001a\u00020\u00162\u0006\u0010C\u001a\u00020DH\u0096\u0001J\u0012\u0010E\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0016\u0010F\u001a\u00020 2\u0006\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0013J\u0018\u0010G\u001a\u00020,2\u0006\u00100\u001a\u0002012\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u000208H\u0016J\b\u0010J\u001a\u00020 H\u0016J\u001a\u0010K\u001a\u00020 2\u0006\u0010L\u001a\u00020=2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0011\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\u0013H\u0096\u0001J\b\u0010O\u001a\u00020 H\u0016J\b\u0010P\u001a\u00020 H\u0002J!\u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020S2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020UH\u0096\u0001J\u0011\u0010V\u001a\u00020 2\u0006\u00105\u001a\u00020\u0016H\u0096\u0001J\f\u0010W\u001a\u00020 *\u00020XH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/dewords/pope/gui/MoreFragment;", "Lcom/dewords/pope/gui/BaseFragment;", "Lcom/dewords/pope/interfaces/IRefreshable;", "Lcom/dewords/pope/interfaces/IHistory;", "Lcom/dewords/pope/util/IDialogManager;", "Lcom/dewords/pope/gui/network/IStreamsFragmentDelegate;", "()V", "aboutButton", "Landroid/widget/Button;", "dialogsDelegate", "Lcom/dewords/pope/util/DialogDelegate;", "donationsButton", "Landroidx/cardview/widget/CardView;", "historyAdapter", "Lcom/dewords/pope/gui/HistoryAdapter;", "historyEntry", "Lcom/dewords/pope/gui/view/TitleListView;", "multiSelectHelper", "Lorg/videolan/tools/MultiSelectHelper;", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "savedSelection", "Ljava/util/ArrayList;", "", "settingsButton", "streamsAdapter", "Lcom/dewords/pope/gui/network/MRLAdapter;", "streamsEntry", "streamsViewModel", "Lcom/dewords/pope/viewmodels/StreamsModel;", "viewModel", "Lcom/dewords/pope/viewmodels/HistoryModel;", "clearHistory", "", "dialogCanceled", "dialog", "Lorg/videolan/libvlc/Dialog;", "fireDialog", "getMultiHelper", "getTitle", "", "getlistEventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/network/MrlAction;", "hasFAB", "", "isEmpty", "manageDonationVisibility", "onActionItemClicked", "mode", "Landroidx/appcompat/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onClick", "position", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCtxAction", "option", "", "onDestroyActionMode", "onLongClick", "onPrepareActionMode", "onSaveInstanceState", "outState", "onStart", "onViewCreated", "view", "playMedia", "mw", "refresh", "restoreMultiSelectHelper", "setup", "fragment", "Landroidx/fragment/app/Fragment;", "keyboardListener", "Lcom/dewords/pope/gui/network/KeyboardListener;", "showContext", "process", "Lcom/dewords/pope/gui/helpers/Click;", "pope-player_debug"})
public final class MoreFragment extends com.dewords.pope.gui.BaseFragment implements com.dewords.pope.interfaces.IRefreshable, com.dewords.pope.interfaces.IHistory, com.dewords.pope.util.IDialogManager, com.dewords.pope.gui.network.IStreamsFragmentDelegate {
    private com.dewords.pope.gui.network.MRLAdapter streamsAdapter;
    private com.dewords.pope.gui.view.TitleListView historyEntry;
    private com.dewords.pope.gui.view.TitleListView streamsEntry;
    private android.widget.Button settingsButton;
    private android.widget.Button aboutButton;
    private androidx.cardview.widget.CardView donationsButton;
    private com.dewords.pope.viewmodels.HistoryModel viewModel;
    private com.dewords.pope.viewmodels.StreamsModel streamsViewModel;
    private org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.interfaces.media.MediaWrapper> multiSelectHelper;
    private final com.dewords.pope.gui.HistoryAdapter historyAdapter = null;
    private java.util.ArrayList<java.lang.Integer> savedSelection;
    private final com.dewords.pope.util.DialogDelegate dialogsDelegate = null;
    
    public MoreFragment() {
        super();
    }
    
    @java.lang.Override()
    protected boolean hasFAB() {
        return false;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    private final org.videolan.tools.MultiSelectHelper<com.dewords.pope.viewmodels.HistoryModel> getMultiHelper() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void manageDonationVisibility() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void refresh() {
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void clearHistory() {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
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
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    private final void restoreMultiSelectHelper() {
    }
    
    private final void process(com.dewords.pope.gui.helpers.Click $this$process) {
    }
    
    public final void onClick(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    public final void onLongClick(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    @java.lang.Override()
    public void fireDialog(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void dialogCanceled(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.Dialog dialog) {
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