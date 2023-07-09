package com.dewords.pope.gui;

import java.lang.System;

/**
 * Activity showing the different libraries used by VLC for Android and their licenses
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/AuthorsActivity;", "Lcom/dewords/pope/gui/BaseActivity;", "()V", "binding", "Lcom/dewords/pope/databinding/AboutAuthorsActivityBinding;", "getBinding$pope_player_debug", "()Lcom/dewords/pope/databinding/AboutAuthorsActivityBinding;", "setBinding$pope_player_debug", "(Lcom/dewords/pope/databinding/AboutAuthorsActivityBinding;)V", "displayTitle", "", "getDisplayTitle", "()Z", "getSnackAnchorView", "Landroid/view/View;", "overAudioPlayer", "loadAuthors", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "pope-player_debug"})
public final class AuthorsActivity extends com.dewords.pope.gui.BaseActivity {
    public com.dewords.pope.databinding.AboutAuthorsActivityBinding binding;
    private final boolean displayTitle = true;
    
    public AuthorsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.databinding.AboutAuthorsActivityBinding getBinding$pope_player_debug() {
        return null;
    }
    
    public final void setBinding$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.AboutAuthorsActivityBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getSnackAnchorView(boolean overAudioPlayer) {
        return null;
    }
    
    @java.lang.Override()
    public boolean getDisplayTitle() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    /**
     * Load the authors list from the json file in assets and then populate the list
     */
    private final void loadAuthors() {
    }
}