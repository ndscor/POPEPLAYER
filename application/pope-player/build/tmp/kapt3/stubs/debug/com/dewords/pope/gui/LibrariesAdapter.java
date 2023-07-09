package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dewords/pope/gui/LibrariesAdapter;", "Lcom/dewords/pope/gui/DiffUtilAdapter;", "Lcom/dewords/pope/gui/LibraryWithLicense;", "Lcom/dewords/pope/gui/LibrariesAdapter$ViewHolder;", "itemClickHandler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "license", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "pope-player_debug"})
public final class LibrariesAdapter extends com.dewords.pope.gui.DiffUtilAdapter<com.dewords.pope.gui.LibraryWithLicense, com.dewords.pope.gui.LibrariesAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.dewords.pope.gui.LibraryWithLicense, kotlin.Unit> itemClickHandler = null;
    
    public LibrariesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.LibraryWithLicense, kotlin.Unit> itemClickHandler) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.LibrariesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.LibrariesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/LibrariesAdapter$ViewHolder;", "Lcom/dewords/pope/gui/helpers/SelectorViewHolder;", "Lcom/dewords/pope/databinding/LibraryItemBinding;", "vdb", "(Lcom/dewords/pope/gui/LibrariesAdapter;Lcom/dewords/pope/databinding/LibraryItemBinding;)V", "pope-player_debug"})
    public final class ViewHolder extends com.dewords.pope.gui.helpers.SelectorViewHolder<com.dewords.pope.databinding.LibraryItemBinding> {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.LibraryItemBinding vdb) {
            super(null);
        }
    }
}