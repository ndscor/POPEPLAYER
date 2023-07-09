package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VlcProgressDialogBindingImpl extends VlcProgressDialogBinding  {

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
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnCancelAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcProgressDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private VlcProgressDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.cancel.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.text.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.handler == variableId) {
            setHandler((com.dewords.pope.gui.dialogs.VlcProgressDialog) variable);
        }
        else if (BR.dialog == variableId) {
            setDialog((org.videolan.libvlc.Dialog.ProgressDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.dialogs.VlcProgressDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setDialog(@Nullable org.videolan.libvlc.Dialog.ProgressDialog Dialog) {
        this.mDialog = Dialog;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dialog);
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
        com.dewords.pope.gui.dialogs.VlcProgressDialog handler = mHandler;
        boolean dialogIsIndeterminate = false;
        org.videolan.libvlc.Dialog.ProgressDialog dialog = mDialog;
        int textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE = 0;
        java.lang.String dialogCancelText = null;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        java.lang.String dialogText = null;
        boolean textUtilsIsEmptyDialogCancelText = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.isIndeterminate()
                    dialogIsIndeterminate = dialog.isIndeterminate();
                    // read dialog.cancelText
                    dialogCancelText = dialog.getCancelText();
                    // read dialog.text
                    dialogText = dialog.getText();
                }


                // read TextUtils.isEmpty(dialog.cancelText)
                textUtilsIsEmptyDialogCancelText = android.text.TextUtils.isEmpty(dialogCancelText);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogCancelText) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogCancelText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.cancel.setVisibility(textUtilsIsEmptyDialogCancelTextViewGONEViewVISIBLE);
            this.progress.setIndeterminate(dialogIsIndeterminate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcProgressDialog value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.dialogs.VlcProgressDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(dialog.cancelText) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}