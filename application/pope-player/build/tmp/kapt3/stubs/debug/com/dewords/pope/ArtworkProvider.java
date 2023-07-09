package com.dewords.pope;

import java.lang.System;

/**
 * This content provider enables callers to retrieve cover artwork cataloged by the VLC Medialibrary.
 *
 * The URI structure was designed interface with Android Auto, which utilizes Glide to cache artwork.
 * Passing a URI is the preferred approach instead of returning a Bitmap embedded within the menu,
 * as the URI is used as the key for the Glide cache. Bitmaps passed directly lack metadata to
 * properly re-retrieve from the cache, often resulting in the display of incorrect imagery.
 *
 * Glide debugging can be enabled via:
 *  adb shell setprop log.tag.Engine VERBOSE
 *  adb shell setprop log.tag.DecodeJob VERBOSE
 *
 * URI Structure
 *
 * The <id> value at the *end* of the URI is used to lookup data within the Medialibrary. Additional
 * information, such as track count and checksum, have been added within the path to trigger
 * expiration of images when the Medialibrary is updated. This was designed avoid using time-based
 * triggers for *all* imagery which results in noticeable flicker and load delays.
 *
 * Medialibrary content:
 * content://com.dewords.pope.artwork/album/<track count>/<id>
 * content://com.dewords.pope.artwork/artist/<track count>/<id>
 * content://com.dewords.pope.artwork/media/<last modified>/<id>
 * content://com.dewords.pope.artwork/play_all/artist/<track count>/<id>
 * content://com.dewords.pope.artwork/play_all/genre/<track count>/<id>
 * content://com.dewords.pope.artwork/play_all/playlist/<CRC32 checksum>/<track count>/<id>
 * content://com.dewords.pope.artwork/shuffle_all/<half day expiration time>/<track count>
 * content://com.dewords.pope.artwork/history/<XOR checksum>/<track count>
 * content://com.dewords.pope.artwork/last_added/<XOR checksum>/<track count>
 *
 * Non-Medialibrary remote cache:
 * content://com.dewords.pope.artwork/remote?path=<encoded uri>
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J3\u0010 \u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00112\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u001eH\u0002J\u0012\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u0016H\u0002J(\u0010,\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0002J\u001c\u00100\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\n\u00103\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u00104\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u00105\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020/2\u0006\u00101\u001a\u00020\u0011H\u0002J\u0014\u00109\u001a\u00020:2\n\u0010;\u001a\u00060<j\u0002`=H\u0002J\b\u0010>\u001a\u00020/H\u0016J\u001a\u0010?\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u0011H\u0016J\u0010\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u0018H\u0002JO\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010E\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u00132\b\u0010F\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0002\u0010GJ\u001c\u0010H\u001a\u0004\u0018\u00010\u00182\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020\rH\u0002J\u0014\u0010L\u001a\u0004\u0018\u00010\u00182\b\u0010B\u001a\u0004\u0018\u00010\u0018H\u0002J;\u0010M\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u0001072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0011\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010NR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006P"}, d2 = {"Lcom/dewords/pope/ArtworkProvider;", "Landroid/content/ContentProvider;", "()V", "ctx", "Landroid/content/Context;", "dateFormatter", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", "getDateFormatter", "()Ljava/lang/ThreadLocal;", "dateFormatter$delegate", "Lkotlin/Lazy;", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "encodeImage", "", "bmp", "Landroid/graphics/Bitmap;", "getCategoryImage", "Landroid/os/ParcelFileDescriptor;", "context", "category", "id", "", "getHistory", "getHomeImage", "key", "list", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "(Landroid/content/Context;Ljava/lang/String;[Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastAdded", "getMediaImage", "mediaId", "getPFDFromBitmap", "bitmap", "getPFDFromByteArray", "byteArray", "getPlayAllImage", "type", "shuffle", "", "getRemoteImage", "path", "getShuffleAll", "getTimestamp", "getType", "insert", "values", "Landroid/content/ContentValues;", "isImageWithinBounds", "logError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onCreate", "openFile", "mode", "padSquare", "src", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "readEmbeddedArtwork", "mw", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "width", "removeTransparency", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "pope-player_debug"})
public final class ArtworkProvider extends android.content.ContentProvider {
    private android.content.Context ctx;
    private final kotlin.Lazy dateFormatter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.ArtworkProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PATH = "path";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALBUM = "album";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENRE = "genre";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA = "media";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTIST = "artist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REMOTE = "remote";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HISTORY = "history";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAYLIST = "playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAY_ALL = "play_all";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_ADDED = "last_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHUFFLE = "shuffle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHUFFLE_ALL = "shuffle_all";
    private static final android.util.LruCache<java.lang.String, byte[]> memCache = null;
    
    public ArtworkProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.ParcelFileDescriptor openFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String mode) {
        return null;
    }
    
    /**
     * Load an image from a remote path and cache it in memory. When a URI is passed to the OS for
     * cover art it is requested from several different places, such as Android Auto, bluetooth, etc.
     * Rather than going over the network repeatedly we request it once and return it internally.
     */
    private final android.os.ParcelFileDescriptor getRemoteImage(android.content.Context ctx, java.lang.String path) {
        return null;
    }
    
    /**
     * Return square artwork for use within the Android Auto album and artist listings.
     *
     * Non-square images are padded for uniformity with getMediaImage, although not technically
     * required for display solely within AA menus. This function does slightly differ from
     * getMediaImage in that results are not cached since AA is the only consumer and Glide within
     * AA performs caching.
     */
    private final android.os.ParcelFileDescriptor getCategoryImage(android.content.Context context, java.lang.String category, long id) {
        return null;
    }
    
    /**
     * This function caches and returns square artwork for display within the Android Auto queue and
     * for the currently playing song. It may be called by half-a-dozen consumers concurrently.
     *
     * For the currently playing song, a URI to this function is always specified which either returns
     * actual cover art or a high resolution orange cone. When a track does *not* have cover art
     * available, the ic_auto_nothumb drawable is passed in the MediaSessionBrowser for the *queue*.
     * By sharing a common URI between the queue and currently playing song, we vastly cut down on
     * the number of calls to the content provider, as the cache sees a higher hit ratio. Users also
     * tend to browse the queue, which effectively pre-loads the artwork.
     *
     * If the artwork is already square on disk, we simply return the file (png, jpg)
     * If the artwork is not square, pad it square based on the max size of the largest dimension (webp)
     * If the artwork is null, or mediaId is 0, return a 512x512 orange cone (webp)
     */
    private final android.os.ParcelFileDescriptor getMediaImage(android.content.Context ctx, long mediaId) {
        return null;
    }
    
    private final android.os.ParcelFileDescriptor getPlayAllImage(android.content.Context ctx, java.lang.String type, long id, boolean shuffle) {
        return null;
    }
    
    private final byte[] getHistory(android.content.Context ctx) {
        return null;
    }
    
    private final byte[] getShuffleAll(android.content.Context ctx) {
        return null;
    }
    
    private final byte[] getLastAdded(android.content.Context ctx) {
        return null;
    }
    
    /**
     * Generate shuffle all, last added, and history images for the home screen.
     */
    private final java.lang.Object getHomeImage(android.content.Context context, java.lang.String key, org.videolan.medialibrary.interfaces.media.MediaWrapper[] list, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        return null;
    }
    
    /**
     * Test if the cover art image is square to determine if padding is required. Also check if the
     * image is larger than 2000x2000px. Images 3000x3000px crash Android Auto.
     */
    private final boolean isImageWithinBounds(java.lang.String path) {
        return false;
    }
    
    /**
     * Android Auto Head Units, in particular Hyundai and perhaps others, will only display cover
     * art on the head-unit's home screen if the image is square. If a *bitmap* is passed, the head-unit
     * stretches it square, typically distorting it. If a *URI* is passed with a non-square image, it does
     * not display at all. We check to see if the image is square, and if not, we pad it by
     * placing it centered on a transparent background.
     */
    private final android.graphics.Bitmap padSquare(android.graphics.Bitmap src) {
        return null;
    }
    
    /**
     * Workaround for Android 13 notification bar media controls. Crossfade animation between old
     * cover art and new cover art does not work correctly with transparency.
     */
    private final android.graphics.Bitmap removeTransparency(android.graphics.Bitmap src) {
        return null;
    }
    
    /**
     * Encode bitmap in WEBP format.
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final byte[] encodeImage(android.graphics.Bitmap bmp) {
        return null;
    }
    
    /**
     * Attempt to directly load embedded artwork.
     */
    private final android.graphics.Bitmap readEmbeddedArtwork(org.videolan.medialibrary.media.MediaLibraryItem mw, int width) {
        return null;
    }
    
    /**
     * Return a ParcelFileDescriptor from a Bitmap encoded in WEBP format. This function writes the
     * compressed data stream directly to the file descriptor with no intermediate byte array.
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final android.os.ParcelFileDescriptor getPFDFromBitmap(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    /**
     * Return a ParcelFileDescriptor from an existing image in a byte array.
     */
    private final android.os.ParcelFileDescriptor getPFDFromByteArray(byte[] byteArray) {
        return null;
    }
    
    private final void logError(java.lang.Exception e) {
    }
    
    private final java.lang.ThreadLocal<java.text.SimpleDateFormat> getDateFormatter() {
        return null;
    }
    
    private final java.lang.String getTimestamp() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onCreate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getType(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
    java.lang.String sortOrder) {
        return null;
    }
    
    @java.lang.Override()
    public int update(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @java.lang.Override()
    public int delete(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String selection, @org.jetbrains.annotations.Nullable()
    java.lang.String[] selectionArgs) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 2\b\b\u0002\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\"J \u0010%\u001a\u0004\u0018\u00010\u00122\u0006\u0010&\u001a\u00020\u00042\u000e\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/dewords/pope/ArtworkProvider$Companion;", "", "()V", "ALBUM", "", "ARTIST", "GENRE", "HISTORY", "LAST_ADDED", "MEDIA", "PATH", "PLAYLIST", "PLAY_ALL", "REMOTE", "SHUFFLE", "SHUFFLE_ALL", "memCache", "Landroid/util/LruCache;", "", "buildMediaUri", "Landroid/net/Uri;", "ctx", "Landroid/content/Context;", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "buildUri", "path", "clear", "", "computeChecksum", "", "list", "", "detectReordering", "", "computeExpiration", "halfDayExpiration", "getOrPutImage", "key", "defaultValue", "Lkotlin/Function0;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized()
        public final synchronized void clear() {
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Synchronized()
        public final synchronized byte[] getOrPutImage(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<byte[]> defaultValue) {
            return null;
        }
        
        /**
         * Compute an expiration time for thumbs we would like to periodically rotate.
         * @param halfDayExpiration If true (default), return the time rounded to midnight,
         * if between midnight and noon, or time rounded to noon, if between noon and midnight.
         * If false, return the current time (will always refresh thumbnail on page load).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String computeExpiration(boolean halfDayExpiration) {
            return null;
        }
        
        /**
         * Construct the URI used to access this content provider
         */
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri buildUri(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx, @org.jetbrains.annotations.Nullable()
        android.net.Uri path) {
            return null;
        }
        
        /**
         * Construct the URI for MediaWrappers
         */
        @org.jetbrains.annotations.NotNull()
        public final android.net.Uri buildMediaUri(@org.jetbrains.annotations.NotNull()
        android.content.Context ctx, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
            return null;
        }
        
        /**
         * Compute either a CRC32 or a simple XOR checksum. For playlists, the CRC32 enables
         * detection if the contents of the playlist are re-ordered. This is important for capturing
         * the cover art change for playlists with videos. For last added and history on the home
         * screen we actually want to ignore re-ordering. If the user likes to play the
         * same songs from their history over and over, it will simply re-sort the history. As XOR
         * is commutative, the value computed will be the same and the cached image will be shown.
         */
        public final long computeChecksum(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> list, boolean detectReordering) {
            return 0L;
        }
    }
}