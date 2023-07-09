package com.dewords.pope.gui.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lcom/dewords/pope/gui/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentFragment", "Lcom/dewords/pope/gui/onboarding/FragmentName;", "getCurrentFragment", "()Lcom/dewords/pope/gui/onboarding/FragmentName;", "setCurrentFragment", "(Lcom/dewords/pope/gui/onboarding/FragmentName;)V", "notificationPermissionAlreadyAsked", "", "getNotificationPermissionAlreadyAsked", "()Z", "setNotificationPermissionAlreadyAsked", "(Z)V", "permissionAlreadyAsked", "getPermissionAlreadyAsked", "setPermissionAlreadyAsked", "permissionType", "Lcom/dewords/pope/gui/onboarding/PermissionType;", "getPermissionType", "()Lcom/dewords/pope/gui/onboarding/PermissionType;", "setPermissionType", "(Lcom/dewords/pope/gui/onboarding/PermissionType;)V", "scanStorages", "getScanStorages", "setScanStorages", "theme", "", "getTheme", "()I", "setTheme", "(I)V", "pope-player_debug"})
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel {
    private boolean permissionAlreadyAsked = false;
    private boolean notificationPermissionAlreadyAsked = false;
    private boolean scanStorages = true;
    @org.jetbrains.annotations.NotNull()
    private com.dewords.pope.gui.onboarding.PermissionType permissionType = com.dewords.pope.gui.onboarding.PermissionType.ALL;
    private int theme;
    @org.jetbrains.annotations.NotNull()
    private com.dewords.pope.gui.onboarding.FragmentName currentFragment = com.dewords.pope.gui.onboarding.FragmentName.WELCOME;
    
    public OnboardingViewModel() {
        super();
    }
    
    public final boolean getPermissionAlreadyAsked() {
        return false;
    }
    
    public final void setPermissionAlreadyAsked(boolean p0) {
    }
    
    public final boolean getNotificationPermissionAlreadyAsked() {
        return false;
    }
    
    public final void setNotificationPermissionAlreadyAsked(boolean p0) {
    }
    
    public final boolean getScanStorages() {
        return false;
    }
    
    public final void setScanStorages(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.onboarding.PermissionType getPermissionType() {
        return null;
    }
    
    public final void setPermissionType(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.onboarding.PermissionType p0) {
    }
    
    public final int getTheme() {
        return 0;
    }
    
    public final void setTheme(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.onboarding.FragmentName getCurrentFragment() {
        return null;
    }
    
    public final void setCurrentFragment(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.onboarding.FragmentName p0) {
    }
}