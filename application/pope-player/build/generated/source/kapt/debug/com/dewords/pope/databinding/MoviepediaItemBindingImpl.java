package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MoviepediaItemBindingImpl extends MoviepediaItemBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

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
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MoviepediaItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private MoviepediaItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.itemDescription.setTag(null);
        this.itemImage.setTag(null);
        this.itemTitle.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setHandler((com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler) variable);
        }
        else if (BR.item == variableId) {
            setItem((com.dewords.pope.models.resolver.ResolverMedia) variable);
        }
        else if (BR.imageUrl == variableId) {
            setImageUrl((android.net.Uri) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setItem(@Nullable com.dewords.pope.models.resolver.ResolverMedia Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setImageUrl(@Nullable android.net.Uri ImageUrl) {
        this.mImageUrl = ImageUrl;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.imageUrl);
        super.requestRebind();
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
        com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler handler = mHandler;
        com.dewords.pope.models.resolver.ResolverMedia item = mItem;
        android.net.Uri imageUrl = mImageUrl;
        int bgColor = mBgColor;
        java.lang.String ItemTitle1 = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;

        if ((dirtyFlags & 0x22L) != 0) {



                if (item != null) {
                    // read item.title()
                    ItemTitle1 = item.title();
                }
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            com.dewords.moviepedia.ui.MediaScrapingResultAdapterKt.showYear(this.itemDescription, item);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemTitle, ItemTitle1);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemImage, cover);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.ImageLoaderKt.downloadIcon(this.itemImage, imageUrl, (boolean)false);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, androidx.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.dewords.moviepedia.ui.MediaScrapingActivity.ClickHandler handler = mHandler;
        // item
        com.dewords.pope.models.resolver.ResolverMedia item = mItem;
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
        flag 2 (0x3L): imageUrl
        flag 3 (0x4L): bgColor
        flag 4 (0x5L): cover
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}