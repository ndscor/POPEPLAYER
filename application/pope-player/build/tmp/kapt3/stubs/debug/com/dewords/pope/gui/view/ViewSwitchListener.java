package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/dewords/pope/gui/view/ViewSwitchListener;", "", "onBackSwitched", "", "onSwitched", "position", "", "onSwitching", "progress", "", "onTouchClick", "onTouchDown", "onTouchLongClick", "onTouchUp", "pope-player_debug"})
public abstract interface ViewSwitchListener {
    
    public abstract void onSwitching(float progress);
    
    public abstract void onSwitched(int position);
    
    public abstract void onTouchDown();
    
    public abstract void onTouchUp();
    
    public abstract void onTouchClick();
    
    public abstract void onTouchLongClick();
    
    public abstract void onBackSwitched();
}