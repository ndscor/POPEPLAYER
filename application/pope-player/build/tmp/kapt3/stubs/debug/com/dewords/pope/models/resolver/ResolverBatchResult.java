package com.dewords.pope.models.resolver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/models/resolver/ResolverBatchResult;", "", "()V", "getId", "", "getMedia", "Lcom/dewords/pope/models/resolver/ResolverMedia;", "pope-player_debug"})
public abstract class ResolverBatchResult {
    
    public ResolverBatchResult() {
        super();
    }
    
    public abstract long getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.dewords.pope.models.resolver.ResolverMedia getMedia();
}