package com.dewords.pope.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0006\u0010\u0011\u001a\u00020\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/util/CarConnectionHandler;", "Landroid/content/AsyncQueryHandler;", "resolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "connectionType", "Landroidx/lifecycle/MutableLiveData;", "", "getConnectionType", "()Landroidx/lifecycle/MutableLiveData;", "onQueryComplete", "", "token", "cookie", "", "cursor", "Landroid/database/Cursor;", "query", "Companion", "pope-player_debug"})
public final class CarConnectionHandler extends android.content.AsyncQueryHandler {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> connectionType = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.util.CarConnectionHandler.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECEIVER_ACTION = "androidx.car.com.dewords.pope.app.connection.action.CAR_CONNECTION_UPDATED";
    
    /**
     * Not connected to any car head unit.z
     */
    public static final int CONNECTION_TYPE_NOT_CONNECTED = 0;
    
    /**
     * Natively running on a head unit (Android Automotive OS).
     */
    public static final int CONNECTION_TYPE_NATIVE = 1;
    
    /**
     * Connected to a car head unit by projecting to it.
     */
    public static final int CONNECTION_TYPE_PROJECTION = 2;
    
    public CarConnectionHandler(@org.jetbrains.annotations.Nullable()
    android.content.ContentResolver resolver) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getConnectionType() {
        return null;
    }
    
    public final void query() {
    }
    
    @java.lang.Override()
    protected void onQueryComplete(int token, @org.jetbrains.annotations.Nullable()
    java.lang.Object cookie, @org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dewords/pope/util/CarConnectionHandler$Companion;", "", "()V", "CONNECTION_TYPE_NATIVE", "", "CONNECTION_TYPE_NOT_CONNECTED", "CONNECTION_TYPE_PROJECTION", "RECEIVER_ACTION", "", "preferCarConnectionHandler", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean preferCarConnectionHandler() {
            return false;
        }
    }
}