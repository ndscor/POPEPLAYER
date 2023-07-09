package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\"H\u0007J3\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u001e\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000200J\u0016\u00102\u001a\u00020$2\u0006\u0010*\u001a\u0002032\u0006\u00104\u001a\u000205J\u0016\u00106\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.2\u0006\u00107\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u00109\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010:\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010>\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0016\u0010?\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010D\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010E\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010F\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010G\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u000e\u0010I\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.J\u0016\u0010J\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.2\u0006\u00107\u001a\u00020\u0014J\u001c\u0010K\u001a\u0004\u0018\u0001052\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010L\u001a\u00020MH\u0002J\u000e\u0010N\u001a\u00020M2\u0006\u0010-\u001a\u00020.J\u0006\u0010O\u001a\u00020$J\u001a\u0010P\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010Q\u001a\u0004\u0018\u00010\u0016J\u000e\u0010R\u001a\u00020$2\u0006\u0010-\u001a\u00020.J\u0018\u0010S\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u0010T\u001a\u00020MJ\u0010\u0010U\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0007J\u0010\u0010V\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0007J\u001a\u0010W\u001a\u00020$2\b\u00104\u001a\u0004\u0018\u0001052\b\u0010X\u001a\u0004\u0018\u00010YJ \u0010Z\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010[\u001a\u00020\u00142\b\b\u0002\u0010L\u001a\u00020MJ\u0018\u0010Z\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u0016H\u0007J:\u0010]\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u00162\b\b\u0002\u0010L\u001a\u00020M2\b\b\u0003\u0010^\u001a\u00020\u00142\f\u0010_\u001a\b\u0012\u0004\u0012\u00020$0`H\u0007J\u0018\u0010a\u001a\u0004\u0018\u00010b2\u0006\u0010*\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u0016J\u0010\u0010c\u001a\u00020$2\u0006\u0010*\u001a\u000203H\u0007J>\u0010d\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u00162\b\b\u0002\u0010L\u001a\u00020M2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020$0`2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020$0`H\u0007J\u001a\u0010f\u001a\u00020$2\u0006\u0010g\u001a\u00020h2\n\u0010i\u001a\u0006\u0012\u0002\b\u00030jJ\u0012\u0010f\u001a\u00020$2\n\u0010k\u001a\u0006\u0012\u0002\b\u00030lJ\n\u0010m\u001a\u00020$*\u00020nJ.\u0010o\u001a\u00020$*\u0002032\f\u0010p\u001a\b\u0012\u0004\u0012\u00020r0q2\u0006\u0010s\u001a\u00020M2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020$0`J%\u0010u\u001a\u00020$*\u0002032\f\u0010p\u001a\b\u0012\u0004\u0012\u00020r0v2\u0006\u0010w\u001a\u00020\u0016\u00a2\u0006\u0002\u0010xJ\u0018\u0010u\u001a\u00020$*\u0002032\f\u0010y\u001a\b\u0012\u0004\u0012\u00020r0qJ\u001c\u0010z\u001a\u00020$*\u0002032\u0006\u0010{\u001a\u00020\u00162\b\b\u0002\u0010|\u001a\u00020MJB\u0010}\u001a\u0004\u0018\u00010$*\u00020h2\u0006\u0010-\u001a\u00020.2\b\b\u0001\u0010~\u001a\u00020\u00142\b\b\u0001\u0010\u007f\u001a\u00020\u00142\u0007\u0010\u0080\u0001\u001a\u00020M2\u0007\u0010\u0081\u0001\u001a\u00020MH\u0002\u00a2\u0006\u0003\u0010\u0082\u0001J \u0010\u0083\u0001\u001a\u00020$*\u0002032\u0007\u0010\u0084\u0001\u001a\u00020AH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J\u000b\u0010\u0086\u0001\u001a\u00020M*\u00020.J\u000b\u0010\u0087\u0001\u001a\u00020$*\u00020nJ\u000b\u0010\u0088\u0001\u001a\u00020$*\u000203J\u0014\u0010\u0089\u0001\u001a\u00020$*\u0002032\u0007\u0010\u008a\u0001\u001a\u00020rJ?\u0010\u008b\u0001\u001a\u00020$*\u0002032\u0015\u0010\u008c\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008e\u0001\u0012\u0004\u0012\u00020$0\u008d\u00012\u001b\u0010\u008f\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020$0\u0090\u0001JF\u0010]\u001a\u00020$*\u00030\u0092\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u00162\u001e\u0010_\u001a\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020$0\u0093\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008d\u0001H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0094\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0095\u0001"}, d2 = {"Lcom/dewords/pope/gui/helpers/UiTools;", "", "()V", "DEFAULT_COVER_ALBUM_DRAWABLE", "Landroid/graphics/drawable/BitmapDrawable;", "DEFAULT_COVER_ALBUM_DRAWABLE_BIG", "DEFAULT_COVER_ARTIST_DRAWABLE", "DEFAULT_COVER_ARTIST_DRAWABLE_BIG", "DEFAULT_COVER_AUDIO_AUTO_DRAWABLE", "DEFAULT_COVER_AUDIO_DRAWABLE", "DEFAULT_COVER_AUDIO_DRAWABLE_BIG", "DEFAULT_COVER_FOLDER_DRAWABLE", "DEFAULT_COVER_FOLDER_DRAWABLE_BIG", "DEFAULT_COVER_MOVIE_DRAWABLE", "DEFAULT_COVER_MOVIE_DRAWABLE_BIG", "DEFAULT_COVER_TVSHOW_DRAWABLE", "DEFAULT_COVER_TVSHOW_DRAWABLE_BIG", "DEFAULT_COVER_VIDEO_DRAWABLE", "DEFAULT_COVER_VIDEO_DRAWABLE_BIG", "DELETE_DURATION", "", "TAG", "", "currentNightMode", "getCurrentNightMode", "()I", "setCurrentNightMode", "(I)V", "sHandler", "Landroid/os/Handler;", "blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "blurView", "", "imageView", "Landroid/widget/ImageView;", "colorFilter", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;FILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmExit", "activity", "Landroid/app/Activity;", "deleteSubtitleDialog", "context", "Landroid/content/Context;", "positiveListener", "Landroid/content/DialogInterface$OnClickListener;", "negativeListener", "fillAboutView", "Landroidx/fragment/app/FragmentActivity;", "v", "Landroid/view/View;", "getColorFromAttribute", "attrId", "getDefaultAlbumDrawable", "getDefaultAlbumDrawableBig", "getDefaultArtistDrawable", "getDefaultArtistDrawableBig", "getDefaultAudioAutoDrawable", "getDefaultAudioDrawable", "getDefaultAudioDrawableBig", "getDefaultCover", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getDefaultFolderDrawable", "getDefaultFolderDrawableBig", "getDefaultMovieDrawable", "getDefaultMovieDrawableBig", "getDefaultTvshowDrawable", "getDefaultTvshowDrawableBig", "getDefaultVideoDrawable", "getDefaultVideoDrawableBig", "getResourceFromAttribute", "getSnackAnchorView", "overAudioPlayer", "", "hasSecondaryDisplay", "invalidateBitmaps", "newStorageDetected", "path", "restartDialog", "setKeyboardVisibility", "show", "setOnDragListener", "setRotationAnimation", "setViewOnClickListener", "ocl", "Landroid/view/View$OnClickListener;", "snacker", "stringId", "message", "snackerConfirm", "confirmMessage", "action", "Lkotlin/Function0;", "snackerMessageInfinite", "Lcom/google/android/material/snackbar/Snackbar;", "snackerMissing", "snackerWithCancel", "cancelAction", "updateSortTitles", "menu", "Landroid/view/Menu;", "provider", "Lcom/dewords/pope/providers/medialibrary/MedialibraryProvider;", "sortable", "Lcom/dewords/pope/gui/browser/MediaBrowserFragment;", "addFavoritesIcon", "Landroid/widget/TextView;", "addToGroup", "tracks", "", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "forbidNewGroup", "newGroupListener", "addToPlaylist", "", "key", "(Landroidx/fragment/app/FragmentActivity;[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Ljava/lang/String;)V", "list", "addToPlaylistAsync", "parent", "includeSubfolders", "appendSortOrder", "id", "titleRes", "isCurrent", "desc", "(Landroid/view/Menu;Landroid/content/Context;IIZZ)Lkotlin/Unit;", "createShortcut", "mediaLibraryItem", "(Landroidx/fragment/app/FragmentActivity;Lorg/videolan/medialibrary/media/MediaLibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTablet", "removeDrawables", "showDonations", "showMediaInfo", "mediaWrapper", "showVideoTrack", "menuListener", "Lkotlin/Function1;", "Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$VideoTrackOption;", "trackSelectionListener", "Lkotlin/Function2;", "Lcom/dewords/pope/gui/dialogs/VideoTracksDialog$TrackType;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "pope-player_debug"})
public final class UiTools {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.UiTools INSTANCE = null;
    private static int currentNightMode = 0;
    private static final java.lang.String TAG = "VLC/UiTools";
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_VIDEO_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_AUDIO_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_AUDIO_AUTO_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_ALBUM_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_ARTIST_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_MOVIE_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_TVSHOW_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_FOLDER_DRAWABLE;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_VIDEO_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_AUDIO_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_ALBUM_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_ARTIST_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_MOVIE_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_TVSHOW_DRAWABLE_BIG;
    private static android.graphics.drawable.BitmapDrawable DEFAULT_COVER_FOLDER_DRAWABLE_BIG;
    private static final android.os.Handler sHandler = null;
    private static final int DELETE_DURATION = 3000;
    
    private UiTools() {
        super();
    }
    
    public final int getCurrentNightMode() {
        return 0;
    }
    
    public final void setCurrentNightMode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultVideoDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultAudioDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultAudioAutoDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultFolderDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultAlbumDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultArtistDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultMovieDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultTvshowDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultVideoDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultAudioDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultAlbumDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultArtistDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultMovieDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultTvshowDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultFolderDrawableBig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final android.view.View getSnackAnchorView(android.app.Activity activity, boolean overAudioPlayer) {
        return null;
    }
    
    /**
     * Print an on-screen message to alert the user
     */
    public final void snacker(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int stringId, boolean overAudioPlayer) {
    }
    
    /**
     * Print an on-screen message to alert the user
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void snacker(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Print an on-screen message to alert the user, with undo action
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void snackerConfirm(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean overAudioPlayer, @androidx.annotation.StringRes()
    int confirmMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void snackerConfirm(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$snackerConfirm, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    /**
     * Print an on-screen message to alert the user, with undo action
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void snackerWithCancel(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message, boolean overAudioPlayer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> cancelAction) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.snackbar.Snackbar snackerMessageInfinite(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public final void snackerMissing(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    /**
     * Get a resource id from an attribute id.
     *
     * @param context
     * @param attrId
     * @return the resource id
     */
    public final int getResourceFromAttribute(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int attrId) {
        return 0;
    }
    
    /**
     * Get a color id from an attribute id.
     *
     * @param context
     * @param attrId
     * @return the color id
     */
    public final int getColorFromAttribute(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int attrId) {
        return 0;
    }
    
    public final void setViewOnClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener ocl) {
    }
    
    /**
     * Fill the about main view for mobile and TV
     */
    public final void fillAboutView(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void setKeyboardVisibility(@org.jetbrains.annotations.Nullable()
    android.view.View v, boolean show) {
    }
    
    public final void addToPlaylistAsync(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$addToPlaylistAsync, @org.jetbrains.annotations.NotNull()
    java.lang.String parent, boolean includeSubfolders) {
    }
    
    public final void addToPlaylist(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$addToPlaylist, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> list) {
    }
    
    public final void addToPlaylist(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$addToPlaylist, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper[] tracks, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void addToGroup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$addToGroup, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> tracks, boolean forbidNewGroup, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> newGroupListener) {
    }
    
    /**
     * Creates a shortcut to the media on the launcher
     * @param mediaLibraryItem: the [MediaLibraryItem] to create a shortcut to
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final java.lang.Object createShortcut(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$createShortcut, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem mediaLibraryItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    public final void showVideoTrack(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$showVideoTrack, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.dewords.pope.gui.dialogs.VideoTracksDialog.VideoTrackOption, kotlin.Unit> menuListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.dewords.pope.gui.dialogs.VideoTracksDialog.TrackType, kotlin.Unit> trackSelectionListener) {
    }
    
    public final void showDonations(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$showDonations) {
    }
    
    public final void showMediaInfo(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$showMediaInfo, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper mediaWrapper) {
    }
    
    public final boolean isTablet(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isTablet) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.BitmapDrawable getDefaultCover(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
        return null;
    }
    
    /**
     * Set a blur effect on the whole [ImageView] using [RenderEffect]
     * with a fallback on [RenderScript] if needed
     *
     * @param imageView the [ImageView] to blur
     * @param bitmap the [Bitmap] to display
     * @param radius the blur radius
     * @param colorFilter the color filter to be used on the view depending on the theme
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object blurView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, float radius, int colorFilter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Blur a [Bitmap]. it uses a deprecated API and therefore should not be used
     * except for a fallback for API < 31
     *
     * @param bitmap the [Bitmap] to blur
     * @param radius the bur radius
     * @return a blurred bitmap
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final android.graphics.Bitmap blurBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    /**
     * Blur a [Bitmap]. it uses a deprecated API and therefore should not be used
     * except for a fallback for API < 31
     *
     * @param bitmap the [Bitmap] to blur
     * @param radius the bur radius
     * @return a blurred bitmap
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmOverloads()
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final android.graphics.Bitmap blurBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, float radius) {
        return null;
    }
    
    public final void updateSortTitles(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.providers.medialibrary.MedialibraryProvider<?> provider) {
    }
    
    public final void updateSortTitles(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.browser.MediaBrowserFragment<?> sortable) {
    }
    
    /**
     * Sets a [MenuItem] title and contentDescription depending on the sort it shows
     *
     * @param context the context to be used for strings
     * @param id the [MenuItem] id
     * @param titleRes the string resource to use as a title
     * @param isCurrent is this the current sort
     * @param desc is the sort descending
     */
    private final kotlin.Unit appendSortOrder(android.view.Menu $this$appendSortOrder, android.content.Context context, @androidx.annotation.IdRes()
    int id, @androidx.annotation.StringRes()
    int titleRes, boolean isCurrent, boolean desc) {
        return null;
    }
    
    public final void confirmExit(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void newStorageDetected(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    public final void setOnDragListener(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR2)
    public final void setRotationAnimation(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void restartDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void deleteSubtitleDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener positiveListener, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener negativeListener) {
    }
    
    public final boolean hasSecondaryDisplay(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * Invalidate the default bitmaps that are different in light and dark modes
     */
    public final void invalidateBitmaps() {
    }
    
    public final void addFavoritesIcon(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$addFavoritesIcon) {
    }
    
    public final void removeDrawables(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$removeDrawables) {
    }
}