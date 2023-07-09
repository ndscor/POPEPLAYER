package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00028\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/gui/helpers/SelectorViewHolder;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vdb", "(Landroidx/databinding/ViewDataBinding;)V", "ITEM_FOCUS_OFF", "", "ITEM_FOCUS_ON", "ITEM_SELECTION_ON", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "Landroidx/databinding/ViewDataBinding;", "isSelected", "", "selectView", "", "selected", "setViewBackground", "focus", "pope-player_debug"})
public class SelectorViewHolder<T extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private T binding;
    private final int ITEM_FOCUS_ON = 0;
    private final int ITEM_FOCUS_OFF = 0;
    private final int ITEM_SELECTION_ON = 0;
    
    public SelectorViewHolder(@org.jetbrains.annotations.NotNull()
    T vdb) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    protected boolean isSelected() {
        return false;
    }
    
    public void selectView(boolean selected) {
    }
    
    private final void setViewBackground(boolean focus, boolean selected) {
    }
}