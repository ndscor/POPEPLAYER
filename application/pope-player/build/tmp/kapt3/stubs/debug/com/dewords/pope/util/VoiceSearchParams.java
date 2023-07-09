package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010*\u001a\u00020\u0003H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\tR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000b\u00a8\u0006+"}, d2 = {"Lcom/dewords/pope/util/VoiceSearchParams;", "", "query", "", "extras", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", "album", "getAlbum", "()Ljava/lang/String;", "setAlbum", "(Ljava/lang/String;)V", "artist", "getArtist", "setArtist", "genre", "getGenre", "setGenre", "isAlbumFocus", "", "()Z", "setAlbumFocus", "(Z)V", "isAny", "setAny", "isArtistFocus", "setArtistFocus", "isGenreFocus", "setGenreFocus", "isPlaylistFocus", "setPlaylistFocus", "isSongFocus", "setSongFocus", "isUnstructured", "setUnstructured", "playlist", "getPlaylist", "setPlaylist", "getQuery", "song", "getSong", "setSong", "toString", "pope-player_debug"})
public final class VoiceSearchParams {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String query = null;
    private boolean isAny = false;
    private boolean isUnstructured = false;
    private boolean isGenreFocus = false;
    private boolean isArtistFocus = false;
    private boolean isAlbumFocus = false;
    private boolean isPlaylistFocus = false;
    private boolean isSongFocus = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String genre;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String artist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String album;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String playlist;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String song;
    
    public VoiceSearchParams(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final boolean isAny() {
        return false;
    }
    
    public final void setAny(boolean p0) {
    }
    
    public final boolean isUnstructured() {
        return false;
    }
    
    public final void setUnstructured(boolean p0) {
    }
    
    public final boolean isGenreFocus() {
        return false;
    }
    
    public final void setGenreFocus(boolean p0) {
    }
    
    public final boolean isArtistFocus() {
        return false;
    }
    
    public final void setArtistFocus(boolean p0) {
    }
    
    public final boolean isAlbumFocus() {
        return false;
    }
    
    public final void setAlbumFocus(boolean p0) {
    }
    
    public final boolean isPlaylistFocus() {
        return false;
    }
    
    public final void setPlaylistFocus(boolean p0) {
    }
    
    public final boolean isSongFocus() {
        return false;
    }
    
    public final void setSongFocus(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGenre() {
        return null;
    }
    
    public final void setGenre(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtist() {
        return null;
    }
    
    public final void setArtist(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbum() {
        return null;
    }
    
    public final void setAlbum(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaylist() {
        return null;
    }
    
    public final void setPlaylist(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSong() {
        return null;
    }
    
    public final void setSong(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}