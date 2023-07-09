package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogExtDeviceBindingImpl extends DialogExtDeviceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ext_device_summary, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerBrowseAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerCancelAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHandlerScanAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public DialogExtDeviceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DialogExtDeviceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.extDeviceCancel.setTag(null);
        this.extDeviceOpen.setTag(null);
        this.extDeviceScan.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.handler == variableId) {
            setHandler((com.dewords.pope.gui.dialogs.ExtDeviceHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.dialogs.ExtDeviceHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
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
        android.view.View.OnClickListener handlerBrowseAndroidViewViewOnClickListener = null;
        com.dewords.pope.gui.dialogs.ExtDeviceHandler handler = mHandler;
        android.view.View.OnClickListener handlerCancelAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener handlerScanAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (handler != null) {
                    // read handler::browse
                    handlerBrowseAndroidViewViewOnClickListener = (((mHandlerBrowseAndroidViewViewOnClickListener == null) ? (mHandlerBrowseAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerBrowseAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::cancel
                    handlerCancelAndroidViewViewOnClickListener = (((mHandlerCancelAndroidViewViewOnClickListener == null) ? (mHandlerCancelAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerCancelAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::scan
                    handlerScanAndroidViewViewOnClickListener = (((mHandlerScanAndroidViewViewOnClickListener == null) ? (mHandlerScanAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHandlerScanAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.extDeviceCancel.setOnClickListener(handlerCancelAndroidViewViewOnClickListener);
            this.extDeviceOpen.setOnClickListener(handlerBrowseAndroidViewViewOnClickListener);
            this.extDeviceScan.setOnClickListener(handlerScanAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.ExtDeviceHandler value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.dialogs.ExtDeviceHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.browse(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.ExtDeviceHandler value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.dialogs.ExtDeviceHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.cancel(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.ExtDeviceHandler value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.dialogs.ExtDeviceHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.scan(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}