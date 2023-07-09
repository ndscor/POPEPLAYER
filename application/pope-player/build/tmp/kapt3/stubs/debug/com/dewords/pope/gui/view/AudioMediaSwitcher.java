package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002#$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H$J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\bJ\u001b\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/dewords/pope/gui/view/AudioMediaSwitcher;", "Lcom/dewords/pope/gui/view/FlingViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "audioMediaSwitcherListener", "Lcom/dewords/pope/gui/view/AudioMediaSwitcher$AudioMediaSwitcherListener;", "hasPrevious", "", "previousPosition", "", "viewSwitchListener", "Lcom/dewords/pope/gui/view/ViewSwitchListener;", "getViewSwitchListener", "()Lcom/dewords/pope/gui/view/ViewSwitchListener;", "addMediaView", "", "inflater", "Landroid/view/LayoutInflater;", "title", "", "artist", "album", "cover", "Landroid/graphics/Bitmap;", "trackInfo", "onTextClicked", "setAudioMediaSwitcherListener", "l", "updateMedia", "service", "Lcom/dewords/pope/PlaybackService;", "(Lcom/dewords/pope/PlaybackService;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AudioMediaSwitcherListener", "EmptySwitcherListener", "pope-player_debug"})
public abstract class AudioMediaSwitcher extends com.dewords.pope.gui.view.FlingViewGroup {
    private com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener audioMediaSwitcherListener;
    private boolean hasPrevious = false;
    private int previousPosition = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.gui.view.ViewSwitchListener viewSwitchListener = null;
    
    public AudioMediaSwitcher(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dewords.pope.gui.view.ViewSwitchListener getViewSwitchListener() {
        return null;
    }
    
    public final void onTextClicked() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateMedia(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService service, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    protected abstract void addMediaView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String artist, @org.jetbrains.annotations.Nullable()
    java.lang.String album, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap cover, @org.jetbrains.annotations.Nullable()
    java.lang.String trackInfo);
    
    public final void setAudioMediaSwitcherListener(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener l) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/view/AudioMediaSwitcher$AudioMediaSwitcherListener;", "", "onMediaSwitched", "", "position", "", "onMediaSwitching", "onTextClicked", "onTouchClick", "onTouchDown", "onTouchLongClick", "onTouchUp", "Companion", "pope-player_debug"})
    public static abstract interface AudioMediaSwitcherListener {
        @org.jetbrains.annotations.NotNull()
        public static final com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener.Companion Companion = null;
        public static final int PREVIOUS_MEDIA = 1;
        public static final int CURRENT_MEDIA = 2;
        public static final int NEXT_MEDIA = 3;
        
        public abstract void onMediaSwitching();
        
        public abstract void onMediaSwitched(int position);
        
        public abstract void onTouchDown();
        
        public abstract void onTouchUp();
        
        public abstract void onTouchClick();
        
        public abstract void onTouchLongClick();
        
        public abstract void onTextClicked();
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/view/AudioMediaSwitcher$AudioMediaSwitcherListener$Companion;", "", "()V", "CURRENT_MEDIA", "", "NEXT_MEDIA", "PREVIOUS_MEDIA", "pope-player_debug"})
        public static final class Companion {
            public static final int PREVIOUS_MEDIA = 1;
            public static final int CURRENT_MEDIA = 2;
            public static final int NEXT_MEDIA = 3;
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/view/AudioMediaSwitcher$EmptySwitcherListener;", "Lcom/dewords/pope/gui/view/AudioMediaSwitcher$AudioMediaSwitcherListener;", "()V", "onMediaSwitched", "", "position", "", "onMediaSwitching", "onTextClicked", "onTouchClick", "onTouchDown", "onTouchLongClick", "onTouchUp", "pope-player_debug"})
    public static final class EmptySwitcherListener implements com.dewords.pope.gui.view.AudioMediaSwitcher.AudioMediaSwitcherListener {
        @org.jetbrains.annotations.NotNull()
        public static final com.dewords.pope.gui.view.AudioMediaSwitcher.EmptySwitcherListener INSTANCE = null;
        
        private EmptySwitcherListener() {
            super();
        }
        
        @java.lang.Override()
        public void onMediaSwitching() {
        }
        
        @java.lang.Override()
        public void onMediaSwitched(int position) {
        }
        
        @java.lang.Override()
        public void onTouchDown() {
        }
        
        @java.lang.Override()
        public void onTouchUp() {
        }
        
        @java.lang.Override()
        public void onTouchClick() {
        }
        
        @java.lang.Override()
        public void onTouchLongClick() {
        }
        
        @java.lang.Override()
        public void onTextClicked() {
        }
    }
}