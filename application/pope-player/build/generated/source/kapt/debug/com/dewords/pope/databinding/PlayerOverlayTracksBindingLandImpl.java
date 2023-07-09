package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlayerOverlayTracksBindingLandImpl extends PlayerOverlayTracksBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(1, 
            new String[] {"player_overlay_track_item", "player_overlay_track_item", "player_overlay_track_item"},
            new int[] {2, 3, 4},
            new int[] {com.dewords.pope.R.layout.player_overlay_track_item,
                com.dewords.pope.R.layout.player_overlay_track_item,
                com.dewords.pope.R.layout.player_overlay_track_item});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tracks_separator_2, 5);
        sViewsWithIds.put(R.id.tracks_separator_3, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlayerOverlayTracksBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private PlayerOverlayTracksBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) bindings[3]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[6]
            , (com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) bindings[4]
            );
        setContainedBinding(this.audioTracks);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.playerOverlayTracks.setTag(null);
        setContainedBinding(this.subtitleTracks);
        setContainedBinding(this.videoTracks);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        audioTracks.invalidateAll();
        subtitleTracks.invalidateAll();
        videoTracks.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (audioTracks.hasPendingBindings()) {
            return true;
        }
        if (subtitleTracks.hasPendingBindings()) {
            return true;
        }
        if (videoTracks.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        audioTracks.setLifecycleOwner(lifecycleOwner);
        subtitleTracks.setLifecycleOwner(lifecycleOwner);
        videoTracks.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAudioTracks((com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) object, fieldId);
            case 1 :
                return onChangeSubtitleTracks((com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) object, fieldId);
            case 2 :
                return onChangeVideoTracks((com.dewords.pope.databinding.PlayerOverlayTrackItemBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAudioTracks(com.dewords.pope.databinding.PlayerOverlayTrackItemBinding AudioTracks, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSubtitleTracks(com.dewords.pope.databinding.PlayerOverlayTrackItemBinding SubtitleTracks, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVideoTracks(com.dewords.pope.databinding.PlayerOverlayTrackItemBinding VideoTracks, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        // batch finished
        executeBindingsOn(audioTracks);
        executeBindingsOn(subtitleTracks);
        executeBindingsOn(videoTracks);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): audioTracks
        flag 1 (0x2L): subtitleTracks
        flag 2 (0x3L): videoTracks
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}