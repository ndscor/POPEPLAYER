package com.dewords.pope.gui.preferences.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001aH\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/dewords/pope/gui/preferences/widgets/PreferencesWidgets;", "Lcom/dewords/pope/gui/preferences/BasePreferenceFragment;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "backgroundPreference", "Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;", "foregroundPreference", "forwardDelay", "Lcom/dewords/pope/gui/view/NumberPickerPreference;", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/dewords/pope/gui/preferences/widgets/SavedColors;", "lightThemePreference", "Landroidx/preference/CheckBoxPreference;", "model", "Lcom/dewords/pope/widget/WidgetViewModel;", "getModel$pope_player_debug", "()Lcom/dewords/pope/widget/WidgetViewModel;", "setModel$pope_player_debug", "(Lcom/dewords/pope/widget/WidgetViewModel;)V", "rewindDelay", "settings", "Landroid/content/SharedPreferences;", "showCover", "showSeek", "getTitleId", "", "getXml", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSharedPreferenceChanged", "sharedPreferences", "key", "", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "saveNewColor", "foreground", "", "newColor", "updateSavedColors", "updateWidgetEntity", "pope-player_debug"})
public final class PreferencesWidgets extends com.dewords.pope.gui.preferences.BasePreferenceFragment implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.SharedPreferences settings;
    private com.squareup.moshi.JsonAdapter<com.dewords.pope.gui.preferences.widgets.SavedColors> jsonAdapter;
    public com.dewords.pope.widget.WidgetViewModel model;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat backgroundPreference;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat foregroundPreference;
    private androidx.preference.CheckBoxPreference lightThemePreference;
    private androidx.preference.CheckBoxPreference showSeek;
    private androidx.preference.CheckBoxPreference showCover;
    private com.dewords.pope.gui.view.NumberPickerPreference forwardDelay;
    private com.dewords.pope.gui.view.NumberPickerPreference rewindDelay;
    
    public PreferencesWidgets() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.widget.WidgetViewModel getModel$pope_player_debug() {
        return null;
    }
    
    public final void setModel$pope_player_debug(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.widget.WidgetViewModel p0) {
    }
    
    @java.lang.Override()
    protected int getXml() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getTitleId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    /**
     * Saves a new color to the shared pref to show it again in the color picker next time
     *
     * @param foreground is this for the foreground color?
     * @param newColor the color to save
     */
    private final void saveNewColor(boolean foreground, int newColor) {
    }
    
    /**
     * Update a color picker colors with saved ones
     *
     * @param foreground is this for the foreground color?
     */
    private final void updateSavedColors(boolean foreground) {
    }
    
    private final void updateWidgetEntity() {
    }
}