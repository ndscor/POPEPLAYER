package com.dewords.pope.models.identify;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/models/identify/MediaType;", "", "(Ljava/lang/String;I)V", "TV_SHOW", "TV_SEASON", "TV_EPISODE", "MOVIE", "pope-player_debug"})
public enum MediaType {
    @com.squareup.moshi.Json(name = "tvshow")
    /*public static final*/ TV_SHOW /* = new TV_SHOW() */,
    @com.squareup.moshi.Json(name = "tvseason")
    /*public static final*/ TV_SEASON /* = new TV_SEASON() */,
    @com.squareup.moshi.Json(name = "tvepisode")
    /*public static final*/ TV_EPISODE /* = new TV_EPISODE() */,
    @com.squareup.moshi.Json(name = "movie")
    /*public static final*/ MOVIE /* = new MOVIE() */;
    
    MediaType() {
    }
}