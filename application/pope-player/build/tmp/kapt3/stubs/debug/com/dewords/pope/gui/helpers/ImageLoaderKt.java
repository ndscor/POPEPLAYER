package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u0007\u001a$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0007\u001a$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0007\u001a!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u001a$\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u001a\u001a\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\"\u001a\u00020\u0003H\u0007\u001a\u0018\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020$\u001aI\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\'2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)\u001a\u0018\u0010*\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003\u001a$\u0010*\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u001a$\u0010+\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u000e\u001a3\u0010-\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010.\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/\u001a\u001a\u00100\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u001a\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0007\u001a8\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000eH\u0007\u001a \u00105\u001a\u00020\n2\u0006\u0010\u000b\u001a\u0002062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u001a\u00107\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007\u001a\u001a\u00108\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u000109H\u0007\u001aB\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010<\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010\'2\b\b\u0002\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000eH\u0007\u001a\u001a\u0010?\u001a\u00020\n2\b\b\u0001\u0010@\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\fH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"TAG", "", "defaultImageWidth", "", "defaultImageWidthTV", "placeholderTvBg", "Landroid/graphics/drawable/Drawable;", "sMedialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "constraintRatio", "", "v", "Landroid/view/View;", "isSquare", "", "imageWidth", "downloadIcon", "imageUri", "Landroid/net/Uri;", "tv", "imageUrl", "findInLibrary", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "item", "isMedia", "(Lorg/videolan/medialibrary/media/MediaLibraryItem;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAudioIconDrawable", "Landroid/graphics/drawable/BitmapDrawable;", "context", "Landroid/content/Context;", "type", "big", "getBitmapFromDrawable", "Landroid/graphics/Bitmap;", "drawableId", "getDummyItemIcon", "Lorg/videolan/medialibrary/media/DummyItem;", "getImage", "binding", "Landroidx/databinding/ViewDataBinding;", "card", "(Landroid/view/View;Lorg/videolan/medialibrary/media/MediaLibraryItem;Landroidx/databinding/ViewDataBinding;IZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMediaIconDrawable", "getMoviepediaIconDrawable", "", "getPlaylistOrGenreImage", "width", "(Landroid/view/View;Lorg/videolan/medialibrary/media/MediaLibraryItem;Landroidx/databinding/ViewDataBinding;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageCardViewContent", "content", "imageCardViewTitle", "title", "loadImage", "loadPlaylistImageWithWidth", "Landroid/widget/ImageView;", "placeHolderImageView", "placeHolderView", "", "updateImageView", "bitmap", "target", "vdb", "updateScaleType", "updateImageViewTv", "res", "pope-player_debug"})
public final class ImageLoaderKt {
    private static final org.videolan.medialibrary.interfaces.Medialibrary sMedialibrary = null;
    @kotlin.jvm.Volatile()
    private static volatile int defaultImageWidth = 0;
    private static int defaultImageWidthTV = 0;
    private static final java.lang.String TAG = "ImageLoader";
    private static android.graphics.drawable.Drawable placeholderTvBg;
    
    @androidx.annotation.MainThread()
    @androidx.databinding.BindingAdapter(value = {"media", "imageWidth", "tv", "card"}, requireAll = false)
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem item, int imageWidth, boolean tv, boolean card) {
    }
    
    public static final void loadPlaylistImageWithWidth(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView v, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem item, int imageWidth) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.BitmapDrawable getAudioIconDrawable(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int type, boolean big) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.BitmapDrawable getMediaIconDrawable(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int type, boolean big) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.BitmapDrawable getMoviepediaIconDrawable(@org.jetbrains.annotations.Nullable()
    android.content.Context context, long type, boolean big) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    public static final android.graphics.Bitmap getBitmapFromDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.DrawableRes()
    int drawableId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.BitmapDrawable getMediaIconDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.BitmapDrawable getDummyItemIcon(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.media.DummyItem item) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @androidx.databinding.BindingAdapter(value = {"placeholder"})
    public static final void placeHolderView(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.Object item) {
    }
    
    @androidx.annotation.MainThread()
    @androidx.databinding.BindingAdapter(value = {"placeholderImage"})
    public static final void placeHolderImageView(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.media.MediaLibraryItem item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"icvTitle"})
    public static final void imageCardViewTitle(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"icvContent"})
    public static final void imageCardViewContent(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.String content) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUri", "tv"}, requireAll = false)
    public static final void downloadIcon(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, boolean tv) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl", "tv"}, requireAll = false)
    public static final void downloadIcon(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, boolean tv) {
    }
    
    private static final java.lang.Object getImage(android.view.View v, org.videolan.medialibrary.media.MediaLibraryItem item, androidx.databinding.ViewDataBinding binding, int imageWidth, boolean tv, boolean card, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private static final java.lang.Object getPlaylistOrGenreImage(android.view.View v, org.videolan.medialibrary.media.MediaLibraryItem item, androidx.databinding.ViewDataBinding binding, int width, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public static final void updateImageViewTv(@androidx.annotation.DrawableRes()
    int res, @org.jetbrains.annotations.NotNull()
    android.view.View target) {
    }
    
    @androidx.annotation.MainThread()
    public static final void updateImageView(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    android.view.View target, @org.jetbrains.annotations.Nullable()
    androidx.databinding.ViewDataBinding vdb, boolean updateScaleType, boolean tv, boolean card) {
    }
    
    private static final java.lang.Object findInLibrary(org.videolan.medialibrary.media.MediaLibraryItem item, boolean isMedia, kotlin.coroutines.Continuation<? super org.videolan.medialibrary.media.MediaLibraryItem> continuation) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @androidx.databinding.BindingAdapter(value = {"constraintRatio", "coverWidth"}, requireAll = false)
    public static final void constraintRatio(@org.jetbrains.annotations.NotNull()
    android.view.View v, boolean isSquare, int imageWidth) {
    }
}