package com.dewords.pope.widget.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u001c\u0010\u0012\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a\u0012\u0010\u0013\u001a\u00020\u000b*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u000b\u001a\u0012\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0006\u00a8\u0006\u0018"}, d2 = {"generateCircularProgressbar", "Landroid/graphics/Bitmap;", "Lcom/dewords/pope/widget/utils/WidgetCacheEntry;", "context", "Landroid/content/Context;", "size", "", "progress", "stroke", "generatePillProgressbar", "getArtistColor", "", "Lorg/videolan/vlc/mediadb/models/Widget;", "palette", "Landroidx/palette/graphics/Palette;", "getBackgroundColor", "getBackgroundSecondaryColor", "getForegroundColor", "getProgressBackgroundColor", "getSeparatorColor", "isLight", "", "lightenOrDarkenColor", "value", "pope-player_debug"})
public final class WidgetUtilsKt {
    
    /**
     * Get the foreground color of the widget depending on its theme
     * @param context the context to use
     * @param palette the palette to be used if needed
     * @return a color
     */
    public static final int getForegroundColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getForegroundColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette) {
        return 0;
    }
    
    /**
     * Get the background color of the widget depending on its theme
     * @param context the context to use
     * @param palette the palette to be used if needed
     * @return a color
     */
    public static final int getBackgroundColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getBackgroundColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette) {
        return 0;
    }
    
    /**
     * Get the background secondary color of the widget depending on its theme. Mostly used for the micro widget 'FAB' color
     * @param context the context to use
     * @param palette the palette to be used if needed
     * @return a color
     */
    public static final int getBackgroundSecondaryColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getBackgroundSecondaryColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette) {
        return 0;
    }
    
    /**
     * Get the Artist text color of the widget depending on its theme
     * @param context the context to use
     * @param palette the palette to be used if needed
     * @return a color
     */
    public static final int getArtistColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getArtistColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette) {
        return 0;
    }
    
    public static final int getProgressBackgroundColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getProgressBackgroundColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    androidx.palette.graphics.Palette palette) {
        return 0;
    }
    
    /**
     * Get the separator view color
     *
     * @param context the context to use
     * @return a color without the transparency added
     */
    public static final int getSeparatorColor(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.mediadb.models.Widget $this$getSeparatorColor, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Get a color variant from a given color. It lightens or darkens it depending on its shade
     *
     * @param value the difference in light to apply
     * @return a new color
     */
    public static final int lightenOrDarkenColor(int $this$lightenOrDarkenColor, float value) {
        return 0;
    }
    
    /**
     * Detects if the color represented by this Int is light
     *
     * @return true if the color is light, false if it's dark
     */
    public static final boolean isLight(int $this$isLight) {
        return false;
    }
    
    /**
     * Generates a circular progress bar [Bitmap]
     *
     * @param context the context to use
     * @param size the size of the generated [Bitmap]
     * @param progress the progress to show in the progress bar
     * @return a progress bar [Bitmap]
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap generateCircularProgressbar(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.utils.WidgetCacheEntry $this$generateCircularProgressbar, @org.jetbrains.annotations.NotNull()
    android.content.Context context, float size, float progress, float stroke) {
        return null;
    }
    
    /**
     * Generates a pill progress bar [Bitmap]
     *
     * @param context the context to use
     * @param progress the progress to show in the progress bar
     * @return a progress bar [Bitmap]
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap generatePillProgressbar(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.utils.WidgetCacheEntry $this$generatePillProgressbar, @org.jetbrains.annotations.NotNull()
    android.content.Context context, float progress) {
        return null;
    }
}