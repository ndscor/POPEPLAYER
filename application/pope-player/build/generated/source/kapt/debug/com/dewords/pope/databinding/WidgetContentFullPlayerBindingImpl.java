package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WidgetContentFullPlayerBindingImpl extends WidgetContentFullPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.widget_left_space, 1);
        sViewsWithIds.put(R.id.backward, 2);
        sViewsWithIds.put(R.id.seek_rewind, 3);
        sViewsWithIds.put(R.id.seek_rewind_text, 4);
        sViewsWithIds.put(R.id.play_pause, 5);
        sViewsWithIds.put(R.id.progress_round, 6);
        sViewsWithIds.put(R.id.seek_forward, 7);
        sViewsWithIds.put(R.id.seek_forward_text, 8);
        sViewsWithIds.put(R.id.forward, 9);
        sViewsWithIds.put(R.id.widget_right_space, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WidgetContentFullPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private WidgetContentFullPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[10]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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