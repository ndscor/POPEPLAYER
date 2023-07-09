package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChapterListItemBindingImpl extends ChapterListItemBinding  {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHolderOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ChapterListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ChapterListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.chapterTime.setTag(null);
        this.chapterTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.chapter == variableId) {
            setChapter((com.dewords.pope.gui.dialogs.SelectChapterDialog.Chapter) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.dialogs.SelectChapterDialog.ChapterViewHolder) variable);
        }
        else if (BR.selected == variableId) {
            setSelected((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChapter(@Nullable com.dewords.pope.gui.dialogs.SelectChapterDialog.Chapter Chapter) {
        this.mChapter = Chapter;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.chapter);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.dialogs.SelectChapterDialog.ChapterViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.holder);
        super.requestRebind();
    }
    public void setSelected(@Nullable java.lang.Boolean Selected) {
        this.mSelected = Selected;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.selected);
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
        java.lang.String ChapterTime1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelected = false;
        com.dewords.pope.gui.dialogs.SelectChapterDialog.Chapter chapter = mChapter;
        com.dewords.pope.gui.dialogs.SelectChapterDialog.ChapterViewHolder holder = mHolder;
        android.view.View.OnClickListener holderOnClickAndroidViewViewOnClickListener = null;
        java.lang.Boolean selected = mSelected;
        java.lang.String chapterName = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (chapter != null) {
                    // read chapter.time
                    ChapterTime1 = chapter.getTime();
                    // read chapter.name
                    chapterName = chapter.getName();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (holder != null) {
                    // read holder::onClick
                    holderOnClickAndroidViewViewOnClickListener = (((mHolderOnClickAndroidViewViewOnClickListener == null) ? (mHolderOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHolderOnClickAndroidViewViewOnClickListener).setValue(holder));
                }
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selected)
                androidxDatabindingViewDataBindingSafeUnboxSelected = androidx.databinding.ViewDataBinding.safeUnbox(selected);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chapterTime, ChapterTime1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chapterTitle, chapterName);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.isSelected(this.chapterTitle, selected);
            this.mboundView0.setSelected(androidxDatabindingViewDataBindingSafeUnboxSelected);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(holderOnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.dialogs.SelectChapterDialog.ChapterViewHolder value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.dialogs.SelectChapterDialog.ChapterViewHolder value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): chapter
        flag 1 (0x2L): holder
        flag 2 (0x3L): selected
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}