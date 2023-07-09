package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0006H\u0014J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J \u0010\u001e\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\u001a\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\fH\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/gui/browser/FilePickerFragment;", "Lcom/dewords/pope/gui/browser/FileBrowserFragment;", "Lcom/dewords/pope/gui/browser/BrowserContainer;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "()V", "isFile", "", "()Z", "isNetwork", "pickerType", "Lcom/dewords/pope/providers/PickerType;", "backTo", "", "tag", "", "browseUp", "containerActivity", "Landroidx/fragment/app/FragmentActivity;", "createFragment", "Landroidx/fragment/app/Fragment;", "defineIsRoot", "onClick", "v", "Landroid/view/View;", "position", "", "item", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onImageClick", "onStart", "onViewCreated", "view", "pickFile", "mw", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setupBrowser", "pope-player_debug"})
public final class FilePickerFragment extends com.dewords.pope.gui.browser.FileBrowserFragment implements com.dewords.pope.gui.browser.BrowserContainer<org.videolan.medialibrary.media.MediaLibraryItem> {
    private com.dewords.pope.providers.PickerType pickerType;
    private final boolean isNetwork = false;
    private final boolean isFile = true;
    
    public FilePickerFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.fragment.app.Fragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setupBrowser() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @java.lang.Override()
    public void backTo(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onImageClick(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    private final void pickFile(org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
    }
    
    public final void browseUp() {
    }
    
    @java.lang.Override()
    protected boolean defineIsRoot() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.FragmentActivity containerActivity() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isNetwork() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isFile() {
        return false;
    }
}