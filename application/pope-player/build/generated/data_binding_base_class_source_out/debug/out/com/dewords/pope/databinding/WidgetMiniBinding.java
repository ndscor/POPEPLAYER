// Generated by data binding compiler. Do not edit!
package com.dewords.pope.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dewords.pope.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class WidgetMiniBinding extends ViewDataBinding {
  @NonNull
  public final ImageView appIcon;

  @NonNull
  public final TextView appName;

  @NonNull
  public final TextView artist;

  @NonNull
  public final WidgetContentFullPlayerBinding controls;

  @NonNull
  public final ImageView cover;

  @NonNull
  public final RelativeLayout coverParent;

  @NonNull
  public final ImageView playerContainerBackground;

  @NonNull
  public final ImageView separator;

  @NonNull
  public final TextView songName;

  @NonNull
  public final LinearLayout textContainer;

  @NonNull
  public final ImageView widgetConfigure;

  @NonNull
  public final RelativeLayout widgetContainer;

  protected WidgetMiniBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView appIcon, TextView appName, TextView artist, WidgetContentFullPlayerBinding controls,
      ImageView cover, RelativeLayout coverParent, ImageView playerContainerBackground,
      ImageView separator, TextView songName, LinearLayout textContainer, ImageView widgetConfigure,
      RelativeLayout widgetContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appIcon = appIcon;
    this.appName = appName;
    this.artist = artist;
    this.controls = controls;
    this.cover = cover;
    this.coverParent = coverParent;
    this.playerContainerBackground = playerContainerBackground;
    this.separator = separator;
    this.songName = songName;
    this.textContainer = textContainer;
    this.widgetConfigure = widgetConfigure;
    this.widgetContainer = widgetContainer;
  }

  @NonNull
  public static WidgetMiniBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.widget_mini, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static WidgetMiniBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<WidgetMiniBinding>inflateInternal(inflater, R.layout.widget_mini, root, attachToRoot, component);
  }

  @NonNull
  public static WidgetMiniBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.widget_mini, null, false, component)
   */
  @NonNull
  @Deprecated
  public static WidgetMiniBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<WidgetMiniBinding>inflateInternal(inflater, R.layout.widget_mini, null, false, component);
  }

  public static WidgetMiniBinding bind(@NonNull View view) {
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
  public static WidgetMiniBinding bind(@NonNull View view, @Nullable Object component) {
    return (WidgetMiniBinding)bind(component, view, R.layout.widget_mini);
  }
}
