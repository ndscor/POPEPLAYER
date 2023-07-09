package androidx.appcompat.app;

import java.lang.System;

/**
 * Context wrapping used to force the locale in all activities
 * See https://stackoverflow.com/a/58004553
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J#\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016*\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\u0012\u0010&\u001a\u00020\u00052\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u0012\u0010-\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0012\u0010/\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010+H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\u0012\u00104\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u00104\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0018H\u0016J\u0010\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u000bH\u0016J\u0010\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0018H\u0016J\u0012\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0018H\u0016J\u0012\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Landroidx/appcompat/app/BaseContextWrappingDelegate;", "Landroidx/appcompat/app/AppCompatDelegate;", "superDelegate", "(Landroidx/appcompat/app/AppCompatDelegate;)V", "addContentView", "", "v", "Landroid/view/View;", "lp", "Landroid/view/ViewGroup$LayoutParams;", "applyDayNight", "", "attachBaseContext2", "Landroid/content/Context;", "context", "createView", "parent", "name", "", "attrs", "Landroid/util/AttributeSet;", "findViewById", "T", "id", "", "(I)Landroid/view/View;", "getDrawerToggleDelegate", "Landroidx/appcompat/app/ActionBarDrawerToggle$Delegate;", "getLocalNightMode", "getMenuInflater", "Landroid/view/MenuInflater;", "getSupportActionBar", "Landroidx/appcompat/app/ActionBar;", "hasWindowFeature", "featureId", "installViewFactory", "invalidateOptionsMenu", "isHandleNativeActionModesEnabled", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPostCreate", "onPostResume", "onSaveInstanceState", "outState", "onStart", "onStop", "requestWindowFeature", "setContentView", "resId", "setHandleNativeActionModesEnabled", "enabled", "setLocalNightMode", "mode", "setSupportActionBar", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setTheme", "themeResId", "setTitle", "title", "", "startSupportActionMode", "Landroidx/appcompat/view/ActionMode;", "callback", "Landroidx/appcompat/view/ActionMode$Callback;", "wrap", "pope-player_debug"})
public final class BaseContextWrappingDelegate extends androidx.appcompat.app.AppCompatDelegate {
    private final androidx.appcompat.app.AppCompatDelegate superDelegate = null;
    
    public BaseContextWrappingDelegate(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatDelegate superDelegate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.app.ActionBar getSupportActionBar() {
        return null;
    }
    
    @java.lang.Override()
    public void setSupportActionBar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.MenuInflater getMenuInflater() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPostResume() {
    }
    
    @java.lang.Override()
    public void setTheme(int themeResId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <T extends android.view.View>T findViewById(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void setContentView(int resId) {
    }
    
    @java.lang.Override()
    public void setContentView(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams lp) {
    }
    
    @java.lang.Override()
    public void addContentView(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup.LayoutParams lp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context attachBaseContext2(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence title) {
    }
    
    @java.lang.Override()
    public void invalidateOptionsMenu() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return null;
    }
    
    @java.lang.Override()
    public boolean requestWindowFeature(int featureId) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasWindowFeature(int featureId) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.view.ActionMode startSupportActionMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode.Callback callback) {
        return null;
    }
    
    @java.lang.Override()
    public void installViewFactory() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View createView(@org.jetbrains.annotations.Nullable()
    android.view.View parent, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        return null;
    }
    
    @java.lang.Override()
    public void setHandleNativeActionModesEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public boolean isHandleNativeActionModesEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public boolean applyDayNight() {
        return false;
    }
    
    @java.lang.Override()
    public void setLocalNightMode(int mode) {
    }
    
    @java.lang.Override()
    public int getLocalNightMode() {
        return 0;
    }
    
    private final android.content.Context wrap(android.content.Context context) {
        return null;
    }
}