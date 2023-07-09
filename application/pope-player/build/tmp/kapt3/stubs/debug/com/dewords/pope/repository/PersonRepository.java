package com.dewords.pope.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/dewords/pope/repository/PersonRepository;", "Lorg/videolan/tools/IOScopedObject;", "personDao", "Lcom/dewords/pope/database/PersonDao;", "(Lcom/dewords/pope/database/PersonDao;)V", "addPerson", "Lkotlinx/coroutines/Job;", "person", "Lcom/dewords/pope/database/models/Person;", "addPersonImmediate", "", "deleteAll", "personsToRemove", "", "getAll", "Companion", "pope-player_debug"})
public final class PersonRepository extends org.videolan.tools.IOScopedObject {
    private final com.dewords.pope.database.PersonDao personDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.repository.PersonRepository.Companion Companion = null;
    
    public PersonRepository(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.PersonDao personDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addPerson(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.Person person) {
        return null;
    }
    
    public final void addPersonImmediate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.database.models.Person person) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.database.models.Person> getAll() {
        return null;
    }
    
    public final void deleteAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dewords.pope.database.models.Person> personsToRemove) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dewords/pope/repository/PersonRepository$Companion;", "Lorg/videolan/tools/SingletonHolder;", "Lcom/dewords/pope/repository/PersonRepository;", "Landroid/content/Context;", "()V", "pope-player_debug"})
    public static final class Companion extends org.videolan.tools.SingletonHolder<com.dewords.pope.repository.PersonRepository, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}