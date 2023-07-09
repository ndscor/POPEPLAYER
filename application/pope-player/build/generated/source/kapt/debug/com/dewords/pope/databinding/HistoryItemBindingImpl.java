package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryItemBindingImpl extends HistoryItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout4, 9);
        sViewsWithIds.put(R.id.song_marker, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl1 mHolderOnImageClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public HistoryItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private HistoryItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            );
        this.icon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.missingMedia.setTag(null);
        this.missingOverlay.setTag(null);
        this.networkMedia.setTag(null);
        this.otgMedia.setTag(null);
        this.sdMedia.setTag(null);
        this.subtitle.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.isNetwork == variableId) {
            setIsNetwork((boolean) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.HistoryAdapter.ViewHolder) variable);
        }
        else if (BR.media == variableId) {
            setMedia((org.videolan.medialibrary.interfaces.media.MediaWrapper) variable);
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

    public void setIsNetwork(boolean IsNetwork) {
        this.mIsNetwork = IsNetwork;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isNetwork);
        super.requestRebind();
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.HistoryAdapter.ViewHolder Holder) {
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
    public void setIsSD(boolean IsSD) {
        this.mIsSD = IsSD;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.isSD);
        super.requestRebind();
    }
    public void setIsOTG(boolean IsOTG) {
        this.mIsOTG = IsOTG;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
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
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        boolean mediaIsPresent = false;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        boolean isNetwork = mIsNetwork;
        int bgColor = mBgColor;
        boolean isSDMediaIsPresentBooleanFalse = false;
        int isOTGMediaIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        int mediaIsPresentViewVISIBLEViewGONE = 0;
        boolean MediaIsPresent1 = false;
        int isNetworkMediaIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean isNetworkMediaIsPresentBooleanFalse = false;
        int isSDMediaIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        int textUtilsIsEmptyMediaDescriptionViewGONEViewVISIBLE = 0;
        com.dewords.pope.gui.HistoryAdapter.ViewHolder holder = mHolder;
        java.lang.String mediaTitle = null;
        boolean textUtilsIsEmptyMediaDescription = false;
        org.videolan.medialibrary.interfaces.media.MediaWrapper media = mMedia;
        boolean isOTGMediaIsPresentBooleanFalse = false;
        android.view.View.OnClickListener holderOnImageClickAndroidViewViewOnClickListener = null;
        int mediaIsPresentViewGONEViewVISIBLE = 0;
        boolean isSD = mIsSD;
        boolean isOTG = mIsOTG;
        java.lang.String mediaDescription = null;

        if ((dirtyFlags & 0x91L) != 0) {

            if((dirtyFlags & 0x91L) != 0) {
                if(isNetwork) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }
        if ((dirtyFlags & 0x82L) != 0) {
        }
        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                    // read holder::onImageClick
                    holderOnImageClickAndroidViewViewOnClickListener = (((mHolderOnImageClickAndroidViewViewOnClickListener == null) ? (mHolderOnImageClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnImageClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x90L) != 0) {



                if (media != null) {
                    // read media.isPresent
                    MediaIsPresent1 = media.isPresent();
                    // read media.title
                    mediaTitle = media.getTitle();
                    // read media.description
                    mediaDescription = media.getDescription();
                }
            if((dirtyFlags & 0x90L) != 0) {
                if(MediaIsPresent1) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read !media.isPresent
                mediaIsPresent = !MediaIsPresent1;
                // read media.isPresent ? View.GONE : View.VISIBLE
                mediaIsPresentViewGONEViewVISIBLE = ((MediaIsPresent1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(media.description)
                textUtilsIsEmptyMediaDescription = android.text.TextUtils.isEmpty(mediaDescription);
            if((dirtyFlags & 0x90L) != 0) {
                if(mediaIsPresent) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x90L) != 0) {
                if(textUtilsIsEmptyMediaDescription) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read !media.isPresent ? View.VISIBLE : View.GONE
                mediaIsPresentViewVISIBLEViewGONE = ((mediaIsPresent) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read TextUtils.isEmpty(media.description) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyMediaDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyMediaDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xb0L) != 0) {

            if((dirtyFlags & 0xb0L) != 0) {
                if(isSD) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
        }
        if ((dirtyFlags & 0xd0L) != 0) {

            if((dirtyFlags & 0xd0L) != 0) {
                if(isOTG) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x820200L) != 0) {



                if (media != null) {
                    // read media.isPresent
                    MediaIsPresent1 = media.isPresent();
                }
            if((dirtyFlags & 0x90L) != 0) {
                if(MediaIsPresent1) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
        }

        if ((dirtyFlags & 0xb0L) != 0) {

                // read isSD ? media.isPresent : false
                isSDMediaIsPresentBooleanFalse = ((isSD) ? (MediaIsPresent1) : (false));
            if((dirtyFlags & 0xb0L) != 0) {
                if(isSDMediaIsPresentBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read isSD ? media.isPresent : false ? View.VISIBLE : View.GONE
                isSDMediaIsPresentBooleanFalseViewVISIBLEViewGONE = ((isSDMediaIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x91L) != 0) {

                // read isNetwork ? media.isPresent : false
                isNetworkMediaIsPresentBooleanFalse = ((isNetwork) ? (MediaIsPresent1) : (false));
            if((dirtyFlags & 0x91L) != 0) {
                if(isNetworkMediaIsPresentBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read isNetwork ? media.isPresent : false ? View.VISIBLE : View.GONE
                isNetworkMediaIsPresentBooleanFalseViewVISIBLEViewGONE = ((isNetworkMediaIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xd0L) != 0) {

                // read isOTG ? media.isPresent : false
                isOTGMediaIsPresentBooleanFalse = ((isOTG) ? (MediaIsPresent1) : (false));
            if((dirtyFlags & 0xd0L) != 0) {
                if(isOTGMediaIsPresentBooleanFalse) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read isOTG ? media.isPresent : false ? View.VISIBLE : View.GONE
                isOTGMediaIsPresentBooleanFalseViewVISIBLEViewGONE = ((isOTGMediaIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            this.icon.setOnClickListener(holderOnImageClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icon, cover);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.icon, media, (int)0, (boolean)false, (boolean)false);
            com.dewords.pope.util.AccessibilityHelperKt.mediaDescription(this.mboundView0, media);
            this.missingMedia.setVisibility(mediaIsPresentViewGONEViewVISIBLE);
            this.missingOverlay.setVisibility(mediaIsPresentViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, mediaDescription);
            this.subtitle.setEnabled(MediaIsPresent1);
            this.subtitle.setVisibility(textUtilsIsEmptyMediaDescriptionViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, mediaTitle);
            this.title.setEnabled(MediaIsPresent1);
        }
        if ((dirtyFlags & 0x82L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, androidx.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            this.networkMedia.setVisibility(isNetworkMediaIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.otgMedia.setVisibility(isOTGMediaIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            this.sdMedia.setVisibility(isSDMediaIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.HistoryAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.HistoryAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.HistoryAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.HistoryAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onImageClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isNetwork
        flag 1 (0x2L): bgColor
        flag 2 (0x3L): cover
        flag 3 (0x4L): holder
        flag 4 (0x5L): media
        flag 5 (0x6L): isSD
        flag 6 (0x7L): isOTG
        flag 7 (0x8L): null
        flag 8 (0x9L): isSD ? media.isPresent : false
        flag 9 (0xaL): isSD ? media.isPresent : false
        flag 10 (0xbL): isOTG ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): isOTG ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !media.isPresent ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !media.isPresent ? View.VISIBLE : View.GONE
        flag 14 (0xfL): isNetwork ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): isNetwork ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): isNetwork ? media.isPresent : false
        flag 17 (0x12L): isNetwork ? media.isPresent : false
        flag 18 (0x13L): isSD ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): isSD ? media.isPresent : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): TextUtils.isEmpty(media.description) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): TextUtils.isEmpty(media.description) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): isOTG ? media.isPresent : false
        flag 23 (0x18L): isOTG ? media.isPresent : false
        flag 24 (0x19L): media.isPresent ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): media.isPresent ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}