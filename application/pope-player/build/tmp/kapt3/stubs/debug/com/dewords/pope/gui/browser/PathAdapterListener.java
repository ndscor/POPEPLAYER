package com.dewords.pope.gui.browser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/gui/browser/PathAdapterListener;", "", "backTo", "", "tag", "", "currentContext", "Landroid/content/Context;", "getPathOperationDelegate", "Lcom/dewords/pope/viewmodels/browser/IPathOperationDelegate;", "showRoot", "", "pope-player_debug"})
public abstract interface PathAdapterListener {
    
    public abstract void backTo(@org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context currentContext();
    
    public abstract boolean showRoot();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dewords.pope.viewmodels.browser.IPathOperationDelegate getPathOperationDelegate();
}