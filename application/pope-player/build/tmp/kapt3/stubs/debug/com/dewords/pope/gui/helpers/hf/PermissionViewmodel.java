package com.dewords.pope.gui.helpers.hf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0013R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/PermissionViewmodel;", "Landroidx/lifecycle/ViewModel;", "()V", "deferredGrant", "Lkotlinx/coroutines/CompletableDeferred;", "", "getDeferredGrant", "()Lkotlinx/coroutines/CompletableDeferred;", "setDeferredGrant", "(Lkotlinx/coroutines/CompletableDeferred;)V", "isCompleted", "()Z", "permissionPending", "getPermissionPending", "permissionRationaleShown", "getPermissionRationaleShown", "setPermissionRationaleShown", "(Z)V", "complete", "", "value", "setupDeferred", "pope-player_debug"})
public final class PermissionViewmodel extends androidx.lifecycle.ViewModel {
    private boolean permissionRationaleShown = false;
    public kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> deferredGrant;
    
    public PermissionViewmodel() {
        super();
    }
    
    public final boolean getPermissionRationaleShown() {
        return false;
    }
    
    public final void setPermissionRationaleShown(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> getDeferredGrant() {
        return null;
    }
    
    public final void setDeferredGrant(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> p0) {
    }
    
    public final boolean getPermissionPending() {
        return false;
    }
    
    public final boolean isCompleted() {
        return false;
    }
    
    public final void complete(boolean value) {
    }
    
    public final void setupDeferred() {
    }
}