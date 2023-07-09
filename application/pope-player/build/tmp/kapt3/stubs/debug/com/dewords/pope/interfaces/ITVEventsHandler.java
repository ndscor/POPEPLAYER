package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/interfaces/ITVEventsHandler;", "", "onClickAddToPlaylist", "", "v", "Landroid/view/View;", "position", "", "onClickAppend", "onClickMoveDown", "onClickMoveUp", "onClickPlay", "onClickPlayNext", "onClickRemove", "onFocusChanged", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
public abstract interface ITVEventsHandler {
    
    public abstract void onClickPlay(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickPlayNext(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickAppend(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickAddToPlaylist(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickMoveUp(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickMoveDown(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onClickRemove(@org.jetbrains.annotations.NotNull()
    android.view.View v, int position);
    
    public abstract void onFocusChanged(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item);
}