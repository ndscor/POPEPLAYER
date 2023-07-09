package com.dewords.pope.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0011\u0018\u0000 .2\u00020\u0001:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0010J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\u0014\u0010\u001d\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fJ\u0016\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0010J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nJ\u0014\u0010&\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fJ(\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0018H\u0002J\u0006\u0010,\u001a\u00020\u0010J\b\u0010-\u001a\u00020\u0018H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/dewords/pope/media/MediaWrapperList;", "", "()V", "copy", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getCopy", "()Ljava/util/List;", "eventListenerList", "Ljava/util/ArrayList;", "Lcom/dewords/pope/media/MediaWrapperList$EventListener;", "internalList", "isAudioList", "", "()Z", "videoCount", "", "add", "", "media", "addEventListener", "listener", "clear", "getMRL", "", "position", "getMedia", "insert", "isValid", "map", "list", "", "move", "startPosition", "endPosition", "remove", "location", "removeEventListener", "replaceWith", "signalEventListeners", "event", "arg1", "arg2", "mrl", "size", "toString", "Companion", "EventListener", "pope-player_debug"})
public final class MediaWrapperList {
    private final java.util.ArrayList<org.videolan.medialibrary.interfaces.media.MediaWrapper> internalList = null;
    private final java.util.ArrayList<com.dewords.pope.media.MediaWrapperList.EventListener> eventListenerList = null;
    private int videoCount = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.media.MediaWrapperList.Companion Companion = null;
    private static final java.lang.String TAG = "VLC/MediaWrapperList";
    private static final int EVENT_ADDED = 0;
    private static final int EVENT_REMOVED = 1;
    private static final int EVENT_MOVED = 2;
    
    public MediaWrapperList() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    public final synchronized java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> getCopy() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized boolean isAudioList() {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void add(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void addEventListener(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.media.MediaWrapperList.EventListener listener) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeEventListener(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.media.MediaWrapperList.EventListener listener) {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized void signalEventListeners(int event, int arg1, int arg2, java.lang.String mrl) {
    }
    
    /**
     * Clear the media list. (remove all media)
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void clear() {
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized boolean isValid(int position) {
        return false;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void insert(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
    }
    
    /**
     * Move a media from one position to another
     *
     * @param startPosition start position
     * @param endPosition end position
     * @throws IndexOutOfBoundsException
     */
    @kotlin.jvm.Synchronized()
    public final synchronized void move(int startPosition, int endPosition) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void remove(int position) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String location) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized int size() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    public final synchronized org.videolan.medialibrary.interfaces.media.MediaWrapper getMedia(int position) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void replaceWith(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> list) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void map(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> list) {
    }
    
    /**
     * @param position The index of the media in the list
     * @return null if not found
     */
    @kotlin.jvm.Synchronized()
    private final synchronized java.lang.String getMRL(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/media/MediaWrapperList$EventListener;", "", "onItemAdded", "", "index", "", "mrl", "", "onItemMoved", "indexBefore", "indexAfter", "onItemRemoved", "pope-player_debug"})
    public static abstract interface EventListener {
        
        public abstract void onItemAdded(int index, @org.jetbrains.annotations.NotNull()
        java.lang.String mrl);
        
        public abstract void onItemRemoved(int index, @org.jetbrains.annotations.NotNull()
        java.lang.String mrl);
        
        public abstract void onItemMoved(int indexBefore, int indexAfter, @org.jetbrains.annotations.NotNull()
        java.lang.String mrl);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/media/MediaWrapperList$Companion;", "", "()V", "EVENT_ADDED", "", "EVENT_MOVED", "EVENT_REMOVED", "TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}