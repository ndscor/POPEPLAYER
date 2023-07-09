package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardBrowserItemBindingImpl extends CardBrowserItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_ban, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHolderOnCheckBoxClickAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHolderOnLongClickAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl2 mHolderOnMoreClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public CardBrowserItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private CardBrowserItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.dewords.pope.gui.helpers.ThreeStatesCheckbox) bindings[2]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.browserCheckbox.setTag(null);
        this.browserContainer.setTag(null);
        this.dviIcon.setTag(null);
        this.itemIcon.setTag(null);
        this.itemMore.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.text.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        else if (BR.checkEnabled == variableId) {
            setCheckEnabled((boolean) variable);
        }
        else if (BR.favorite == variableId) {
            setFavorite((boolean) variable);
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
    public void setCheckEnabled(boolean CheckEnabled) {
        this.mCheckEnabled = CheckEnabled;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.checkEnabled);
        super.requestRebind();
    }
    public void setFavorite(boolean Favorite) {
        this.mFavorite = Favorite;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.favorite);
        super.requestRebind();
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setProtocol(@Nullable java.lang.String Protocol) {
        this.mProtocol = Protocol;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.protocol);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setHasContextMenu(boolean HasContextMenu) {
        this.mHasContextMenu = HasContextMenu;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
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
        int bgColor = mBgColor;
        int textUtilsIsEmptyProtocolViewGONEViewVISIBLE = 0;
        boolean hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        java.lang.String itemDescription = null;
        boolean textUtilsIsEmptyProtocol = false;
        boolean checkEnabled = mCheckEnabled;
        boolean favorite = mFavorite;
        android.view.View.OnClickListener holderOnCheckBoxClickAndroidViewViewOnClickListener = null;
        android.view.View.OnLongClickListener holderOnLongClickAndroidViewViewOnLongClickListener = null;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = 0;
        java.lang.String itemTitle = null;
        boolean textUtilsIsEmptyItemDescription = false;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean filenameJavaLangObjectNull = false;
        java.lang.String protocol = mProtocol;
        com.dewords.pope.gui.browser.BaseBrowserAdapter.ViewHolder<? extends androidx.databinding.ViewDataBinding> holder = mHolder;
        boolean itemGetItemTypeMediaLibraryItemTYPESTORAGE = false;
        android.view.View.OnClickListener holderOnMoreClickAndroidViewViewOnClickListener = null;
        boolean hasContextMenu = mHasContextMenu;
        int textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = 0;
        int itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = 0;
        int itemGetItemType = 0;

        if ((dirtyFlags & 0x211L) != 0) {


            if ((dirtyFlags & 0x201L) != 0) {

                    if (item != null) {
                        // read item.description
                        itemDescription = item.getDescription();
                        // read item.getItemType()
                        itemGetItemType = item.getItemType();
                    }


                    // read TextUtils.isEmpty(item.description)
                    textUtilsIsEmptyItemDescription = android.text.TextUtils.isEmpty(itemDescription);
                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                if((dirtyFlags & 0x201L) != 0) {
                    if(textUtilsIsEmptyItemDescription) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if((dirtyFlags & 0x201L) != 0) {
                    if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
                    textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyItemDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE = ((itemGetItemTypeMediaLibraryItemTYPESTORAGE) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }

                // read TalkbackUtil.INSTANCE.getDir(context, item, favorite)
                talkbackUtilINSTANCEGetDirContextItemFavorite = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getDir(getRoot().getContext(), item, favorite);
        }
        if ((dirtyFlags & 0x203L) != 0) {



                // read filename == null
                filenameJavaLangObjectNull = (filename) == (null);
            if((dirtyFlags & 0x203L) != 0) {
                if(filenameJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x208L) != 0) {
        }
        if ((dirtyFlags & 0x220L) != 0) {
        }
        if ((dirtyFlags & 0x240L) != 0) {



                // read TextUtils.isEmpty(protocol)
                textUtilsIsEmptyProtocol = android.text.TextUtils.isEmpty(protocol);
            if((dirtyFlags & 0x240L) != 0) {
                if(textUtilsIsEmptyProtocol) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyProtocolViewGONEViewVISIBLE = ((textUtilsIsEmptyProtocol) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x381L) != 0) {

            if((dirtyFlags & 0x300L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x381L) != 0) {
                if(hasContextMenu) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }

            if ((dirtyFlags & 0x280L) != 0) {

                    if (holder != null) {
                        // read holder::onClick
                        holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                        // read holder::onCheckBoxClick
                        holderOnCheckBoxClickAndroidViewViewOnClickListener = (((mHolderOnCheckBoxClickAndroidViewViewOnClickListener == null) ? (mHolderOnCheckBoxClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHolderOnCheckBoxClickAndroidViewViewOnClickListener).setValue(holder));
                    }
            }

                if (holder != null) {
                    // read holder::onLongClick
                    holderOnLongClickAndroidViewViewOnLongClickListener = (((mHolderOnLongClickAndroidViewViewOnLongClickListener == null) ? (mHolderOnLongClickAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHolderOnLongClickAndroidViewViewOnLongClickListener).setValue(holder));
                }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (holder != null) {
                        // read holder::onMoreClick
                        holderOnMoreClickAndroidViewViewOnClickListener = (((mHolderOnMoreClickAndroidViewViewOnClickListener == null) ? (mHolderOnMoreClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHolderOnMoreClickAndroidViewViewOnClickListener).setValue(holder));
                    }
            }
            if ((dirtyFlags & 0x300L) != 0) {

                    // read hasContextMenu ? View.VISIBLE : View.GONE
                    hasContextMenuViewVISIBLEViewGONE = ((hasContextMenu) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10800L) != 0) {


            if ((dirtyFlags & 0x800L) != 0) {

                    if (item != null) {
                        // read item.title
                        itemTitle = item.getTitle();
                    }
            }
            if ((dirtyFlags & 0x10000L) != 0) {

                    if (item != null) {
                        // read item.getItemType()
                        itemGetItemType = item.getItemType();
                    }


                    // read item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                    itemGetItemTypeMediaLibraryItemTYPESTORAGE = (itemGetItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_STORAGE);
                if((dirtyFlags & 0x201L) != 0) {
                    if(itemGetItemTypeMediaLibraryItemTYPESTORAGE) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x203L) != 0) {

                // read filename == null ? item.title : filename
                filenameJavaLangObjectNullItemTitleFilename = ((filenameJavaLangObjectNull) ? (itemTitle) : (filename));
        }
        if ((dirtyFlags & 0x381L) != 0) {

                // read hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
                hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE = ((hasContextMenu) ? (true) : (itemGetItemTypeMediaLibraryItemTYPESTORAGE));
        }
        // batch finished
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            this.browserCheckbox.setEnabled(checkEnabled);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.browserCheckbox.setOnClickListener(holderOnCheckBoxClickAndroidViewViewOnClickListener);
            this.browserContainer.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.browserCheckbox.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewVISIBLEViewGONE);
            com.dewords.pope.util.AccessibilityHelperKt.mediaDescription(this.browserContainer, item);
            this.itemIcon.setVisibility(itemGetItemTypeMediaLibraryItemTYPESTORAGEViewGONEViewVISIBLE);
            com.dewords.pope.gui.helpers.ImageLoaderKt.loadImage(this.itemIcon, item, (int)0, (boolean)false, (boolean)false);
            com.dewords.pope.util.KextensionsKt.browserDescription(this.text, itemDescription);
            this.text.setVisibility(textUtilsIsEmptyItemDescriptionViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x211L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.browserContainer.setContentDescription(talkbackUtilINSTANCEGetDirContextItemFavorite);
            }
        }
        if ((dirtyFlags & 0x381L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnLongClick(this.browserContainer, (android.view.View.OnLongClickListener)holderOnLongClickAndroidViewViewOnLongClickListener, hasContextMenuBooleanTrueItemGetItemTypeMediaLibraryItemTYPESTORAGE);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dviIcon, protocol);
            this.dviIcon.setVisibility(textUtilsIsEmptyProtocolViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.itemIcon, cover);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.itemMore.setVisibility(hasContextMenuViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setOnClick(this.itemMore, (android.view.View.OnClickListener)holderOnMoreClickAndroidViewViewOnClickListener, hasContextMenu);
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, androidx.databinding.adapters.Converters.convertColorToDrawable(bgColor));
        }
        if ((dirtyFlags & 0x203L) != 0) {
            // api target 1

            com.dewords.pope.util.KextensionsKt.asyncText(this.title, filenameJavaLangObjectNullItemTitleFilename);
        }
        if ((dirtyFlags & 0x200L) != 0) {
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
            this.value.onMoreClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): filename
        flag 2 (0x3L): bgColor
        flag 3 (0x4L): checkEnabled
        flag 4 (0x5L): favorite
        flag 5 (0x6L): cover
        flag 6 (0x7L): protocol
        flag 7 (0x8L): holder
        flag 8 (0x9L): hasContextMenu
        flag 9 (0xaL): null
        flag 10 (0xbL): filename == null ? item.title : filename
        flag 11 (0xcL): filename == null ? item.title : filename
        flag 12 (0xdL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 13 (0xeL): hasContextMenu ? View.VISIBLE : View.GONE
        flag 14 (0xfL): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): TextUtils.isEmpty(protocol) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 17 (0x12L): hasContextMenu ? true : item.getItemType() == MediaLibraryItem.TYPE_STORAGE
        flag 18 (0x13L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 19 (0x14L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.VISIBLE : View.GONE
        flag 20 (0x15L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): TextUtils.isEmpty(item.description) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
        flag 23 (0x18L): item.getItemType() == MediaLibraryItem.TYPE_STORAGE ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}