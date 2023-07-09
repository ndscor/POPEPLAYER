package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ContextSheet;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "binding", "Lcom/dewords/pope/databinding/ContextualSheetBinding;", "itemPosition", "", "options", "", "Lcom/dewords/pope/gui/dialogs/CtxOption;", "receiver", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "getReceiver", "()Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "setReceiver", "(Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;)V", "getDefaultState", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "populateOptions", "", "flags", "", "restoreReceiver", "ContextAdapter", "pope-player_debug"})
public final class ContextSheet extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private com.dewords.pope.databinding.ContextualSheetBinding binding;
    private java.util.List<? extends com.dewords.pope.gui.dialogs.CtxOption> options;
    public com.dewords.pope.gui.dialogs.CtxActionReceiver receiver;
    private int itemPosition = -1;
    
    public ContextSheet() {
        super();
    }
    
    @java.lang.Override()
    public int getDefaultState() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean needToManageOrientation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.dialogs.CtxActionReceiver getReceiver() {
        return null;
    }
    
    public final void setReceiver(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.CtxActionReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void restoreReceiver(android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    private final java.util.List<com.dewords.pope.gui.dialogs.CtxOption> populateOptions(long flags) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ContextSheet$ContextAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dewords/pope/gui/dialogs/ContextSheet$ContextAdapter$ViewHolder;", "Lcom/dewords/pope/gui/dialogs/ContextSheet;", "(Lcom/dewords/pope/gui/dialogs/ContextSheet;)V", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "pope-player_debug"})
    public final class ContextAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dewords.pope.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder> {
        private final kotlin.Lazy inflater$delegate = null;
        
        public ContextAdapter() {
            super();
        }
        
        private final android.view.LayoutInflater getInflater() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.dewords.pope.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.gui.dialogs.ContextSheet.ContextAdapter.ViewHolder holder, int position) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ContextSheet$ContextAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dewords/pope/databinding/ContextItemBinding;", "(Lcom/dewords/pope/gui/dialogs/ContextSheet$ContextAdapter;Lcom/dewords/pope/databinding/ContextItemBinding;)V", "getBinding", "()Lcom/dewords/pope/databinding/ContextItemBinding;", "focusedColor", "", "getFocusedColor", "()I", "focusedColor$delegate", "Lkotlin/Lazy;", "textColor", "pope-player_debug"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final com.dewords.pope.databinding.ContextItemBinding binding = null;
            private final int textColor = 0;
            private final kotlin.Lazy focusedColor$delegate = null;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            com.dewords.pope.databinding.ContextItemBinding binding) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.dewords.pope.databinding.ContextItemBinding getBinding() {
                return null;
            }
            
            private final int getFocusedColor() {
                return 0;
            }
        }
    }
}