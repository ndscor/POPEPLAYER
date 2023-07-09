package com.dewords.pope.media;

import java.lang.System;

/**
 * The mediaId used in the media session browser is defined as an opaque string token which is left
 * up to the application developer to define. In practicality, mediaIds from multiple applications
 * may be combined into a single data structure, so we use a valid uri, and have have intentionally
 * prefixed it with a namespace. The value is stored as a string to avoid repeated type conversion;
 * however, it may be parsed by the uri class as needed. The uri starts with two forward slashes to
 * disambiguate the authority from the path, per RFC 3986, section 3.
 *
 * The mediaId structure is documented below for reference. The first (or second) letter of each
 * section is used in lieu of the entire word in order to shorten the id throughout the library.
 * The reduction of space consumed by the mediaId enables an increased number of records per page.
 *
 * Root node
 * //com.dewords.pope/{r}oot[?{f}latten=1]
 * Root menu
 * //com.dewords.pope/{r}oot/home
 * //com.dewords.pope/{r}oot/playlist/<id>
 * //com.dewords.pope/{r}oot/{l}ib
 * //com.dewords.pope/{r}oot/stream
 * Home menu
 * //com.dewords.pope/{r}oot/home/shuffle_all
 * //com.dewords.pope/{r}oot/home/last_added[?{i}ndex=<track num>]
 * //com.dewords.pope/{r}oot/home/history[?{i}ndex=<track num>]
 * Library menu
 * //com.dewords.pope/{r}oot/{l}ib/a{r}tist[?{p}age=<page num>]
 * //com.dewords.pope/{r}oot/{l}ib/a{r}tist/<id>
 * //com.dewords.pope/{r}oot/{l}ib/a{l}bum[?{p}age=<page num>]
 * //com.dewords.pope/{r}oot/{l}ib/a{l}bum/<id>
 * //com.dewords.pope/{r}oot/{l}ib/{t}rack[?{p}age=<page num>]
 * //com.dewords.pope/{r}oot/{l}ib/{t}rack[?{p}age=<page num>][&{i}ndex=<track num>]
 * //com.dewords.pope/{r}oot/{l}ib/{g}enre[?{p}age=<page num>]
 * //com.dewords.pope/{r}oot/{l}ib/{g}enre/<id>
 * Media
 * //com.dewords.pope/media/<id>
 * Errors
 * //com.dewords.pope/error/media
 * //com.dewords.pope/error/playlist
 * Search
 * //com.dewords.pope/search?query=<query>
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/dewords/pope/media/MediaSessionBrowser;", "", "()V", "Companion", "pope-player_debug"})
public final class MediaSessionBrowser {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.media.MediaSessionBrowser.Companion Companion = null;
    private static final java.lang.String TAG = "VLC/MediaSessionBrowser";
    private static final com.dewords.pope.media.MediaSessionBrowser instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_ROOT = "//com.dewords.pope.debug/r";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_ROOT_NO_TABS = "//com.dewords.pope.debug/r?f=1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_MEDIA = "//com.dewords.pope.debug/r/media";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_SEARCH = "//com.dewords.pope.debug/r/search";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_SUGGESTED = "//com.dewords.pope.debug/r/suggested";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_NO_MEDIA = "//com.dewords.pope.debug/r/error/media";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_NO_PLAYLIST = "//com.dewords.pope.debug/r/error/playlist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_HOME = "//com.dewords.pope.debug/r/home";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_PLAYLIST = "//com.dewords.pope.debug/r/playlist";
    private static final java.lang.String ID_LIBRARY = "//com.dewords.pope.debug/r/l";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_STREAM = "//com.dewords.pope.debug/r/stream";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_SHUFFLE_ALL = "//com.dewords.pope.debug/r/home/shuffle_all";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_LAST_ADDED = "//com.dewords.pope.debug/r/home/last_added";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_HISTORY = "//com.dewords.pope.debug/r/home/history";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_ARTIST = "//com.dewords.pope.debug/r/l/r";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_ALBUM = "//com.dewords.pope.debug/r/l/l";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_TRACK = "//com.dewords.pope.debug/r/l/t";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_GENRE = "//com.dewords.pope.debug/r/l/g";
    public static final int MAX_HISTORY_SIZE = 100;
    public static final int MAX_COVER_ART_ITEMS = 50;
    private static final int MAX_SUGGESTED_SIZE = 15;
    public static final int MAX_RESULT_SIZE = 800;
    
    public MediaSessionBrowser() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\'H\u0007J]\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0010\u0010)\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010-\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020%2\b\b\u0002\u0010/\u001a\u00020%H\u0002\u00a2\u0006\u0002\u00100J\u0018\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0002J&\u00104\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00042\u0006\u00105\u001a\u000206H\u0002J\u000e\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020+J\u001a\u00109\u001a\u00020\'2\b\b\u0002\u0010:\u001a\u00020\u00172\b\b\u0002\u0010;\u001a\u00020\u0017J6\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u00042\b\b\u0001\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u00172\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u000e\u0010D\u001a\u00020%2\u0006\u00108\u001a\u00020+J?\u0010E\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0*2\u0006\u0010G\u001a\u00020C2\u0006\u0010H\u001a\u00020C2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\'H\u0002\u00a2\u0006\u0002\u0010JJ(\u0010K\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010L\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\'H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2 = {"Lcom/dewords/pope/media/MediaSessionBrowser$Companion;", "", "()V", "ID_ALBUM", "", "ID_ARTIST", "ID_GENRE", "ID_HISTORY", "ID_HOME", "ID_LAST_ADDED", "ID_LIBRARY", "ID_MEDIA", "ID_NO_MEDIA", "ID_NO_PLAYLIST", "ID_PLAYLIST", "ID_ROOT", "ID_ROOT_NO_TABS", "ID_SEARCH", "ID_SHUFFLE_ALL", "ID_STREAM", "ID_SUGGESTED", "ID_TRACK", "MAX_COVER_ART_ITEMS", "", "MAX_HISTORY_SIZE", "MAX_RESULT_SIZE", "MAX_SUGGESTED_SIZE", "TAG", "instance", "Lcom/dewords/pope/media/MediaSessionBrowser;", "browse", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "context", "Landroid/content/Context;", "parentId", "isShuffling", "", "rootHints", "Landroid/os/Bundle;", "buildMediaItems", "list", "", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "groupTitle", "limitSize", "suggestionMode", "androidAuto", "(Landroid/content/Context;Ljava/lang/String;[Lorg/videolan/medialibrary/media/MediaLibraryItem;Ljava/lang/String;ZZZ)Ljava/util/List;", "buildRangeLabel", "firstTitle", "lastTitle", "buildSuggestions", "ml", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "generateMediaId", "libraryItem", "getContentStyle", "browsableHint", "playableHint", "getPlayAllBuilder", "Landroid/support/v4/media/MediaDescriptionCompat$Builder;", "ctx", "mediaId", "title", "trackCount", "uri", "Landroid/net/Uri;", "isMediaAudio", "paginateLibrary", "mediaList", "parentIdUri", "iconUri", "extras", "([Lorg/videolan/medialibrary/media/MediaLibraryItem;Landroid/net/Uri;Landroid/net/Uri;Landroid/os/Bundle;)Ljava/util/List;", "search", "query", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.WorkerThread()
        public final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> browse(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String parentId, boolean isShuffling, @org.jetbrains.annotations.Nullable()
        android.os.Bundle rootHints) {
            return null;
        }
        
        /**
         * The search method is passed a simple query string absent metadata indicating
         * the user's intent to load a playlist, genre, artist, album, or song. This is slightly different
         * than PlaybackService.onPlayFromSearch (which is also invoked by voice search) and allows
         * the user to navigate to other content via on-screen menus.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.WorkerThread()
        public final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> search(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String query, @org.jetbrains.annotations.Nullable()
        android.os.Bundle rootHints) {
            return null;
        }
        
        /**
         * This function constructs a list of suggestions to display in driving mode. A max of fifteen
         * items are returned to the caller. The first item is always shuffle all.
         */
        private final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> buildSuggestions(android.content.Context context, java.lang.String parentId, org.videolan.medialibrary.interfaces.Medialibrary ml) {
            return null;
        }
        
        /**
         * This function constructs a collection of MediaBrowserCompat.MediaItems for each applicable
         * array element in the MediaLibraryItems list passed from either the browse or search methods.
         *
         * @param context Application context to resolve string resources
         * @param parentId Identifies the position in the menu hierarchy. The browse function
         * will pass the argument from the calling application. The search function will use a
         * placeholder value to act as if the user navigated to the location.
         * @param list MediaLibraryItems to process into MediaBrowserCompat.MediaItems
         * @param groupTitle Common heading to group items (unused if null)
         * @param limitSize Limit the number of items returned (default is false)
         * @return List containing fully constructed MediaBrowser MediaItem
         */
        private final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> buildMediaItems(android.content.Context context, java.lang.String parentId, org.videolan.medialibrary.media.MediaLibraryItem[] list, java.lang.String groupTitle, boolean limitSize, boolean suggestionMode, boolean androidAuto) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle getContentStyle(int browsableHint, int playableHint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String generateMediaId(@org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem libraryItem) {
            return null;
        }
        
        public final boolean isMediaAudio(@org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.media.MediaLibraryItem libraryItem) {
            return false;
        }
        
        /**
         * At present Android Auto has no ability to directly handle paging so we must limit the size of the result
         * to avoid returning a parcel which exceeds the size limitations. We break the results into another
         * layer of browsable drill-downs labeled "start - finish" for each entry type.
         */
        private final java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> paginateLibrary(org.videolan.medialibrary.media.MediaLibraryItem[] mediaList, android.net.Uri parentIdUri, android.net.Uri iconUri, android.os.Bundle extras) {
            return null;
        }
        
        private final java.lang.String buildRangeLabel(java.lang.String firstTitle, java.lang.String lastTitle) {
            return null;
        }
        
        private final android.support.v4.media.MediaDescriptionCompat.Builder getPlayAllBuilder(android.content.Context ctx, java.lang.String mediaId, @androidx.annotation.StringRes()
        int title, int trackCount, android.net.Uri uri) {
            return null;
        }
    }
}