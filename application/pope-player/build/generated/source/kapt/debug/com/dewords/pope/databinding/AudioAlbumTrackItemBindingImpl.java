package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AudioAlbumTrackItemBindingImpl extends AudioAlbumTrackItemBinding  {

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
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl1 mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public AudioAlbumTrackItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private AudioAlbumTrackItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.itemMore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mediaAbsent.setTag(null);
        this.mediaFavorite.setTag(null);
        this.mediaNetwork.setTag(null);
        this.mediaSd.setTag(null);
        this.otgMedia.setTag(null);
        this.selectedCheck.setTag(null);
        this.subtitle.setTag(null);
        this.title.setTag(null);
        this.trackNumber.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setItem((org.videolan.medialibrary.interfaces.media.MediaWrapper) variable);
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
            setHolder((com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder) variable);
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
    public void setItem(@Nullable org.videolan.medialibrary.interfaces.media.MediaWrapper Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIsNetwork(boolean IsNetwork) {
        this.mIsNetwork = IsNetwork;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isNetwork);
        super.requestRebind();
    }
    public void setIsPresent(boolean IsPresent) {
        this.mIsPresent = IsPresent;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isPresent);
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
    public void setInSelection(boolean InSelection) {
        this.mInSelection = InSelection;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.inSelection);
        super.requestRebind();
    }
    public void setImageWidth(int ImageWidth) {
        this.mImageWidth = ImageWidth;
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
    }
    public void setHolder(@Nullable com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setIsSD(boolean IsSD) {
        this.mIsSD = IsSD;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.isSD);
        super.requestRebind();
    }
    public void setIsOTG(boolean IsOTG) {
        this.mIsOTG = IsOTG;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
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
        org.videolan.medialibrary.interfaces.media.MediaWrapper item = mItem;
        int isPresentViewVISIBLEViewINVISIBLE = 0;
        boolean isNetworkIsPresent = false;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        int isFavoriteViewVISIBLEViewGONE = 0;
        boolean isNetwork = mIsNetwork;
        boolean inSelection = false;
        boolean isPresent = mIsPresent;
        boolean isSDIsPresent = false;
        int isNetworkIsPresentViewVISIBLEViewGONE = 0;
        int isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        boolean selected = mSelected;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        java.lang.String itemTitle = null;
        boolean InSelection1 = mInSelection;
        int isOTGIsPresentViewVISIBLEViewGONE = 0;
        com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder holder = mHolder;
        boolean isOTGIsPresent = false;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        java.lang.String talkbackUtilINSTANCEGetTimeAndArtistContextItem = null;
        int selectedViewVISIBLEViewGONE = 0;
        int isSDIsPresentViewVISIBLEViewGONE = 0;
        java.lang.String talkbackUtilINSTANCEGetTrackNumberContextItem = null;
        boolean isSD = mIsSD;
        boolean IsPresent1 = false;
        boolean isPresentInSelectionBooleanFalse = false;
        boolean isOTG = mIsOTG;

        if ((dirtyFlags & 0x801L) != 0) {

            if((dirtyFlags & 0x801L) != 0) {
                if(isFavorite) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read isFavorite ? View.VISIBLE : View.GONE
                isFavoriteViewVISIBLEViewGONE = ((isFavorite) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x802L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                }
                // read TalkbackUtil.INSTANCE.getTimeAndArtist(context, item)
                talkbackUtilINSTANCEGetTimeAndArtistContextItem = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getTimeAndArtist(getRoot().getContext(), item);
                // read TalkbackUtil.INSTANCE.getTrackNumber(context, item)
                talkbackUtilINSTANCEGetTrackNumberContextItem = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getTrackNumber(getRoot().getContext(), item);
        }
        if ((dirtyFlags & 0x80cL) != 0) {
        }
        if ((dirtyFlags & 0xe2cL) != 0) {

            if((dirtyFlags & 0x828L) != 0) {
                if(isPresent) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }

            if ((dirtyFlags & 0x80cL) != 0) {

                    // read (isNetwork) & (isPresent)
                    isNetworkIsPresent = (isNetwork) & (isPresent);
                if((dirtyFlags & 0x80cL) != 0) {
                    if(isNetworkIsPresent) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read (isNetwork) & (isPresent) ? View.VISIBLE : View.GONE
                    isNetworkIsPresentViewVISIBLEViewGONE = ((isNetworkIsPresent) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    // read !isPresent
                    IsPresent1 = !isPresent;
                if((dirtyFlags & 0x808L) != 0) {
                    if(IsPresent1) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0x808L) != 0) {

                        // read !isPresent ? View.VISIBLE : View.INVISIBLE
                        isPresentViewVISIBLEViewINVISIBLE = ((IsPresent1) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                }
            }
        }
        if ((dirtyFlags & 0x810L) != 0) {

            if((dirtyFlags & 0x810L) != 0) {
                if(selected) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read selected ? View.VISIBLE : View.GONE
                selectedViewVISIBLEViewGONE = ((selected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x900L) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                    // read holder::onMoreClick
                    holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0xa08L) != 0) {



                // read (isSD) & (isPresent)
                isSDIsPresent = (isSD) & (isPresent);
            if((dirtyFlags & 0xa08L) != 0) {
                if(isSDIsPresent) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read (isSD) & (isPresent) ? View.VISIBLE : View.GONE
                isSDIsPresentViewVISIBLEViewGONE = ((isSDIsPresent) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xc08L) != 0) {



                // read (isOTG) & (!isPresent)
                isOTGIsPresent = (isOTG) & (IsPresent1);
            if((dirtyFlags & 0xc08L) != 0) {
                if(isOTGIsPresent) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read (isOTG) & (!isPresent) ? View.VISIBLE : View.GONE
                isOTGIsPresentViewVISIBLEViewGONE = ((isOTGIsPresent) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x8000000L) != 0) {



                // read !inSelection
                inSelection = !InSelection1;
        }

        if ((dirtyFlags & 0x828L) != 0) {

                // read isPresent ? !inSelection : false
                isPresentInSelectionBooleanFalse = ((isPresent) ? (inSelection) : (false));
            if((dirtyFlags & 0x828L) != 0) {
                if(isPresentInSelectionBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
                isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE = ((isPresentInSelectionBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            this.itemMore.setOnClickListener(holderOnMoreClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
            this.mboundView0.setOnLongClickListener(holderOnLongClickAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x828L) != 0) {
            // api target 1

            this.itemMore.setVisibility(isPresentInSelectionBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x810L) != 0) {
            // api target 1

            this.mboundView0.setSelected(selected);
            this.selectedCheck.setVisibility(selectedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x808L) != 0) {
            // api target 1

            this.mediaAbsent.setVisibility(isPresentViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x801L) != 0) {
            // api target 1

            this.mediaFavorite.setVisibility(isFavoriteViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80cL) != 0) {
            // api target 1

            this.mediaNetwork.setVisibility(isNetworkIsPresentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa08L) != 0) {
            // api target 1

            this.mediaSd.setVisibility(isSDIsPresentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            this.otgMedia.setVisibility(isOTGIsPresentViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x802L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.subtitle.setContentDescription(talkbackUtilINSTANCEGetTimeAndArtistContextItem);
                this.trackNumber.setContentDescription(talkbackUtilINSTANCEGetTrackNumberContextItem);
            }
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, itemTitle);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.audio.AudioAlbumTracksAdapter.TrackItemViewHolder value) {
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
        flag 2 (0x3L): isNetwork
        flag 3 (0x4L): isPresent
        flag 4 (0x5L): selected
        flag 5 (0x6L): inSelection
        flag 6 (0x7L): imageWidth
        flag 7 (0x8L): cover
        flag 8 (0x9L): holder
        flag 9 (0xaL): isSD
        flag 10 (0xbL): isOTG
        flag 11 (0xcL): null
        flag 12 (0xdL): !isPresent ? View.VISIBLE : View.INVISIBLE
        flag 13 (0xeL): !isPresent ? View.VISIBLE : View.INVISIBLE
        flag 14 (0xfL): isFavorite ? View.VISIBLE : View.GONE
        flag 15 (0x10L): isFavorite ? View.VISIBLE : View.GONE
        flag 16 (0x11L): (isNetwork) & (isPresent) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): (isNetwork) & (isPresent) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
        flag 19 (0x14L): isPresent ? !inSelection : false ? View.VISIBLE : View.INVISIBLE
        flag 20 (0x15L): (isOTG) & (!isPresent) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): (isOTG) & (!isPresent) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): selected ? View.VISIBLE : View.GONE
        flag 23 (0x18L): selected ? View.VISIBLE : View.GONE
        flag 24 (0x19L): (isSD) & (isPresent) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): (isSD) & (isPresent) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): isPresent ? !inSelection : false
        flag 27 (0x1cL): isPresent ? !inSelection : false
    flag mapping end*/
    //end
}