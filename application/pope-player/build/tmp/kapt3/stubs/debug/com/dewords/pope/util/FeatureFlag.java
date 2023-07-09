package com.dewords.pope.util;

import java.lang.System;

/**
 * An experimental feature that can be disabled
 *
 * @param dependsOn: another feature this feature depends on
 * @param title: a string reference for this feature's title
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\'\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/util/FeatureFlag;", "", "dependsOn", "title", "", "warning", "(Ljava/lang/String;ILcom/dewords/pope/util/FeatureFlag;ILjava/lang/Integer;)V", "getDependsOn", "()Lcom/dewords/pope/util/FeatureFlag;", "setDependsOn", "(Lcom/dewords/pope/util/FeatureFlag;)V", "getTitle", "()I", "setTitle", "(I)V", "getWarning", "()Ljava/lang/Integer;", "setWarning", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getKey", "", "pope-player_debug"})
public enum FeatureFlag {
;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.util.FeatureFlag dependsOn;
    private int title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer warning;
    
    FeatureFlag(com.dewords.pope.util.FeatureFlag dependsOn, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    java.lang.Integer warning) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.util.FeatureFlag getDependsOn() {
        return null;
    }
    
    public final void setDependsOn(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.util.FeatureFlag p0) {
    }
    
    public final int getTitle() {
        return 0;
    }
    
    public final void setTitle(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWarning() {
        return null;
    }
    
    public final void setWarning(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.lang.String getKey() {
        return null;
    }
}