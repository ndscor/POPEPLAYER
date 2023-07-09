// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import com.dewords.pope.gui.audio.EqualizerFragment;
import com.google.android.material.slider.Slider;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EqualizerBinding extends ViewDataBinding {
  @NonNull
  public final TextView eqTitle;

  @NonNull
  public final LinearLayout equalizerBands;

  @NonNull
  public final SwitchCompat equalizerButton;

  @NonNull
  public final ConstraintLayout equalizerContainer;

  @NonNull
  public final Button equalizerDelete;

  @NonNull
  public final Slider equalizerPreamp;

  @NonNull
  public final AppCompatSpinner equalizerPresets;

  @NonNull
  public final Button equalizerRevert;

  @NonNull
  public final Button equalizerSave;

  @NonNull
  public final SwitchCompat snapBands;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @Bindable
  protected EqualizerFragment.EqualizerState mState;

  protected EqualizerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView eqTitle, LinearLayout equalizerBands, SwitchCompat equalizerButton,
      ConstraintLayout equalizerContainer, Button equalizerDelete, Slider equalizerPreamp,
      AppCompatSpinner equalizerPresets, Button equalizerRevert, Button equalizerSave,
      SwitchCompat snapBands, TextView textView10, TextView textView11) {
    super(_bindingComponent, _root, _localFieldCount);
    this.eqTitle = eqTitle;
    this.equalizerBands = equalizerBands;
    this.equalizerButton = equalizerButton;
    this.equalizerContainer = equalizerContainer;
    this.equalizerDelete = equalizerDelete;
    this.equalizerPreamp = equalizerPreamp;
    this.equalizerPresets = equalizerPresets;
    this.equalizerRevert = equalizerRevert;
    this.equalizerSave = equalizerSave;
    this.snapBands = snapBands;
    this.textView10 = textView10;
    this.textView11 = textView11;
  }

  public abstract void setState(@Nullable EqualizerFragment.EqualizerState state);

  @Nullable
  public EqualizerFragment.EqualizerState getState() {
    return mState;
  }

  @NonNull
  public static EqualizerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.equalizer, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EqualizerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EqualizerBinding>inflateInternal(inflater, R.layout.equalizer, root, attachToRoot, component);
  }

  @NonNull
  public static EqualizerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.equalizer, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EqualizerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EqualizerBinding>inflateInternal(inflater, R.layout.equalizer, null, false, component);
  }

  public static EqualizerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static EqualizerBinding bind(@NonNull View view, @Nullable Object component) {
    return (EqualizerBinding)bind(component, view, R.layout.equalizer);
  }
}
