package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AudioPlayerBindingImpl extends AudioPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ab_repeat_container, 24);
        sViewsWithIds.put(R.id.backgroundView, 25);
        sViewsWithIds.put(R.id.top_gradient, 26);
        sViewsWithIds.put(R.id.guideline8, 27);
        sViewsWithIds.put(R.id.guideline9, 28);
        sViewsWithIds.put(R.id.progressBar, 29);
        sViewsWithIds.put(R.id.header, 30);
        sViewsWithIds.put(R.id.header_background, 31);
        sViewsWithIds.put(R.id.header_divider, 32);
        sViewsWithIds.put(R.id.audio_media_switcher, 33);
        sViewsWithIds.put(R.id.playlist_search_text, 34);
        sViewsWithIds.put(R.id.guideline_header_bottom, 35);
        sViewsWithIds.put(R.id.barrier, 36);
        sViewsWithIds.put(R.id.playback_chips, 37);
        sViewsWithIds.put(R.id.playback_speed_quick_action, 38);
        sViewsWithIds.put(R.id.sleep_quick_action, 39);
        sViewsWithIds.put(R.id.songs_list, 40);
        sViewsWithIds.put(R.id.bottom_gradient, 41);
        sViewsWithIds.put(R.id.audio_play_progress, 42);
        sViewsWithIds.put(R.id.cover_media_switcher, 43);
        sViewsWithIds.put(R.id.audio_rewind_text, 44);
        sViewsWithIds.put(R.id.audio_forward_text, 45);
        sViewsWithIds.put(R.id.songs_list_guide, 46);
        sViewsWithIds.put(R.id.timeline, 47);
        sViewsWithIds.put(R.id.centerGuideline, 48);
        sViewsWithIds.put(R.id.hinge_go_left, 49);
        sViewsWithIds.put(R.id.hinge_go_right, 50);
        sViewsWithIds.put(R.id.player_options_container, 51);
        sViewsWithIds.put(R.id.player_options_stub, 52);
        sViewsWithIds.put(R.id.bookmarks_stub, 53);
        sViewsWithIds.put(R.id.bookmark_marker_container, 54);
        sViewsWithIds.put(R.id.ab_repeat_marker_guideline_container, 55);
        sViewsWithIds.put(R.id.ab_repeat_marker_a, 56);
        sViewsWithIds.put(R.id.ab_repeat_marker_b, 57);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mFragmentOnABRepeatResetClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mFragmentOnABRepeatStopClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mFragmentOnStopClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl2 mFragmentOnPreviousClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mFragmentOnNextClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mFragmentOnRepeatClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl1 mFragmentOnJumpBackLongAndroidViewViewOnLongClickListener;
    private OnLongClickListenerImpl2 mFragmentOnJumpForwardLongAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl6 mFragmentOnSearchClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl7 mFragmentOnJumpForwardAndroidViewViewOnClickListener;
    private OnClickListenerImpl8 mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener;
    private OnClickListenerImpl9 mFragmentOnPlayPauseClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl10 mFragmentOnTimeLabelClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl11 mFragmentOnShuffleClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl12 mFragmentOnJumpBackAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AudioPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 58, sIncludes, sViewsWithIds));
    }
    private AudioPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[24]
            , (android.widget.ImageView) bindings[56]
            , (android.widget.ImageView) bindings[57]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (androidx.constraintlayout.widget.Guideline) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[55]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[45]
            , (com.dewords.pope.gui.view.HeaderMediaSwitcher) bindings[33]
            , (android.widget.TextView) bindings[42]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[44]
            , (android.widget.ImageView) bindings[25]
            , (androidx.constraintlayout.widget.Barrier) bindings[36]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[54]
            , (androidx.appcompat.widget.ViewStubCompat) bindings[53]
            , (android.view.View) bindings[41]
            , (androidx.constraintlayout.widget.Guideline) bindings[48]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.dewords.pope.gui.view.CoverMediaSwitcher) bindings[43]
            , null
            , null
            , (androidx.constraintlayout.widget.Guideline) bindings[27]
            , (androidx.constraintlayout.widget.Guideline) bindings[28]
            , (androidx.constraintlayout.widget.Guideline) bindings[35]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[30]
            , (android.view.View) bindings[31]
            , (android.view.View) bindings[32]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[49]
            , (android.widget.ImageView) bindings[50]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[19]
            , (com.google.android.material.chip.ChipGroup) bindings[37]
            , (com.google.android.material.chip.Chip) bindings[38]
            , (android.widget.FrameLayout) bindings[51]
            , (androidx.appcompat.widget.ViewStubCompat) bindings[52]
            , (android.widget.ImageView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ProgressBar) bindings[29]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[17]
            , (com.google.android.material.chip.Chip) bindings[39]
            , null
            , null
            , null
            , (androidx.recyclerview.widget.RecyclerView) bindings[40]
            , (android.view.View) bindings[46]
            , (android.widget.TextView) bindings[15]
            , (com.dewords.pope.gui.view.AccessibleSeekBar) bindings[47]
            , (android.view.View) bindings[26]
            , null
            );
        this.abRepeatMarkerGuidelineA.setTag(null);
        this.abRepeatMarkerGuidelineB.setTag(null);
        this.abRepeatReset.setTag(null);
        this.abRepeatStop.setTag(null);
        this.advFunction.setTag(null);
        this.audioForward10.setTag(null);
        this.audioRewind10.setTag(null);
        this.contentLayout.setTag(null);
        this.headerLargePlayPause.setTag(null);
        this.headerNext.setTag(null);
        this.headerPlayPause.setTag(null);
        this.headerPrevious.setTag(null);
        this.headerRepeat.setTag(null);
        this.headerShuffle.setTag(null);
        this.headerTime.setTag(null);
        this.length.setTag(null);
        this.next.setTag(null);
        this.playPause.setTag(null);
        this.playlistSearch.setTag(null);
        this.playlistSwitch.setTag(null);
        this.previous.setTag(null);
        this.repeat.setTag(null);
        this.shuffle.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.fragment == variableId) {
            setFragment((com.dewords.pope.gui.audio.AudioPlayer) variable);
        }
        else if (BR.ab_repeat_b == variableId) {
            setAbRepeatB((java.lang.Float) variable);
        }
        else if (BR.can_shuffle == variableId) {
            setCanShuffle((java.lang.Boolean) variable);
        }
        else if (BR.ab_repeat_a == variableId) {
            setAbRepeatA((java.lang.Float) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.dewords.pope.gui.audio.AudioPlayer Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setAbRepeatB(@Nullable java.lang.Float AbRepeatB) {
        this.mAbRepeatB = AbRepeatB;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ab_repeat_b);
        super.requestRebind();
    }
    public void setCanShuffle(@Nullable java.lang.Boolean CanShuffle) {
        this.mCanShuffle = CanShuffle;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.can_shuffle);
        super.requestRebind();
    }
    public void setAbRepeatA(@Nullable java.lang.Float AbRepeatA) {
        this.mAbRepeatA = AbRepeatA;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.ab_repeat_a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        android.view.View.OnClickListener fragmentOnABRepeatResetClickAndroidViewViewOnClickListener = null;
        com.dewords.pope.gui.audio.AudioPlayer fragment = mFragment;
        android.view.View.OnClickListener fragmentOnABRepeatStopClickAndroidViewViewOnClickListener = null;
        java.lang.Float abRepeatB = mAbRepeatB;
        android.view.View.OnLongClickListener fragmentOnStopClickAndroidViewViewOnLongClickListener = null;
        android.view.View.OnClickListener fragmentOnPreviousClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnNextClickAndroidViewViewOnClickListener = null;
        float androidxDatabindingViewDataBindingSafeUnboxAbRepeatA = 0f;
        android.view.View.OnClickListener fragmentOnRepeatClickAndroidViewViewOnClickListener = null;
        android.view.View.OnLongClickListener fragmentOnJumpBackLongAndroidViewViewOnLongClickListener = null;
        android.view.View.OnLongClickListener fragmentOnJumpForwardLongAndroidViewViewOnLongClickListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCanShuffle = false;
        java.lang.Boolean canShuffle = mCanShuffle;
        android.view.View.OnClickListener fragmentOnSearchClickAndroidViewViewOnClickListener = null;
        int canShuffleViewVISIBLEViewINVISIBLE = 0;
        android.view.View.OnClickListener fragmentOnJumpForwardAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = null;
        java.lang.Float abRepeatA = mAbRepeatA;
        float androidxDatabindingViewDataBindingSafeUnboxAbRepeatB = 0f;
        android.view.View.OnClickListener fragmentOnPlayPauseClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnTimeLabelClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnShuffleClickAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener fragmentOnJumpBackAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (fragment != null) {
                    // read fragment::onABRepeatResetClick
                    fragmentOnABRepeatResetClickAndroidViewViewOnClickListener = (((mFragmentOnABRepeatResetClickAndroidViewViewOnClickListener == null) ? (mFragmentOnABRepeatResetClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mFragmentOnABRepeatResetClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onABRepeatStopClick
                    fragmentOnABRepeatStopClickAndroidViewViewOnClickListener = (((mFragmentOnABRepeatStopClickAndroidViewViewOnClickListener == null) ? (mFragmentOnABRepeatStopClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mFragmentOnABRepeatStopClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onStopClick
                    fragmentOnStopClickAndroidViewViewOnLongClickListener = (((mFragmentOnStopClickAndroidViewViewOnLongClickListener == null) ? (mFragmentOnStopClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mFragmentOnStopClickAndroidViewViewOnLongClickListener).setValue(fragment));
                    // read fragment::onPreviousClick
                    fragmentOnPreviousClickAndroidViewViewOnClickListener = (((mFragmentOnPreviousClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPreviousClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mFragmentOnPreviousClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onPlaylistSwitchClick
                    fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = (((mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mFragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onNextClick
                    fragmentOnNextClickAndroidViewViewOnClickListener = (((mFragmentOnNextClickAndroidViewViewOnClickListener == null) ? (mFragmentOnNextClickAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mFragmentOnNextClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onRepeatClick
                    fragmentOnRepeatClickAndroidViewViewOnClickListener = (((mFragmentOnRepeatClickAndroidViewViewOnClickListener == null) ? (mFragmentOnRepeatClickAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mFragmentOnRepeatClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onJumpBackLong
                    fragmentOnJumpBackLongAndroidViewViewOnLongClickListener = (((mFragmentOnJumpBackLongAndroidViewViewOnLongClickListener == null) ? (mFragmentOnJumpBackLongAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl1()) : mFragmentOnJumpBackLongAndroidViewViewOnLongClickListener).setValue(fragment));
                    // read fragment::onJumpForwardLong
                    fragmentOnJumpForwardLongAndroidViewViewOnLongClickListener = (((mFragmentOnJumpForwardLongAndroidViewViewOnLongClickListener == null) ? (mFragmentOnJumpForwardLongAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl2()) : mFragmentOnJumpForwardLongAndroidViewViewOnLongClickListener).setValue(fragment));
                    // read fragment::onSearchClick
                    fragmentOnSearchClickAndroidViewViewOnClickListener = (((mFragmentOnSearchClickAndroidViewViewOnClickListener == null) ? (mFragmentOnSearchClickAndroidViewViewOnClickListener = new OnClickListenerImpl6()) : mFragmentOnSearchClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onJumpForward
                    fragmentOnJumpForwardAndroidViewViewOnClickListener = (((mFragmentOnJumpForwardAndroidViewViewOnClickListener == null) ? (mFragmentOnJumpForwardAndroidViewViewOnClickListener = new OnClickListenerImpl7()) : mFragmentOnJumpForwardAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::showAdvancedOptions
                    fragmentShowAdvancedOptionsAndroidViewViewOnClickListener = (((mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener == null) ? (mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener = new OnClickListenerImpl8()) : mFragmentShowAdvancedOptionsAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onPlayPauseClick
                    fragmentOnPlayPauseClickAndroidViewViewOnClickListener = (((mFragmentOnPlayPauseClickAndroidViewViewOnClickListener == null) ? (mFragmentOnPlayPauseClickAndroidViewViewOnClickListener = new OnClickListenerImpl9()) : mFragmentOnPlayPauseClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onTimeLabelClick
                    fragmentOnTimeLabelClickAndroidViewViewOnClickListener = (((mFragmentOnTimeLabelClickAndroidViewViewOnClickListener == null) ? (mFragmentOnTimeLabelClickAndroidViewViewOnClickListener = new OnClickListenerImpl10()) : mFragmentOnTimeLabelClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onShuffleClick
                    fragmentOnShuffleClickAndroidViewViewOnClickListener = (((mFragmentOnShuffleClickAndroidViewViewOnClickListener == null) ? (mFragmentOnShuffleClickAndroidViewViewOnClickListener = new OnClickListenerImpl11()) : mFragmentOnShuffleClickAndroidViewViewOnClickListener).setValue(fragment));
                    // read fragment::onJumpBack
                    fragmentOnJumpBackAndroidViewViewOnClickListener = (((mFragmentOnJumpBackAndroidViewViewOnClickListener == null) ? (mFragmentOnJumpBackAndroidViewViewOnClickListener = new OnClickListenerImpl12()) : mFragmentOnJumpBackAndroidViewViewOnClickListener).setValue(fragment));
                }
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ab_repeat_b)
                androidxDatabindingViewDataBindingSafeUnboxAbRepeatB = androidx.databinding.ViewDataBinding.safeUnbox(abRepeatB);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(can_shuffle)
                androidxDatabindingViewDataBindingSafeUnboxCanShuffle = androidx.databinding.ViewDataBinding.safeUnbox(canShuffle);
            if((dirtyFlags & 0x14L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxCanShuffle) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(can_shuffle) ? View.VISIBLE : View.INVISIBLE
                canShuffleViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxCanShuffle) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(ab_repeat_a)
                androidxDatabindingViewDataBindingSafeUnboxAbRepeatA = androidx.databinding.ViewDataBinding.safeUnbox(abRepeatA);
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.dewords.pope.gui.video.VideoPlayerActivityKt.setConstraintPercent(this.abRepeatMarkerGuidelineA, androidxDatabindingViewDataBindingSafeUnboxAbRepeatA);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            com.dewords.pope.gui.video.VideoPlayerActivityKt.setConstraintPercent(this.abRepeatMarkerGuidelineB, androidxDatabindingViewDataBindingSafeUnboxAbRepeatB);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.abRepeatReset.setOnClickListener(fragmentOnABRepeatResetClickAndroidViewViewOnClickListener);
            this.abRepeatStop.setOnClickListener(fragmentOnABRepeatStopClickAndroidViewViewOnClickListener);
            this.advFunction.setOnClickListener(fragmentShowAdvancedOptionsAndroidViewViewOnClickListener);
            this.audioForward10.setOnClickListener(fragmentOnJumpForwardAndroidViewViewOnClickListener);
            this.audioForward10.setOnLongClickListener(fragmentOnJumpForwardLongAndroidViewViewOnLongClickListener);
            this.audioRewind10.setOnClickListener(fragmentOnJumpBackAndroidViewViewOnClickListener);
            this.audioRewind10.setOnLongClickListener(fragmentOnJumpBackLongAndroidViewViewOnLongClickListener);
            this.headerLargePlayPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.headerLargePlayPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.headerNext.setOnClickListener(fragmentOnNextClickAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.headerPlayPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.headerPrevious.setOnClickListener(fragmentOnPreviousClickAndroidViewViewOnClickListener);
            this.headerRepeat.setOnClickListener(fragmentOnRepeatClickAndroidViewViewOnClickListener);
            this.headerShuffle.setOnClickListener(fragmentOnShuffleClickAndroidViewViewOnClickListener);
            this.headerTime.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
            this.length.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
            this.next.setOnClickListener(fragmentOnNextClickAndroidViewViewOnClickListener);
            this.playPause.setOnClickListener(fragmentOnPlayPauseClickAndroidViewViewOnClickListener);
            this.playPause.setOnLongClickListener(fragmentOnStopClickAndroidViewViewOnLongClickListener);
            this.playlistSearch.setOnClickListener(fragmentOnSearchClickAndroidViewViewOnClickListener);
            this.playlistSwitch.setOnClickListener(fragmentOnPlaylistSwitchClickAndroidViewViewOnClickListener);
            this.previous.setOnClickListener(fragmentOnPreviousClickAndroidViewViewOnClickListener);
            this.repeat.setOnClickListener(fragmentOnRepeatClickAndroidViewViewOnClickListener);
            this.shuffle.setOnClickListener(fragmentOnShuffleClickAndroidViewViewOnClickListener);
            this.time.setOnClickListener(fragmentOnTimeLabelClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.shuffle.setVisibility(canShuffleViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onABRepeatResetClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onABRepeatStopClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onStopClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPreviousClick(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl3 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlaylistSwitchClick(arg0); 
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl4 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onNextClick(arg0); 
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl5 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRepeatClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl1 implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnLongClickListenerImpl1 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onJumpBackLong(arg0); 
        }
    }
    public static class OnLongClickListenerImpl2 implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnLongClickListenerImpl2 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onJumpForwardLong(arg0); 
        }
    }
    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl6 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSearchClick(arg0); 
        }
    }
    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl7 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onJumpForward(arg0); 
        }
    }
    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl8 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.showAdvancedOptions(arg0); 
        }
    }
    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl9 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPlayPauseClick(arg0); 
        }
    }
    public static class OnClickListenerImpl10 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl10 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onTimeLabelClick(arg0); 
        }
    }
    public static class OnClickListenerImpl11 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl11 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onShuffleClick(arg0); 
        }
    }
    public static class OnClickListenerImpl12 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioPlayer value;
        public OnClickListenerImpl12 setValue(com.dewords.pope.gui.audio.AudioPlayer value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onJumpBack(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragment
        flag 1 (0x2L): ab_repeat_b
        flag 2 (0x3L): can_shuffle
        flag 3 (0x4L): ab_repeat_a
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(can_shuffle) ? View.VISIBLE : View.INVISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(can_shuffle) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}