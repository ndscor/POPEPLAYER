package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0014J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/gui/view/ClickableSwitchPreference;", "Landroidx/preference/TwoStatePreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "switchClickListener", "Landroid/view/View$OnClickListener;", "switchView", "Landroid/view/View;", "onBindViewHolder", "", "holder", "Landroidx/preference/PreferenceViewHolder;", "onClick", "setOnSwitchClickListener", "listener", "pope-player_debug"})
public final class ClickableSwitchPreference extends androidx.preference.TwoStatePreference {
    private android.view.View switchView;
    private android.view.View.OnClickListener switchClickListener;
    
    public ClickableSwitchPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceViewHolder holder) {
    }
    
    public final void setOnSwitchClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    @java.lang.Override()
    protected void onClick() {
    }
}