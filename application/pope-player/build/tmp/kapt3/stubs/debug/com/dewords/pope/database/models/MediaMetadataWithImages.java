package com.dewords.pope.database.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/dewords/pope/database/models/MediaMetadataWithImages;", "", "()V", "images", "", "Lcom/dewords/pope/database/models/MediaImage;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "media", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getMedia", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "setMedia", "(Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;)V", "metadata", "Lcom/dewords/pope/database/models/MediaMetadata;", "getMetadata", "()Lcom/dewords/pope/database/models/MediaMetadata;", "setMetadata", "(Lcom/dewords/pope/database/models/MediaMetadata;)V", "show", "getShow", "setShow", "pope-player_debug"})
public final class MediaMetadataWithImages {
    @androidx.room.Embedded()
    public com.dewords.pope.database.models.MediaMetadata metadata;
    @androidx.room.Relation(parentColumn = "show_id", entityColumn = "moviepedia_id", entity = com.dewords.pope.database.models.MediaMetadata.class)
    public com.dewords.pope.database.models.MediaMetadata show;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private org.videolan.medialibrary.interfaces.media.MediaWrapper media;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(parentColumn = "moviepedia_id", entityColumn = "media_id", entity = com.dewords.pope.database.models.MediaImage.class)
    private java.util.List<com.dewords.pope.database.models.MediaImage> images;
    
    public MediaMetadataWithImages() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaMetadata getMetadata() {
        return null;
    }
    
    public final void setMetadata(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadata p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.database.models.MediaMetadata getShow() {
        return null;
    }
    
    public final void setShow(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.MediaMetadata p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.database.models.MediaImage> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaImage> p0) {
    }
}