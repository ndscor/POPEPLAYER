package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogDisplaySettingsBindingImpl extends DialogDisplaySettingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title, 1);
        sViewsWithIds.put(R.id.display_mode_group, 2);
        sViewsWithIds.put(R.id.display_in_list_text, 3);
        sViewsWithIds.put(R.id.display_in_list_image, 4);
        sViewsWithIds.put(R.id.show_all_artist_group, 5);
        sViewsWithIds.put(R.id.show_all_artist_text, 6);
        sViewsWithIds.put(R.id.show_all_artist_checkbox, 7);
        sViewsWithIds.put(R.id.only_favs_group, 8);
        sViewsWithIds.put(R.id.only_favs_text, 9);
        sViewsWithIds.put(R.id.only_favs_checkbox, 10);
        sViewsWithIds.put(R.id.video_groups_group, 11);
        sViewsWithIds.put(R.id.video_group_text, 12);
        sViewsWithIds.put(R.id.video_group_spinner, 13);
        sViewsWithIds.put(R.id.sorts_title, 14);
        sViewsWithIds.put(R.id.sorts_container, 15);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogDisplaySettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private DialogDisplaySettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[2]
            , (android.widget.CheckBox) bindings[10]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.CheckBox) bindings[7]
            , (android.view.View) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.Spinner) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[11]
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