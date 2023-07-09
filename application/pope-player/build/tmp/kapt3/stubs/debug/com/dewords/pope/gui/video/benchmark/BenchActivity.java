package com.dewords.pope.gui.video.benchmark;

import java.lang.System;

/**
 * BenchActivity is a class that overrides VideoPlayerActivity through ShallowVideoPlayer.
 * BenchActivity can perform several tests:
 * - PLAYBACK:
 * The class just plays the video, sending back statistics to VLCBenchmark.
 * - SCREENSHOTS:
 * The class waits for the video to buffer the first time to do the initial setup.
 * Then a seek is performed to the first screenshot timestamp.
 * Once the buffering is finished, a broadcast is sent to com.dewords.popebenchmark's service
 * to take a screenshot. Screenshots are taken in VLCBenchmark because, as of Android 10,
 * the MediaProjection API previously used to take screenshots now requires user input to
 * accept permission to take a screenshot at every restart of the com.dewords.pope.app, which happens for every test
 * on vlc-android. By using this API in a service in VLCBenchmark, the user is only asked permission
 * once, when the user starts the benchmark.
 * VLCBenchmark then uses a broadcast to ask vlc-android to resume the sample to the next
 * screenshot timestamp or stop if there aren't any left.
 */
@android.annotation.TargetApi(value = 21)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002FGB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\bH\u0002J\u0010\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u0015H\u0002J\u0010\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\u0006H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0002J\b\u00101\u001a\u00020\'H\u0016J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\bH\u0002J\u0010\u00105\u001a\u00020\'2\u0006\u0010+\u001a\u00020\bH\u0002J\u0018\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0014J\u0012\u00109\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\b\u0010<\u001a\u00020\'H\u0014J\u0010\u0010=\u001a\u00020\'2\u0006\u0010>\u001a\u00020?H\u0017J\b\u0010@\u001a\u00020\'H\u0014J\u0012\u0010A\u001a\u00020\'2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020\'H\u0002J\b\u0010E\u001a\u00020\'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/dewords/pope/gui/video/benchmark/BenchActivity;", "Lcom/dewords/pope/gui/video/benchmark/ShallowVideoPlayer;", "()V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "direction", "", "hasLimit", "", "hasVLCFailed", "hasVout", "interval", "", "isHardware", "isScreenshot", "isSeeking", "isSetup", "isSpeed", "lateFrameCounter", "oldHistoryBoolean", "oldOpenglValue", "", "oldRate", "oldRepeating", "position", "positionCounter", "screenshotCount", "screenshotsTimestamp", "", "", "speed", "speedIteration", "stacktraceFile", "timeLimit", "timeOut", "Ljava/lang/Runnable;", "timeoutHandler", "Landroid/os/Handler;", "checkLogs", "", "continueScreenshots", "continueSpeedTest", "converge", "dropped", "errorFinish", "resultString", "exit", "resultCode", "findLimit", "finish", "getStackTrace", "Lkotlinx/coroutines/Job;", "heuristic", "initConvergeance", "loadMedia", "fromStart", "forceUsingNew", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMediaPlayerEvent", "event", "Lorg/videolan/libvlc/MediaPlayer$Event;", "onResume", "onServiceChanged", "service", "Lcom/dewords/pope/PlaybackService;", "seekScreenshot", "setTimeout", "Companion", "ScreenshotBroadcastReceiver", "pope-player_debug"})
public final class BenchActivity extends com.dewords.pope.gui.video.benchmark.ShallowVideoPlayer {
    private java.lang.Runnable timeOut;
    private final android.os.Handler timeoutHandler = null;
    private java.util.List<java.lang.Long> screenshotsTimestamp;
    private boolean isScreenshot = false;
    private int screenshotCount = 0;
    private int lateFrameCounter = 0;
    private boolean isSetup = false;
    private boolean isSeeking = false;
    private boolean hasVLCFailed = false;
    private boolean isHardware = false;
    private boolean hasVout = false;
    private boolean isSpeed = false;
    private float speed = 1.0F;
    private int speedIteration = 0;
    private float interval = 1.0F;
    private int direction = 0;
    private boolean hasLimit = false;
    private float oldRate = 0.0F;
    private int oldRepeating = 0;
    private java.lang.String oldOpenglValue = "-2";
    private boolean oldHistoryBoolean = true;
    private float position = 0.0F;
    private int positionCounter = 0;
    private java.lang.String stacktraceFile;
    private android.content.BroadcastReceiver broadcastReceiver;
    private long timeLimit = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.video.benchmark.BenchActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_TIMESTAMPS = "extra_benchmark_timestamps";
    private static final java.lang.String EXTRA_ACTION_QUALITY = "extra_benchmark_action_quality";
    private static final java.lang.String EXTRA_ACTION_PLAYBACK = "extra_benchmark_action_playback";
    private static final java.lang.String EXTRA_ACTION_SPEED = "extra_benchmark_action_speed";
    private static final java.lang.String EXTRA_ACTION = "extra_benchmark_action";
    private static final java.lang.String EXTRA_HARDWARE = "extra_benchmark_disable_hardware";
    private static final java.lang.String EXTRA_STACKTRACE_FILE = "stacktrace_file";
    private static final java.lang.String EXTRA_TIME_LIMIT = "extra_benchmark_time_limit";
    private static final java.lang.String ACTION_TRIGGER_SCREENSHOT = "com.dewords.popebenchmark.TRIGGER_SCREENSHOT";
    private static final java.lang.String ACTION_CONTINUE_BENCHMARK = "com.dewords.pope.gui.video.benchmark.CONTINUE_BENCHMARK";
    private static final int SPEED_TEST_ITERATION_LIMIT = 5;
    private static final java.lang.String TAG = "VLCBenchmark";
    private static final int RESULT_FAILED = 6;
    private static final int RESULT_NO_HW = 1;
    private static final java.lang.String PREFERENCE_PLAYBACK_HISTORY = "playback_history";
    private static final java.lang.String PREFERENCE_OPENGL = "opengl";
    
    public BenchActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onServiceChanged(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService service) {
    }
    
    @java.lang.Override()
    protected void loadMedia(boolean fromStart, boolean forceUsingNew) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * On some weak devices, the hardware decoder will end up hung.
     * To avoid stopping the benchmark, a timeout is set to stop vlc
     * and return to the benchmark for the next test.
     */
    private final void setTimeout() {
    }
    
    /**
     * Reacts on the event buffering before calling super:
     *
     *
     * if end of buffering, initialises screen info,
     * the projectionManager, and handler used, and starts
     * the activity that asks for the screenshot permission.
     *
     * if end of buffering, and boolean seeking is true
     * trigger screenshot in com.dewords.popebenchmark's service
     *
     * if not end of buffering, and seeking, checks for seek timeouts.
     *
     * @param event mediaPlayer events
     */
    @android.annotation.TargetApi(value = 21)
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    private final void initConvergeance(boolean dropped) {
    }
    
    private final boolean findLimit(boolean dropped) {
        return false;
    }
    
    private final void converge(boolean dropped) {
    }
    
    private final boolean heuristic() {
        return false;
    }
    
    private final void continueSpeedTest() {
    }
    
    private final void continueScreenshots() {
    }
    
    /**
     * Seeks to the position of the next screenshot,
     * triggering the buffering of the video.
     * At the end of the video buffering, the screenshot callback is set.
     */
    private final void seekScreenshot() {
    }
    
    /**
     * Override of VideoPlayerActivity's exit aiming to catch the resultCode
     * if the resultCode is different from RESULT_OK, boolean mVLCFailed is set to true,
     * then we will not override the finish(), and change the resultCode.
     * @param resultCode VideoPlayerActivity's resultCode
     */
    @java.lang.Override()
    public void exit(int resultCode) {
    }
    
    /**
     * To be called when the error is big enough to return to VLCBenchmark
     * @param resultString error description for display in VLCBenchmark
     */
    private final void errorFinish(java.lang.String resultString) {
    }
    
    /**
     * Method reading vlc-android logs so that the benchmark can get the cause
     * of the crash / freeze
     */
    private final kotlinx.coroutines.Job getStackTrace() {
        return null;
    }
    
    /**
     * Method analysing VLC logs to find warnings,
     * and report them to VLCBenchmark
     */
    private final void checkLogs() {
    }
    
    /**
     * Sets up the benchmark statistics to be returned
     * before calling super
     */
    @java.lang.Override()
    public void finish() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/dewords/pope/gui/video/benchmark/BenchActivity$ScreenshotBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/dewords/pope/gui/video/benchmark/BenchActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "pope-player_debug"})
    public final class ScreenshotBroadcastReceiver extends android.content.BroadcastReceiver {
        
        public ScreenshotBroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/dewords/pope/gui/video/benchmark/BenchActivity$Companion;", "", "()V", "ACTION_CONTINUE_BENCHMARK", "", "ACTION_TRIGGER_SCREENSHOT", "EXTRA_ACTION", "EXTRA_ACTION_PLAYBACK", "EXTRA_ACTION_QUALITY", "EXTRA_ACTION_SPEED", "EXTRA_HARDWARE", "EXTRA_STACKTRACE_FILE", "EXTRA_TIMESTAMPS", "EXTRA_TIME_LIMIT", "PREFERENCE_OPENGL", "PREFERENCE_PLAYBACK_HISTORY", "RESULT_FAILED", "", "RESULT_NO_HW", "SPEED_TEST_ITERATION_LIMIT", "TAG", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}