package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AudioBrowserCardItemBindingImpl extends AudioBrowserCardItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl1 mHolderOnMainActionClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AudioBrowserCardItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private AudioBrowserCardItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (com.dewords.pope.gui.view.FadableImageView) bindings[4]
            , (com.dewords.pope.gui.view.FadableImageView) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.view.View) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            );
        this.container.setTag(null);
        this.itemMore.setTag(null);
        this.mainActionButton.setTag(null);
        this.mediaCover.setTag(null);
        this.mediaCoverContainer.setTag(null);
        this.mediaFavorite.setTag(null);
        this.mlItemOverlay.setTag(null);
        this.networkMedia.setTag(null);
        this.networkMediaOff.setTag(null);
        this.networkOffOverlay.setTag(null);
        this.otgMedia.setTag(null);
        this.sdMedia.setTag(null);
        this.selectedCheck.setTag(null);
        this.subtitle.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.isFavorite == variableId) {
            setIsFavorite((boolean) variable);
        }
        else if (BR.item == variableId) {
            setItem((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.isNetwork == variableId) {
            setIsNetwork((boolean) variable);
        }
        else if (BR.isPresent == variableId) {
            setIsPresent((boolean) variable);
        }
        else if (BR.selected == variableId) {
            setSelected((boolean) variable);
        }
        else if (BR.inSelection == variableId) {
            setInSelection((boolean) variable);
        }
        else if (BR.imageWidth == variableId) {
            setImageWidth((int) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder) variable);
        }
        else if (BR.scaleType == variableId) {
            setScaleType((android.widget.ImageView.ScaleType) variable);
        }
        else if (BR.isSD == variableId) {
            setIsSD((boolean) variable);
        }
        else if (BR.isOTG == variableId) {
            setIsOTG((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsFavorite(boolean IsFavorite) {
        this.mIsFavorite = IsFavorite;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isFavorite);
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
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
    }
    public void setIsNetwork(boolean IsNetwork) {
        this.mIsNetwork = IsNetwork;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isNetwork);
        super.requestRebind();
    }
    public void setIsPresent(boolean IsPresent) {
        this.mIsPresent = IsPresent;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.isPresent);
        super.requestRebind();
    }
    public void setSelected(boolean Selected) {
        this.mSelected = Selected;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.selected);
        super.requestRebind();
    }
    public void setInSelection(boolean InSelection) {
        this.mInSelection = InSelection;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.inSelection);
        super.requestRebind();
    }
    public void setImageWidth(int ImageWidth) {
        this.mImageWidth = ImageWidth;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.imageWidth);
        super.requestRebind();
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setScaleType(@Nullable android.widget.ImageView.ScaleType ScaleType) {
        this.mScaleType = ScaleType;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.scaleType);
        super.requestRebind();
    }
    public void setIsSD(boolean IsSD) {
        this.mIsSD = IsSD;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.isSD);
        super.requestRebind();
    }
    public void setIsOTG(boolean IsOTG) {
        this.mIsOTG = IsOTG;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.isOTG);
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
        boolean isFavorite = mIsFavorite;
        int isNetworkViewVISIBLEViewGONE = 0;
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int isFavoriteViewVISIBLEViewGONE = 0;
        boolean isNetwork = mIsNetwork;
        boolean inSelection = false;
        boolean isPresent = mIsPresent;
        int isPresentInSelectionBooleanFalseViewVISIBLEViewGONE = 0;
        int isSDViewVISIBLEViewGONE = 0;
        boolean selected = mSelected;
        int isPresentViewVISIBLEViewGONE = 0;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        java.lang.String itemTitle = null;
        boolean InSelection1 = mInSelection;
        int isOTGViewVISIBLEViewGONE = 0;
        int imageWidth = mImageWidth;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        android.view.View.OnClickListener holderOnMainActionClickAndroidViewViewOnClickListener = null;
        com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder holder = mHolder;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        int selectedViewVISIBLEViewGONE = 0;
        android.widget.ImageView.ScaleType scaleType = mScaleType;
        boolean isSD = mIsSD;
        boolean IsPresent1 = false;
        boolean isPresentInSelectionBooleanFalse = false;
        boolean isOTG = mIsOTG;

        if ((dirtyFlags & 0x2001L) != 0) {

            if((dirtyFlags & 0x2001L) != 0) {
                if(isFavorite) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read isFavorite ? View.VISIBLE : View.GONE
                isFavoriteViewVISIBLEViewGONE = ((isFavorite) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x2082L) != 0) {


            if ((dirtyFlags & 0x2002L) != 0) {

                    if (item != null) {
                        // read item.title
                        itemTitle = item.getTitle();
                    }
            }
        }
        if ((dirtyFlags & 0x2008L) != 0) {

            if((dirtyFlags & 0x2008L) != 0) {
                if(isNetwork) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read isNetwork ? View.VISIBLE : View.GONE
                isNetworkViewVISIBLEViewGONE = ((isNetwork) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x2050L) != 0) {

            if((dirtyFlags & 0x2050L) != 0) {
                if(isPresent) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }

            if ((dirtyFlags & 0x2010L) != 0) {

                    // read !isPresent
                    IsPresent1 = !isPresent;
                if((dirtyFlags & 0x2010L) != 0) {
                    if(IsPresent1) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read !isPresent ? View.VISIBLE : View.GONE
                    isPresentViewVISIBLEViewGONE = ((IsPresent1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x2020L) != 0) {

            if((dirtyFlags & 0x2020L) != 0) {
                if(selected) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read selected ? View.VISIBLE : View.GONE
                selectedViewVISIBLEViewGONE = ((selected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x2100L) != 0) {
        }
        if ((dirtyFlags & 0x2200L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                    // read holder::onMainActionClick
                    holderOnMainActionClickAndroidViewViewOnClickListener = (((mHolderOnMainActionClickAndroidViewViewOnClickListener == null) ? (mHolderOnMainActionClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnMainActionClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x2400L) != 0) {
        }
        if ((dirtyFlags & 0x2800L) != 0) {

            if((dirtyFlags & 0x2800L) != 0) {
                if(isSD) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read isSD ? View.VISIBLE : View.GONE
                isSDViewVISIBLEViewGONE = ((isSD) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x3000L) != 0) {

            if((dirtyFlags & 0x3000L) != 0) {
                if(isOTG) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read isOTG ? View.VISIBLE : View.GONE
                isOTGViewVISIBLEViewGONE = ((isOTG) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x20000000L) != 0) {



                // read !inSelection
                inSelection = !InSelection1;
        }

        if ((dirtyFlags & 0x2050L) != 0) {

                // read isPresent ? !inSelection : false
                isPresentInSelectionBooleanFalse = ((isPresent) ? (inSelection) : (false));
            if((dirtyFlags & 0x2050L) != 0) {
                if(isPresentInSelectionBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read isPresent ? !inSelection : false ? View.VISIBLE : View.GONE
                isPresentInSelectionBooleanFalseViewVISIBLEViewGONE = ((isPresentInSelectionBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2020L) != 0) {
            // api target 1

            this.container.setSelected(selected);
            com.dewords.pope.gui.helpers.UiToolsKt.selectedPadding(this.container, selected);
            com.dewords.pope.gui.helpers.UiToolsKt.selectedElevation(this.mediaCoverContainer, selected);
            this.mlItemOverlay.setVisibility(selectedViewVISIBLEViewGONE);
            this.selectedCheck.setVisibility(selectedViewVISIBLEViewGONE);
            com.dewords.pope.gui.helpers.UiToolsKt.selectedElevation(this.selectedCheck, selected);
        }
        if ((dirtyFlags & 0x2002L) != 0) {
            // api target 1

            com.dewords.pope.util.AccessibilityHelperKt.mediaDescription(this.container, item);
            com.dewords.pope.util.KextensionsKt.asyncTextItem(this.subtitle, item);
            com.dewords.pope.gui.helpers.ImageLoaderKt.placeHolderView(this.subtitle, item);
            com.dewords.pope.util.KextensionsKt.asyncText(this.title, itemTitle);
            com.dewords.pope.gui.helpers.ImageLoaderKt.placeHolderView(this.title, item);
        }
        if ((dirtyFlags & 0x2200L) != 0) {
            // api target 1

            this.container.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.container.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mainActionButton.setOnClickListener(holderOnMainActionClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x2050L) != 0) {
            // api target 1

            this.itemMore.setVisibility(isPresentInSelectionBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2400L) != 0) {
            // api target 1

            this.mediaCover.setScaleType(scaleType);
        }
        if ((dirtyFlags & 0x2100L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mediaCover, cover);
        }
        if ((dirtyFlags & 0x2082L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.mediaCover, item, imageWidth, (boolean)false, true);
        }
        if ((dirtyFlags & 0x2001L) != 0) {
            // api target 1

            this.mediaFavorite.setVisibility(isFavoriteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2008L) != 0) {
            // api target 1

            this.networkMedia.setVisibility(isNetworkViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2010L) != 0) {
            // api target 1

            this.networkMediaOff.setVisibility(isPresentViewVISIBLEViewGONE);
            this.networkOffOverlay.setVisibility(isPresentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.otgMedia.setVisibility(isOTGViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            this.sdMedia.setVisibility(isSDViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.setEllipsizeModeByPref(this.title, true);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMainActionClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.audio.AudioBrowserAdapter.MediaItemCardViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isFavorite
        flag 1 (0x2L): item
        flag 2 (0x3L): bgColor
        flag 3 (0x4L): isNetwork
        flag 4 (0x5L): isPresent
        flag 5 (0x6L): selected
        flag 6 (0x7L): inSelection
        flag 7 (0x8L): imageWidth
        flag 8 (0x9L): cover
        flag 9 (0xaL): holder
        flag 10 (0xbL): scaleType
        flag 11 (0xcL): isSD
        flag 12 (0xdL): isOTG
        flag 13 (0xeL): null
        flag 14 (0xfL): isNetwork ? View.VISIBLE : View.GONE
        flag 15 (0x10L): isNetwork ? View.VISIBLE : View.GONE
        flag 16 (0x11L): isFavorite ? View.VISIBLE : View.GONE
        flag 17 (0x12L): isFavorite ? View.VISIBLE : View.GONE
        flag 18 (0x13L): isPresent ? !inSelection : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): isPresent ? !inSelection : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): isSD ? View.VISIBLE : View.GONE
        flag 21 (0x16L): isSD ? View.VISIBLE : View.GONE
        flag 22 (0x17L): !isPresent ? View.VISIBLE : View.GONE
        flag 23 (0x18L): !isPresent ? View.VISIBLE : View.GONE
        flag 24 (0x19L): isOTG ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): isOTG ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): selected ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): selected ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): isPresent ? !inSelection : false
        flag 29 (0x1eL): isPresent ? !inSelection : false
    flag mapping end*/
    //end
}