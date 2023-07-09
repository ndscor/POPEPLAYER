package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VlcLoginDialogBindingImpl extends VlcLoginDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.login_container, 7);
        sViewsWithIds.put(R.id.password_container, 8);
        sViewsWithIds.put(R.id.password, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnLoginAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerOnCancelAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcLoginDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private VlcLoginDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.EditText) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.action.setTag(null);
        this.cancel.setTag(null);
        this.login.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.store.setTag(null);
        this.text.setTag(null);
        this.warning.setTag(null);
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
            setHandler((com.dewords.pope.gui.dialogs.VlcLoginDialog) variable);
        }
        else if (BR.dialog == variableId) {
            setDialog((org.videolan.libvlc.Dialog.LoginDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.dialogs.VlcLoginDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setDialog(@Nullable org.videolan.libvlc.Dialog.LoginDialog Dialog) {
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
        boolean dialogAsksStore = false;
        int dialogAsksStoreViewVISIBLEViewGONE = 0;
        boolean handlerStore = false;
        java.lang.String dialogGetDefaultUsername = null;
        java.lang.String dialogText = null;
        android.view.View.OnClickListener handlerOnLoginAndroidViewViewOnClickListener = null;
        com.dewords.pope.gui.dialogs.VlcLoginDialog handler = mHandler;
        org.videolan.libvlc.Dialog.LoginDialog dialog = mDialog;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        int dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE = 0;
        boolean dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler.store()
                    handlerStore = handler.store();
                    // read handler::onLogin
                    handlerOnLoginAndroidViewViewOnClickListener = (((mHandlerOnLoginAndroidViewViewOnClickListener == null) ? (mHandlerOnLoginAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnLoginAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.asksStore()
                    dialogAsksStore = dialog.asksStore();
                    // read dialog.getDefaultUsername()
                    dialogGetDefaultUsername = dialog.getDefaultUsername();
                    // read dialog.text
                    dialogText = dialog.getText();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(dialogAsksStore) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read dialog.asksStore() ? View.VISIBLE : View.GONE
                dialogAsksStoreViewVISIBLEViewGONE = ((dialogAsksStore) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
                dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse = ((dialogAsksStore) ? (!org.videolan.libvlc.util.AndroidUtil.isMarshMallowOrLater) : (false));
            if((dirtyFlags & 0x6L) != 0) {
                if(dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
                dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE = ((dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action.setOnClickListener(handlerOnLoginAndroidViewViewOnClickListener);
            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.store, handlerStore);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.login, dialogGetDefaultUsername);
            this.store.setVisibility(dialogAsksStoreViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
            this.warning.setVisibility(dialogAsksStoreAndroidUtilIsMarshMallowOrLaterBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.dialogs.VlcLoginDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLogin(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcLoginDialog value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.dialogs.VlcLoginDialog value) {
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
        flag 3 (0x4L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 4 (0x5L): dialog.asksStore() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
        flag 8 (0x9L): dialog.asksStore() ? !AndroidUtil.isMarshMallowOrLater : false
    flag mapping end*/
    //end
}