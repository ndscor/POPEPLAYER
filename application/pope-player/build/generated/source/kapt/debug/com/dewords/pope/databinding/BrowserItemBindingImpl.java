package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BrowserItemBindingImpl extends BrowserItemBinding  {

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
    private OnClickListenerImpl1 mHolderOnCheckBoxClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl2 mHolderOnBanClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mHolderOnMoreClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mHolderOnImageClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public BrowserItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private BrowserItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.dewords.pope.gui.helpers.ThreeStatesCheckbox) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.browserCheckbox.setTag(null);
        this.browserContainer.setTag(null);
        this.dviIcon.setTag(null);
        this.itemBan.setTag(null);
        this.itemIcon.setTag(null);
        this.itemMore.setTag(null);
        this.text.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.item == variableId) {
            setItem((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.filename == variableId) {
            setFilename((java.lang.String) variable);
        }
        else if (BR.bgColor == variableId) {
            setBgColor((int) variable);
        }
        else if (BR.isBannedParent == variableId) {
            setIsBannedParent((boolean) variable);
        }
        else if (BR.isTv == variableId) {
            setIsTv((boolean) variable);
        }
        else if (BR.checkEnabled == variableId) {
            setCheckEnabled((boolean) variable);
        }
        else if (BR.favorite == variableId) {
            setFavorite((boolean) variable);
        }
        else if (BR.isBanned == variableId) {
            setIsBanned((boolean) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.protocol == variableId) {
            setProtocol((java.lang.String) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder) variable);
        }
        else if (BR.hasContextMenu == variableId) {
            setHasContextMenu((boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setFilename(@Nullable java.lang.String Filename) {
        this.mFilename = Filename;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.filename);
        super.requestRebind();
    }
    public void setBgColor(int BgColor) {
        this.mBgColor = BgColor;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.bgColor);
        super.requestRebind();
    }
    public void setIsBannedParent(boolean IsBannedParent) {
        this.mIsBannedParent = IsBannedParent;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isBannedParent);
        super.requestRebind();
    }
    public void setIsTv(boolean IsTv) {
        this.mIsTv = IsTv;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.isTv);
        super.requestRebind();
    }
    public void setCheckEnabled(boolean CheckEnabled) {
        this.mCheckEnabled = CheckEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.checkEnabled);
        super.requestRebind();
    }
    public void setFavorite(boolean Favorite) {
        this.mFavorite = Favorite;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.favorite);
        super.requestRebind();
    }
    public void setIsBanned(boolean IsBanned) {
        this.mIsBanned = IsBanned;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.isBanned);
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
    public void setProtocol(@Nullable java.lang.String Protocol) {
        this.mProtocol = Protocol;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.protocol);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setHasContextMenu(boolean HasContextMenu) {
        this.mHasContextMenu = HasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.hasContextMenu);
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
        java.lang.String filenameJavaLangObjectNullItemTitleFilename = null;
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        java.lang.String talkbackUtilINSTANCEGetDirContextItemFavorite = null;
        int hasContextMenuViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        java.lang.String filename = mFilename;
        boolean holderJavaLangObjectNull = false;
        java.lang.String isTvTextAndroidStringBannedTvTextAndroidStringBanned = null;
        int bgColor = mBgColor;
        int textUtilsIsEmptyProtocolViewGONEViewVISIBLE = 0;
        boolean isBannedParent = mIsBannedParent;
        boolean hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        boolean checkEnabledIsBannedBooleanFalse = false;
        java.lang.String itemDescription = null;
        boolean isTv = mIsTv;
        boolean textUtilsIsEmptyProtocol = false;
        boolean checkEnabled = mCheckEnabled;
        boolean favorite = mFavorite;
        java.lang.String isBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription = null;
        android.view.View.OnClickListener holderOnCheckBoxClickAndroidViewViewOnClickListener = null;
        int textUtilsIsEmptyItemDescriptionIsBannedBooleanFalseViewGONEViewVISIBLE = 0;
        java.lang.String isBannedParentTextAndroidStringBannedParentIsBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription = null;
        boolean isBanned = mIsBanned;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = 0;
        java.lang.String itemTitle = null;
        android.view.View.OnClickListener holderOnBanClickAndroidViewViewOnClickListener = null;
        boolean textUtilsIsEmptyItemDescription = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean textUtilsIsEmptyItemDescriptionIsBannedBooleanFalse = false;
        boolean IsBanned1 = false;
        boolean filenameJavaLangObjectNull = false;
        java.lang.String protocol = mProtocol;
        com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder<? extends androidx.databinding.ViewDataBinding> holder = mHolder;
        boolean itemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean hasContextMenu = mHasContextMenu;
        android.view.View.OnClickListener holderOnImageClickAndroidViewViewOnClickListener = null;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = 0;
        int itemGetItemType = 0;

        if ((dirtyFlags & 0x10c1L) != 0) {


            if ((dirtyFlags & 0x1001L) != 0) {

                    if (item != null) {
                        // read item.getItemType()
                        itemGetItemType = item.getItemType();
                    }


                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                if((dirtyFlags & 0x1001L) != 0) {
                    if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1081L) != 0) {

                    if (item != null) {
                        // read item.description
                        itemDescription = item.getDescription();
                    }


                    // read TextUtils.isEmpty(item.description)
                    textUtilsIsEmptyItemDescription = android.text.TextUtils.isEmpty(itemDescription);
                if((dirtyFlags & 0x1081L) != 0) {
                    if(textUtilsIsEmptyItemDescription) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x1003L) != 0) {



                // read filename == null
                filenameJavaLangObjectNull = (filename) == (null);
            if((dirtyFlags & 0x1003L) != 0) {
                if(filenameJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
        }
        if ((dirtyFlags & 0x1004L) != 0) {
        }
        if ((dirtyFlags & 0x1099L) != 0) {

            if((dirtyFlags & 0x1099L) != 0) {
                if(isBannedParent) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }
        }
        if ((dirtyFlags & 0x10a0L) != 0) {

            if((dirtyFlags & 0x10a0L) != 0) {
                if(checkEnabled) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x1041L) != 0) {



                // read TalkbackUtil.INSTANCE.getDir(context, item, favorite)
                talkbackUtilINSTANCEGetDirContextItemFavorite = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getDir(getRoot().getContext(), item, favorite);
        }
        if ((dirtyFlags & 0x1080L) != 0) {

            if((dirtyFlags & 0x20000000L) != 0) {
                if(isBanned) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read !isBanned
                IsBanned1 = !isBanned;
        }
        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {



                // read TextUtils.isEmpty(protocol)
                textUtilsIsEmptyProtocol = android.text.TextUtils.isEmpty(protocol);
            if((dirtyFlags & 0x1200L) != 0) {
                if(textUtilsIsEmptyProtocol) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyProtocolViewGONEViewVISIBLE = ((textUtilsIsEmptyProtocol) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1c01L) != 0) {

            if((dirtyFlags & 0x1800L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x1c01L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }

            if ((dirtyFlags & 0x1400L) != 0) {

                    if (holder != null) {
                        // read holder::onClick
                        holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onCheckBoxClick
                        holderOnCheckBoxClickAndroidViewViewOnClickListener = (((mHolderOnCheckBoxClickAndroidViewViewOnClickListener == null) ? (mHolderOnCheckBoxClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnCheckBoxClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onBanClick
                        holderOnBanClickAndroidViewViewOnClickListener = (((mHolderOnBanClickAndroidViewViewOnClickListener == null) ? (mHolderOnBanClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnBanClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onImageClick
                        holderOnImageClickAndroidViewViewOnClickListener = (((mHolderOnImageClickAndroidViewViewOnClickListener == null) ? (mHolderOnImageClickAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mHolderOnImageClickAndroidViewViewOnClickListener).setValue(holder));
                    }
                    // read holder != null
                    holderJavaLangObjectNull = (holder) != (null);
            }

                if (holder != null) {
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
            if ((dirtyFlags & 0x1c00L) != 0) {

                    if (holder != null) {
                        // read holder::onMoreClick
                        holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                    }
            }
            if ((dirtyFlags & 0x1800L) != 0) {

                    // read hasContextMenu ? View.VISIBLE : View.GONE
                    hasContextMenuViewVISIBLEViewGONE = ((hasContextMenu) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x204000L) != 0) {


            if ((dirtyFlags & 0x4000L) != 0) {

                    if (item != null) {
                        // read item.title
                        itemTitle = item.getTitle();
                    }
            }
            if ((dirtyFlags & 0x200000L) != 0) {

                    if (item != null) {
                        // read item.getItemType()
                        itemGetItemType = item.getItemType();
                    }


                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                if((dirtyFlags & 0x1001L) != 0) {
                    if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x421000000L) != 0) {

            if((dirtyFlags & 0x20000000L) != 0) {
                if(isBanned) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }

            if ((dirtyFlags & 0x401000000L) != 0) {

                    // read !isBanned
                    IsBanned1 = !isBanned;
            }
        }

        if ((dirtyFlags & 0x1003L) != 0) {

                // read filename == null ? item.title : filename
                filenameJavaLangObjectNullItemTitleFilename = ((filenameJavaLangObjectNull) ? (itemTitle) : (filename));
        }
        if ((dirtyFlags & 0x1c01L) != 0) {

                // read hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = ((hasContextMenu) ? (true) : (itemGetItemTypeMediaLibraryItemTYPESTORAGE));
        }
        if ((dirtyFlags & 0x10a0L) != 0) {

                // read checkEnabled ? !isBanned : false
                checkEnabledIsBannedBooleanFalse = ((checkEnabled) ? (IsBanned1) : (false));
        }
        if ((dirtyFlags & 0x1081L) != 0) {

                // read TextUtils.isEmpty(item.description) ? !isBanned : false
                textUtilsIsEmptyItemDescriptionIsBannedBooleanFalse = ((textUtilsIsEmptyItemDescription) ? (IsBanned1) : (false));
            if((dirtyFlags & 0x1081L) != 0) {
                if(textUtilsIsEmptyItemDescriptionIsBannedBooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }


                // read TextUtils.isEmpty(item.description) ? !isBanned : false ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemDescriptionIsBannedBooleanFalseViewGONEViewVISIBLE = ((textUtilsIsEmptyItemDescriptionIsBannedBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x2000000L) != 0) {



                if (item != null) {
                    // read item.description
                    itemDescription = item.getDescription();
                }
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

            if((dirtyFlags & 0x4000000L) != 0) {
                if(isTv) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read isTv ? @android:string/banned_tv : @android:string/banned
                isTvTextAndroidStringBannedTvTextAndroidStringBanned = ((isTv) ? (text.getResources().getString(R.string.banned_tv)) : (text.getResources().getString(R.string.banned)));
        }

        if ((dirtyFlags & 0x20000000L) != 0) {

                // read isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
                isBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription = ((isBanned) ? (isTvTextAndroidStringBannedTvTextAndroidStringBanned) : (itemDescription));
        }

        if ((dirtyFlags & 0x1099L) != 0) {

                // read isBannedParent ? @android:string/banned_parent : isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
                isBannedParentTextAndroidStringBannedParentIsBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription = ((isBannedParent) ? (text.getResources().getString(R.string.banned_parent)) : (isBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription));
        }
        // batch finished
        if ((dirtyFlags & 0x10a0L) != 0) {
            // api target 1

            this.browserCheckbox.setEnabled(checkEnabledIsBannedBooleanFalse);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            this.browserCheckbox.setOnClickListener(holderOnCheckBoxClickAndroidViewViewOnClickListener);
            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.browserContainer, (android.view.View.OnClickListener)holderOnClickAndroidViewViewOnClickListener, holderJavaLangObjectNull);
            this.itemBan.setOnClickListener(holderOnBanClickAndroidViewViewOnClickListener);
            this.itemIcon.setOnClickListener(holderOnImageClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1001L) != 0) {
            // api target 1

            this.browserCheckbox.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE);
            this.itemIcon.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE);
            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.itemIcon, item, (int)0, (boolean)false, (boolean)false);
        }
        if ((dirtyFlags & 0x1004L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.browserContainer, androidx.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x1041L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.browserContainer.setContentDescription(talkbackUtilINSTANCEGetDirContextItemFavorite);
            }
        }
        if ((dirtyFlags & 0x1c01L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnLongClick(this.browserContainer, (android.view.View.OnLongClickListener)holderOnLongClickAndroidViewViewOnLongClickListener, hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dviIcon, protocol);
            this.dviIcon.setVisibility(textUtilsIsEmptyProtocolViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemIcon, cover);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.itemMore.setVisibility(hasContextMenuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1c00L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)holderOnMoreClickAndroidViewViewOnClickListener, hasContextMenu);
        }
        if ((dirtyFlags & 0x1080L) != 0) {
            // api target 1

            this.text.setEnabled(IsBanned1);
            this.title.setEnabled(IsBanned1);
        }
        if ((dirtyFlags & 0x1081L) != 0) {
            // api target 1

            this.text.setVisibility(textUtilsIsEmptyItemDescriptionIsBannedBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1099L) != 0) {
            // api target 1

            com.dewords.pope.util.KextensionsKt.browserDescription(this.text, isBannedParentTextAndroidStringBannedParentIsBannedIsTvTextAndroidStringBannedTvTextAndroidStringBannedItemDescription);
        }
        if ((dirtyFlags & 0x1003L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, filenameJavaLangObjectNullItemTitleFilename);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.setEllipsizeModeByPref(this.title, true);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCheckBoxClick(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnLongClickListenerImpl setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onLongClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onBanClick(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl3 setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onMoreClick(arg0); 
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value;
        public OnClickListenerImpl4 setValue(com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder value) {
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
        flag 0 (0x1L): item
        flag 1 (0x2L): filename
        flag 2 (0x3L): bgColor
        flag 3 (0x4L): isBannedParent
        flag 4 (0x5L): isTv
        flag 5 (0x6L): checkEnabled
        flag 6 (0x7L): favorite
        flag 7 (0x8L): isBanned
        flag 8 (0x9L): cover
        flag 9 (0xaL): protocol
        flag 10 (0xbL): holder
        flag 11 (0xcL): hasContextMenu
        flag 12 (0xdL): null
        flag 13 (0xeL): filename == null ? item.title : filename
        flag 14 (0xfL): filename == null ? item.title : filename
        flag 15 (0x10L): hasContextMenu ? View.VISIBLE : View.GONE
        flag 16 (0x11L): hasContextMenu ? View.VISIBLE : View.GONE
        flag 17 (0x12L): isTv ? @android:string/banned_tv : @android:string/banned
        flag 18 (0x13L): isTv ? @android:string/banned_tv : @android:string/banned
        flag 19 (0x14L): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 22 (0x17L): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 23 (0x18L): checkEnabled ? !isBanned : false
        flag 24 (0x19L): checkEnabled ? !isBanned : false
        flag 25 (0x1aL): isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
        flag 26 (0x1bL): isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
        flag 27 (0x1cL): TextUtils.isEmpty(item.description) ? !isBanned : false ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): TextUtils.isEmpty(item.description) ? !isBanned : false ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): isBannedParent ? @android:string/banned_parent : isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
        flag 30 (0x1fL): isBannedParent ? @android:string/banned_parent : isBanned ? isTv ? @android:string/banned_tv : @android:string/banned : item.description
        flag 31 (0x20L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 32 (0x21L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 33 (0x22L): TextUtils.isEmpty(item.description) ? !isBanned : false
        flag 34 (0x23L): TextUtils.isEmpty(item.description) ? !isBanned : false
        flag 35 (0x24L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
        flag 36 (0x25L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}