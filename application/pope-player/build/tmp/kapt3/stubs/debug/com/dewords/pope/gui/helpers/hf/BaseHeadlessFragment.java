package com.dewords.pope.gui.helpers.hf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0004J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f*\u00060\u0010j\u0002`\u0011H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/helpers/hf/BaseHeadlessFragment;", "Landroidx/fragment/app/Fragment;", "()V", "model", "Lcom/dewords/pope/gui/helpers/hf/PermissionViewmodel;", "getModel", "()Lcom/dewords/pope/gui/helpers/hf/PermissionViewmodel;", "model$delegate", "Lkotlin/Lazy;", "exit", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "granted", "", "", "Lcom/dewords/pope/gui/helpers/hf/PermissionResults;", "pope-player_debug"})
public class BaseHeadlessFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy model$delegate = null;
    
    public BaseHeadlessFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.gui.helpers.hf.PermissionViewmodel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected final void exit() {
    }
    
    protected final boolean granted(@org.jetbrains.annotations.NotNull()
    int[] $this$granted) {
        return false;
    }
}