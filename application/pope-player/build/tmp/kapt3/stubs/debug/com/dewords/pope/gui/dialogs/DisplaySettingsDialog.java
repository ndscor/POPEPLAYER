package com.dewords.pope.gui.dialogs;

import java.lang.System;

/**
 * Dialog showing the display settings for a media list (audio video)
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0016j\b\u0012\u0004\u0012\u00020\u0006`\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog;", "Lcom/dewords/pope/gui/dialogs/VLCBottomSheetDialogFragment;", "()V", "binding", "Lcom/dewords/pope/databinding/DialogDisplaySettingsBinding;", "currentSort", "", "currentSortDesc", "", "displayInCards", "displaySettingsViewModel", "Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel;", "getDisplaySettingsViewModel", "()Lcom/dewords/pope/viewmodels/DisplaySettingsViewModel;", "displaySettingsViewModel$delegate", "Lkotlin/Lazy;", "onlyFavs", "showAllArtists", "Ljava/lang/Boolean;", "showVideoGroups", "", "sorts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDefaultState", "initialFocusedView", "Landroid/view/View;", "needToManageOrientation", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateDisplayMode", "updateShowAllArtists", "updateShowOnlyFavs", "updateSorts", "Companion", "VideoGroup", "pope-player_debug"})
public final class DisplaySettingsDialog extends com.dewords.pope.gui.dialogs.VLCBottomSheetDialogFragment {
    private boolean displayInCards = false;
    private boolean onlyFavs = false;
    private java.util.ArrayList<java.lang.Integer> sorts;
    private int currentSort = -1;
    private boolean currentSortDesc = false;
    private java.lang.Boolean showAllArtists;
    private java.lang.String showVideoGroups;
    private com.dewords.pope.databinding.DialogDisplaySettingsBinding binding;
    private final kotlin.Lazy displaySettingsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.dialogs.DisplaySettingsDialog.Companion Companion = null;
    
    public DisplaySettingsDialog() {
        super();
    }
    
    private final com.dewords.pope.viewmodels.DisplaySettingsViewModel getDisplaySettingsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public int getDefaultState() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean needToManageOrientation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View initialFocusedView() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Update the view for the "display in list / grid" item
     */
    private final void updateDisplayMode() {
    }
    
    /**
     * Update the view for the "show all artists" item
     */
    private final void updateShowAllArtists() {
    }
    
    /**
     * Update the view for the "show only favorites" item
     */
    private final void updateShowOnlyFavs() {
    }
    
    /**
     * Update the views for the sort items
     */
    private final void updateSorts() {
    }
    
    /**
     * Video grouping entry
     *
     * @property value the value to be saved in the shared preferences
     * @property title the title resources to be shown
     * @property type the [VideosViewModel] type for this grouping
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog$VideoGroup;", "", "value", "", "title", "", "type", "Lcom/dewords/pope/viewmodels/mobile/VideoGroupingType;", "(Ljava/lang/String;ILjava/lang/String;ILcom/dewords/pope/viewmodels/mobile/VideoGroupingType;)V", "getTitle", "()I", "getType", "()Lcom/dewords/pope/viewmodels/mobile/VideoGroupingType;", "getValue", "()Ljava/lang/String;", "toString", "GROUP_BY_NAME", "GROUP_BY_FOLDER", "NO_GROUP", "Companion", "pope-player_debug"})
    public static enum VideoGroup {
        /*public static final*/ GROUP_BY_NAME /* = new GROUP_BY_NAME(null, 0, null) */,
        /*public static final*/ GROUP_BY_FOLDER /* = new GROUP_BY_FOLDER(null, 0, null) */,
        /*public static final*/ NO_GROUP /* = new NO_GROUP(null, 0, null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        private final int title = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.dewords.pope.viewmodels.mobile.VideoGroupingType type = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.dewords.pope.gui.dialogs.DisplaySettingsDialog.VideoGroup.Companion Companion = null;
        
        VideoGroup(java.lang.String value, int title, com.dewords.pope.viewmodels.mobile.VideoGroupingType type) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final int getTitle() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.viewmodels.mobile.VideoGroupingType getType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog$VideoGroup$Companion;", "", "()V", "findByValue", "Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog$VideoGroup;", "value", "", "pope-player_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Retrieve a [VideoGroup] by its value
             *
             * @param value of the video group to retrieve
             * @return a [VideoGroup]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.dewords.pope.gui.dialogs.DisplaySettingsDialog.VideoGroup findByValue(@org.jetbrains.annotations.Nullable()
            java.lang.String value) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog$Companion;", "", "()V", "newInstance", "Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog;", "displayInCards", "", "showAllArtists", "onlyFavs", "sorts", "", "", "currentSort", "currentSortDesc", "videoGroup", "", "(ZLjava/lang/Boolean;ZLjava/util/List;IZLjava/lang/String;)Lcom/dewords/pope/gui/dialogs/DisplaySettingsDialog;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.gui.dialogs.DisplaySettingsDialog newInstance(boolean displayInCards, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean showAllArtists, boolean onlyFavs, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> sorts, int currentSort, boolean currentSortDesc, @org.jetbrains.annotations.Nullable()
        java.lang.String videoGroup) {
            return null;
        }
    }
}