package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SubtitleDownloadItemBindingImpl extends SubtitleDownloadItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.barrier, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SubtitleDownloadItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SubtitleDownloadItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.downloadSub.setTag(null);
        this.language.setTag(null);
        this.loading.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.subtitleItem == variableId) {
            setSubtitleItem((com.dewords.pope.gui.dialogs.SubtitleItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubtitleItem(@Nullable com.dewords.pope.gui.dialogs.SubtitleItem SubtitleItem) {
        this.mSubtitleItem = SubtitleItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.subtitleItem);
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
        boolean subtitleItemStateStateDownloaded = false;
        int subtitleItemStateStateDownloadingViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable subtitleItemStateStateDownloadedDownloadSubAndroidDrawableIcDoneDownloadSubAndroidDrawableIcDownload = null;
        java.lang.String subtitleItemMovieReleaseNameTrim = null;
        java.lang.String subtitleItemMovieReleaseName = null;
        com.dewords.pope.gui.dialogs.SubtitleItem subtitleItem = mSubtitleItem;
        com.dewords.pope.gui.dialogs.State subtitleItemState = null;
        java.lang.String subtitleItemSubLanguageIDTrim = null;
        java.lang.String subtitleItemSubLanguageID = null;
        int subtitleItemStateStateDownloadingViewGONEViewVISIBLE = 0;
        boolean subtitleItemStateStateDownloading = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (subtitleItem != null) {
                    // read subtitleItem.movieReleaseName
                    subtitleItemMovieReleaseName = subtitleItem.getMovieReleaseName();
                    // read subtitleItem.state
                    subtitleItemState = subtitleItem.getState();
                    // read subtitleItem.subLanguageID
                    subtitleItemSubLanguageID = subtitleItem.getSubLanguageID();
                }


                if (subtitleItemMovieReleaseName != null) {
                    // read subtitleItem.movieReleaseName.trim()
                    subtitleItemMovieReleaseNameTrim = subtitleItemMovieReleaseName.trim();
                }
                // read subtitleItem.state == State.Downloaded
                subtitleItemStateStateDownloaded = (subtitleItemState) == (com.dewords.pope.gui.dialogs.State.Downloaded);
                // read subtitleItem.state == State.Downloading
                subtitleItemStateStateDownloading = (subtitleItemState) == (com.dewords.pope.gui.dialogs.State.Downloading);
            if((dirtyFlags & 0x3L) != 0) {
                if(subtitleItemStateStateDownloaded) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(subtitleItemStateStateDownloading) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x40L;
                }
            }
                if (subtitleItemSubLanguageID != null) {
                    // read subtitleItem.subLanguageID.trim()
                    subtitleItemSubLanguageIDTrim = subtitleItemSubLanguageID.trim();
                }


                // read subtitleItem.state == State.Downloaded ? @android:drawable/ic_done : @android:drawable/ic_download
                subtitleItemStateStateDownloadedDownloadSubAndroidDrawableIcDoneDownloadSubAndroidDrawableIcDownload = ((subtitleItemStateStateDownloaded) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(downloadSub.getContext(), R.drawable.ic_done)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(downloadSub.getContext(), R.drawable.ic_download)));
                // read subtitleItem.state == State.Downloading ? View.VISIBLE : View.GONE
                subtitleItemStateStateDownloadingViewVISIBLEViewGONE = ((subtitleItemStateStateDownloading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read subtitleItem.state == State.Downloading ? View.GONE : View.VISIBLE
                subtitleItemStateStateDownloadingViewGONEViewVISIBLE = ((subtitleItemStateStateDownloading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.downloadSub, subtitleItemStateStateDownloadedDownloadSubAndroidDrawableIcDoneDownloadSubAndroidDrawableIcDownload);
            this.downloadSub.setVisibility(subtitleItemStateStateDownloadingViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.language, subtitleItemSubLanguageIDTrim);
            this.loading.setVisibility(subtitleItemStateStateDownloadingViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subTitle, subtitleItemMovieReleaseNameTrim);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subtitleItem
        flag 1 (0x2L): null
        flag 2 (0x3L): subtitleItem.state == State.Downloading ? View.VISIBLE : View.GONE
        flag 3 (0x4L): subtitleItem.state == State.Downloading ? View.VISIBLE : View.GONE
        flag 4 (0x5L): subtitleItem.state == State.Downloaded ? @android:drawable/ic_done : @android:drawable/ic_download
        flag 5 (0x6L): subtitleItem.state == State.Downloaded ? @android:drawable/ic_done : @android:drawable/ic_download
        flag 6 (0x7L): subtitleItem.state == State.Downloading ? View.GONE : View.VISIBLE
        flag 7 (0x8L): subtitleItem.state == State.Downloading ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}