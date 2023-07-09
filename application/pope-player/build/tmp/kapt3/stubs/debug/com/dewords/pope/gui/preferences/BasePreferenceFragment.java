package com.dewords.pope.gui.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$J\b\u0010\u0005\u001a\u00020\u0004H$J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0004J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/gui/preferences/BasePreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "getTitleId", "", "getXml", "loadFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "onCreatePreferences", "bundle", "Landroid/os/Bundle;", "s", "", "onDisplayPreferenceDialog", "preference", "Landroidx/preference/Preference;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "selectPreference", "key", "Companion", "pope-player_debug"})
public abstract class BasePreferenceFragment extends androidx.preference.PreferenceFragmentCompat {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.preferences.BasePreferenceFragment.Companion Companion = null;
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "android.support.v7.preference.PreferenceFragment.DIALOG";
    
    public BasePreferenceFragment() {
        super();
    }
    
    protected abstract int getXml();
    
    protected abstract int getTitleId();
    
    @java.lang.Override()
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, @org.jetbrains.annotations.Nullable()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    protected final void loadFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void onDisplayPreferenceDialog(@org.jetbrains.annotations.NotNull()
    androidx.preference.Preference preference) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void selectPreference(java.lang.String key) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/gui/preferences/BasePreferenceFragment$Companion;", "", "()V", "DIALOG_FRAGMENT_TAG", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}