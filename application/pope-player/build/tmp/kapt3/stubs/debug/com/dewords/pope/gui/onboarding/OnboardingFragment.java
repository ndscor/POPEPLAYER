package com.dewords.pope.gui.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/dewords/pope/gui/onboarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onboardingFragmentListener", "Lcom/dewords/pope/gui/onboarding/OnboardingFragmentListener;", "getOnboardingFragmentListener", "()Lcom/dewords/pope/gui/onboarding/OnboardingFragmentListener;", "setOnboardingFragmentListener", "(Lcom/dewords/pope/gui/onboarding/OnboardingFragmentListener;)V", "getDefaultViewForTalkback", "Landroid/view/View;", "onResume", "", "pope-player_debug"})
public abstract class OnboardingFragment extends androidx.fragment.app.Fragment {
    public com.dewords.pope.gui.onboarding.OnboardingFragmentListener onboardingFragmentListener;
    
    public OnboardingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.onboarding.OnboardingFragmentListener getOnboardingFragmentListener() {
        return null;
    }
    
    public final void setOnboardingFragmentListener(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.onboarding.OnboardingFragmentListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View getDefaultViewForTalkback();
    
    @java.lang.Override()
    public void onResume() {
    }
}