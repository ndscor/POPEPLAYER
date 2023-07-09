package com.dewords.pope.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/dewords/pope/viewmodel/Season;", "", "seasonNumber", "", "episodes", "Ljava/util/ArrayList;", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "Lkotlin/collections/ArrayList;", "(ILjava/util/ArrayList;)V", "getEpisodes", "()Ljava/util/ArrayList;", "setEpisodes", "(Ljava/util/ArrayList;)V", "getSeasonNumber", "()I", "setSeasonNumber", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "pope-player_debug"})
public final class Season {
    private int seasonNumber;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> episodes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.viewmodel.Season copy(int seasonNumber, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> episodes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Season() {
        super();
    }
    
    public Season(int seasonNumber, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> episodes) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getSeasonNumber() {
        return 0;
    }
    
    public final void setSeasonNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> getEpisodes() {
        return null;
    }
    
    public final void setEpisodes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.dewords.pope.database.models.MediaMetadataWithImages> p0) {
    }
}