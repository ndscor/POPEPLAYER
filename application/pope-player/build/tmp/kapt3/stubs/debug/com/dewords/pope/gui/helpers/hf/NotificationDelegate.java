package com.dewords.pope.gui.helpers.hf;

import java.lang.System;

@android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/NotificationDelegate;", "Lcom/dewords/pope/gui/helpers/hf/BaseHeadlessFragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "requestPermission", "Companion", "pope-player_debug"})
public final class NotificationDelegate extends com.dewords.pope.gui.helpers.hf.BaseHeadlessFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.hf.NotificationDelegate.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "VLC/NotificationDelegate";
    private static final videolan.org.commontools.LiveEvent<java.lang.Boolean> notificationAccessGranted = null;
    
    public NotificationDelegate() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void requestPermission() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u00020\u0007*\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/NotificationDelegate$Companion;", "", "()V", "TAG", "", "notificationAccessGranted", "Lvideolan/org/commontools/LiveEvent;", "", "getNotificationPermission", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
        public final java.lang.Object getNotificationPermission(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity $this$getNotificationPermission, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
            return null;
        }
    }
}