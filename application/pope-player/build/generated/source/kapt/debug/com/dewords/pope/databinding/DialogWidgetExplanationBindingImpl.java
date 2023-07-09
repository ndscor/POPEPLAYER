package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogWidgetExplanationBindingImpl extends DialogWidgetExplanationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.step1, 1);
        sViewsWithIds.put(R.id.step2, 2);
        sViewsWithIds.put(R.id.step3, 3);
        sViewsWithIds.put(R.id.title, 4);
        sViewsWithIds.put(R.id.textView32, 5);
        sViewsWithIds.put(R.id.widget_sizes, 6);
        sViewsWithIds.put(R.id.widget_resize_text, 7);
        sViewsWithIds.put(R.id.widget_resize, 8);
        sViewsWithIds.put(R.id.widget_resize_handle, 9);
        sViewsWithIds.put(R.id.resizeLongTapIcon, 10);
        sViewsWithIds.put(R.id.imageView19, 11);
        sViewsWithIds.put(R.id.widget_explanation_step3_text, 12);
        sViewsWithIds.put(R.id.widget_next_button, 13);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogWidgetExplanationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private DialogWidgetExplanationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (androidx.constraintlayout.widget.Group) bindings[1]
            , (androidx.constraintlayout.widget.Group) bindings[2]
            , (androidx.constraintlayout.widget.Group) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.ImageView) bindings[8]
            , (com.dewords.pope.gui.view.WidgetHandleView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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