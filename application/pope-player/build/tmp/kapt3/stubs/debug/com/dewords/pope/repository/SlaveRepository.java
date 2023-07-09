package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tJ\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/repository/SlaveRepository;", "Lorg/videolan/tools/IOScopedObject;", "slaveDao", "Lorg/videolan/vlc/database/SlaveDao;", "(Lorg/videolan/vlc/database/SlaveDao;)V", "getSlaves", "", "Lorg/videolan/libvlc/interfaces/IMedia$Slave;", "mrl", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSlave", "Lkotlinx/coroutines/Job;", "mediaPath", "type", "", "priority", "uriString", "saveSlaves", "mw", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "Companion", "pope-player_debug"})
public final class SlaveRepository extends org.videolan.tools.IOScopedObject {
    private final org.videolan.vlc.database.SlaveDao slaveDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.SlaveRepository.Companion Companion = null;
    
    public SlaveRepository(@org.jetbrains.annotations.NotNull()
    org.videolan.vlc.database.SlaveDao slaveDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveSlave(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaPath, int type, int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String uriString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<kotlinx.coroutines.Job> saveSlaves(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper mw) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSlaves(@org.jetbrains.annotations.NotNull()
    java.lang.String mrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<? extends org.videolan.libvlc.interfaces.IMedia.Slave>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/SlaveRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/SlaveRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.SlaveRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}