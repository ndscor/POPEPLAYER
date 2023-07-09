package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/interfaces/Sortable;", "Landroid/widget/PopupMenu$OnMenuItemClickListener;", "getVM", "Lcom/dewords/pope/viewmodels/BaseModel;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "sort", "", "v", "Landroid/view/View;", "pope-player_debug"})
public abstract interface Sortable extends android.widget.PopupMenu.OnMenuItemClickListener {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.viewmodels.BaseModel<? extends org.videolan.medialibrary.media.MediaLibraryItem> getVM();
    
    public abstract void sort(@org.jetbrains.annotations.NotNull()
    android.view.View v);
    
    @java.lang.Override()
    public abstract boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static void sort(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.interfaces.Sortable $this, @org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public static boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.interfaces.Sortable $this, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}