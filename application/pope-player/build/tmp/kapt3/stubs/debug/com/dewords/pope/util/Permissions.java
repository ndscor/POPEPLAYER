package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u001e\u0010$\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0004J\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J3\u0010+\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00130-H\u0002J\u0018\u00101\u001a\u00020\r2\u0006\u0010\u0014\u001a\u0002022\u0006\u0010(\u001a\u00020\u0004H\u0002J\u000e\u00103\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00104\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00105\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J1\u00106\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00130-J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0016\u00108\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\"\u00109\u001a\u00020\u0013*\u00020\u00152\b\b\u0002\u0010:\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006;"}, d2 = {"Lcom/dewords/pope/util/Permissions;", "", "()V", "PERMISSION_PIP", "", "PERMISSION_SETTINGS_TAG", "PERMISSION_STORAGE_TAG", "PERMISSION_SYSTEM_BRIGHTNESS", "PERMISSION_SYSTEM_DRAW_OVRLAYS", "PERMISSION_SYSTEM_RINGTONE", "PERMISSION_WRITE_STORAGE_TAG", "READ_EXTERNAL_STORAGE", "sAlertDialog", "Landroid/app/Dialog;", "getSAlertDialog", "()Landroid/app/Dialog;", "setSAlertDialog", "(Landroid/app/Dialog;)V", "askWriteStoragePermission", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "exit", "", "callback", "Ljava/lang/Runnable;", "canDrawOverlays", "context", "Landroid/content/Context;", "canReadStorage", "canSendNotifications", "canWriteSettings", "canWriteStorage", "checkDrawOverlaysPermission", "checkPiPPermission", "checkReadStoragePermission", "checkWritePermission", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "checkWriteSettingsPermission", "mode", "createDialog", "createDialogCompat", "createExternalManagerDialog", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "boolean", "createSettingsDialogCompat", "Landroid/app/Activity;", "hasAllAccess", "isPiPAllowed", "showAppSettingsPage", "showExternalPermissionDialog", "showSettingsPermissionDialog", "showStoragePermissionDialog", "requestStoragePermission", "write", "pope-player_debug"})
public final class Permissions {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.Permissions INSTANCE = null;
    public static final int PERMISSION_STORAGE_TAG = 255;
    public static final int PERMISSION_SETTINGS_TAG = 254;
    public static final int PERMISSION_WRITE_STORAGE_TAG = 253;
    public static final int READ_EXTERNAL_STORAGE = 256;
    public static final int PERMISSION_SYSTEM_RINGTONE = 42;
    private static final int PERMISSION_SYSTEM_BRIGHTNESS = 43;
    private static final int PERMISSION_SYSTEM_DRAW_OVRLAYS = 44;
    private static final int PERMISSION_PIP = 45;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog sAlertDialog;
    
    private Permissions() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getSAlertDialog() {
        return null;
    }
    
    public final void setSAlertDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final boolean canDrawOverlays(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean isPiPAllowed(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public final boolean canWriteSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean canReadStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean canSendNotifications(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean hasAllAccess(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.jvm.JvmOverloads()
    public final boolean canWriteStorage() {
        return false;
    }
    
    @kotlin.jvm.JvmOverloads()
    public final boolean canWriteStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean checkReadStoragePermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, boolean exit) {
        return false;
    }
    
    public final void askWriteStoragePermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, boolean exit, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable callback) {
    }
    
    public final void checkDrawOverlaysPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final void checkPiPPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public final void checkWriteSettingsPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, int mode) {
    }
    
    private final void showSettingsPermissionDialog(androidx.fragment.app.FragmentActivity activity, int mode) {
    }
    
    public final void showStoragePermissionDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, boolean exit) {
    }
    
    public final void showExternalPermissionDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener) {
    }
    
    private final android.app.Dialog createDialog(androidx.fragment.app.FragmentActivity activity, boolean exit) {
        return null;
    }
    
    private final android.app.Dialog createExternalManagerDialog(androidx.fragment.app.FragmentActivity activity, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener) {
        return null;
    }
    
    private final android.app.Dialog createDialogCompat(androidx.fragment.app.FragmentActivity activity, boolean exit) {
        return null;
    }
    
    public final void showAppSettingsPage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    private final android.app.Dialog createSettingsDialogCompat(android.app.Activity activity, int mode) {
        return null;
    }
    
    private final void requestStoragePermission(androidx.fragment.app.FragmentActivity $this$requestStoragePermission, boolean write, java.lang.Runnable callback) {
    }
    
    public final boolean checkWritePermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media, @org.jetbrains.annotations.NotNull()
    java.lang.Runnable callback) {
        return false;
    }
}