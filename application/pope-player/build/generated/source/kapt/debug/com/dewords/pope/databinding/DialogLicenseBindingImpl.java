package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogLicenseBindingImpl extends DialogLicenseBinding  {

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
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogLicenseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DialogLicenseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.copyright.setTag(null);
        this.licenseButton.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.textView28.setTag(null);
        this.title.setTag(null);
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
        if (BR.library == variableId) {
            setLibrary((com.dewords.pope.gui.LibraryWithLicense) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLibrary(@Nullable com.dewords.pope.gui.LibraryWithLicense Library) {
        this.mLibrary = Library;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.library);
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
        int textUtilsIsEmptyLibraryLicenseLinkViewGONEViewVISIBLE = 0;
        java.lang.String libraryLicenseDescription = null;
        boolean textUtilsIsEmptyLibraryLicenseLink = false;
        com.dewords.pope.gui.LibraryWithLicense library = mLibrary;
        java.lang.String libraryLicenseTitle = null;
        java.lang.String libraryCopyright = null;
        java.lang.String libraryLicenseLink = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (library != null) {
                    // read library.licenseDescription
                    libraryLicenseDescription = library.getLicenseDescription();
                    // read library.licenseTitle
                    libraryLicenseTitle = library.getLicenseTitle();
                    // read library.copyright
                    libraryCopyright = library.getCopyright();
                    // read library.licenseLink
                    libraryLicenseLink = library.getLicenseLink();
                }


                // read TextUtils.isEmpty(library.licenseLink)
                textUtilsIsEmptyLibraryLicenseLink = android.text.TextUtils.isEmpty(libraryLicenseLink);
            if((dirtyFlags & 0x3L) != 0) {
                if(textUtilsIsEmptyLibraryLicenseLink) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read TextUtils.isEmpty(library.licenseLink) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyLibraryLicenseLinkViewGONEViewVISIBLE = ((textUtilsIsEmptyLibraryLicenseLink) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.copyright, libraryCopyright);
            this.licenseButton.setVisibility(textUtilsIsEmptyLibraryLicenseLinkViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView28, libraryLicenseDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, libraryLicenseTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): library
        flag 1 (0x2L): null
        flag 2 (0x3L): TextUtils.isEmpty(library.licenseLink) ? View.GONE : View.VISIBLE
        flag 3 (0x4L): TextUtils.isEmpty(library.licenseLink) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}