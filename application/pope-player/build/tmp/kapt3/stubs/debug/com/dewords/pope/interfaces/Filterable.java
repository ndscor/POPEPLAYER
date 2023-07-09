package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/interfaces/Filterable;", "", "allowedToExpand", "", "enableSearchOption", "filter", "", "query", "", "getFilterQuery", "restoreList", "setSearchVisibility", "visible", "pope-player_debug"})
public abstract interface Filterable {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFilterQuery();
    
    public abstract boolean enableSearchOption();
    
    public abstract void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    public abstract void restoreList();
    
    public abstract void setSearchVisibility(boolean visible);
    
    public abstract boolean allowedToExpand();
}