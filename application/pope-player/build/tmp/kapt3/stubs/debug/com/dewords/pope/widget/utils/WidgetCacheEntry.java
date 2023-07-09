package com.dewords.pope.widget.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u00101\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\t\u00102\u001a\u00020\rH\u00c6\u0003J^\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u00020\u000bH\u00d6\u0001J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020\u0007H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006;"}, d2 = {"Lcom/dewords/pope/widget/utils/WidgetCacheEntry;", "", "widget", "Lcom/dewords/pope/mediadb/models/Widget;", "currentMedia", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "currentCover", "", "palette", "Landroidx/palette/graphics/Palette;", "foregroundColor", "", "playing", "", "currentCoverInvalidated", "(Lcom/dewords/pope/mediadb/models/Widget;Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Ljava/lang/String;Landroidx/palette/graphics/Palette;Ljava/lang/Integer;Ljava/lang/Boolean;Z)V", "getCurrentCover", "()Ljava/lang/String;", "setCurrentCover", "(Ljava/lang/String;)V", "getCurrentCoverInvalidated", "()Z", "setCurrentCoverInvalidated", "(Z)V", "getCurrentMedia", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setCurrentMedia", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "getForegroundColor", "()Ljava/lang/Integer;", "setForegroundColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPalette", "()Landroidx/palette/graphics/Palette;", "setPalette", "(Landroidx/palette/graphics/Palette;)V", "getPlaying", "()Ljava/lang/Boolean;", "setPlaying", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWidget", "()Lcom/dewords/pope/mediadb/models/Widget;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/dewords/pope/mediadb/models/Widget;Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Ljava/lang/String;Landroidx/palette/graphics/Palette;Ljava/lang/Integer;Ljava/lang/Boolean;Z)Lcom/dewords/pope/widget/utils/WidgetCacheEntry;", "equals", "other", "hashCode", "reset", "", "toString", "pope-player_debug"})
public final class WidgetCacheEntry {
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.mediadb.models.Widget widget = null;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.medialibrary.interfaces.media.MediaWrapper currentMedia;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentCover;
    @org.jetbrains.annotations.Nullable()
    private androidx.palette.graphics.Palette palette;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer foregroundColor;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean playing;
    private boolean currentCoverInvalidated;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.widget.utils.WidgetCacheEntry copy(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper currentMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String currentCover, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    java.lang.Integer foregroundColor, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean playing, boolean currentCoverInvalidated) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WidgetCacheEntry(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper currentMedia, @org.jetbrains.annotations.Nullable()
    java.lang.String currentCover, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorInt()
    java.lang.Integer foregroundColor, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean playing, boolean currentCoverInvalidated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.mediadb.models.Widget component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.mediadb.models.Widget getWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper getCurrentMedia() {
        return null;
    }
    
    public final void setCurrentMedia(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentCover() {
        return null;
    }
    
    public final void setCurrentCover(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.palette.graphics.Palette component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.palette.graphics.Palette getPalette() {
        return null;
    }
    
    public final void setPalette(@org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getForegroundColor() {
        return null;
    }
    
    public final void setForegroundColor(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPlaying() {
        return null;
    }
    
    public final void setPlaying(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getCurrentCoverInvalidated() {
        return false;
    }
    
    public final void setCurrentCoverInvalidated(boolean p0) {
    }
    
    public final void reset() {
    }
}