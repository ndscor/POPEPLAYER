package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaylistItemBindingImpl extends PlaylistItemBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.playing, 10);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    private OnClickListenerImpl mHolderOnMoveUpClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnDeleteClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHolderOnMoveDownClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public PlaylistItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private PlaylistItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.ImageButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.dewords.pope.gui.view.MiniVisualizer) bindings[10]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[9]
            );
        this.audioItemSubtitle.setTag(null);
        this.audioItemTitle.setTag(null);
        this.coverImage.setTag(null);
        this.itemContainer.setTag(null);
        this.itemDelete.setTag(null);
        this.itemMore.setTag(null);
        this.itemMoveDown.setTag(null);
        this.itemMoveUp.setTag(null);
        this.selector.setTag(null);
        this.tipsOverlay.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
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
        if (BR.subTitle == variableId) {
            setSubTitle((java.lang.String) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.masked == variableId) {
            setMasked((java.lang.Boolean) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder) variable);
        }
        else if (BR.media == variableId) {
            setMedia((org.videolan.medialibrary.interfaces.media.MediaWrapper) variable);
        }
        else if (BR.scaleType == variableId) {
            setScaleType((android.widget.ImageView.ScaleType) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubTitle(@Nullable java.lang.String SubTitle) {
        this.mSubTitle = SubTitle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subTitle);
        super.requestRebind();
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setMasked(@Nullable java.lang.Boolean Masked) {
        this.mMasked = Masked;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.masked);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setMedia(@Nullable org.videolan.medialibrary.interfaces.media.MediaWrapper Media) {
        this.mMedia = Media;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public void setScaleType(@Nullable android.widget.ImageView.ScaleType ScaleType) {
        this.mScaleType = ScaleType;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.scaleType);
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
        boolean textUtilsIsEmptySubTitle = false;
        android.view.View.OnClickListener holderOnMoveUpClickAndroidViewViewOnClickListener = null;
        java.lang.String subTitle = mSubTitle;
        int textUtilsIsEmptySubTitleViewGONEViewVISIBLE = 0;
        int maskedViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener holderOnDeleteClickAndroidViewViewOnClickListener = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener holderOnMoveDownClickAndroidViewViewOnClickListener = null;
        java.lang.Boolean masked = mMasked;
        com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder holder = mHolder;
        java.lang.String mediaTitle = null;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        org.videolan.medialibrary.interfaces.media.MediaWrapper media = mMedia;
        android.widget.ImageView.ScaleType scaleType = mScaleType;
        boolean androidxDatabindingViewDataBindingSafeUnboxMasked = false;

        if ((dirtyFlags & 0x41L) != 0) {



                // read TextUtils.isEmpty(subTitle)
                textUtilsIsEmptySubTitle = android.text.TextUtils.isEmpty(subTitle);
            if((dirtyFlags & 0x41L) != 0) {
                if(textUtilsIsEmptySubTitle) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
                textUtilsIsEmptySubTitleViewGONEViewVISIBLE = ((textUtilsIsEmptySubTitle) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x42L) != 0) {
        }
        if ((dirtyFlags & 0x44L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(masked)
                androidxDatabindingViewDataBindingSafeUnboxMasked = androidx.databinding.ViewDataBinding.safeUnbox(masked);
            if((dirtyFlags & 0x44L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxMasked) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(masked) ? View.VISIBLE : View.GONE
                maskedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMasked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x48L) != 0) {



                if (holder != null) {
                    // read holder::onMoveUpClick
                    holderOnMoveUpClickAndroidViewViewOnClickListener = (((mHolderOnMoveUpClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoveUpClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnMoveUpClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onDeleteClick
                    holderOnDeleteClickAndroidViewViewOnClickListener = (((mHolderOnDeleteClickAndroidViewViewOnClickListener == null) ? (mHolderOnDeleteClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnDeleteClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onMoveDownClick
                    holderOnMoveDownClickAndroidViewViewOnClickListener = (((mHolderOnMoveDownClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoveDownClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnMoveDownClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x50L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemSubtitle, subTitle);
            this.audioItemSubtitle.setVisibility(textUtilsIsEmptySubTitleViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemTitle, mediaTitle);
            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.coverImage, media, (int)0, (boolean)false, true);
            com.dewords.pope.util.AccessibilityHelperKt.mediaDescription(this.selector, media);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.setEllipsizeModeByPref(this.audioItemTitle, true);
            this.selector.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.coverImage.setScaleType(scaleType);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.coverImage, cover);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.itemDelete.setOnClickListener(holderOnDeleteClickAndroidViewViewOnClickListener);
            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.itemMoveDown.setOnClickListener(holderOnMoveDownClickAndroidViewViewOnClickListener);
            this.itemMoveUp.setOnClickListener(holderOnMoveUpClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            this.tipsOverlay.setVisibility(maskedViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoveUpClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onDeleteClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoveDownClick(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value;
        public OnClickListenerImpl3 setValue(com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // media
        org.videolan.medialibrary.interfaces.media.MediaWrapper media = mMedia;
        // holder
        com.dewords.pope.gui.audio.PlaylistAdapter.ViewHolder holder = mHolder;
        // holder != null
        boolean holderJavaLangObjectNull = false;



        holderJavaLangObjectNull = (holder) != (null);
        if (holderJavaLangObjectNull) {




            holder.onClick(callbackArg_0, media);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subTitle
        flag 1 (0x2L): cover
        flag 2 (0x3L): masked
        flag 3 (0x4L): holder
        flag 4 (0x5L): media
        flag 5 (0x6L): scaleType
        flag 6 (0x7L): null
        flag 7 (0x8L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): TextUtils.isEmpty(subTitle) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(masked) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(masked) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}