package com.dewords.pope.gui.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/dewords/pope/gui/network/StreamsFragmentDelegate;", "Lcom/dewords/pope/gui/network/IStreamsFragmentDelegate;", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "()V", "fragment", "Landroidx/fragment/app/Fragment;", "keyboardListener", "Lcom/dewords/pope/gui/network/KeyboardListener;", "viewModel", "Lcom/dewords/pope/viewmodels/StreamsModel;", "getlistEventActor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/gui/network/MrlAction;", "onCtxAction", "", "position", "", "option", "", "playMedia", "mw", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "renameStream", "setup", "showContext", "pope-player_debug"})
public final class StreamsFragmentDelegate implements com.dewords.pope.gui.network.IStreamsFragmentDelegate, com.dewords.pope.gui.dialogs.CtxActionReceiver {
    private com.dewords.pope.gui.network.KeyboardListener keyboardListener;
    private com.dewords.pope.viewmodels.StreamsModel viewModel;
    private androidx.fragment.app.Fragment fragment;
    
    public StreamsFragmentDelegate() {
        super();
    }
    
    @java.lang.Override()
    public void setup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.StreamsModel viewModel, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.network.KeyboardListener keyboardListener) {
    }
    
    @java.lang.Override()
    public void onCtxAction(int position, long option) {
    }
    
    @java.lang.Override()
    public void showContext(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Override()
    public kotlinx.coroutines.channels.SendChannel<com.dewords.pope.gui.network.MrlAction> getlistEventActor() {
        return null;
    }
    
    @java.lang.Override()
    public void playMedia(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
    }
    
    private final void renameStream(int position) {
    }
}