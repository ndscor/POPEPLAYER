package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"JOYSTICK_INPUT_DELAY", "", "MAX_FOV", "", "MIN_FOV", "TOUCH_BRIGHTNESS", "TOUCH_FLAG_AUDIO_VOLUME", "TOUCH_FLAG_BRIGHTNESS", "TOUCH_FLAG_DOUBLE_TAP_SEEK", "TOUCH_FLAG_PLAY", "TOUCH_FLAG_SCALE", "TOUCH_FLAG_SCREENSHOT", "TOUCH_FLAG_SWIPE_SEEK", "TOUCH_IGNORE", "TOUCH_MOVE", "TOUCH_NONE", "TOUCH_SCREENSHOT", "TOUCH_TAP_SEEK", "TOUCH_VOLUME", "pope-player_debug"})
public final class VideoTouchDelegateKt {
    public static final int TOUCH_FLAG_AUDIO_VOLUME = 1;
    public static final int TOUCH_FLAG_BRIGHTNESS = 2;
    public static final int TOUCH_FLAG_DOUBLE_TAP_SEEK = 4;
    public static final int TOUCH_FLAG_PLAY = 8;
    public static final int TOUCH_FLAG_SWIPE_SEEK = 16;
    public static final int TOUCH_FLAG_SCREENSHOT = 32;
    public static final int TOUCH_FLAG_SCALE = 64;
    private static final int TOUCH_NONE = 0;
    private static final int TOUCH_VOLUME = 1;
    private static final int TOUCH_BRIGHTNESS = 2;
    private static final int TOUCH_MOVE = 3;
    private static final int TOUCH_TAP_SEEK = 4;
    private static final int TOUCH_IGNORE = 5;
    private static final int TOUCH_SCREENSHOT = 6;
    private static final float MIN_FOV = 20.0F;
    private static final float MAX_FOV = 150.0F;
    private static final int JOYSTICK_INPUT_DELAY = 300;
}