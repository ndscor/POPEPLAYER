package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\u000bH&J\u0011\u0010\u0014\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u000b*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/gui/audio/IAudioPlayerAnimator;", "", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "getFoldingFeature", "()Landroidx/window/layout/FoldingFeature;", "setFoldingFeature", "(Landroidx/window/layout/FoldingFeature;)V", "isShowingCover", "", "manageHinge", "", "manageSearchVisibilities", "filter", "onSlide", "slideOffset", "", "showCover", "value", "switchShowCover", "updateBackground", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupAnimator", "Lcom/dewords/pope/gui/audio/AudioPlayer;", "binding", "Lcom/dewords/pope/databinding/AudioPlayerBinding;", "pope-player_debug"})
public abstract interface IAudioPlayerAnimator {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.window.layout.FoldingFeature getFoldingFeature();
    
    public abstract void setFoldingFeature(@org.jetbrains.annotations.Nullable()
    androidx.window.layout.FoldingFeature p0);
    
    public abstract void switchShowCover();
    
    public abstract void manageHinge();
    
    public abstract boolean isShowingCover();
    
    public abstract void showCover(boolean value);
    
    public abstract void setupAnimator(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioPlayer $this$setupAnimator, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.databinding.AudioPlayerBinding binding);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateBackground(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void manageSearchVisibilities(boolean filter);
    
    public abstract void onSlide(float slideOffset);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}