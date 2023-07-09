package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0015H\u0002J1\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00050\u001b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J#\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/dewords/pope/util/VLCDownloadManager;", "Landroid/content/BroadcastReceiver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "defaultSubsDirectory", "", "dlDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/dewords/pope/util/SubDlResult;", "downloadManager", "Landroid/app/DownloadManager;", "download", "", "context", "Landroidx/fragment/app/FragmentActivity;", "subtitleItem", "Lcom/dewords/pope/gui/dialogs/SubtitleItem;", "(Landroidx/fragment/app/FragmentActivity;Lcom/dewords/pope/gui/dialogs/SubtitleItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFailed", "id", "", "Landroid/content/Context;", "downloadSuccessful", "localUri", "(JLcom/dewords/pope/gui/dialogs/SubtitleItem;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDownloadPath", "getDownloadState", "Lkotlin/Pair;", "", "downloadId", "getFinalDirectory", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onReceive", "intent", "Landroid/content/Intent;", "onStart", "pope-player_debug"})
public final class VLCDownloadManager extends android.content.BroadcastReceiver implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.VLCDownloadManager INSTANCE = null;
    private static final android.app.DownloadManager downloadManager = null;
    private static kotlinx.coroutines.CompletableDeferred<com.dewords.pope.util.SubDlResult> dlDeferred;
    private static java.lang.String defaultSubsDirectory;
    
    private VLCDownloadManager() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onStart(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onDestroy(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object download(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object downloadSuccessful(long id, com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem, java.lang.String localUri, androidx.fragment.app.FragmentActivity context, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getFinalDirectory(androidx.fragment.app.FragmentActivity context, com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final void downloadFailed(long id, android.content.Context context) {
    }
    
    private final java.lang.String getDownloadPath(com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.String> getDownloadState(long downloadId) {
        return null;
    }
}