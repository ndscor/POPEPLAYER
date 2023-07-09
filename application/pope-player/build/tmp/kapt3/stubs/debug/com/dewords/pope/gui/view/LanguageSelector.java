package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010%\u001a\u00020&H\u0002J\"\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020$H\u0016J\u0012\u0010,\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u001dJ\u0014\u0010/\u001a\u00020&2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fJ\b\u00100\u001a\u00020&H\u0002R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0010R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/dewords/pope/gui/view/LanguageSelector;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/DialogInterface$OnDismissListener;", "Landroid/content/DialogInterface$OnMultiChoiceClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allEntriesOfLanguages", "", "", "[Ljava/lang/String;", "allValuesOfLanguages", "getAllValuesOfLanguages", "()[Ljava/lang/String;", "setAllValuesOfLanguages", "([Ljava/lang/String;)V", "badge", "Landroid/widget/TextView;", "getBadge", "()Landroid/widget/TextView;", "badge$delegate", "Lkotlin/Lazy;", "listener", "Lcom/dewords/pope/gui/view/OnItemSelectListener;", "selectedIndices", "", "getSelectedIndices", "()Ljava/util/List;", "selection", "", "", "initViews", "", "onClick", "dialog", "Landroid/content/DialogInterface;", "index", "isChecked", "onDismiss", "setOnItemsSelectListener", "onItemSelectListener", "setSelection", "updateBadge", "pope-player_debug"})
public final class LanguageSelector extends androidx.constraintlayout.widget.ConstraintLayout implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnMultiChoiceClickListener {
    private java.lang.String[] allEntriesOfLanguages;
    public java.lang.String[] allValuesOfLanguages;
    private java.util.List<java.lang.Boolean> selection;
    private com.dewords.pope.gui.view.OnItemSelectListener listener;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy badge$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getAllValuesOfLanguages() {
        return null;
    }
    
    public final void setAllValuesOfLanguages(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    private final java.util.List<java.lang.Integer> getSelectedIndices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBadge() {
        return null;
    }
    
    public LanguageSelector(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public LanguageSelector(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public LanguageSelector(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void initViews() {
    }
    
    public final void setSelection(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> selectedIndices) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog, int index, boolean isChecked) {
    }
    
    private final void updateBadge() {
    }
    
    public final void setOnItemsSelectListener(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.view.OnItemSelectListener onItemSelectListener) {
    }
}