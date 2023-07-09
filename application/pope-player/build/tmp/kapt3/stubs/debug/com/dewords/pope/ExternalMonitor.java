package com.dewords.pope;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\'H\u0002J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u0010-\u001a\u00020.H\u0016J\u000e\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\"J\u000e\u00102\u001a\u00020$2\u0006\u00101\u001a\u00020\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0004R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0004R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8F\u00a2\u0006\f\u0012\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/dewords/pope/ExternalMonitor;", "Landroid/content/BroadcastReceiver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "actor", "Lkotlinx/coroutines/channels/SendChannel;", "Lcom/dewords/pope/DeviceAction;", "getActor$annotations", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "ctx", "Landroid/content/Context;", "devices", "Lorg/videolan/tools/livedata/LiveDataset;", "Landroid/hardware/usb/UsbDevice;", "getDevices", "()Lorg/videolan/tools/livedata/LiveDataset;", "setDevices", "(Lorg/videolan/tools/livedata/LiveDataset;)V", "registered", "", "storageChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "getStorageChannel$annotations", "storageEvents", "Lkotlinx/coroutines/flow/Flow;", "getStorageEvents$annotations", "getStorageEvents", "()Lkotlinx/coroutines/flow/Flow;", "storageObserver", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "checkNewStorages", "", "notifyNewStorage", "mediaMounted", "Lcom/dewords/pope/MediaMounted;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "subscribeStorageCb", "observer", "unsubscribeStorageCb", "pope-player_debug"})
public final class ExternalMonitor extends android.content.BroadcastReceiver implements androidx.lifecycle.DefaultLifecycleObserver, kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.ExternalMonitor INSTANCE = null;
    private static android.content.Context ctx;
    private static boolean registered = false;
    private static final kotlinx.coroutines.channels.SendChannel<com.dewords.pope.DeviceAction> actor = null;
    private static final kotlinx.coroutines.channels.BroadcastChannel<com.dewords.pope.DeviceAction> storageChannel = null;
    private static java.lang.ref.WeakReference<android.app.Activity> storageObserver;
    @org.jetbrains.annotations.NotNull()
    private static org.videolan.tools.livedata.LiveDataset<android.hardware.usb.UsbDevice> devices;
    
    private ExternalMonitor() {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getActor$annotations() {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getStorageChannel$annotations() {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    public static void getStorageEvents$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.dewords.pope.DeviceAction> getStorageEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<android.hardware.usb.UsbDevice> getDevices() {
        return null;
    }
    
    public final void setDevices(@org.jetbrains.annotations.NotNull()
    org.videolan.tools.livedata.LiveDataset<android.hardware.usb.UsbDevice> p0) {
    }
    
    @java.lang.Override()
    public void onStart(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    private final void checkNewStorages(android.content.Context ctx) {
    }
    
    @java.lang.Override()
    public void onStop(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @kotlin.jvm.Synchronized()
    private final synchronized void notifyNewStorage(com.dewords.pope.MediaMounted mediaMounted) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void subscribeStorageCb(@org.jetbrains.annotations.NotNull()
    android.app.Activity observer) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void unsubscribeStorageCb(@org.jetbrains.annotations.NotNull()
    android.app.Activity observer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
}