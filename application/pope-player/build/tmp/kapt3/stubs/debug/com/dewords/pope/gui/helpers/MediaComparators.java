package com.dewords.pope.gui.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/dewords/pope/gui/helpers/MediaComparators;", "", "()V", "ANDROID_AUTO", "Ljava/util/Comparator;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "getANDROID_AUTO", "()Ljava/util/Comparator;", "BY_TRACK_NUMBER", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getBY_TRACK_NUMBER", "asciiAlphaNumeric", "Ljava/util/BitSet;", "getAsciiAlphaNumeric", "()Ljava/util/BitSet;", "asciiAlphaNumeric$delegate", "Lkotlin/Lazy;", "asciiPunctuation", "getAsciiPunctuation", "asciiPunctuation$delegate", "englishArticles", "", "", "getEnglishArticles", "()[Ljava/lang/String;", "englishArticles$delegate", "buildComparableTitle", "origTitle", "formatArticles", "title", "appendPrefix", "", "removeLeadingPunctuation", "removeNonAlphaNumeric", "pope-player_debug"})
public final class MediaComparators {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.MediaComparators INSTANCE = null;
    private static final kotlin.Lazy englishArticles$delegate = null;
    private static final kotlin.Lazy asciiAlphaNumeric$delegate = null;
    private static final kotlin.Lazy asciiPunctuation$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Comparator<org.videolan.medialibrary.interfaces.media.MediaWrapper> BY_TRACK_NUMBER = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Comparator<org.videolan.medialibrary.media.MediaLibraryItem> ANDROID_AUTO = null;
    
    private MediaComparators() {
        super();
    }
    
    private final java.lang.String[] getEnglishArticles() {
        return null;
    }
    
    private final java.util.BitSet getAsciiAlphaNumeric() {
        return null;
    }
    
    private final java.util.BitSet getAsciiPunctuation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<org.videolan.medialibrary.interfaces.media.MediaWrapper> getBY_TRACK_NUMBER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<org.videolan.medialibrary.media.MediaLibraryItem> getANDROID_AUTO() {
        return null;
    }
    
    private final java.lang.String buildComparableTitle(java.lang.String origTitle) {
        return null;
    }
    
    /**
     * Functionally identical to "^(?i)(the|an|a)\\s+(.*)", and either returning "$2" or "$2, $1"
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatArticles(@org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean appendPrefix) {
        return null;
    }
    
    /**
     * Remove all non-lowercase alphanumeric characters.
     * Functionally identical to replaceAll("[^a-z0-9]+", "")
     */
    private final java.lang.String removeNonAlphaNumeric(java.lang.String title) {
        return null;
    }
    
    /**
     * Find the first occurrence of non-punctuation characters.
     * Functionally identical to replaceAll("^[\t\\x20-\\x2F\\x3A-\\x40\\x5B-\\x60\\x7B-\\x7E]+", "")
     * "[On Android]...Unicode character classes are always used." (see Pattern.UNICODE_CHARACTER_CLASS)
     * therefore "^[\\p{Blank}\\p{Punct}]+" is not a direct substitute.
     */
    private final java.lang.String removeLeadingPunctuation(java.lang.String title) {
        return null;
    }
}