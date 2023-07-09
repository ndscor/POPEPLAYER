package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlayerHudRightBindingImpl extends PlayerHudRightBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clock, 1);
        sViewsWithIds.put(R.id.player_overlay_navmenu, 2);
        sViewsWithIds.put(R.id.player_screenshot, 3);
        sViewsWithIds.put(R.id.player_overlay_title, 4);
        sViewsWithIds.put(R.id.playlist_toggle, 5);
        sViewsWithIds.put(R.id.video_secondary_display, 6);
        sViewsWithIds.put(R.id.video_renderer, 7);
        sViewsWithIds.put(R.id.quick_actions_container, 8);
        sViewsWithIds.put(R.id.playback_speed_quick_action, 9);
        sViewsWithIds.put(R.id.sleep_quick_action, 10);
        sViewsWithIds.put(R.id.spu_delay_quick_action, 11);
        sViewsWithIds.put(R.id.audio_delay_quick_action, 12);
        sViewsWithIds.put(R.id.icon_barrier, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlayerHudRightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private PlayerHudRightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.chip.Chip) bindings[12]
            , (android.widget.TextClock) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Barrier) bindings[13]
            , (com.google.android.material.chip.Chip) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.HorizontalScrollView) bindings[8]
            , (com.google.android.material.chip.Chip) bindings[10]
            , (com.google.android.material.chip.Chip) bindings[11]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            );
        this.hudRightOverlay.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}