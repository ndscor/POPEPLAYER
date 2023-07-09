package com.dewords.pope.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u0002:\u0002\u0086\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010[\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u0012\u0010\u001c\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010$H\u0007J\u0016\u0010_\u001a\u00020\u00112\u0006\u0010`\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u0015J\u0006\u0010b\u001a\u00020-J\u0006\u0010c\u001a\u00020-J\u001d\u0010d\u001a\u0004\u0018\u00010]2\u0006\u0010`\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u0015\u00a2\u0006\u0002\u0010eJ\u001e\u0010f\u001a\u0004\u0018\u00010g2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u0015012\u0006\u0010`\u001a\u00020\u0011J\u001d\u0010i\u001a\u0004\u0018\u00010]2\u0006\u0010j\u001a\u00020\u00112\u0006\u0010k\u001a\u00020\u0011\u00a2\u0006\u0002\u0010lJ\u0006\u0010m\u001a\u00020\u000bJ\b\u0010n\u001a\u00020]H\u0016J\u0011\u0010o\u001a\u00020]2\u0006\u0010p\u001a\u00020qH\u0096\u0001J\u0011\u0010r\u001a\u00020]2\u0006\u0010p\u001a\u00020sH\u0096\u0001J\u0012\u0010t\u001a\u00020]2\b\u0010L\u001a\u0004\u0018\u00010MH\u0002J\u0015\u0010u\u001a\u0004\u0018\u00010]2\u0006\u0010`\u001a\u00020\u0011\u00a2\u0006\u0002\u0010vJ\u0010\u0010w\u001a\u00020\u000b2\b\b\u0002\u0010x\u001a\u00020\u000bJ\u0015\u0010y\u001a\u0004\u0018\u00010]2\u0006\u0010`\u001a\u00020\u0011\u00a2\u0006\u0002\u0010vJ\u0018\u0010z\u001a\u00020]2\u0006\u0010{\u001a\u00020-2\b\b\u0002\u0010|\u001a\u00020\u000bJ\u0010\u0010}\u001a\u00020]2\u0006\u0010L\u001a\u00020MH\u0002J\r\u0010~\u001a\u0004\u0018\u00010]\u00a2\u0006\u0002\u0010\u007fJ\u000e\u0010\u0080\u0001\u001a\u0004\u0018\u00010]\u00a2\u0006\u0002\u0010\u007fJ\u000f\u0010\u0081\u0001\u001a\u00020]2\u0006\u0010`\u001a\u00020\u0011J\u0012\u0010\u0082\u0001\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\\J\u000e\u0010\u0083\u0001\u001a\u0004\u0018\u00010]\u00a2\u0006\u0002\u0010\u007fJ\u000e\u0010\u0084\u0001\u001a\u0004\u0018\u00010]\u00a2\u0006\u0002\u0010\u007fJ\t\u0010\u0085\u0001\u001a\u00020]H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR)\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8BX\u0082\u0084\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010!\u0012\u0004\b%\u0010\u0003\u001a\u0004\b&\u0010\'R\u000e\u0010)\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010*\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\rR\u0011\u0010,\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001018F\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020807\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\rR\u0013\u0010=\u001a\u0004\u0018\u00010-8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR$\u0010F\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010IR\u0011\u0010J\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\bK\u0010\u0013R\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0011\u0010R\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bS\u0010\rR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020U0A\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0013\u0010W\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\bX\u0010\u0007R\u0011\u0010Y\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0087\u0001"}, d2 = {"Lcom/dewords/pope/viewmodels/PlaylistModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/dewords/pope/PlaybackService$Callback;", "()V", "album", "", "getAlbum", "()Ljava/lang/String;", "artist", "getArtist", "canShuffle", "", "getCanShuffle", "()Z", "connected", "getConnected", "currentMediaPosition", "", "getCurrentMediaPosition", "()I", "currentMediaWrapper", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getCurrentMediaWrapper", "()Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "dataset", "Lorg/videolan/tools/livedata/LiveDataset;", "getDataset", "()Lorg/videolan/tools/livedata/LiveDataset;", "filter", "Lcom/dewords/pope/util/PlaylistFilterDelegate;", "getFilter", "()Lcom/dewords/pope/util/PlaylistFilterDelegate;", "filter$delegate", "Lkotlin/Lazy;", "filterActor", "Lkotlinx/coroutines/channels/SendChannel;", "", "getFilterActor$annotations", "getFilterActor", "()Lkotlinx/coroutines/channels/SendChannel;", "filterActor$delegate", "filtering", "hasMedia", "getHasMedia", "length", "", "getLength", "()J", "medias", "", "getMedias", "()Ljava/util/List;", "originalDataset", "", "playerState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dewords/pope/viewmodels/PlayerState;", "getPlayerState", "()Landroidx/lifecycle/MutableLiveData;", "playing", "getPlaying", "previousTotalTime", "getPreviousTotalTime", "()Ljava/lang/Long;", "progress", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/dewords/pope/viewmodels/PlaybackProgress;", "getProgress", "()Landroidx/lifecycle/MediatorLiveData;", "value", "repeatType", "getRepeatType", "setRepeatType", "(I)V", "selection", "getSelection", "service", "Lcom/dewords/pope/PlaybackService;", "getService", "()Lcom/dewords/pope/PlaybackService;", "setService", "(Lcom/dewords/pope/PlaybackService;)V", "shuffling", "getShuffling", "speed", "", "getSpeed", "title", "getTitle", "videoTrackCount", "getVideoTrackCount", "canSwitchToVideo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "getPlaylistPosition", "position", "media", "getTime", "getTotalTime", "insertMedia", "(ILorg/videolan/medialibrary/interfaces/media/MediaWrapper;)Lkotlin/Unit;", "load", "Lkotlinx/coroutines/Job;", "medialist", "move", "from", "to", "(II)Lkotlin/Unit;", "next", "onCleared", "onMediaEvent", "event", "Lorg/videolan/libvlc/interfaces/IMedia$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "onServiceChanged", "play", "(I)Lkotlin/Unit;", "previous", "force", "remove", "setTime", "time", "fast", "setup", "shuffle", "()Lkotlin/Unit;", "stop", "stopAfter", "switchToVideo", "toggleABRepeat", "togglePlayPause", "update", "Companion", "pope-player_debug"})
public final class PlaylistModel extends androidx.lifecycle.ViewModel implements com.dewords.pope.PlaybackService.Callback {
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.PlaybackService service;
    @org.jetbrains.annotations.NotNull()
    private final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.interfaces.media.MediaWrapper> dataset = null;
    private java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> originalDataset;
    private boolean filtering = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.dewords.pope.viewmodels.PlaybackProgress> progress = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Float> speed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.dewords.pope.viewmodels.PlayerState> playerState = null;
    private final kotlin.Lazy filter$delegate = null;
    private final kotlin.Lazy filterActor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.viewmodels.PlaylistModel.Companion Companion = null;
    
    public PlaylistModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.tools.livedata.LiveDataset<org.videolan.medialibrary.interfaces.media.MediaWrapper> getDataset() {
        return null;
    }
    
    public final int getSelection() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.dewords.pope.viewmodels.PlaybackProgress> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Float> getSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.dewords.pope.viewmodels.PlayerState> getPlayerState() {
        return null;
    }
    
    public final boolean getConnected() {
        return false;
    }
    
    private final com.dewords.pope.util.PlaylistFilterDelegate getFilter() {
        return null;
    }
    
    private final kotlinx.coroutines.channels.SendChannel<java.lang.CharSequence> getFilterActor() {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.ObsoleteCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getFilterActor$annotations() {
    }
    
    private final void setup(com.dewords.pope.PlaybackService service) {
    }
    
    @java.lang.Override()
    public void update() {
    }
    
    public final boolean getHasMedia() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit insertMedia(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit remove(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit move(int from, int to) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public final void filter(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence query) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlbum() {
        return null;
    }
    
    @java.lang.Override()
    public void onCleared() {
    }
    
    public final int getPlaylistPosition(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper media) {
        return 0;
    }
    
    public final void stopAfter(int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit play(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit togglePlayPause() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit stop() {
        return null;
    }
    
    public final boolean next() {
        return false;
    }
    
    public final boolean previous(boolean force) {
        return false;
    }
    
    public final long getLength() {
        return 0L;
    }
    
    public final boolean getPlaying() {
        return false;
    }
    
    public final boolean getShuffling() {
        return false;
    }
    
    public final boolean getCanShuffle() {
        return false;
    }
    
    public final int getRepeatType() {
        return 0;
    }
    
    public final void setRepeatType(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.medialibrary.interfaces.media.MediaWrapper getCurrentMediaWrapper() {
        return null;
    }
    
    public final int getCurrentMediaPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper> getMedias() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPreviousTotalTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit shuffle() {
        return null;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    public final void setTime(long time, boolean fast) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job load(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.videolan.medialibrary.interfaces.media.MediaWrapper> medialist, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object switchToVideo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object canSwitchToVideo(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit toggleABRepeat() {
        return null;
    }
    
    public final int getVideoTrackCount() {
        return 0;
    }
    
    private final void onServiceChanged(com.dewords.pope.PlaybackService service) {
    }
    
    public final long getTotalTime() {
        return 0L;
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia.Event event) {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dewords/pope/viewmodels/PlaylistModel$Companion;", "", "()V", "get", "Lcom/dewords/pope/viewmodels/PlaylistModel;", "fragment", "Landroidx/fragment/app/Fragment;", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.dewords.pope.viewmodels.PlaylistModel get(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
    }
}