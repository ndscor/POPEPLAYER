package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class EqualizerBindingImpl extends EqualizerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.equalizer_container, 4);
        sViewsWithIds.put(R.id.eq_title, 5);
        sViewsWithIds.put(R.id.equalizer_button, 6);
        sViewsWithIds.put(R.id.equalizer_presets, 7);
        sViewsWithIds.put(R.id.textView10, 8);
        sViewsWithIds.put(R.id.textView11, 9);
        sViewsWithIds.put(R.id.equalizer_preamp, 10);
        sViewsWithIds.put(R.id.equalizer_bands, 11);
        sViewsWithIds.put(R.id.snapBands, 12);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public EqualizerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private EqualizerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.appcompat.widget.SwitchCompat) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.Button) bindings[1]
            , (com.google.android.material.slider.Slider) bindings[10]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[7]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (androidx.appcompat.widget.SwitchCompat) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.equalizerDelete.setTag(null);
        this.equalizerRevert.setTag(null);
        this.equalizerSave.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.state == variableId) {
            setState((com.dewords.pope.gui.audio.EqualizerFragment.EqualizerState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable com.dewords.pope.gui.audio.EqualizerFragment.EqualizerState State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.state);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStateSaveButtonVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeStateDeleteButtonVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeStateRevertButtonVisibility((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStateSaveButtonVisibility(androidx.databinding.ObservableBoolean StateSaveButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStateDeleteButtonVisibility(androidx.databinding.ObservableBoolean StateDeleteButtonVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeStateRevertButtonVisibility(androidx.databinding.ObservableBoolean StateRevertButtonVisibility, int fieldId) {
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
        boolean stateRevertButtonVisibilityGet = false;
        androidx.databinding.ObservableBoolean stateSaveButtonVisibility = null;
        com.dewords.pope.gui.audio.EqualizerFragment.EqualizerState state = mState;
        boolean stateSaveButtonVisibilityGet = false;
        androidx.databinding.ObservableBoolean stateDeleteButtonVisibility = null;
        androidx.databinding.ObservableBoolean stateRevertButtonVisibility = null;
        boolean stateDeleteButtonVisibilityGet = false;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (state != null) {
                        // read state.saveButtonVisibility
                        stateSaveButtonVisibility = state.getSaveButtonVisibility();
                    }
                    updateRegistration(0, stateSaveButtonVisibility);


                    if (stateSaveButtonVisibility != null) {
                        // read state.saveButtonVisibility.get()
                        stateSaveButtonVisibilityGet = stateSaveButtonVisibility.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (state != null) {
                        // read state.deleteButtonVisibility
                        stateDeleteButtonVisibility = state.getDeleteButtonVisibility();
                    }
                    updateRegistration(1, stateDeleteButtonVisibility);


                    if (stateDeleteButtonVisibility != null) {
                        // read state.deleteButtonVisibility.get()
                        stateDeleteButtonVisibilityGet = stateDeleteButtonVisibility.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (state != null) {
                        // read state.revertButtonVisibility
                        stateRevertButtonVisibility = state.getRevertButtonVisibility();
                    }
                    updateRegistration(2, stateRevertButtonVisibility);


                    if (stateRevertButtonVisibility != null) {
                        // read state.revertButtonVisibility.get()
                        stateRevertButtonVisibilityGet = stateRevertButtonVisibility.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.equalizerDelete.setEnabled(stateDeleteButtonVisibilityGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.equalizerRevert.setEnabled(stateRevertButtonVisibilityGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.equalizerSave.setEnabled(stateSaveButtonVisibilityGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): state.saveButtonVisibility
        flag 1 (0x2L): state.deleteButtonVisibility
        flag 2 (0x3L): state.revertButtonVisibility
        flag 3 (0x4L): state
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}