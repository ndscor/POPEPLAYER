package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchItemBindingImpl extends SearchItemBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SearchItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.itemDescription.setTag(null);
        this.itemImage.setTag(null);
        this.itemTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setHandler((com.dewords.pope.gui.SearchActivity.ClickHandler) variable);
        }
        else if (BR.item == variableId) {
            setItem((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.SearchResultAdapter.ViewHolder) variable);
        }
        else if (BR.isSquare == variableId) {
            setIsSquare((java.lang.Boolean) variable);
        }
        else if (BR.coverWidth == variableId) {
            setCoverWidth((int) variable);
        }
        else if (BR.description == variableId) {
            setDescription((java.lang.String) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.SearchActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setItem(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.SearchResultAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
    }
    public void setIsSquare(@Nullable java.lang.Boolean IsSquare) {
        this.mIsSquare = IsSquare;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isSquare);
        super.requestRebind();
    }
    public void setCoverWidth(int CoverWidth) {
        this.mCoverWidth = CoverWidth;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.coverWidth);
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
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.cover);
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
        com.dewords.pope.gui.SearchActivity.ClickHandler handler = mHandler;
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSquare = false;
        java.lang.Boolean isSquare = mIsSquare;
        java.lang.String ItemTitle1 = null;
        int coverWidth = mCoverWidth;
        java.lang.String description = mDescription;
        android.graphics.drawable.BitmapDrawable cover = mCover;

        if ((dirtyFlags & 0x92L) != 0) {


            if ((dirtyFlags & 0x82L) != 0) {

                    if (item != null) {
                        // read item.title
                        ItemTitle1 = item.getTitle();
                    }
            }
        }
        if ((dirtyFlags & 0x98L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSquare)
                androidxDatabindingViewDataBindingSafeUnboxIsSquare = androidx.databinding.ViewDataBinding.safeUnbox(isSquare);
        }
        if ((dirtyFlags & 0x9aL) != 0) {


            if ((dirtyFlags & 0x92L) != 0) {
            }
            if ((dirtyFlags & 0x98L) != 0) {
            }
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemDescription, description);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemImage, cover);
        }
        if ((dirtyFlags & 0x92L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.itemImage, item, coverWidth, (boolean)false, (boolean)false);
        }
        if ((dirtyFlags & 0x98L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.ImageLoaderKt.constraintRatio(this.itemImage, androidxDatabindingViewDataBindingSafeUnboxIsSquare, coverWidth);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemTitle, ItemTitle1);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.dewords.pope.gui.SearchActivity.ClickHandler handler = mHandler;
        // item
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {



            handler.onItemClick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): item
        flag 2 (0x3L): holder
        flag 3 (0x4L): isSquare
        flag 4 (0x5L): coverWidth
        flag 5 (0x6L): description
        flag 6 (0x7L): cover
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}