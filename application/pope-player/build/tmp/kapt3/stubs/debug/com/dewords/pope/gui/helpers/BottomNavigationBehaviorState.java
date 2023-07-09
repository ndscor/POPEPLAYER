package com.dewords.pope.gui.helpers;

import java.lang.System;

/**
 * State persisted across instances
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/dewords/pope/gui/helpers/BottomNavigationBehaviorState;", "Landroidx/customview/view/AbsSavedState;", "source", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "superState", "Landroid/os/Parcelable;", "translation", "", "(Landroid/os/Parcelable;F)V", "getTranslation", "()F", "setTranslation", "(F)V", "writeToParcel", "", "out", "flags", "", "CREATOR", "pope-player_debug"})
public final class BottomNavigationBehaviorState extends androidx.customview.view.AbsSavedState {
    private float translation;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.helpers.BottomNavigationBehaviorState.CREATOR CREATOR = null;
    
    public final float getTranslation() {
        return 0.0F;
    }
    
    public final void setTranslation(float p0) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public BottomNavigationBehaviorState(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BottomNavigationBehaviorState(@org.jetbrains.annotations.NotNull()
    android.os.Parcel source, @org.jetbrains.annotations.Nullable()
    java.lang.ClassLoader loader) {
        super(null);
    }
    
    public BottomNavigationBehaviorState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable superState, float translation) {
        super(null);
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel out, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/gui/helpers/BottomNavigationBehaviorState$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/dewords/pope/gui/helpers/BottomNavigationBehaviorState;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/dewords/pope/gui/helpers/BottomNavigationBehaviorState;", "pope-player_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.dewords.pope.gui.helpers.BottomNavigationBehaviorState> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.dewords.pope.gui.helpers.BottomNavigationBehaviorState createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.dewords.pope.gui.helpers.BottomNavigationBehaviorState[] newArray(int size) {
            return null;
        }
    }
}