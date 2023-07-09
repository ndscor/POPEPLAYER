package com.dewords.pope.viewmodels;

import java.lang.System;

/**
 * View model allowing to emit / collect display setting changes between
 * a calling fragment and the [DisplaySettingsDialog]
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_settingChangeFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel$SettingChange;", "settingChangeFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getSettingChangeFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "consume", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "key", "", "value", "", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SettingChange", "pope-player_debug"})
public final class DisplaySettingsViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dewords.pope.viewmodels.DisplaySettingsViewModel.SettingChange> _settingChangeFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.dewords.pope.viewmodels.DisplaySettingsViewModel.SettingChange> settingChangeFlow = null;
    
    public DisplaySettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.dewords.pope.viewmodels.DisplaySettingsViewModel.SettingChange> getSettingChangeFlow() {
        return null;
    }
    
    /**
     * Send a new event when a setting is changed
     *
     * @param key the setting key
     * @param value the setting value
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object send(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * When the flow value is consumed, revert to "init" state
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object consume(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Display setting object
     * Initial values should always be discarded
     *
     * @property key the setting key
     * @property value the setting value
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0001H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel$SettingChange;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pope-player_debug"})
    public static final class SettingChange {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object value = null;
        
        /**
         * Display setting object
         * Initial values should always be discarded
         *
         * @property key the setting key
         * @property value the setting value
         */
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.viewmodels.DisplaySettingsViewModel.SettingChange copy(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            return null;
        }
        
        /**
         * Display setting object
         * Initial values should always be discarded
         *
         * @property key the setting key
         * @property value the setting value
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Display setting object
         * Initial values should always be discarded
         *
         * @property key the setting key
         * @property value the setting value
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Display setting object
         * Initial values should always be discarded
         *
         * @property key the setting key
         * @property value the setting value
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public SettingChange() {
            super();
        }
        
        public SettingChange(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Object value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object getValue() {
            return null;
        }
    }
}