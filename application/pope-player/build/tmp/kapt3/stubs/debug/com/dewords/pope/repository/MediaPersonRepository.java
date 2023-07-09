package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/repository/MediaPersonRepository;", "Lorg/videolan/tools/IOScopedObject;", "mediaPersonActorJoinDao", "Lcom/dewords/pope/database/MediaPersonJoinDao;", "(Lcom/dewords/pope/database/MediaPersonJoinDao;)V", "addPersons", "", "mediaPersons", "", "Lcom/dewords/pope/database/models/MediaPersonJoin;", "getAll", "getPersonsByType", "Landroidx/lifecycle/LiveData;", "Lcom/dewords/pope/database/models/Person;", "moviepediaId", "", "personType", "Lcom/dewords/pope/database/models/PersonType;", "removeAllFor", "Companion", "pope-player_debug"})
public final class MediaPersonRepository extends org.videolan.tools.IOScopedObject {
    private final com.dewords.pope.database.MediaPersonJoinDao mediaPersonActorJoinDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.MediaPersonRepository.Companion Companion = null;
    
    public MediaPersonRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.MediaPersonJoinDao mediaPersonActorJoinDao) {
        super();
    }
    
    public final void addPersons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.MediaPersonJoin> mediaPersons) {
    }
    
    public final void removeAllFor(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.database.models.MediaPersonJoin> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.database.models.Person>> getPersonsByType(@org.jetbrains.annotations.NotNull()
    java.lang.String moviepediaId, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.PersonType personType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/MediaPersonRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/MediaPersonRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.MediaPersonRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}