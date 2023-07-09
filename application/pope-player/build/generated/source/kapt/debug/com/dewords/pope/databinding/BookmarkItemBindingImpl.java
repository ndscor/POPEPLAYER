package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BookmarkItemBindingImpl extends BookmarkItemBinding implements com.dewords.pope.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BookmarkItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private BookmarkItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageButton) bindings[4]
            , (android.view.View) bindings[1]
            );
        this.audioItemSubtitle.setTag(null);
        this.audioItemTitle.setTag(null);
        this.itemMore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.selector.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.dewords.pope.generated.callback.OnClickListener(this, 2);
        mCallback2 = new com.dewords.pope.generated.callback.OnClickListener(this, 1);
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
        if (BR.bookmark == variableId) {
            setBookmark((org.videolan.medialibrary.interfaces.media.Bookmark) variable);
        }
        else if (BR.holder == variableId) {
            setHolder((com.dewords.pope.gui.helpers.BookmarkAdapter.ViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBookmark(@Nullable org.videolan.medialibrary.interfaces.media.Bookmark Bookmark) {
        this.mBookmark = Bookmark;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bookmark);
        super.requestRebind();
    }
    public void setHolder(@Nullable com.dewords.pope.gui.helpers.BookmarkAdapter.ViewHolder Holder) {
        this.mHolder = Holder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.holder);
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
        org.videolan.medialibrary.interfaces.media.Bookmark bookmark = mBookmark;
        long bookmarkTime = 0;
        java.lang.String bookmarkTitle = null;
        com.dewords.pope.gui.helpers.BookmarkAdapter.ViewHolder holder = mHolder;
        java.lang.String talkbackUtilINSTANCEMillisToStringContextBookmarkTime = null;
        java.lang.String toolsMillisToStringBookmarkTime = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (bookmark != null) {
                    // read bookmark.time
                    bookmarkTime = bookmark.getTime();
                    // read bookmark.title
                    bookmarkTitle = bookmark.getTitle();
                }


                // read TalkbackUtil.INSTANCE.millisToString(context, bookmark.time)
                talkbackUtilINSTANCEMillisToStringContextBookmarkTime = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.millisToString(getRoot().getContext(), bookmarkTime);
                // read Tools.millisToString(bookmark.time)
                toolsMillisToStringBookmarkTime = org.videolan.medialibrary.Tools.millisToString(bookmarkTime);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemSubtitle, toolsMillisToStringBookmarkTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.audioItemTitle, bookmarkTitle);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.audioItemSubtitle.setContentDescription(talkbackUtilINSTANCEMillisToStringContextBookmarkTime);
            }
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.dewords.pope.gui.helpers.UiToolsKt.setEllipsizeModeByPref(this.audioItemTitle, true);
            this.itemMore.setOnClickListener(mCallback3);
            this.selector.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // bookmark
                org.videolan.medialibrary.interfaces.media.Bookmark bookmark = mBookmark;
                // holder
                com.dewords.pope.gui.helpers.BookmarkAdapter.ViewHolder holder = mHolder;
                // holder != null
                boolean holderJavaLangObjectNull = false;



                holderJavaLangObjectNull = (holder) != (null);
                if (holderJavaLangObjectNull) {




                    holder.onMoreClick(callbackArg_0, bookmark);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // bookmark
                org.videolan.medialibrary.interfaces.media.Bookmark bookmark = mBookmark;
                // holder
                com.dewords.pope.gui.helpers.BookmarkAdapter.ViewHolder holder = mHolder;
                // holder != null
                boolean holderJavaLangObjectNull = false;



                holderJavaLangObjectNull = (holder) != (null);
                if (holderJavaLangObjectNull) {




                    holder.onClick(callbackArg_0, bookmark);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bookmark
        flag 1 (0x2L): holder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}