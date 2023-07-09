package com.dewords.pope.provider.datasources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/provider/datasources/MovieDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "context", "Landroid/content/Context;", "sort", "Lkotlin/Pair;", "", "metadataType", "Lcom/dewords/pope/database/models/MediaMetadataType;", "(Landroid/content/Context;Lkotlin/Pair;Lcom/dewords/pope/database/models/MediaMetadataType;)V", "dataSource", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/DataSource;", "create", "pope-player_debug"})
public final class MovieDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.dewords.pope.database.models.MediaMetadataWithImages> {
    private final android.content.Context context = null;
    private final kotlin.Pair<java.lang.Integer, java.lang.Boolean> sort = null;
    private final com.dewords.pope.database.models.MediaMetadataType metadataType = null;
    private final androidx.lifecycle.MutableLiveData<androidx.paging.DataSource<java.lang.Integer, com.dewords.pope.database.models.MediaMetadataWithImages>> dataSource = null;
    
    public MovieDataSourceFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.Integer, java.lang.Boolean> sort, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadataType metadataType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.dewords.pope.database.models.MediaMetadataWithImages> create() {
        return null;
    }
}