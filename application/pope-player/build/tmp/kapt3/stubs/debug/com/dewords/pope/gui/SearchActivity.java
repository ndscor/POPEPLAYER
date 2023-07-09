package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J(\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0002J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J$\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J(\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/gui/SearchActivity;", "Lcom/dewords/pope/gui/BaseActivity;", "Landroid/text/TextWatcher;", "Landroid/widget/TextView$OnEditorActionListener;", "()V", "binding", "Lcom/dewords/pope/databinding/SearchActivityBinding;", "clickHandler", "Lcom/dewords/pope/gui/SearchActivity$ClickHandler;", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "getSnackAnchorView", "Landroid/view/View;", "overAudioPlayer", "", "initializeLists", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEditorAction", "v", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "onTextChanged", "before", "performSearh", "query", "", "ClickHandler", "Companion", "pope-player_debug"})
public class SearchActivity extends com.dewords.pope.gui.BaseActivity implements android.text.TextWatcher, android.widget.TextView.OnEditorActionListener {
    private org.videolan.medialibrary.interfaces.Medialibrary medialibrary;
    private com.dewords.pope.databinding.SearchActivityBinding binding;
    private final com.dewords.pope.gui.SearchActivity.ClickHandler clickHandler = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.SearchActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/SearchActivity";
    
    public SearchActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View getSnackAnchorView(boolean overAudioPlayer) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performSearh(java.lang.String query) {
    }
    
    private final void initializeLists() {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/dewords/pope/gui/SearchActivity$ClickHandler;", "", "(Lcom/dewords/pope/gui/SearchActivity;)V", "onBack", "", "v", "Landroid/view/View;", "onItemClick", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onBack(@org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
        android.view.View v) {
        }
        
        public final void onItemClick(@org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/SearchActivity$Companion;", "", "()V", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}