package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0011\u001a\u00020\u000eJ#\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/repository/WidgetRepository;", "", "widgetDao", "Lcom/dewords/pope/database/WidgetDao;", "(Lcom/dewords/pope/database/WidgetDao;)V", "addWidget", "", "widget", "Lcom/dewords/pope/mediadb/models/Widget;", "(Lcom/dewords/pope/mediadb/models/Widget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNew", "context", "Landroid/content/Context;", "appWidgetId", "", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWidget", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWidgets", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWidget", "getWidgetFlow", "Lkotlinx/coroutines/flow/Flow;", "updateWidget", "preventCacheClear", "", "(Lcom/dewords/pope/mediadb/models/Widget;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "pope-player_debug"})
public final class WidgetRepository {
    private final com.dewords.pope.database.WidgetDao widgetDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.WidgetRepository.Companion Companion = null;
    
    public WidgetRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.WidgetDao widgetDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllWidgets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dewords.pope.mediadb.models.Widget>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWidget(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.mediadb.models.Widget> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.dewords.pope.mediadb.models.Widget> getWidgetFlow(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addWidget(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateWidget(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.mediadb.models.Widget widget, boolean preventCacheClear, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteWidget(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createNew(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int appWidgetId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dewords.pope.mediadb.models.Widget> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/WidgetRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/WidgetRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.WidgetRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}