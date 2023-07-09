package com.dewords.pope.gui.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/dewords/pope/gui/onboarding/OnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dewords/pope/gui/onboarding/OnboardingFragmentListener;", "()V", "nextButton", "Landroid/widget/Button;", "viewModel", "Lcom/dewords/pope/gui/onboarding/OnboardingViewModel;", "getViewModel", "()Lcom/dewords/pope/gui/onboarding/OnboardingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "askNotificationPermission", "", "askPermission", "manageNextVisibility", "visible", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDone", "onNext", "showFragment", "fragmentName", "Lcom/dewords/pope/gui/onboarding/FragmentName;", "backward", "pope-player_debug"})
public final class OnboardingActivity extends androidx.appcompat.app.AppCompatActivity implements com.dewords.pope.gui.onboarding.OnboardingFragmentListener {
    private android.widget.Button nextButton;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public OnboardingActivity() {
        super();
    }
    
    private final com.dewords.pope.gui.onboarding.OnboardingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showFragment(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.onboarding.FragmentName fragmentName, boolean backward) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDone() {
    }
    
    private final void askPermission() {
    }
    
    private final void askNotificationPermission() {
    }
    
    @java.lang.Override()
    public void onNext() {
    }
    
    public final void manageNextVisibility(boolean visible) {
    }
}