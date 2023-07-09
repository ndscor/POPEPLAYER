package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRendererBindingImpl extends ItemRendererBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.renderer_icon, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRendererBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemRendererBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rendererName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
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
        if (BR.renderer == variableId) {
            setRenderer((org.videolan.libvlc.RendererItem) variable);
        }
        else if (BR.clicHandler == variableId) {
            setClicHandler((com.dewords.pope.gui.dialogs.RenderersDialog.RendererClickhandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRenderer(@Nullable org.videolan.libvlc.RendererItem Renderer) {
        this.mRenderer = Renderer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.renderer);
        super.requestRebind();
    }
    public void setClicHandler(@Nullable com.dewords.pope.gui.dialogs.RenderersDialog.RendererClickhandler ClicHandler) {
        this.mClicHandler = ClicHandler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clicHandler);
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
        org.videolan.libvlc.RendererItem renderer = mRenderer;
        java.lang.String rendererDisplayName = null;
        com.dewords.pope.gui.dialogs.RenderersDialog.RendererClickhandler clicHandler = mClicHandler;

        if ((dirtyFlags & 0x5L) != 0) {



                if (renderer != null) {
                    // read renderer.displayName
                    rendererDisplayName = renderer.displayName;
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rendererName.setOnClickListener(mCallback16);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rendererName, rendererDisplayName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // renderer
        org.videolan.libvlc.RendererItem renderer = mRenderer;
        // clicHandler != null
        boolean clicHandlerJavaLangObjectNull = false;
        // clicHandler
        com.dewords.pope.gui.dialogs.RenderersDialog.RendererClickhandler clicHandler = mClicHandler;



        clicHandlerJavaLangObjectNull = (clicHandler) != (null);
        if (clicHandlerJavaLangObjectNull) {



            clicHandler.connect(renderer);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): renderer
        flag 1 (0x2L): clicHandler
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}