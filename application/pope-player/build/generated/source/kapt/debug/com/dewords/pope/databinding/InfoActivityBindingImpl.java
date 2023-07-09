package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InfoActivityBindingImpl extends InfoActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 17);
        sViewsWithIds.put(R.id.info_subtitles, 18);
        sViewsWithIds.put(R.id.main_toolbar, 19);
        sViewsWithIds.put(R.id.container, 20);
        sViewsWithIds.put(R.id.guideline9, 21);
        sViewsWithIds.put(R.id.guideline10, 22);
        sViewsWithIds.put(R.id.ariane, 23);
        sViewsWithIds.put(R.id.file_size_views, 24);
        sViewsWithIds.put(R.id.fab, 25);
        sViewsWithIds.put(R.id.audio_player_tips, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InfoActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private InfoActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[23]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[26])
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[20]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[25]
            , (androidx.constraintlayout.widget.Group) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[22]
            , (androidx.constraintlayout.widget.Guideline) bindings[21]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.appcompat.widget.Toolbar) bindings[19]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            );
        this.audioPlayerTips.setContainingBinding(this);
        this.collapsingToolbar.setTag(null);
        this.coordinator.setTag(null);
        this.directoryNotScannedButton.setTag(null);
        this.directoryNotScannedText.setTag(null);
        this.extraIcon.setTag(null);
        this.extraTitle.setTag(null);
        this.extraValue.setTag(null);
        this.imageProgress.setTag(null);
        this.lengthIcon.setTag(null);
        this.lengthTitle.setTag(null);
        this.lengthValue.setTag(null);
        this.list.setTag(null);
        this.mlItemResolution.setTag(null);
        this.playlistCover.setTag(null);
        this.sizeIcon.setTag(null);
        this.sizeTitle.setTag(null);
        this.sizeValue.setTag(null);
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
        else if (BR.extraValueText == variableId) {
            setExtraValueText((java.lang.String) variable);
        }
        else if (BR.extraTitleText == variableId) {
            setExtraTitleText((java.lang.String) variable);
        }
        else if (BR.sizeTitleText == variableId) {
            setSizeTitleText((java.lang.String) variable);
        }
        else if (BR.length == variableId) {
            setLength((java.lang.Long) variable);
        }
        else if (BR.resolution == variableId) {
            setResolution((java.lang.String) variable);
        }
        else if (BR.progress == variableId) {
            setProgress((int) variable);
        }
        else if (BR.path == variableId) {
            setPath((java.lang.String) variable);
        }
        else if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.sizeValueText == variableId) {
            setSizeValueText((java.lang.String) variable);
        }
        else if (BR.sizeValueContentDescription == variableId) {
            setSizeValueContentDescription((java.lang.String) variable);
        }
        else if (BR.scanned == variableId) {
            setScanned((boolean) variable);
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
    public void setExtraValueText(@Nullable java.lang.String ExtraValueText) {
        this.mExtraValueText = ExtraValueText;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.extraValueText);
        super.requestRebind();
    }
    public void setExtraTitleText(@Nullable java.lang.String ExtraTitleText) {
        this.mExtraTitleText = ExtraTitleText;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.extraTitleText);
        super.requestRebind();
    }
    public void setSizeTitleText(@Nullable java.lang.String SizeTitleText) {
        this.mSizeTitleText = SizeTitleText;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.sizeTitleText);
        super.requestRebind();
    }
    public void setLength(@Nullable java.lang.Long Length) {
        this.mLength = Length;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.length);
        super.requestRebind();
    }
    public void setResolution(@Nullable java.lang.String Resolution) {
        this.mResolution = Resolution;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.resolution);
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
    public void setPath(@Nullable java.lang.String Path) {
        this.mPath = Path;
    }
    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setSizeValueText(@Nullable java.lang.String SizeValueText) {
        this.mSizeValueText = SizeValueText;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.sizeValueText);
        super.requestRebind();
    }
    public void setSizeValueContentDescription(@Nullable java.lang.String SizeValueContentDescription) {
        this.mSizeValueContentDescription = SizeValueContentDescription;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.sizeValueContentDescription);
        super.requestRebind();
    }
    public void setScanned(boolean Scanned) {
        this.mScanned = Scanned;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.scanned);
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
        boolean textUtilsIsEmptyExtraTitleText = false;
        org.videolan.medialibrary.media.MediaLibraryItem item = mItem;
        int scannedViewGONEViewVISIBLE = 0;
        java.lang.String extraValueText = mExtraValueText;
        int textUtilsIsEmptyExtraTitleTextViewGONEViewVISIBLE = 0;
        java.lang.String extraTitleText = mExtraTitleText;
        java.lang.String toolsMillisToTextLargeLength = null;
        int progressInt0ViewVISIBLEViewGONE = 0;
        java.lang.String sizeTitleText = mSizeTitleText;
        boolean textUtilsIsEmptySizeTitleText = false;
        java.lang.Long length = mLength;
        java.lang.String resolution = mResolution;
        long androidxDatabindingViewDataBindingSafeUnboxLength = 0;
        int textUtilsIsEmptySizeTitleTextViewGONEViewVISIBLE = 0;
        int progress = mProgress;
        boolean lengthJavaLangObjectNull = false;
        java.lang.String itemTitle = null;
        boolean resolutionJavaLangObjectNull = false;
        boolean itemItemTypeMediaLibraryItemTYPEMEDIA = false;
        int itemItemType = 0;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        java.lang.String sizeValueText = mSizeValueText;
        java.lang.String sizeValueContentDescription = mSizeValueContentDescription;
        boolean scanned = mScanned;
        boolean progressInt0 = false;
        int lengthJavaLangObjectNullViewGONEViewVISIBLE = 0;
        int resolutionJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String talkbackUtilINSTANCEMillisToStringContextLength = null;
        int itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE = 0;

        if ((dirtyFlags & 0x1001L) != 0) {



                if (item != null) {
                    // read item.title
                    itemTitle = item.getTitle();
                    // read item.itemType
                    itemItemType = item.getItemType();
                }


                // read item.itemType == MediaLibraryItem.TYPE_MEDIA
                itemItemTypeMediaLibraryItemTYPEMEDIA = (itemItemType) == (org.videolan.medialibrary.media.MediaLibraryItem.TYPE_MEDIA);
            if((dirtyFlags & 0x1001L) != 0) {
                if(itemItemTypeMediaLibraryItemTYPEMEDIA) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
                itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE = ((itemItemTypeMediaLibraryItemTYPEMEDIA) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x1002L) != 0) {
        }
        if ((dirtyFlags & 0x1004L) != 0) {



                // read TextUtils.isEmpty(extraTitleText)
                textUtilsIsEmptyExtraTitleText = android.text.TextUtils.isEmpty(extraTitleText);
            if((dirtyFlags & 0x1004L) != 0) {
                if(textUtilsIsEmptyExtraTitleText) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read TextUtils.isEmpty(extraTitleText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyExtraTitleTextViewGONEViewVISIBLE = ((textUtilsIsEmptyExtraTitleText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1008L) != 0) {



                // read TextUtils.isEmpty(sizeTitleText)
                textUtilsIsEmptySizeTitleText = android.text.TextUtils.isEmpty(sizeTitleText);
            if((dirtyFlags & 0x1008L) != 0) {
                if(textUtilsIsEmptySizeTitleText) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read TextUtils.isEmpty(sizeTitleText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptySizeTitleTextViewGONEViewVISIBLE = ((textUtilsIsEmptySizeTitleText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1010L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(length)
                androidxDatabindingViewDataBindingSafeUnboxLength = androidx.databinding.ViewDataBinding.safeUnbox(length);
                // read length == null
                lengthJavaLangObjectNull = (length) == (null);
            if((dirtyFlags & 0x1010L) != 0) {
                if(lengthJavaLangObjectNull) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read Tools.millisToTextLarge(androidx.databinding.ViewDataBinding.safeUnbox(length))
                toolsMillisToTextLargeLength = org.videolan.medialibrary.Tools.millisToTextLarge(androidxDatabindingViewDataBindingSafeUnboxLength);
                // read TalkbackUtil.INSTANCE.millisToString(context, androidx.databinding.ViewDataBinding.safeUnbox(length))
                talkbackUtilINSTANCEMillisToStringContextLength = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.millisToString(getRoot().getContext(), androidxDatabindingViewDataBindingSafeUnboxLength);
                // read length == null ? View.GONE : View.VISIBLE
                lengthJavaLangObjectNullViewGONEViewVISIBLE = ((lengthJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1020L) != 0) {



                // read resolution == null
                resolutionJavaLangObjectNull = (resolution) == (null);
            if((dirtyFlags & 0x1020L) != 0) {
                if(resolutionJavaLangObjectNull) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read resolution == null ? View.GONE : View.VISIBLE
                resolutionJavaLangObjectNullViewGONEViewVISIBLE = ((resolutionJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1040L) != 0) {



                // read progress > 0
                progressInt0 = (progress) > (0);
            if((dirtyFlags & 0x1040L) != 0) {
                if(progressInt0) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read progress > 0 ? View.VISIBLE : View.GONE
                progressInt0ViewVISIBLEViewGONE = ((progressInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1400L) != 0) {
        }
        if ((dirtyFlags & 0x1800L) != 0) {

            if((dirtyFlags & 0x1800L) != 0) {
                if(scanned) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read scanned ? View.GONE : View.VISIBLE
                scannedViewGONEViewVISIBLE = ((scanned) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1001L) != 0) {
            // api target 1

            this.collapsingToolbar.setTitle(itemTitle);
            this.list.setVisibility(itemItemTypeMediaLibraryItemTYPEMEDIAViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.directoryNotScannedButton.setVisibility(scannedViewGONEViewVISIBLE);
            this.directoryNotScannedText.setVisibility(scannedViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1004L) != 0) {
            // api target 1

            this.extraIcon.setVisibility(textUtilsIsEmptyExtraTitleTextViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.extraTitle, extraTitleText);
        }
        if ((dirtyFlags & 0x1002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.extraValue, extraValueText);
        }
        if ((dirtyFlags & 0x1040L) != 0) {
            // api target 1

            this.imageProgress.setProgress(progress);
            this.imageProgress.setVisibility(progressInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1010L) != 0) {
            // api target 1

            this.lengthIcon.setVisibility(lengthJavaLangObjectNullViewGONEViewVISIBLE);
            this.lengthTitle.setVisibility(lengthJavaLangObjectNullViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lengthValue, toolsMillisToTextLargeLength);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.lengthValue.setContentDescription(talkbackUtilINSTANCEMillisToStringContextLength);
            }
        }
        if ((dirtyFlags & 0x1020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mlItemResolution, resolution);
            this.mlItemResolution.setVisibility(resolutionJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playlistCover, cover);
        }
        if ((dirtyFlags & 0x1008L) != 0) {
            // api target 1

            this.sizeIcon.setVisibility(textUtilsIsEmptySizeTitleTextViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sizeTitle, sizeTitleText);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sizeValue, sizeValueText);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.sizeValue.setContentDescription(sizeValueContentDescription);
            }
        }
        if (audioPlayerTips.getBinding() != null) {
            executeBindingsOn(audioPlayerTips.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): extraValueText
        flag 2 (0x3L): extraTitleText
        flag 3 (0x4L): sizeTitleText
        flag 4 (0x5L): length
        flag 5 (0x6L): resolution
        flag 6 (0x7L): progress
        flag 7 (0x8L): path
        flag 8 (0x9L): cover
        flag 9 (0xaL): sizeValueText
        flag 10 (0xbL): sizeValueContentDescription
        flag 11 (0xcL): scanned
        flag 12 (0xdL): null
        flag 13 (0xeL): scanned ? View.GONE : View.VISIBLE
        flag 14 (0xfL): scanned ? View.GONE : View.VISIBLE
        flag 15 (0x10L): TextUtils.isEmpty(extraTitleText) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): TextUtils.isEmpty(extraTitleText) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): progress > 0 ? View.VISIBLE : View.GONE
        flag 18 (0x13L): progress > 0 ? View.VISIBLE : View.GONE
        flag 19 (0x14L): TextUtils.isEmpty(sizeTitleText) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): TextUtils.isEmpty(sizeTitleText) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): length == null ? View.GONE : View.VISIBLE
        flag 22 (0x17L): length == null ? View.GONE : View.VISIBLE
        flag 23 (0x18L): resolution == null ? View.GONE : View.VISIBLE
        flag 24 (0x19L): resolution == null ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
        flag 26 (0x1bL): item.itemType == MediaLibraryItem.TYPE_MEDIA ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}