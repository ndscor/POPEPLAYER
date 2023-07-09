package com.dewords.pope.gui.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"CTX_FLAGS_KEY", "", "CTX_MEDIA_KEY", "CTX_POSITION_KEY", "CTX_TITLE_KEY", "showContext", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "receiver", "Lcom/dewords/pope/gui/dialogs/CtxActionReceiver;", "arguments", "Landroid/os/Bundle;", "position", "", "media", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "flags", "", "pope-player_debug"})
public final class ContextSheetKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CTX_TITLE_KEY = "CTX_TITLE_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CTX_POSITION_KEY = "CTX_POSITION_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CTX_FLAGS_KEY = "CTX_FLAGS_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CTX_MEDIA_KEY = "CTX_MEDIA_KEY";
    
    /**
     * Show the bottom sheet containing the context actions
     *
     * @param activity the activity to use to launch the BottomSheet
     * @param receiver the `CtxActionReceiver` managing the result
     * @param arguments the arguments to send to the [VLCBottomSheetDialogFragment]
     */
    private static final void showContext(androidx.fragment.app.FragmentActivity activity, com.dewords.pope.gui.dialogs.CtxActionReceiver receiver, android.os.Bundle arguments) {
    }
    
    /**
     * Show the bottom sheet containing the context actions. Depending on [media] type, it generate the right arguments
     *
     * @param activity the activity to use to launch the BottomSheet
     * @param receiver the `CtxActionReceiver` managing the result
     * @param position the position that the caller may need to manage the result
     * @param media the media used to display the title
     * @param flags the flags describing the actions to be displayed
     */
    public static final void showContext(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.dialogs.CtxActionReceiver receiver, int position, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem media, long flags) {
    }
}