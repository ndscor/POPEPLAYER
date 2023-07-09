package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VideoTrackItemBindingImpl extends VideoTrackItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VideoTrackItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private VideoTrackItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            );
        this.imageView11.setTag(null);
        this.trackContainer.setTag(null);
        this.trackTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.track == variableId) {
            setTrack((com.dewords.pope.gui.dialogs.adapters.VlcTrack) variable);
        }
        else if (BR.contentDescription == variableId) {
            setContentDescription((java.lang.String) variable);
        }
        else if (BR.selected == variableId) {
            setSelected((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTrack(@Nullable com.dewords.pope.gui.dialogs.adapters.VlcTrack Track) {
        this.mTrack = Track;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.track);
        super.requestRebind();
    }
    public void setContentDescription(@Nullable java.lang.String ContentDescription) {
        this.mContentDescription = ContentDescription;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.contentDescription);
        super.requestRebind();
    }
    public void setSelected(@Nullable java.lang.Boolean Selected) {
        this.mSelected = Selected;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.selected);
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
        int selectedTrackTitleAndroidColorWhiteTrackTitleAndroidColorWhiteTransparent50 = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelected = false;
        com.dewords.pope.gui.dialogs.adapters.VlcTrack track = mTrack;
        java.lang.String trackGetId = null;
        java.lang.String contentDescription = mContentDescription;
        java.lang.String trackGetIdEqualsJavaLangString1TrackTitleAndroidStringDisableTrackTrackGetName = null;
        int selectedViewVISIBLEViewINVISIBLE = 0;
        java.lang.String trackGetName = null;
        java.lang.Boolean selected = mSelected;
        boolean trackGetIdEqualsJavaLangString1 = false;

        if ((dirtyFlags & 0x9L) != 0) {



                if (track != null) {
                    // read track.getId()
                    trackGetId = track.getId();
                }


                if (trackGetId != null) {
                    // read track.getId().equals("-1")
                    trackGetIdEqualsJavaLangString1 = trackGetId.equals("-1");
                }
            if((dirtyFlags & 0x9L) != 0) {
                if(trackGetIdEqualsJavaLangString1) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selected)
                androidxDatabindingViewDataBindingSafeUnboxSelected = androidx.databinding.ViewDataBinding.safeUnbox(selected);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSelected) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(selected) ? @android:color/white : @android:color/white_transparent_50
                selectedTrackTitleAndroidColorWhiteTrackTitleAndroidColorWhiteTransparent50 = ((androidxDatabindingViewDataBindingSafeUnboxSelected) ? (getColorFromResource(trackTitle, R.color.white)) : (getColorFromResource(trackTitle, R.color.white_transparent_50)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(selected) ? View.VISIBLE : View.INVISIBLE
                selectedViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxSelected) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (track != null) {
                    // read track.getName()
                    trackGetName = track.getName();
                }
        }

        if ((dirtyFlags & 0x9L) != 0) {

                // read track.getId().equals("-1") ? @android:string/disable_track : track.getName()
                trackGetIdEqualsJavaLangString1TrackTitleAndroidStringDisableTrackTrackGetName = ((trackGetIdEqualsJavaLangString1) ? (trackTitle.getResources().getString(R.string.disable_track)) : (trackGetName));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.imageView11.setVisibility(selectedViewVISIBLEViewINVISIBLE);
            this.trackTitle.setTextColor(selectedTrackTitleAndroidColorWhiteTrackTitleAndroidColorWhiteTransparent50);
            com.dewords.pope.gui.helpers.UiToolsKt.isSelected(this.trackTitle, selected);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.trackTitle.setContentDescription(contentDescription);
            }
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackTitle, trackGetIdEqualsJavaLangString1TrackTitleAndroidStringDisableTrackTrackGetName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.setEllipsizeModeByPref(this.trackTitle, true);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): track
        flag 1 (0x2L): contentDescription
        flag 2 (0x3L): selected
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(selected) ? @android:color/white : @android:color/white_transparent_50
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(selected) ? @android:color/white : @android:color/white_transparent_50
        flag 6 (0x7L): track.getId().equals("-1") ? @android:string/disable_track : track.getName()
        flag 7 (0x8L): track.getId().equals("-1") ? @android:string/disable_track : track.getName()
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(selected) ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(selected) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}