package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH&J\b\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u0016H&J\u0016\u0010\u001e\u001a\u00020\u0016*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/dewords/pope/gui/helpers/INavigator;", "", "appbarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "setAppbarLayout", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "currentFragmentId", "", "getCurrentFragmentId", "()I", "setCurrentFragmentId", "(I)V", "navigationView", "", "Lcom/google/android/material/navigation/NavigationBarView;", "getNavigationView", "()Ljava/util/List;", "setNavigationView", "(Ljava/util/List;)V", "configurationChanged", "", "size", "currentIdIsExtension", "", "getFragmentWidth", "activity", "Landroid/app/Activity;", "reloadPreferences", "setupNavigation", "Lcom/dewords/pope/gui/MainActivity;", "state", "Landroid/os/Bundle;", "pope-player_debug"})
public abstract interface INavigator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.android.material.navigation.NavigationBarView> getNavigationView();
    
    public abstract void setNavigationView(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.android.material.navigation.NavigationBarView> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.appbar.AppBarLayout getAppbarLayout();
    
    public abstract void setAppbarLayout(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout p0);
    
    public abstract int getCurrentFragmentId();
    
    public abstract void setCurrentFragmentId(int p0);
    
    public abstract void setupNavigation(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.MainActivity $this$setupNavigation, @org.jetbrains.annotations.Nullable()
    android.os.Bundle state);
    
    public abstract boolean currentIdIsExtension();
    
    public abstract void reloadPreferences();
    
    public abstract void configurationChanged(int size);
    
    public abstract int getFragmentWidth(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
}