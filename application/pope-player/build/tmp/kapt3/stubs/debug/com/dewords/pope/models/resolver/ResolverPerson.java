package com.dewords.pope.models.resolver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/models/resolver/ResolverPerson;", "", "()V", "image", "", "name", "personId", "pope-player_debug"})
public abstract class ResolverPerson {
    
    public ResolverPerson() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String name();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String image();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String personId();
}