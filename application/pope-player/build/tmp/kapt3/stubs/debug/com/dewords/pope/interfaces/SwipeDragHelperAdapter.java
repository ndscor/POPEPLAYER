package com.dewords.pope.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/interfaces/SwipeDragHelperAdapter;", "", "onItemDismiss", "", "position", "", "onItemMove", "fromPosition", "toPosition", "onItemMoved", "dragFrom", "dragTo", "pope-player_debug"})
public abstract interface SwipeDragHelperAdapter {
    
    public abstract void onItemMove(int fromPosition, int toPosition);
    
    public abstract void onItemDismiss(int position);
    
    public abstract void onItemMoved(int dragFrom, int dragTo);
}