package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dewords/pope/util/AccessControl;", "", "()V", "callingUidChecked", "", "", "Lcom/dewords/pope/util/AuthEntry;", "certificateAllowList", "", "", "Lcom/dewords/pope/util/CertInfo;", "getCertificateAllowList", "()Ljava/util/Map;", "certificateAllowList$delegate", "Lkotlin/Lazy;", "platformSignature", "genSigSha256", "certificate", "", "getCallingPackage", "ctx", "Landroid/content/Context;", "callingUid", "clientPackageName", "getSignature", "callingPackage", "loadAuthorizedKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logCaller", "", "pope-player_debug"})
public final class AccessControl {
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.AccessControl INSTANCE = null;
    private static final java.lang.String platformSignature = null;
    private static final java.util.Map<java.lang.Integer, com.dewords.pope.util.AuthEntry> callingUidChecked = null;
    private static final kotlin.Lazy certificateAllowList$delegate = null;
    
    private AccessControl() {
        super();
    }
    
    private final java.util.Map<java.lang.String, com.dewords.pope.util.CertInfo> getCertificateAllowList() {
        return null;
    }
    
    /**
     * Perform security checks to determine if the callingUid is authorized.
     * @param callingUid The calling application's user id.
     * @param clientPackageName The calling application's package name. If not specified, an attempt
     * will be made to resolve the package name from the package manager.
     */
    public final void logCaller(int callingUid, @org.jetbrains.annotations.Nullable()
    java.lang.String clientPackageName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCallingPackage(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int callingUid, @org.jetbrains.annotations.Nullable()
    java.lang.String clientPackageName) {
        return null;
    }
    
    /**
     * Read authorized keys into memory. Keys are stored in a JSON data file.
     */
    private final java.lang.Object loadAuthorizedKeys(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.dewords.pope.util.CertInfo>> continuation) {
        return null;
    }
    
    @kotlin.Suppress(names = {"deprecation"})
    private final java.lang.String getSignature(android.content.Context ctx, java.lang.String callingPackage) {
        return null;
    }
    
    private final java.lang.String genSigSha256(byte[] certificate) {
        return null;
    }
}