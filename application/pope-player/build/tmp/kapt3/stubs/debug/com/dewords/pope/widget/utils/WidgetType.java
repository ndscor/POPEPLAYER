package com.dewords.pope.widget.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/widget/utils/WidgetType;", "", "layout", "", "(Ljava/lang/String;II)V", "getLayout", "()I", "PILL", "MINI", "MICRO", "MACRO", "pope-player_debug"})
public enum WidgetType {
    /*public static final*/ PILL /* = new PILL(0) */,
    /*public static final*/ MINI /* = new MINI(0) */,
    /*public static final*/ MICRO /* = new MICRO(0) */,
    /*public static final*/ MACRO /* = new MACRO(0) */;
    private final int layout = 0;
    
    WidgetType(@androidx.annotation.LayoutRes()
    int layout) {
    }
    
    public final int getLayout() {
        return 0;
    }
}