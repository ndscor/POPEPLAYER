package com.dewords.pope.widget.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/dewords/pope/widget/utils/WidgetUtils;", "", "()V", "getMinimalWidgetSize", "Lkotlin/Pair;", "", "type", "Lcom/dewords/pope/widget/utils/WidgetType;", "getWidgetType", "widget", "Lcom/dewords/pope/mediadb/models/Widget;", "hasEnoughSpaceForSeek", "", "widgetType", "shouldShowSeek", "pope-player_debug"})
public final class WidgetUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.widget.utils.WidgetUtils INSTANCE = null;
    
    private WidgetUtils() {
        super();
    }
    
    /**
     * Calculate the [WidgetType] depending on the widget's settings and size
     *
     * @param widget the widget to check
     * @returnthe [WidgetType] for this widget
     */
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.widget.utils.WidgetType getWidgetType(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget) {
        return null;
    }
    
    /**
     * Minimal size for this widget type
     *
     * @param type the widget type to check
     * @return the minimal size
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getMinimalWidgetSize(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.utils.WidgetType type) {
        return null;
    }
    
    /**
     * Check if the widget has enough space to display the seek icons
     *
     * @param widget the widget to check the size on
     * @param widgetType the current [WidgetType]
     * @return true if the widget has enough space
     */
    public final boolean hasEnoughSpaceForSeek(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.utils.WidgetType widgetType) {
        return false;
    }
    
    /**
     * Check if the widget should show the seek buttons
     *
     * @param widget the widget to check the size on
     * @param widgetType the current [WidgetType]
     * @return true if the widget has enough space and the setting is set to on
     */
    public final boolean shouldShowSeek(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.utils.WidgetType widgetType) {
        return false;
    }
}