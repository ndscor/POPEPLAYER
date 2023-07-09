package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ.\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\r0\f8F\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/dewords/pope/repository/ExternalSubRepository;", "", "externalSubDao", "Lcom/dewords/pope/database/ExternalSubDao;", "coroutineContextProvider", "Lorg/videolan/tools/CoroutineContextProvider;", "(Lcom/dewords/pope/database/ExternalSubDao;Lorg/videolan/tools/CoroutineContextProvider;)V", "_downloadingSubtitles", "Lorg/videolan/tools/livedata/LiveDataMap;", "", "Lcom/dewords/pope/gui/dialogs/SubtitleItem;", "downloadingSubtitles", "Landroidx/lifecycle/LiveData;", "", "getDownloadingSubtitles$annotations", "()V", "getDownloadingSubtitles", "()Landroidx/lifecycle/LiveData;", "addDownloadingItem", "", "key", "item", "deleteSubtitle", "mediaPath", "", "idSubtitle", "getDownloadedSubtitles", "", "Lcom/dewords/pope/mediadb/models/ExternalSub;", "mediaUri", "Landroid/net/Uri;", "getDownloadingSubtitle", "removeDownloadingItem", "saveDownloadedSubtitle", "Lkotlinx/coroutines/Job;", "subtitlePath", "language", "movieReleaseName", "Companion", "pope-player_debug"})
public final class ExternalSubRepository {
    private final com.dewords.pope.database.ExternalSubDao externalSubDao = null;
    private final org.videolan.tools.CoroutineContextProvider coroutineContextProvider = null;
    private org.videolan.tools.livedata.LiveDataMap<java.lang.Long, com.dewords.pope.gui.dialogs.SubtitleItem> _downloadingSubtitles;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.ExternalSubRepository.Companion Companion = null;
    
    public ExternalSubRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.ExternalSubDao externalSubDao, @org.jetbrains.annotations.NotNull()
    org.videolan.tools.CoroutineContextProvider coroutineContextProvider) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    public static void getDownloadingSubtitles$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.Long, com.dewords.pope.gui.dialogs.SubtitleItem>> getDownloadingSubtitles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveDownloadedSubtitle(@org.jetbrains.annotations.NotNull()
    java.lang.String idSubtitle, @org.jetbrains.annotations.NotNull()
    java.lang.String subtitlePath, @org.jetbrains.annotations.NotNull()
    java.lang.String mediaPath, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String movieReleaseName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.mediadb.models.ExternalSub>> getDownloadedSubtitles(@org.jetbrains.annotations.NotNull()
    android.net.Uri mediaUri) {
        return null;
    }
    
    public final void deleteSubtitle(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaPath, @org.jetbrains.annotations.NotNull()
    java.lang.String idSubtitle) {
    }
    
    public final void addDownloadingItem(long key, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.SubtitleItem item) {
    }
    
    public final void removeDownloadingItem(long key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.gui.dialogs.SubtitleItem getDownloadingSubtitle(long key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/ExternalSubRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/ExternalSubRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.ExternalSubRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}