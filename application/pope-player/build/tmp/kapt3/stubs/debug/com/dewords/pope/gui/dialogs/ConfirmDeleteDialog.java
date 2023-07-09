package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0014\u0010\"\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ConfirmDeleteDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "buttonText", "", "deleteAnimation", "Landroid/widget/ImageView;", "deleteButton", "Landroid/widget/Button;", "description", "Landroid/widget/TextView;", "descriptionString", "listener", "Lkotlin/Function0;", "", "mediaList", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "title", "titleString", "getDefaultState", "", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setListener", "Companion", "pope-player_debug"})
public final class ConfirmDeleteDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private kotlin.jvm.functions.Function0<kotlin.Unit> listener;
    private android.widget.ImageView deleteAnimation;
    private android.widget.TextView title;
    private android.widget.TextView description;
    private android.widget.Button deleteButton;
    private java.util.List<? extends org.videolan.medialibrary.media.MediaLibraryItem> mediaList;
    private java.lang.String titleString;
    private java.lang.String descriptionString;
    private java.lang.String buttonText;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.ConfirmDeleteDialog.Companion Companion = null;
    
    public ConfirmDeleteDialog() {
        super();
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public int getDefaultState() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @java.lang.Override()
    public boolean needToManageOrientation() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/dialogs/ConfirmDeleteDialog$Companion;", "", "()V", "newInstance", "Lcom/dewords/pope/gui/dialogs/ConfirmDeleteDialog;", "medias", "Ljava/util/ArrayList;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lkotlin/collections/ArrayList;", "title", "", "description", "buttonText", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a new ConfirmDeleteDialog
         * @param medias the list of media used to create the title. If not relevant, use [title], [description] and [buttonText]
         * @param title the title to be used
         * @param description the description to be used
         * @param buttonText the button's text to be used
         */
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.dialogs.ConfirmDeleteDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<org.videolan.medialibrary.media.MediaLibraryItem> medias, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.NotNull()
        java.lang.String buttonText) {
            return null;
        }
    }
}