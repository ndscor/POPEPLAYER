package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VlcQuestionDialogBindingImpl extends VlcQuestionDialogBinding  {

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
    private OnClickListenerImpl mHandlerOnAction2AndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlerOnCancelAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHandlerOnAction1AndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public VlcQuestionDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private VlcQuestionDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.action1.setTag(null);
        this.action2.setTag(null);
        this.cancel.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
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
            setHandler((com.dewords.pope.gui.dialogs.VlcQuestionDialog) variable);
        }
        else if (BR.dialog == variableId) {
            setDialog((org.videolan.libvlc.Dialog.QuestionDialog) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.dewords.pope.gui.dialogs.VlcQuestionDialog Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setDialog(@Nullable org.videolan.libvlc.Dialog.QuestionDialog Dialog) {
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
        boolean textUtilsIsEmptyDialogAction2Text = false;
        java.lang.String dialogAction1Text = null;
        int textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE = 0;
        java.lang.String dialogText = null;
        java.lang.String dialogAction2Text = null;
        android.view.View.OnClickListener handlerOnAction2AndroidViewViewOnClickListener = null;
        boolean textUtilsIsEmptyDialogCancelText = false;
        int textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE = 0;
        com.dewords.pope.gui.dialogs.VlcQuestionDialog handler = mHandler;
        org.videolan.libvlc.Dialog.QuestionDialog dialog = mDialog;
        java.lang.String dialogCancelText = null;
        android.view.View.OnClickListener handlerOnCancelAndroidViewViewOnClickListener = null;
        java.lang.String textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText = null;
        android.view.View.OnClickListener handlerOnAction1AndroidViewViewOnClickListener = null;
        boolean textUtilsIsEmptyDialogAction1Text = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (handler != null) {
                    // read handler::onAction2
                    handlerOnAction2AndroidViewViewOnClickListener = (((mHandlerOnAction2AndroidViewViewOnClickListener == null) ? (mHandlerOnAction2AndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnAction2AndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onCancel
                    handlerOnCancelAndroidViewViewOnClickListener = (((mHandlerOnCancelAndroidViewViewOnClickListener == null) ? (mHandlerOnCancelAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlerOnCancelAndroidViewViewOnClickListener).setValue(handler));
                    // read handler::onAction1
                    handlerOnAction1AndroidViewViewOnClickListener = (((mHandlerOnAction1AndroidViewViewOnClickListener == null) ? (mHandlerOnAction1AndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHandlerOnAction1AndroidViewViewOnClickListener).setValue(handler));
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (dialog != null) {
                    // read dialog.action1Text
                    dialogAction1Text = dialog.getAction1Text();
                    // read dialog.text
                    dialogText = dialog.getText();
                    // read dialog.action2Text
                    dialogAction2Text = dialog.getAction2Text();
                    // read dialog.cancelText
                    dialogCancelText = dialog.getCancelText();
                }


                // read TextUtils.isEmpty(dialog.action1Text)
                textUtilsIsEmptyDialogAction1Text = android.text.TextUtils.isEmpty(dialogAction1Text);
                // read TextUtils.isEmpty(dialog.action2Text)
                textUtilsIsEmptyDialogAction2Text = android.text.TextUtils.isEmpty(dialogAction2Text);
                // read TextUtils.isEmpty(dialog.cancelText)
                textUtilsIsEmptyDialogCancelText = android.text.TextUtils.isEmpty(dialogCancelText);
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogAction1Text) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogAction2Text) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(textUtilsIsEmptyDialogCancelText) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogAction1Text) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE = ((textUtilsIsEmptyDialogAction2Text) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
                textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText = ((textUtilsIsEmptyDialogCancelText) ? (cancel.getResources().getString(R.string.cancel)) : (dialogCancelText));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.action1.setOnClickListener(handlerOnAction1AndroidViewViewOnClickListener);
            this.action2.setOnClickListener(handlerOnAction2AndroidViewViewOnClickListener);
            this.cancel.setOnClickListener(handlerOnCancelAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.action1, dialogAction1Text);
            this.action1.setVisibility(textUtilsIsEmptyDialogAction1TextViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.action2, dialogAction2Text);
            this.action2.setVisibility(textUtilsIsEmptyDialogAction2TextViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cancel, textUtilsIsEmptyDialogCancelTextCancelAndroidStringCancelDialogCancelText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, dialogText);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction2(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl1 setValue(com.dewords.pope.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCancel(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.VlcQuestionDialog value;
        public OnClickListenerImpl2 setValue(com.dewords.pope.gui.dialogs.VlcQuestionDialog value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAction1(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): dialog
        flag 2 (0x3L): null
        flag 3 (0x4L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): TextUtils.isEmpty(dialog.action2Text) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): TextUtils.isEmpty(dialog.action1Text) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
        flag 8 (0x9L): TextUtils.isEmpty(dialog.cancelText) ? @android:string/cancel : dialog.cancelText
    flag mapping end*/
    //end
}