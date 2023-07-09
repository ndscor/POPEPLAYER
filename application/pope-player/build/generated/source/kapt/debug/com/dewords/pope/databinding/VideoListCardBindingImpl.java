package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VideoListCardBindingImpl extends VideoListCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ml_item_overlay, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl1 mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VideoListCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private VideoListCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ProgressBar) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.view.View) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[14]
            );
        this.container.setTag(null);
        this.itemMore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mediaFavorite.setTag(null);
        this.mlItemProgress.setTag(null);
        this.mlItemSeen.setTag(null);
        this.mlItemThumbnail.setTag(null);
        this.mlItemTime.setTag(null);
        this.mlItemTitle.setTag(null);
        this.networkMedia.setTag(null);
        this.networkMediaOff.setTag(null);
        this.networkOffOverlay.setTag(null);
        this.otgMedia.setTag(null);
        this.sdMedia.setTag(null);
        this.selectedCheck.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
        else if (BR.isNetwork == variableId) {
            setIsNetwork((boolean) variable);
        }
        else if (BR.isPresent == variableId) {
            setIsPresent((boolean) variable);
        }
        else if (BR.media == variableId) {
            setMedia((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.selected == variableId) {
            setSelected((boolean) variable);
        }
        else if (BR.max == variableId) {
            setMax((int) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((int) variable);
        }
        else if (BR.inSelection == variableId) {
            setInSelection((boolean) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.video.VideoListAdapter.ViewHolder) variable);
        }
        else if (BR.seen == variableId) {
            setSeen((long) variable);
        }
        else if (BR.scaleType == variableId) {
            setScaleType((android.widget.ImageView.ScaleType) variable);
        }
        else if (BR.isSD == variableId) {
            setIsSD((boolean) variable);
        }
        else if (BR.time == variableId) {
            setTime((java.lang.String) variable);
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
    public void setIsNetwork(boolean IsNetwork) {
        this.mIsNetwork = IsNetwork;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isNetwork);
        super.requestRebind();
    }
    public void setIsPresent(boolean IsPresent) {
        this.mIsPresent = IsPresent;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isPresent);
        super.requestRebind();
    }
    public void setMedia(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Media) {
        this.mMedia = Media;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.media);
        super.requestRebind();
    }
    public void setSelected(boolean Selected) {
        this.mSelected = Selected;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.selected);
        super.requestRebind();
    }
    public void setMax(int Max) {
        this.mMax = Max;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.max);
        super.requestRebind();
    }
    public void setProgress(int Progress) {
        this.mProgress = Progress;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.progress);
        super.requestRebind();
    }
    public void setInSelection(boolean InSelection) {
        this.mInSelection = InSelection;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.inSelection);
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
    public void setHolder(@Nullable com.dewords.pope.gui.video.VideoListAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setSeen(long Seen) {
        this.mSeen = Seen;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.seen);
        super.requestRebind();
    }
    public void setScaleType(@Nullable android.widget.ImageView.ScaleType ScaleType) {
        this.mScaleType = ScaleType;
    }
    public void setIsSD(boolean IsSD) {
        this.mIsSD = IsSD;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.isSD);
        super.requestRebind();
    }
    public void setTime(@Nullable java.lang.String Time) {
        this.mTime = Time;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.time);
        super.requestRebind();
    }
    public void setIsOTG(boolean IsOTG) {
        this.mIsOTG = IsOTG;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
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
        boolean isNetworkIsPresentBooleanFalse = false;
        boolean isNetwork = false;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int isFavoriteViewVISIBLEViewGONE = 0;
        boolean IsNetwork1 = mIsNetwork;
        boolean textUtilsIsEmptyTime = false;
        boolean inSelection = false;
        boolean isPresent = mIsPresent;
        boolean isSDIsPresentBooleanFalse = false;
        int isNetworkIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String mediaTitle = null;
        org.videolan.medialibrary.media.MediaLibraryItem media = mMedia;
        boolean selectedIsPresentBooleanFalse = false;
        int isOTGIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        int isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        boolean selected = mSelected;
        int isPresentViewVISIBLEViewGONE = 0;
        boolean Selected1 = false;
        int textUtilsIsEmptyTimeViewGONEViewVISIBLE = 0;
        int max = mMax;
        int progress = mProgress;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        boolean InSelection1 = mInSelection;
        int selectedIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        int isSDIsPresentBooleanFalseViewVISIBLEViewGONE = 0;
        boolean isOTGIsPresentBooleanFalse = false;
        boolean isNetworkBooleanTrueIsPresent = false;
        com.dewords.pope.gui.video.VideoListAdapter.ViewHolder holder = mHolder;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        int selectedViewVISIBLEViewGONE = 0;
        long seen = mSeen;
        int maxInt0ViewINVISIBLEViewVISIBLE = 0;
        int seenLong0LViewGONEViewVISIBLE = 0;
        boolean seenLong0L = false;
        boolean isSD = mIsSD;
        boolean maxInt0 = false;
        java.lang.String time = mTime;
        boolean IsPresent1 = false;
        boolean isPresentInSelectionBooleanFalse = false;
        boolean isOTG = mIsOTG;

        if ((dirtyFlags & 0x8001L) != 0) {

            if((dirtyFlags & 0x8001L) != 0) {
                if(isFavorite) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read isFavorite ? View.VISIBLE : View.GONE
                isFavoriteViewVISIBLEViewGONE = ((isFavorite) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x8006L) != 0) {

            if((dirtyFlags & 0x8006L) != 0) {
                if(IsNetwork1) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read !isNetwork
                isNetwork = !IsNetwork1;
            if((dirtyFlags & 0x8006L) != 0) {
                if(isNetwork) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x8084L) != 0) {

            if((dirtyFlags & 0x8084L) != 0) {
                if(isPresent) {
                        dirtyFlags |= 0x2000000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000000L;
                }
            }

            if ((dirtyFlags & 0x8004L) != 0) {

                    // read !isPresent
                    IsPresent1 = !isPresent;
                if((dirtyFlags & 0x8004L) != 0) {
                    if(IsPresent1) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read !isPresent ? View.VISIBLE : View.GONE
                    isPresentViewVISIBLEViewGONE = ((IsPresent1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x8008L) != 0) {



                if (media != null) {
                    // read media.title
                    mediaTitle = media.getTitle();
                }
        }
        if ((dirtyFlags & 0x8014L) != 0) {

            if((dirtyFlags & 0x8010L) != 0) {
                if(selected) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }


                // read !selected
                Selected1 = !selected;
            if((dirtyFlags & 0x8014L) != 0) {
                if(Selected1) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if ((dirtyFlags & 0x8010L) != 0) {

                    // read selected ? View.VISIBLE : View.GONE
                    selectedViewVISIBLEViewGONE = ((selected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x8020L) != 0) {



                // read max == 0
                maxInt0 = (max) == (0);
            if((dirtyFlags & 0x8020L) != 0) {
                if(maxInt0) {
                        dirtyFlags |= 0x200000000000L;
                }
                else {
                        dirtyFlags |= 0x100000000000L;
                }
            }


                // read max == 0 ? View.INVISIBLE : View.VISIBLE
                maxInt0ViewINVISIBLEViewVISIBLE = ((maxInt0) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x8040L) != 0) {
        }
        if ((dirtyFlags & 0x8100L) != 0) {
        }
        if ((dirtyFlags & 0x8200L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0x8400L) != 0) {



                // read seen == 0L
                seenLong0L = (seen) == (0L);
            if((dirtyFlags & 0x8400L) != 0) {
                if(seenLong0L) {
                        dirtyFlags |= 0x800000000000L;
                }
                else {
                        dirtyFlags |= 0x400000000000L;
                }
            }


                // read seen == 0L ? View.GONE : View.VISIBLE
                seenLong0LViewGONEViewVISIBLE = ((seenLong0L) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x9004L) != 0) {

            if((dirtyFlags & 0x9004L) != 0) {
                if(isSD) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
        }
        if ((dirtyFlags & 0xa000L) != 0) {



                // read TextUtils.isEmpty(time)
                textUtilsIsEmptyTime = android.text.TextUtils.isEmpty(time);
            if((dirtyFlags & 0xa000L) != 0) {
                if(textUtilsIsEmptyTime) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }


                // read TextUtils.isEmpty(time) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyTimeViewGONEViewVISIBLE = ((textUtilsIsEmptyTime) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xc004L) != 0) {

            if((dirtyFlags & 0xc004L) != 0) {
                if(isOTG) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x18002220000L) != 0) {

            if((dirtyFlags & 0x8084L) != 0) {
                if(isPresent) {
                        dirtyFlags |= 0x2000000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000000L;
                }
            }

            if ((dirtyFlags & 0x2000000L) != 0) {

                    // read !isPresent
                    IsPresent1 = !isPresent;
                if((dirtyFlags & 0x8004L) != 0) {
                    if(IsPresent1) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x8006L) != 0) {

                // read isNetwork ? isPresent : false
                isNetworkIsPresentBooleanFalse = ((IsNetwork1) ? (isPresent) : (false));
                // read !isNetwork ? true : isPresent
                isNetworkBooleanTrueIsPresent = ((isNetwork) ? (true) : (isPresent));
            if((dirtyFlags & 0x8006L) != 0) {
                if(isNetworkIsPresentBooleanFalse) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read isNetwork ? isPresent : false ? View.VISIBLE : View.GONE
                isNetworkIsPresentBooleanFalseViewVISIBLEViewGONE = ((isNetworkIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x9004L) != 0) {

                // read isSD ? isPresent : false
                isSDIsPresentBooleanFalse = ((isSD) ? (isPresent) : (false));
            if((dirtyFlags & 0x9004L) != 0) {
                if(isSDIsPresentBooleanFalse) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }


                // read isSD ? isPresent : false ? View.VISIBLE : View.GONE
                isSDIsPresentBooleanFalseViewVISIBLEViewGONE = ((isSDIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x8014L) != 0) {

                // read !selected ? !isPresent : false
                selectedIsPresentBooleanFalse = ((Selected1) ? (IsPresent1) : (false));
            if((dirtyFlags & 0x8014L) != 0) {
                if(selectedIsPresentBooleanFalse) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }


                // read !selected ? !isPresent : false ? View.VISIBLE : View.GONE
                selectedIsPresentBooleanFalseViewVISIBLEViewGONE = ((selectedIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xc004L) != 0) {

                // read isOTG ? isPresent : false
                isOTGIsPresentBooleanFalse = ((isOTG) ? (isPresent) : (false));
            if((dirtyFlags & 0xc004L) != 0) {
                if(isOTGIsPresentBooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read isOTG ? isPresent : false ? View.VISIBLE : View.GONE
                isOTGIsPresentBooleanFalseViewVISIBLEViewGONE = ((isOTGIsPresentBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x2000000000000L) != 0) {



                // read !inSelection
                inSelection = !InSelection1;
        }

        if ((dirtyFlags & 0x8084L) != 0) {

                // read isPresent ? !inSelection : false
                isPresentInSelectionBooleanFalse = ((isPresent) ? (inSelection) : (false));
            if((dirtyFlags & 0x8084L) != 0) {
                if(isPresentInSelectionBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }


                // read isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
                isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE = ((isPresentInSelectionBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x8200L) != 0) {
            // api target 1

            this.container.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.container.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x8084L) != 0) {
            // api target 1

            this.itemMore.setVisibility(isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x8008L) != 0) {
            // api target 1

            com.dewords.pope.util.AccessibilityHelperKt.mediaDescription(this.mboundView0, media);
            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.mlItemThumbnail, media, (int)0, (boolean)false, (boolean)false);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemTitle, mediaTitle);
        }
        if ((dirtyFlags & 0x8010L) != 0) {
            // api target 1

            this.mboundView0.setSelected(selected);
            this.selectedCheck.setVisibility(selectedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8001L) != 0) {
            // api target 1

            this.mediaFavorite.setVisibility(isFavoriteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8020L) != 0) {
            // api target 1

            this.mlItemProgress.setMax(max);
            this.mlItemProgress.setVisibility(maxInt0ViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8040L) != 0) {
            // api target 1

            this.mlItemProgress.setProgress(progress);
        }
        if ((dirtyFlags & 0x8400L) != 0) {
            // api target 1

            this.mlItemSeen.setVisibility(seenLong0LViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8100L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mlItemThumbnail, cover);
        }
        if ((dirtyFlags & 0x8006L) != 0) {
            // api target 1

            this.mlItemTime.setEnabled(isNetworkBooleanTrueIsPresent);
            this.networkMedia.setVisibility(isNetworkIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa000L) != 0) {
            // api target 1

            this.mlItemTime.setVisibility(textUtilsIsEmptyTimeViewGONEViewVISIBLE);
            com.dewords.pope.util.KextensionsKt.presenceDescription(this.mlItemTime, time);
        }
        if ((dirtyFlags & 0x8004L) != 0) {
            // api target 1

            this.mlItemTitle.setEnabled(isPresent);
            this.networkMediaOff.setVisibility(isPresentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8014L) != 0) {
            // api target 1

            this.networkOffOverlay.setVisibility(selectedIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 1

            this.otgMedia.setVisibility(isOTGIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9004L) != 0) {
            // api target 1

            this.sdMedia.setVisibility(isSDIsPresentBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.video.VideoListAdapter.ViewHolder value) {
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
        flag 1 (0x2L): isNetwork
        flag 2 (0x3L): isPresent
        flag 3 (0x4L): media
        flag 4 (0x5L): selected
        flag 5 (0x6L): max
        flag 6 (0x7L): progress
        flag 7 (0x8L): inSelection
        flag 8 (0x9L): cover
        flag 9 (0xaL): holder
        flag 10 (0xbL): seen
        flag 11 (0xcL): scaleType
        flag 12 (0xdL): isSD
        flag 13 (0xeL): time
        flag 14 (0xfL): isOTG
        flag 15 (0x10L): null
        flag 16 (0x11L): isNetwork ? isPresent : false
        flag 17 (0x12L): isNetwork ? isPresent : false
        flag 18 (0x13L): isFavorite ? View.VISIBLE : View.GONE
        flag 19 (0x14L): isFavorite ? View.VISIBLE : View.GONE
        flag 20 (0x15L): isSD ? isPresent : false
        flag 21 (0x16L): isSD ? isPresent : false
        flag 22 (0x17L): isNetwork ? isPresent : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): isNetwork ? isPresent : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): !selected ? !isPresent : false
        flag 25 (0x1aL): !selected ? !isPresent : false
        flag 26 (0x1bL): isOTG ? isPresent : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): isOTG ? isPresent : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
        flag 29 (0x1eL): isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
        flag 30 (0x1fL): !isPresent ? View.VISIBLE : View.GONE
        flag 31 (0x20L): !isPresent ? View.VISIBLE : View.GONE
        flag 32 (0x21L): TextUtils.isEmpty(time) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): TextUtils.isEmpty(time) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): !selected ? !isPresent : false ? View.VISIBLE : View.GONE
        flag 35 (0x24L): !selected ? !isPresent : false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): isSD ? isPresent : false ? View.VISIBLE : View.GONE
        flag 37 (0x26L): isSD ? isPresent : false ? View.VISIBLE : View.GONE
        flag 38 (0x27L): isOTG ? isPresent : false
        flag 39 (0x28L): isOTG ? isPresent : false
        flag 40 (0x29L): !isNetwork ? true : isPresent
        flag 41 (0x2aL): !isNetwork ? true : isPresent
        flag 42 (0x2bL): selected ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): selected ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): max == 0 ? View.INVISIBLE : View.VISIBLE
        flag 45 (0x2eL): max == 0 ? View.INVISIBLE : View.VISIBLE
        flag 46 (0x2fL): seen == 0L ? View.GONE : View.VISIBLE
        flag 47 (0x30L): seen == 0L ? View.GONE : View.VISIBLE
        flag 48 (0x31L): isPresent ? !inSelection : false
        flag 49 (0x32L): isPresent ? !inSelection : false
    flag mapping end*/
    //end
}