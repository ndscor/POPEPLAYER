package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WidgetMiniBindingImpl extends WidgetMiniBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(1, 
            new String[] {"widget_content_full_player"},
            new int[] {2},
            new int[] {com.dewords.pope.R.layout.widget_content_full_player});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player_container_background, 3);
        sViewsWithIds.put(R.id.cover_parent, 4);
        sViewsWithIds.put(R.id.app_icon, 5);
        sViewsWithIds.put(R.id.cover, 6);
        sViewsWithIds.put(R.id.separator, 7);
        sViewsWithIds.put(R.id.text_container, 8);
        sViewsWithIds.put(R.id.songName, 9);
        sViewsWithIds.put(R.id.artist, 10);
        sViewsWithIds.put(R.id.app_name, 11);
        sViewsWithIds.put(R.id.widget_configure, 12);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WidgetMiniBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private WidgetMiniBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (com.dewords.pope.databinding.WidgetContentFullPlayerBinding) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.RelativeLayout) bindings[0]
            );
        setContainedBinding(this.controls);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.widgetContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        controls.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (controls.hasPendingBindings()) {
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
        controls.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControls((com.dewords.pope.databinding.WidgetContentFullPlayerBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControls(com.dewords.pope.databinding.WidgetContentFullPlayerBinding Controls, int fieldId) {
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
        // batch finished
        executeBindingsOn(controls);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controls
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}