package com.dewords.pope.gui.audio;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 f2\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003R\u00020\u00000\u00012\u00020\u00052\b\u0012\u0004\u0012\u00020\u00020\u00062\u00020\u0007:\u0004efghB=\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020\u000fH\u0002J\u0012\u0010B\u001a\u0004\u0018\u00010\u00022\u0006\u0010C\u001a\u00020\tH\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010C\u001a\u00020\tH\u0016J\u0010\u0010F\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J\b\u0010G\u001a\u00020\u000fH\u0016J\b\u0010H\u001a\u00020\u000fH\u0004J\u0010\u0010I\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020LH\u0016J\"\u0010M\u001a\u00020@2\u0010\u0010N\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003R\u00020\u00002\u0006\u0010C\u001a\u00020\tH\u0016J0\u0010M\u001a\u00020@2\u0010\u0010N\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003R\u00020\u00002\u0006\u0010C\u001a\u00020\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0016J\"\u0010R\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003R\u00020\u00002\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\tH\u0016J(\u0010V\u001a\u00020@2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010X2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010XH\u0016J\u0010\u0010Z\u001a\u00020@2\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010[\u001a\u00020@2\u0006\u0010C\u001a\u00020\tH\u0016J\u0018\u0010\\\u001a\u00020@2\u0006\u0010]\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tH\u0016J\u0018\u0010_\u001a\u00020@2\u0006\u0010`\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tH\u0016J\u001a\u0010b\u001a\u00020@2\u0010\u0010c\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003R\u00020\u0000H\u0016J\u0010\u0010d\u001a\u00020@2\b\u0010\"\u001a\u0004\u0018\u00010#R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u000208\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\u000fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0014R\u001a\u0010<\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010\u0016\u00a8\u0006i"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "Landroidx/paging/PagedListAdapter;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "Landroidx/databinding/ViewDataBinding;", "Lcom/dewords/pope/gui/view/FastScroller$SeparatedAdapter;", "Lorg/videolan/tools/MultiSelectAdapter;", "Lcom/dewords/pope/interfaces/SwipeDragHelperAdapter;", "type", "", "eventsHandler", "Lcom/dewords/pope/interfaces/IEventsHandler;", "listEventsHandler", "Lcom/dewords/pope/interfaces/IListEventsHandler;", "reorderable", "", "cardSize", "(ILcom/dewords/pope/interfaces/IEventsHandler;Lcom/dewords/pope/interfaces/IListEventsHandler;ZI)V", "areSectionsEnabled", "getAreSectionsEnabled", "()Z", "setAreSectionsEnabled", "(Z)V", "getCardSize$pope_player_debug", "()I", "setCardSize$pope_player_debug", "(I)V", "defaultCover", "Landroid/graphics/drawable/BitmapDrawable;", "getDefaultCover", "()Landroid/graphics/drawable/BitmapDrawable;", "defaultCoverCard", "getEventsHandler", "()Lcom/dewords/pope/interfaces/IEventsHandler;", "focusListener", "Lorg/videolan/resources/interfaces/FocusListener;", "focusNext", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "inflater", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "setInflater", "(Landroid/view/LayoutInflater;)V", "isEmpty", "getListEventsHandler", "()Lcom/dewords/pope/interfaces/IListEventsHandler;", "listImageWidth", "getListImageWidth", "setListImageWidth", "multiSelectHelper", "Lorg/videolan/tools/MultiSelectHelper;", "getMultiSelectHelper", "()Lorg/videolan/tools/MultiSelectHelper;", "getReorderable", "stopReorder", "getStopReorder", "setStopReorder", "clear", "", "displayInCard", "getItem", "position", "getItemId", "", "getItemViewType", "hasSections", "inflaterInitialized", "isPositionValid", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onCurrentListChanged", "previousList", "Landroidx/paging/PagedList;", "currentList", "onDetachedFromRecyclerView", "onItemDismiss", "onItemMove", "fromPosition", "toPosition", "onItemMoved", "dragFrom", "dragTo", "onViewRecycled", "h", "setOnFocusChangeListener", "AbstractMediaItemViewHolder", "Companion", "MediaItemCardViewHolder", "MediaItemViewHolder", "pope-player_debug"})
public class AudioBrowserAdapter extends androidx.paging.PagedListAdapter<org.videolan.medialibrary.media.MediaLibraryItem, com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding>> implements com.dewords.pope.gui.view.FastScroller.SeparatedAdapter, org.videolan.tools.MultiSelectAdapter<org.videolan.medialibrary.media.MediaLibraryItem>, com.dewords.pope.interfaces.SwipeDragHelperAdapter {
    @org.jetbrains.annotations.NotNull()
    private final com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler = null;
    @org.jetbrains.annotations.Nullable()
    private final com.dewords.pope.interfaces.IListEventsHandler listEventsHandler = null;
    private final boolean reorderable = false;
    private int cardSize;
    private int listImageWidth;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.media.MediaLibraryItem> multiSelectHelper = null;
    @org.jetbrains.annotations.Nullable()
    private final android.graphics.drawable.BitmapDrawable defaultCover = null;
    private final android.graphics.drawable.BitmapDrawable defaultCoverCard = null;
    private int focusNext = -1;
    private org.videolan.resources.interfaces.FocusListener focusListener;
    public android.view.LayoutInflater inflater;
    private final kotlin.Lazy handler$delegate = null;
    private boolean stopReorder = false;
    private boolean areSectionsEnabled = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.audio.AudioBrowserAdapter.Companion Companion = null;
    private static final java.lang.String TAG = "VLC/AudioBrowserAdapter";
    private static final int UPDATE_PAYLOAD = 1;
    
    /**
     * Awful hack to workaround the [PagedListAdapter] not keeping track of notifyItemMoved operations
     */
    private static boolean preventNextAnim = false;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<org.videolan.medialibrary.media.MediaLibraryItem> DIFF_CALLBACK = null;
    
    @kotlin.jvm.JvmOverloads()
    public AudioBrowserAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AudioBrowserAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.IListEventsHandler listEventsHandler) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AudioBrowserAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.IListEventsHandler listEventsHandler, boolean reorderable) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AudioBrowserAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> eventsHandler, @org.jetbrains.annotations.Nullable()
    com.dewords.pope.interfaces.IListEventsHandler listEventsHandler, boolean reorderable, int cardSize) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.dewords.pope.interfaces.IEventsHandler<org.videolan.medialibrary.media.MediaLibraryItem> getEventsHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.dewords.pope.interfaces.IListEventsHandler getListEventsHandler() {
        return null;
    }
    
    protected final boolean getReorderable() {
        return false;
    }
    
    public final int getCardSize$pope_player_debug() {
        return 0;
    }
    
    public final void setCardSize$pope_player_debug(int p0) {
    }
    
    protected final int getListImageWidth() {
        return 0;
    }
    
    protected final void setListImageWidth(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.MultiSelectHelper<org.videolan.medialibrary.media.MediaLibraryItem> getMultiSelectHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.graphics.drawable.BitmapDrawable getDefaultCover() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.LayoutInflater getInflater() {
        return null;
    }
    
    public final void setInflater(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater p0) {
    }
    
    private final android.os.Handler getHandler() {
        return null;
    }
    
    public final boolean getStopReorder() {
        return false;
    }
    
    public final void setStopReorder(boolean p0) {
    }
    
    public final boolean getAreSectionsEnabled() {
        return false;
    }
    
    public final void setAreSectionsEnabled(boolean p0) {
    }
    
    protected final boolean inflaterInitialized() {
        return false;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final boolean displayInCard() {
        return false;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding> holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding> holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<androidx.databinding.ViewDataBinding> h) {
    }
    
    private final boolean isPositionValid(int position) {
        return false;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.videolan.medialibrary.media.MediaLibraryItem getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void clear() {
    }
    
    @java.lang.Override()
    public void onCurrentListChanged(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList<org.videolan.medialibrary.media.MediaLibraryItem> previousList, @org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList<org.videolan.medialibrary.media.MediaLibraryItem> currentList) {
    }
    
    @java.lang.Override()
    public boolean hasSections() {
        return false;
    }
    
    @java.lang.Override()
    public void onItemMove(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override()
    public void onItemMoved(int dragFrom, int dragTo) {
    }
    
    @java.lang.Override()
    public void onItemDismiss(int position) {
    }
    
    public final void setOnFocusChangeListener(@org.jetbrains.annotations.Nullable()
    org.videolan.resources.interfaces.FocusListener focusListener) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$MediaItemViewHolder;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "Lcom/dewords/pope/databinding/AudioBrowserItemBinding;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "binding", "(Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;Lcom/dewords/pope/databinding/AudioBrowserItemBinding;)V", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "recycle", "", "selectView", "selected", "", "setItem", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public final class MediaItemViewHolder extends com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<com.dewords.pope.databinding.AudioBrowserItemBinding> {
        @org.jetbrains.annotations.NotNull()
        private android.view.View.OnTouchListener onTouchListener;
        @org.jetbrains.annotations.Nullable()
        private final android.widget.TextView titleView = null;
        
        public MediaItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.AudioBrowserItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View.OnTouchListener getOnTouchListener() {
            return null;
        }
        
        public final void setOnTouchListener(@org.jetbrains.annotations.NotNull()
        android.view.View.OnTouchListener p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
        
        @java.lang.Override()
        public void selectView(boolean selected) {
        }
        
        @java.lang.Override()
        public void setItem(@org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.media.MediaLibraryItem item) {
        }
        
        @java.lang.Override()
        public void recycle() {
        }
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$MediaItemCardViewHolder;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "Lcom/dewords/pope/databinding/AudioBrowserCardItemBinding;", "Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;", "binding", "(Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;Lcom/dewords/pope/databinding/AudioBrowserCardItemBinding;)V", "titleView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "recycle", "", "selectView", "selected", "", "setItem", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public final class MediaItemCardViewHolder extends com.dewords.pope.gui.audio.AudioBrowserAdapter.AbstractMediaItemViewHolder<com.dewords.pope.databinding.AudioBrowserCardItemBinding> {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleView = null;
        
        public MediaItemCardViewHolder(@org.jetbrains.annotations.NotNull()
        com.dewords.pope.databinding.AudioBrowserCardItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.widget.TextView getTitleView() {
            return null;
        }
        
        @java.lang.Override()
        public void selectView(boolean selected) {
        }
        
        @java.lang.Override()
        public void setItem(@org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.media.MediaLibraryItem item) {
        }
        
        @java.lang.Override()
        public void recycle() {
        }
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u00a7\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\bH\u0014J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\rH&J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$AbstractMediaItemViewHolder;", "T", "Landroidx/databinding/ViewDataBinding;", "Lcom/dewords/pope/gui/helpers/SelectorViewHolder;", "Lcom/dewords/pope/gui/helpers/MarqueeViewHolder;", "binding", "(Lcom/dewords/pope/gui/audio/AudioBrowserAdapter;Landroidx/databinding/ViewDataBinding;)V", "canBeReordered", "", "getCanBeReordered", "()Z", "isSelected", "onClick", "", "v", "Landroid/view/View;", "onImageClick", "onLongClick", "onMainActionClick", "onMoreClick", "recycle", "setItem", "item", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "pope-player_debug"})
    public abstract class AbstractMediaItemViewHolder<T extends androidx.databinding.ViewDataBinding> extends com.dewords.pope.gui.helpers.SelectorViewHolder<T> implements com.dewords.pope.gui.helpers.MarqueeViewHolder {
        
        public AbstractMediaItemViewHolder(@org.jetbrains.annotations.NotNull()
        T binding) {
            super(null);
        }
        
        public final boolean getCanBeReordered() {
            return false;
        }
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void onMoreClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final boolean onLongClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            return false;
        }
        
        public final void onImageClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void onMainActionClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        protected boolean isSelected() {
            return false;
        }
        
        public abstract void setItem(@org.jetbrains.annotations.Nullable()
        org.videolan.medialibrary.media.MediaLibraryItem item);
        
        public abstract void recycle();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/dewords/pope/gui/audio/AudioBrowserAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lorg/videolan/medialibrary/media/MediaLibraryItem;", "TAG", "", "UPDATE_PAYLOAD", "", "preventNextAnim", "", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}