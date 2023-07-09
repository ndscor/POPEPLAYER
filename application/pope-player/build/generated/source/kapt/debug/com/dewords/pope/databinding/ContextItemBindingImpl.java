package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContextItemBindingImpl extends ContextItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContextItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ContextItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.contextOptionIcon.setTag(null);
        this.contextOptionTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.option == variableId) {
            setOption((com.dewords.pope.gui.dialogs.CtxOption) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOption(@Nullable com.dewords.pope.gui.dialogs.CtxOption Option) {
        this.mOption = Option;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.option);
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
        boolean optionIconInt0 = false;
        int optionIconInt0ViewVISIBLEViewGONE = 0;
        java.lang.String optionTitle = null;
        int optionIcon = 0;
        com.dewords.pope.gui.dialogs.CtxOption option = mOption;

        if ((dirtyFlags & 0x3L) != 0) {



                if (option != null) {
                    // read option.title
                    optionTitle = option.getTitle();
                    // read option.icon
                    optionIcon = option.getIcon();
                }


                // read option.icon != 0
                optionIconInt0 = (optionIcon) != (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(optionIconInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read option.icon != 0 ? View.VISIBLE : View.GONE
                optionIconInt0ViewVISIBLEViewGONE = ((optionIconInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.contextOptionIcon.setVisibility(optionIconInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contextOptionTitle, optionTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): option
        flag 1 (0x2L): null
        flag 2 (0x3L): option.icon != 0 ? View.VISIBLE : View.GONE
        flag 3 (0x4L): option.icon != 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}