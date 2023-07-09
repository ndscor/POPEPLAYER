package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PreferenceItemBindingImpl extends PreferenceItemBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.separator, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PreferenceItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private PreferenceItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.categoryText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subtitle.setTag(null);
        this.textView16.setTag(null);
        setRootTag(root);
        // listeners
        mCallback13 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.handler == variableId) {
            setHandler((com.dewords.pope.gui.preferences.search.PreferenceItemAdapter.ClickHandler) variable);
        }
        else if (BR.item == variableId) {
            setItem((com.dewords.pope.gui.preferences.search.PreferenceItem) variable);
        }
        else if (BR.category == variableId) {
            setCategory((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.query == variableId) {
            setQuery((java.lang.String) variable);
        }
        else if (BR.description == variableId) {
            setDescription((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.preferences.search.PreferenceItemAdapter.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setItem(@Nullable com.dewords.pope.gui.preferences.search.PreferenceItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setCategory(@Nullable java.lang.String Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setQuery(@Nullable java.lang.String Query) {
        this.mQuery = Query;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.query);
        super.requestRebind();
    }
    public void setDescription(@Nullable java.lang.String Description) {
        this.mDescription = Description;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.description);
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
        com.dewords.pope.gui.preferences.search.PreferenceItemAdapter.ClickHandler handler = mHandler;
        com.dewords.pope.gui.preferences.search.PreferenceItem item = mItem;
        java.lang.String category = mCategory;
        java.lang.String title = mTitle;
        java.lang.String query = mQuery;
        java.lang.String description = mDescription;

        if ((dirtyFlags & 0x44L) != 0) {
        }
        if ((dirtyFlags & 0x58L) != 0) {
        }
        if ((dirtyFlags & 0x78L) != 0) {


            if ((dirtyFlags & 0x58L) != 0) {
            }
        }
        if ((dirtyFlags & 0x70L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.categoryText, category);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback13);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            com.dewords.pope.gui.preferences.search.PreferenceItemAdapterKt.searchText(this.subtitle, description, query);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            com.dewords.pope.gui.preferences.search.PreferenceItemAdapterKt.searchText(this.textView16, title, query);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.dewords.pope.gui.preferences.search.PreferenceItemAdapter.ClickHandler handler = mHandler;
        // item
        com.dewords.pope.gui.preferences.search.PreferenceItem item = mItem;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            handler.onClick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): item
        flag 2 (0x3L): category
        flag 3 (0x4L): title
        flag 4 (0x5L): query
        flag 5 (0x6L): description
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}