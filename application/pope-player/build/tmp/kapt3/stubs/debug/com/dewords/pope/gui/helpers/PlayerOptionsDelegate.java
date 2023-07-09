package com.dewords.pope.gui.helpers;

import java.lang.System;

@android.annotation.SuppressLint(value = {"ShowToast"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010.\u001a\u00020\u000fJ\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\nH\u0002J\u0006\u00102\u001a\u00020\u0007J\u000e\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u000205J\u0014\u00106\u001a\u00020\u000f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u00108\u001a\u00020\u000fH\u0002J\b\u00109\u001a\u00020\u000fH\u0002J\u0006\u0010:\u001a\u00020\u000fJ\u0006\u0010;\u001a\u00020\u000fJ\u0010\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u0011H\u0002J\u0010\u0010>\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020\u000fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\'\u001a\n \u001e*\u0004\u0018\u00010(0(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u000e\u0010-\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate;", "Landroidx/lifecycle/LifecycleObserver;", "activity", "Landroidx/fragment/app/FragmentActivity;", "service", "Lcom/dewords/pope/PlaybackService;", "showABReapeat", "", "(Landroidx/fragment/app/FragmentActivity;Lcom/dewords/pope/PlaybackService;Z)V", "abrBinding", "Lcom/dewords/pope/databinding/PlayerOptionItemBinding;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "bookmarkClickedListener", "Lkotlin/Function0;", "", "flags", "", "getFlags", "()J", "setFlags", "(J)V", "isChromecast", "primary", "ptBinding", "recyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "repeatBinding", "res", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "rootView", "Landroid/widget/FrameLayout;", "getService", "()Lcom/dewords/pope/PlaybackService;", "settings", "Landroid/content/SharedPreferences;", "shuffleBinding", "sleepBinding", "toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "toast$delegate", "Lkotlin/Lazy;", "video", "hide", "initRepeat", "binding", "initShuffle", "isShowing", "onClick", "option", "Lcom/dewords/pope/gui/helpers/PlayerOption;", "setBookmarkClickedListener", "listener", "setRepeatMode", "setShuffle", "setup", "show", "showFragment", "id", "showValueControls", "action", "", "togglePassthrough", "OptionsAdapter", "pope-player_debug"})
public final class PlayerOptionsDelegate implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.PlaybackService service = null;
    private final boolean showABReapeat = false;
    private kotlin.jvm.functions.Function0<kotlin.Unit> bookmarkClickedListener;
    private androidx.recyclerview.widget.RecyclerView recyclerview;
    private android.widget.FrameLayout rootView;
    private long flags = 0L;
    private final kotlin.Lazy toast$delegate = null;
    private final boolean primary = false;
    private final boolean isChromecast = false;
    private final boolean video = false;
    private final android.content.res.Resources res = null;
    private final android.content.SharedPreferences settings = null;
    private com.dewords.pope.databinding.PlayerOptionItemBinding abrBinding;
    private com.dewords.pope.databinding.PlayerOptionItemBinding ptBinding;
    private com.dewords.pope.databinding.PlayerOptionItemBinding repeatBinding;
    private com.dewords.pope.databinding.PlayerOptionItemBinding shuffleBinding;
    private com.dewords.pope.databinding.PlayerOptionItemBinding sleepBinding;
    
    public PlayerOptionsDelegate(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.PlaybackService service, boolean showABReapeat) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    public final long getFlags() {
        return 0L;
    }
    
    public final void setFlags(long p0) {
    }
    
    private final android.widget.Toast getToast() {
        return null;
    }
    
    public final void setup() {
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final void setBookmarkClickedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.helpers.PlayerOption option) {
    }
    
    private final void showFragment(long id) {
    }
    
    private final void showValueControls(int action) {
    }
    
    private final void setRepeatMode() {
    }
    
    private final void setShuffle() {
    }
    
    private final void initShuffle(com.dewords.pope.databinding.PlayerOptionItemBinding binding) {
    }
    
    private final void initRepeat(com.dewords.pope.databinding.PlayerOptionItemBinding binding) {
    }
    
    private final void togglePassthrough() {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate$OptionsAdapter;", "Lcom/dewords/pope/gui/DiffUtilAdapter;", "Lcom/dewords/pope/gui/helpers/PlayerOption;", "Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate$OptionsAdapter$ViewHolder;", "Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate;", "(Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate;)V", "layountInflater", "Landroid/view/LayoutInflater;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "pope-player_debug"})
    final class OptionsAdapter extends com.dewords.pope.gui.DiffUtilAdapter<com.dewords.pope.gui.helpers.PlayerOption, com.dewords.pope.gui.helpers.PlayerOptionsDelegate.OptionsAdapter.ViewHolder> {
        private android.view.LayoutInflater layountInflater;
        
        public OptionsAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.dewords.pope.gui.helpers.PlayerOptionsDelegate.OptionsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.helpers.PlayerOptionsDelegate.OptionsAdapter.ViewHolder holder, int position) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate$OptionsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/PlayerOptionItemBinding;", "(Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate$OptionsAdapter;Lcom/dewords/pope/databinding/PlayerOptionItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/PlayerOptionItemBinding;", "pope-player_debug"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final com.dewords.pope.databinding.PlayerOptionItemBinding binding = null;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            com.dewords.pope.databinding.PlayerOptionItemBinding binding) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.dewords.pope.databinding.PlayerOptionItemBinding getBinding() {
                return null;
            }
        }
    }
}