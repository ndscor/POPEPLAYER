package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/util/SortModule;", "", "canSortBy", "", "sort", "", "canSortByAlbum", "canSortByArtist", "canSortByDuration", "canSortByFileNameName", "canSortByFileSize", "canSortByInsertionDate", "canSortByLastModified", "canSortByMediaNumber", "canSortByName", "canSortByPlayCount", "canSortByReleaseDate", "canSortByTrackId", "", "pope-player_debug"})
public abstract interface SortModule {
    
    public abstract void sort(int sort);
    
    public abstract boolean canSortByName();
    
    public abstract boolean canSortByFileNameName();
    
    public abstract boolean canSortByDuration();
    
    public abstract boolean canSortByInsertionDate();
    
    public abstract boolean canSortByLastModified();
    
    public abstract boolean canSortByReleaseDate();
    
    public abstract boolean canSortByFileSize();
    
    public abstract boolean canSortByArtist();
    
    public abstract boolean canSortByAlbum();
    
    public abstract boolean canSortByPlayCount();
    
    public abstract boolean canSortByTrackId();
    
    public abstract boolean canSortByMediaNumber();
    
    public abstract boolean canSortBy(int sort);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static boolean canSortByName(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByFileNameName(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByDuration(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByInsertionDate(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByLastModified(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByReleaseDate(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByFileSize(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByArtist(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByAlbum(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByPlayCount(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByTrackId(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortByMediaNumber(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this) {
            return false;
        }
        
        public static boolean canSortBy(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.util.SortModule $this, int sort) {
            return false;
        }
    }
}