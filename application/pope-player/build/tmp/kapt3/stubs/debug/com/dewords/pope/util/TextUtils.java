package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\f\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e\u00a2\u0006\u0002\u0010\u000fJ\'\u0010\f\u001a\u00020\u00062\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000e\"\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e\u00a2\u0006\u0002\u0010\u0011J/\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000e\"\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/util/TextUtils;", "", "()V", "separator", "", "formatChapterTitle", "", "context", "Landroid/content/Context;", "chapterNum", "", "title", "separatedString", "pieces", "", "([Ljava/lang/String;)Ljava/lang/String;", "separatedStringArgs", "(C[Ljava/lang/String;)Ljava/lang/String;", "pope-player_debug"})
public final class TextUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.TextUtils INSTANCE = null;
    
    /**
     * Common string separator used in the whole com.dewords.pope.app
     */
    public static final char separator = '\u00b7';
    
    private TextUtils() {
        super();
    }
    
    /**
     * Create a string separated by the common [separator]
     *
     * @param pieces the strings to join
     * @return a string containing all the [pieces] if they are not blanked, separated by the [separator]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmName(name = "separatedStringArgs")
    public final java.lang.String separatedStringArgs(@org.jetbrains.annotations.NotNull()
    java.lang.String... pieces) {
        return null;
    }
    
    /**
     * Create a string separated by the common [separator]
     *
     * @param pieces the strings to join in an [Array]
     * @return a string containing all the [pieces] if they are not blanked, separated by the [separator]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String separatedString(@org.jetbrains.annotations.NotNull()
    java.lang.String[] pieces) {
        return null;
    }
    
    /**
     * Create a string separated by a custom [separator]
     *
     * @param pieces the strings to join
     * @return a string containing all the [pieces] if they are not blanked, separated by [separator]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmName(name = "separatedStringArgs")
    public final java.lang.String separatedStringArgs(char separator, @org.jetbrains.annotations.NotNull()
    java.lang.String... pieces) {
        return null;
    }
    
    /**
     * Create a string separated by a custom [separator]
     *
     * @param pieces the strings to join in an [Array]
     * @return a string containing all the [pieces] if they are not blanked, separated by [separator]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String separatedString(char separator, @org.jetbrains.annotations.NotNull()
    java.lang.String[] pieces) {
        return null;
    }
    
    /**
     * Format the chapter title.
     * If title is null return "Chapter: <num>"
     * If title contains letters only prepend "Chapter: <title>"
     * If title contains any non alpha characters return as-is
     *
     * @param context the context to use to retrieve the string
     * @param chapterNum the current chapter number
     * @param title the title to format
     * @return a formatted string
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatChapterTitle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int chapterNum, @org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
}