package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\r"}, d2 = {"setConstraintPercent", "", "view", "Landroidx/constraintlayout/widget/Guideline;", "percent", "", "setPlaybackTime", "Landroid/widget/TextView;", "length", "", "time", "setProgressMax", "Landroid/widget/SeekBar;", "pope-player_debug"})
public final class VideoPlayerActivityKt {
    
    @androidx.databinding.BindingAdapter(value = {"length", "time"})
    public static final void setPlaybackTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, long length, long time) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"constraintPercent"})
    public static final void setConstraintPercent(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.Guideline view, float percent) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mediamax"})
    public static final void setProgressMax(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar view, long length) {
    }
}