package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlayerHudBindingImpl extends PlayerHudBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener, com.dewords.pope.generated.callback.OnLongClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ab_repeat_container, 12);
        sViewsWithIds.put(R.id.stats_container, 13);
        sViewsWithIds.put(R.id.stats_scrollview, 14);
        sViewsWithIds.put(R.id.stats_scrollview_content, 15);
        sViewsWithIds.put(R.id.info_grids, 16);
        sViewsWithIds.put(R.id.stats_graphs, 17);
        sViewsWithIds.put(R.id.video_stats_title, 18);
        sViewsWithIds.put(R.id.plotView, 19);
        sViewsWithIds.put(R.id.stats_close, 20);
        sViewsWithIds.put(R.id.ab_repeat_reset, 21);
        sViewsWithIds.put(R.id.ab_repeat_stop, 22);
        sViewsWithIds.put(R.id.bookmarks_stub, 23);
        sViewsWithIds.put(R.id.bookmark_marker_container, 24);
        sViewsWithIds.put(R.id.ab_repeat_marker_guideline_container, 25);
        sViewsWithIds.put(R.id.ab_repeat_marker_a, 26);
        sViewsWithIds.put(R.id.ab_repeat_marker_b, 27);
        sViewsWithIds.put(R.id.orientation_toggle, 28);
        sViewsWithIds.put(R.id.player_space_left, 29);
        sViewsWithIds.put(R.id.player_overlay_rewind, 30);
        sViewsWithIds.put(R.id.player_overlay_rewind_text, 31);
        sViewsWithIds.put(R.id.player_overlay_forward, 32);
        sViewsWithIds.put(R.id.player_overlay_forward_text, 33);
        sViewsWithIds.put(R.id.player_space_right, 34);
        sViewsWithIds.put(R.id.swipe_to_unlock, 35);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    private OnClickListenerImpl mPlayerOnAudioSubClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public PlayerHudBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private PlayerHudBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[12]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[27]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[23])
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.TextView) bindings[33]
            , (com.dewords.pope.gui.view.FocusableTextView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (com.dewords.pope.gui.view.AccessibleSeekBar) bindings[3]
            , (com.dewords.pope.gui.view.FocusableTextView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (androidx.legacy.widget.Space) bindings[29]
            , (androidx.legacy.widget.Space) bindings[34]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (org.videolan.liveplotgraph.PlotView) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (com.dewords.pope.gui.view.SwipeToUnlockView) bindings[35]
            , (android.widget.TextView) bindings[18]
            );
        this.abRepeatMarkerGuidelineA.setTag(null);
        this.abRepeatMarkerGuidelineB.setTag(null);
        this.bookmarksStub.setContainingBinding(this);
        this.playerOverlayAdvFunction.setTag(null);
        this.playerOverlayLength.setTag(null);
        this.playerOverlayPlay.setTag(null);
        this.playerOverlaySeekbar.setTag(null);
        this.playerOverlayTime.setTag(null);
        this.playerOverlayTracks.setTag(null);
        this.playerResize.setTag(null);
        this.playlistNext.setTag(null);
        this.playlistPrevious.setTag(null);
        this.progressOverlay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.dewords.pope.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.dewords.pope.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.dewords.pope.generated.callback.OnClickListener(this, 6);
        mCallback5 = new com.dewords.pope.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.dewords.pope.generated.callback.OnClickListener(this, 5);
        mCallback4 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.dewords.pope.generated.callback.OnLongClickListener(this, 7);
        mCallback7 = new com.dewords.pope.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ab_repeat_b == variableId) {
            setAbRepeatB((java.lang.Float) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((androidx.lifecycle.LiveData<com.dewords.pope.media.Progress>) variable);
        }
        else if (BR.ab_repeat_a == variableId) {
            setAbRepeatA((java.lang.Float) variable);
        }
        else if (BR.player == variableId) {
            setPlayer((com.dewords.pope.gui.video.VideoPlayerActivity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAbRepeatB(@Nullable java.lang.Float AbRepeatB) {
        this.mAbRepeatB = AbRepeatB;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ab_repeat_b);
        super.requestRebind();
    }
    public void setProgress(@Nullable androidx.lifecycle.LiveData<com.dewords.pope.media.Progress> Progress) {
        updateLiveDataRegistration(0, Progress);
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public void setAbRepeatA(@Nullable java.lang.Float AbRepeatA) {
        this.mAbRepeatA = AbRepeatA;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.ab_repeat_a);
        super.requestRebind();
    }
    public void setPlayer(@Nullable com.dewords.pope.gui.video.VideoPlayerActivity Player) {
        this.mPlayer = Player;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.player);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeProgress((androidx.lifecycle.LiveData<com.dewords.pope.media.Progress>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeProgress(androidx.lifecycle.LiveData<com.dewords.pope.media.Progress> Progress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Float abRepeatB = mAbRepeatB;
        float androidxDatabindingViewDataBindingSafeUnboxAbRepeatA = 0f;
        long progressTime = 0;
        com.dewords.pope.PlaybackService playerService = null;
        com.dewords.pope.media.Progress progressGetValue = null;
        androidx.lifecycle.LiveData<com.dewords.pope.media.Progress> progress = mProgress;
        int playerServiceGetTimeProgressTime = 0;
        int intProgressLength = 0;
        android.view.View.OnClickListener playerOnAudioSubClickAndroidViewViewOnClickListener = null;
        java.lang.Float abRepeatA = mAbRepeatA;
        long progressLength = 0;
        float androidxDatabindingViewDataBindingSafeUnboxAbRepeatB = 0f;
        java.lang.String toolsMillisToStringProgressTime = null;
        com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;

        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ab_repeat_b)
                androidxDatabindingViewDataBindingSafeUnboxAbRepeatB = androidx.databinding.ViewDataBinding.safeUnbox(abRepeatB);
        }
        if ((dirtyFlags & 0x19L) != 0) {



                if (progress != null) {
                    // read progress.getValue()
                    progressGetValue = progress.getValue();
                }
                if (player != null) {
                    // read player.service
                    playerService = player.getService();
                }


                if (progressGetValue != null) {
                    // read progress.getValue().time
                    progressTime = progressGetValue.getTime();
                }


                if (playerService != null) {
                    // read player.service.getTime(progress.getValue().time)
                    playerServiceGetTimeProgressTime = playerService.getTime(progressTime);
                }
            if ((dirtyFlags & 0x11L) != 0) {

                    // read Tools.millisToString(progress.getValue().time)
                    toolsMillisToStringProgressTime = org.videolan.medialibrary.Tools.millisToString(progressTime);
            }
            if ((dirtyFlags & 0x11L) != 0) {

                    if (progressGetValue != null) {
                        // read progress.getValue().length
                        progressLength = progressGetValue.getLength();
                    }


                    // read (int) progress.getValue().length
                    intProgressLength = ((int) (progressLength));
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (player != null) {
                        // read player::onAudioSubClick
                        playerOnAudioSubClickAndroidViewViewOnClickListener = (((mPlayerOnAudioSubClickAndroidViewViewOnClickListener == null) ? (mPlayerOnAudioSubClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mPlayerOnAudioSubClickAndroidViewViewOnClickListener).setValue(player));
                    }
            }
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ab_repeat_a)
                androidxDatabindingViewDataBindingSafeUnboxAbRepeatA = androidx.databinding.ViewDataBinding.safeUnbox(abRepeatA);
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            com.dewords.pope.gui.video.VideoPlayerActivityKt.setConstraintPercent(this.abRepeatMarkerGuidelineA, androidxDatabindingViewDataBindingSafeUnboxAbRepeatA);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            com.dewords.pope.gui.video.VideoPlayerActivityKt.setConstraintPercent(this.abRepeatMarkerGuidelineB, androidxDatabindingViewDataBindingSafeUnboxAbRepeatB);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.playerOverlayAdvFunction.setOnClickListener(mCallback11);
            this.playerOverlayLength.setOnClickListener(mCallback5);
            this.playerOverlayPlay.setOnClickListener(mCallback7);
            this.playerOverlayTime.setOnClickListener(mCallback4);
            this.playerResize.setOnClickListener(mCallback9);
            this.playerResize.setOnLongClickListener(mCallback10);
            this.playlistNext.setOnClickListener(mCallback8);
            this.playlistPrevious.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            com.dewords.pope.gui.video.VideoPlayerActivityKt.setPlaybackTime(this.playerOverlayLength, progressLength, progressTime);
            com.dewords.pope.gui.video.VideoPlayerActivityKt.setProgressMax(this.playerOverlaySeekbar, intProgressLength);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.playerOverlayTime, toolsMillisToStringProgressTime);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.playerOverlaySeekbar, playerServiceGetTimeProgressTime);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.playerOverlayTracks.setOnClickListener(playerOnAudioSubClickAndroidViewViewOnClickListener);
        }
        if (bookmarksStub.getBinding() != null) {
            executeBindingsOn(bookmarksStub.getBinding());
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.video.VideoPlayerActivity value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.video.VideoPlayerActivity value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAudioSubClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.showAdvancedOptions();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.previous();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // player.resizeVideo()
                java.lang.Boolean playerResizeVideo = null;
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    playerResizeVideo = player.resizeVideo();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.toggleTimeDisplay();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.next();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.toggleTimeDisplay();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // player != null
                boolean playerJavaLangObjectNull = false;
                // player
                com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



                playerJavaLangObjectNull = (player) != (null);
                if (playerJavaLangObjectNull) {


                    player.doPlayPause();
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // player != null
        boolean playerJavaLangObjectNull = false;
        // player.displayResize()
        boolean playerDisplayResize = false;
        // player
        com.dewords.pope.gui.video.VideoPlayerActivity player = mPlayer;



        playerJavaLangObjectNull = (player) != (null);
        if (playerJavaLangObjectNull) {


            playerDisplayResize = player.displayResize();
        }
        return playerDisplayResize;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): progress
        flag 1 (0x2L): ab_repeat_b
        flag 2 (0x3L): ab_repeat_a
        flag 3 (0x4L): player
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}