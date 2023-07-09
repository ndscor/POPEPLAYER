package com.dewords.pope.gui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\"\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0012\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000eH\u0014J\u0012\u0010&\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\t\u00a8\u0006+"}, d2 = {"Lcom/dewords/pope/gui/SecondaryActivity;", "Lcom/dewords/pope/gui/ContentActivity;", "Lcom/dewords/pope/util/IDialogManager;", "()V", "dialogsDelegate", "Lcom/dewords/pope/util/DialogDelegate;", "displayTitle", "", "getDisplayTitle", "()Z", "fragment", "Landroidx/fragment/app/Fragment;", "isOnboarding", "dialogCanceled", "", "dialog", "Lorg/videolan/libvlc/Dialog;", "fetchSecondaryFragment", "id", "", "finish", "fireDialog", "forcedTheme", "", "()Ljava/lang/Integer;", "hideRenderers", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onResume", "Companion", "pope-player_debug"})
public final class SecondaryActivity extends com.dewords.pope.gui.ContentActivity implements com.dewords.pope.util.IDialogManager {
    private androidx.fragment.app.Fragment fragment;
    private final boolean displayTitle = true;
    private final com.dewords.pope.util.DialogDelegate dialogsDelegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.SecondaryActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/SecondaryActivity";
    public static final int ACTIVITY_RESULT_SECONDARY = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_FRAGMENT = "fragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUMS_SONGS = "albumsSongs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ABOUT = "about";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STREAMS = "streams";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HISTORY = "history";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_GROUP_LIST = "videoGroupList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STORAGE_BROWSER = "storage_browser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STORAGE_BROWSER_ONBOARDING = "storage_browser_onboarding";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILE_BROWSER = "file_browser";
    
    public SecondaryActivity() {
        super();
    }
    
    @java.lang.Override()
    public boolean getDisplayTitle() {
        return false;
    }
    
    public final boolean isOnboarding() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer forcedTheme() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void fireDialog(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void dialogCanceled(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hideRenderers() {
        return false;
    }
    
    private final void fetchSecondaryFragment(java.lang.String id) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/gui/SecondaryActivity$Companion;", "", "()V", "ABOUT", "", "ACTIVITY_RESULT_SECONDARY", "", "ALBUMS_SONGS", "FILE_BROWSER", "HISTORY", "KEY_FRAGMENT", "STORAGE_BROWSER", "STORAGE_BROWSER_ONBOARDING", "STREAMS", "TAG", "VIDEO_GROUP_LIST", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}