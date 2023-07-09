package com.dewords.pope.interfaces;



import static com.dewords.pope.gui.preferences.PreferencesActivity.KEY_ACCENT_COLOR;
import static com.dewords.pope.gui.preferences.PreferencesActivity.KEY_PRIMARY_COLOR;
import static com.dewords.pope.gui.preferences.PreferencesActivity.KEY_THEME_STYLE;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

import com.dewords.pope.R;
import com.dewords.pope.gui.preferences.PreferencesActivity;


public class ThemePreferenceFragment extends PreferenceFragment
		implements OnPreferenceChangeListener, Preference.OnPreferenceClickListener{

	public ThemePreferenceFragment() {
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pref_theme);
		PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("ThemePreferenceScreen");
		
		Preference preferencePrimaryColor = findPreference(KEY_PRIMARY_COLOR);
		preferencePrimaryColor.setOnPreferenceChangeListener(this);
		preferencePrimaryColor.setOnPreferenceClickListener(this);

		findPreference(KEY_ACCENT_COLOR).setOnPreferenceClickListener(this);

		Preference preferenceThemeStyle = findPreference(KEY_THEME_STYLE);
		preferenceThemeStyle.setOnPreferenceChangeListener(this);
		preferenceThemeStyle.setOnPreferenceClickListener(this);


	}

	@Override
	public boolean onPreferenceChange(Preference preference, Object newValue) {
        ((PreferencesActivity)getActivity()).changeActionBarColor(Integer.valueOf(newValue.toString()));
		getActivity().recreate();
		return true;
	}

	@Override
	public boolean onPreferenceClick(Preference preference) {
		return false;
	}
}