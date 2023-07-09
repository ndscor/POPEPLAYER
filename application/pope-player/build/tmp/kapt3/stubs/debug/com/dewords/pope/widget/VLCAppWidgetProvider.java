package com.dewords.pope.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH$J\b\u0010\u000e\u001a\u00020\fH$J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/widget/VLCAppWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "applyUpdate", "", "context", "Landroid/content/Context;", "views", "Landroid/widget/RemoteViews;", "partial", "", "getPlayPauseImage", "", "isPlaying", "getlayout", "onDisabled", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "Companion", "pope-player_debug"})
public abstract class VLCAppWidgetProvider extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.widget.VLCAppWidgetProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/VLCAppWidgetProvider";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_PREFIX = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_INIT = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_UPDATE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_UPDATE_COVER = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_UPDATE_POSITION = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_ENABLED = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_WIDGET_DISABLED = null;
    
    public VLCAppWidgetProvider() {
        super();
    }
    
    protected abstract int getlayout();
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void applyUpdate(android.content.Context context, android.widget.RemoteViews views, boolean partial) {
    }
    
    protected abstract int getPlayPauseImage(boolean isPlaying);
    
    @java.lang.Override()
    public void onEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDisabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/widget/VLCAppWidgetProvider$Companion;", "", "()V", "ACTION_WIDGET_DISABLED", "", "getACTION_WIDGET_DISABLED", "()Ljava/lang/String;", "ACTION_WIDGET_ENABLED", "getACTION_WIDGET_ENABLED", "ACTION_WIDGET_INIT", "getACTION_WIDGET_INIT", "ACTION_WIDGET_PREFIX", "getACTION_WIDGET_PREFIX", "ACTION_WIDGET_UPDATE", "getACTION_WIDGET_UPDATE", "ACTION_WIDGET_UPDATE_COVER", "getACTION_WIDGET_UPDATE_COVER", "ACTION_WIDGET_UPDATE_POSITION", "getACTION_WIDGET_UPDATE_POSITION", "TAG", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_PREFIX() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_INIT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_UPDATE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_UPDATE_COVER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_UPDATE_POSITION() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_ENABLED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_WIDGET_DISABLED() {
            return null;
        }
    }
}