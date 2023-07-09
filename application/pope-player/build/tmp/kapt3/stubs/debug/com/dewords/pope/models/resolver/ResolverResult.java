package com.dewords.pope.models.resolver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/dewords/pope/models/resolver/ResolverResult;", "", "()V", "getAllResults", "", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "lucky", "results", "pope-player_debug"})
public abstract class ResolverResult {
    
    public ResolverResult() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.dewords.pope.models.resolver.ResolverMedia lucky();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.dewords.pope.models.resolver.ResolverMedia> results();
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.dewords.pope.models.resolver.ResolverMedia> getAllResults() {
        return null;
    }
}