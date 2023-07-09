package com.dewords.pope.gui.preferences.hack;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\n\b\u0000\u0010\u0012*\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/gui/preferences/hack/MultiSelectListPreferenceDialogFragmentCompat;", "Landroidx/preference/PreferenceDialogFragmentCompat;", "Landroidx/preference/DialogPreference$TargetFragment;", "()V", "listPreference", "Landroidx/preference/MultiSelectListPreference;", "getListPreference", "()Landroidx/preference/MultiSelectListPreference;", "newValues", "Ljava/util/HashSet;", "", "preferenceChanged", "", "selectedItems", "", "getSelectedItems", "()[Z", "findPreference", "T", "Landroidx/preference/Preference;", "key", "", "(Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "onDialogClosed", "", "positiveResult", "onPrepareDialogBuilder", "builder", "Landroidx/appcompat/app/AlertDialog$Builder;", "Companion", "pope-player_debug"})
public final class MultiSelectListPreferenceDialogFragmentCompat extends androidx.preference.PreferenceDialogFragmentCompat implements androidx.preference.DialogPreference.TargetFragment {
    private final java.util.HashSet<java.lang.String> newValues = null;
    private boolean preferenceChanged = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.preferences.hack.MultiSelectListPreferenceDialogFragmentCompat.Companion Companion = null;
    
    public MultiSelectListPreferenceDialogFragmentCompat() {
        super();
    }
    
    private final androidx.preference.MultiSelectListPreference getListPreference() {
        return null;
    }
    
    private final boolean[] getSelectedItems() {
        return null;
    }
    
    @java.lang.Override()
    protected void onPrepareDialogBuilder(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog.Builder builder) {
    }
    
    @java.lang.Override()
    public void onDialogClosed(boolean positiveResult) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends androidx.preference.Preference>T findPreference(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/preferences/hack/MultiSelectListPreferenceDialogFragmentCompat$Companion;", "", "()V", "newInstance", "Lcom/dewords/pope/gui/preferences/hack/MultiSelectListPreferenceDialogFragmentCompat;", "key", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.preferences.hack.MultiSelectListPreferenceDialogFragmentCompat newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String key) {
            return null;
        }
    }
}