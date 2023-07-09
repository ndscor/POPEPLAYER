package com.dewords.pope.util;

import java.lang.System;

/**
 * This is a temporary workaround to translate [IMedia.Track.language] sent by libvlc as a string to a real locale.
 * libvlc 4 should expose the ISO 639 code of the track and therefore [LocaleUtil] and vlc_locales.json could be removed then
 *
 * ⚠️ Current limitation: as the language is only exposed in [IMedia.Track.language] that can be retrieved from a media,
 * external tracks (as subtitle from files) won't be checked during the playback. This is because the tracks retrieved from the
 * [MediaPlayer] only have a description and no language. So we have to compare them to the tracks from the media that doesn't
 * include the external tracks.
 *
 * FIXME Remove this when libvlc exposes a track locale ISO code
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/util/LocaleUtil;", "", "()V", "vlcLocaleList", "", "Lcom/dewords/pope/util/LocaleUtil$VLCLocale;", "getVlcLocaleList", "()Ljava/util/List;", "vlcLocaleList$delegate", "Lkotlin/Lazy;", "getLocaleFromVLC", "", "from", "getLocaleName", "toTranslatedLanguage", "entry", "VLCLocale", "pope-player_debug"})
public final class LocaleUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.LocaleUtil INSTANCE = null;
    
    /**
     * The VLC locale list extracted from the assets
     */
    private static final kotlin.Lazy vlcLocaleList$delegate = null;
    
    private LocaleUtil() {
        super();
    }
    
    /**
     * Get a locale name from a locale extracted from libvlc
     * @param from the track language string from libvlc
     *
     * @return a localized string for this language.
     * Fallback on VLC's language name if Android doesn't know the locale and falls back on returning [from] if nothing is found
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocaleName(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
        return null;
    }
    
    /**
     * Get an ISO-639-1 locale string from a Track language sent by libvlc
     * @param from the track language string from libvlc
     *
     * @return an ISO-639-1 locale string. Returns null if nothing is found
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocaleFromVLC(@org.jetbrains.annotations.NotNull()
    java.lang.String from) {
        return null;
    }
    
    /**
     * Get a translated language name from a [VLCLocale]
     * @param entry: the [VLCLocale] to get the language from
     *
     * @return a language string in the user's locale if found by Android.
     * Falls back on VLC's language name if not found
     */
    private final java.lang.String toTranslatedLanguage(com.dewords.pope.util.LocaleUtil.VLCLocale entry) {
        return null;
    }
    
    /**
     * The VLC locale list extracted from the assets
     */
    private final java.util.List<com.dewords.pope.util.LocaleUtil.VLCLocale> getVlcLocaleList() {
        return null;
    }
    
    /**
     * VLC locale object
     * @param language: the language VLC uses
     * @param values: the ISO values (ISO-639-1, ISO-639-2T, ISO-639-2B) when applicable
     *
     * @see [https://code.videolan.org/videolan/vlc/-/blob/master/src/text/iso-639_def.h]
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/util/LocaleUtil$VLCLocale;", "", "language", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "getLanguage", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pope-player_debug"})
    public static final class VLCLocale {
        @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "language")
        private final java.lang.String language = null;
        @org.jetbrains.annotations.NotNull()
        @com.squareup.moshi.Json(name = "values")
        private final java.util.List<java.lang.String> values = null;
        
        /**
         * VLC locale object
         * @param language: the language VLC uses
         * @param values: the ISO values (ISO-639-1, ISO-639-2T, ISO-639-2B) when applicable
         *
         * @see [https://code.videolan.org/videolan/vlc/-/blob/master/src/text/iso-639_def.h]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.util.LocaleUtil.VLCLocale copy(@org.jetbrains.annotations.NotNull()
        java.lang.String language, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> values) {
            return null;
        }
        
        /**
         * VLC locale object
         * @param language: the language VLC uses
         * @param values: the ISO values (ISO-639-1, ISO-639-2T, ISO-639-2B) when applicable
         *
         * @see [https://code.videolan.org/videolan/vlc/-/blob/master/src/text/iso-639_def.h]
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * VLC locale object
         * @param language: the language VLC uses
         * @param values: the ISO values (ISO-639-1, ISO-639-2T, ISO-639-2B) when applicable
         *
         * @see [https://code.videolan.org/videolan/vlc/-/blob/master/src/text/iso-639_def.h]
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * VLC locale object
         * @param language: the language VLC uses
         * @param values: the ISO values (ISO-639-1, ISO-639-2T, ISO-639-2B) when applicable
         *
         * @see [https://code.videolan.org/videolan/vlc/-/blob/master/src/text/iso-639_def.h]
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public VLCLocale(@org.jetbrains.annotations.NotNull()
        java.lang.String language, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> values) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getValues() {
            return null;
        }
    }
}