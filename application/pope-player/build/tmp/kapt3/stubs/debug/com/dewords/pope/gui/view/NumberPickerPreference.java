package com.dewords.pope.gui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0014J\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u0019"}, d2 = {"Lcom/dewords/pope/gui/view/NumberPickerPreference;", "Landroidx/preference/DialogPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "doPersistInt", "", "value", "", "getPersistedInt", "getSummary", "", "onGetDefaultValue", "", "a", "Landroid/content/res/TypedArray;", "index", "onSetInitialValue", "restore", "", "defaultValue", "setValue", "Companion", "pope-player_debug"})
public final class NumberPickerPreference extends androidx.preference.DialogPreference {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.view.NumberPickerPreference.Companion Companion = null;
    public static final int FALLBACK_DEFAULT_VALUE = -1;
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 100;
    
    public NumberPickerPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getSummary() {
        return null;
    }
    
    public final int getPersistedInt() {
        return 0;
    }
    
    public final void doPersistInt(int value) {
    }
    
    /**
     * Saves the text to the current data storage.
     *
     * @param text The text to save
     */
    public final void setValue(int value) {
    }
    
    @java.lang.Override()
    protected void onSetInitialValue(boolean restore, @org.jetbrains.annotations.Nullable()
    java.lang.Object defaultValue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object onGetDefaultValue(@org.jetbrains.annotations.Nullable()
    android.content.res.TypedArray a, int index) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/view/NumberPickerPreference$Companion;", "", "()V", "FALLBACK_DEFAULT_VALUE", "", "MAX_VALUE", "MIN_VALUE", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}