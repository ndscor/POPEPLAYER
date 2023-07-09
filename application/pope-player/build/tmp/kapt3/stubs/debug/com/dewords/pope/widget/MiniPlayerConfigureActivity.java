package com.dewords.pope.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/dewords/pope/widget/MiniPlayerConfigureActivity;", "Lcom/dewords/pope/gui/BaseActivity;", "()V", "appWidgetId", "", "getAppWidgetId", "()I", "setAppWidgetId", "(I)V", "binding", "Lcom/dewords/pope/databinding/WidgetMiniPlayerConfigureBinding;", "displayTitle", "", "getDisplayTitle", "()Z", "model", "Lcom/dewords/pope/widget/WidgetViewModel;", "getModel$pope_player_debug", "()Lcom/dewords/pope/widget/WidgetViewModel;", "setModel$pope_player_debug", "(Lcom/dewords/pope/widget/WidgetViewModel;)V", "finish", "", "getSnackAnchorView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "overAudioPlayer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onWidgetContainerClicked", "updatePreview", "pope-player_debug"})
public final class MiniPlayerConfigureActivity extends com.dewords.pope.gui.BaseActivity {
    public com.dewords.pope.widget.WidgetViewModel model;
    private final boolean displayTitle = true;
    private com.dewords.pope.databinding.WidgetMiniPlayerConfigureBinding binding;
    private int appWidgetId = android.appwidget.AppWidgetManager.INVALID_APPWIDGET_ID;
    
    public MiniPlayerConfigureActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.widget.WidgetViewModel getModel$pope_player_debug() {
        return null;
    }
    
    public final void setModel$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.WidgetViewModel p0) {
    }
    
    @java.lang.Override()
    public boolean getDisplayTitle() {
        return false;
    }
    
    public final int getAppWidgetId() {
        return 0;
    }
    
    public final void setAppWidgetId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.coordinatorlayout.widget.CoordinatorLayout getSnackAnchorView(boolean overAudioPlayer) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updatePreview() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    private final void onWidgetContainerClicked() {
    }
}