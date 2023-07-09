package com.dewords.pope.gui.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/dewords/pope/gui/preferences/PreferencesSubtitles;", "Lcom/dewords/pope/gui/preferences/BasePreferenceFragment;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "preferredSubtitleTrack", "Landroidx/preference/ListPreference;", "settings", "Landroid/content/SharedPreferences;", "subtitlesBackgroundColor", "Lcom/jaredrummler/android/colorpicker/ColorPreferenceCompat;", "subtitlesBackgroundEnabled", "Landroidx/preference/CheckBoxPreference;", "subtitlesBackgroundOpacity", "Landroidx/preference/SeekBarPreference;", "subtitlesBold", "subtitlesColor", "subtitlesOpacity", "subtitlesOutlineColor", "subtitlesOutlineEnabled", "subtitlesOutlineOpacity", "subtitlesOutlineSize", "subtitlesShadowColor", "subtitlesShadowEnabled", "subtitlesShadowOpacity", "subtitlesSize", "getTitleId", "", "getXml", "managePreferenceVisibilities", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSharedPreferenceChanged", "sharedPreferences", "key", "", "onStart", "onStop", "prepareLocaleList", "resetAll", "updatePreferredSubtitleTrack", "pope-player_debug"})
public final class PreferencesSubtitles extends com.dewords.pope.gui.preferences.BasePreferenceFragment implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.SharedPreferences settings;
    private androidx.preference.ListPreference preferredSubtitleTrack;
    private androidx.preference.ListPreference subtitlesSize;
    private androidx.preference.CheckBoxPreference subtitlesBold;
    private androidx.preference.SeekBarPreference subtitlesOpacity;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat subtitlesColor;
    private androidx.preference.CheckBoxPreference subtitlesBackgroundEnabled;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat subtitlesBackgroundColor;
    private androidx.preference.SeekBarPreference subtitlesBackgroundOpacity;
    private androidx.preference.CheckBoxPreference subtitlesShadowEnabled;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat subtitlesShadowColor;
    private androidx.preference.SeekBarPreference subtitlesShadowOpacity;
    private androidx.preference.CheckBoxPreference subtitlesOutlineEnabled;
    private androidx.preference.ListPreference subtitlesOutlineSize;
    private com.jaredrummler.android.colorpicker.ColorPreferenceCompat subtitlesOutlineColor;
    private androidx.preference.SeekBarPreference subtitlesOutlineOpacity;
    
    public PreferencesSubtitles() {
        super();
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void resetAll() {
    }
    
    private final void updatePreferredSubtitleTrack() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    private final void managePreferenceVisibilities() {
    }
    
    private final void prepareLocaleList() {
    }
}