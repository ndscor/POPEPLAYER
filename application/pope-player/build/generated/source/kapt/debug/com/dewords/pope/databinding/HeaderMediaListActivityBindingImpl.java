package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HeaderMediaListActivityBindingImpl extends HeaderMediaListActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 7);
        sViewsWithIds.put(R.id.header_layout, 8);
        sViewsWithIds.put(R.id.backgroundView, 9);
        sViewsWithIds.put(R.id.barrier, 10);
        sViewsWithIds.put(R.id.play_btn, 11);
        sViewsWithIds.put(R.id.btn_add_playlist, 12);
        sViewsWithIds.put(R.id.btn_shuffle, 13);
        sViewsWithIds.put(R.id.btn_favorite, 14);
        sViewsWithIds.put(R.id.main_toolbar, 15);
        sViewsWithIds.put(R.id.swipeLayout, 16);
        sViewsWithIds.put(R.id.songs, 17);
        sViewsWithIds.put(R.id.browser_fast_scroller, 18);
        sViewsWithIds.put(R.id.audio_player_tips, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HeaderMediaListActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private HeaderMediaListActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[19])
            , (android.widget.ImageView) bindings[9]
            , (androidx.constraintlayout.widget.Barrier) bindings[10]
            , (com.dewords.pope.gui.view.FastScroller) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[13]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[15]
            , (android.widget.Button) bindings[11]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (com.dewords.pope.gui.view.SwipeRefreshLayout) bindings[16]
            );
        this.audioPlayerTips.setContainingBinding(this);
        this.collapsingToolbar.setTag(null);
        this.coordinator.setTag(null);
        this.duration.setTag(null);
        this.headerListArtist.setTag(null);
        this.headerListTitle.setTag(null);
        this.playlistCover.setTag(null);
        this.releaseDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.cover == variableId) {
            setCover((android.graphics.drawable.BitmapDrawable) variable);
        }
        else if (BR.topmargin == variableId) {
            setTopmargin((java.lang.Integer) variable);
        }
        else if (BR.totalDuration == variableId) {
            setTotalDuration((java.lang.Long) variable);
        }
        else if (BR.playlist == variableId) {
            setPlaylist((org.videolan.medialibrary.media.MediaLibraryItem) variable);
        }
        else if (BR.releaseYear == variableId) {
            setReleaseYear((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCover(@Nullable android.graphics.drawable.BitmapDrawable Cover) {
        this.mCover = Cover;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.cover);
        super.requestRebind();
    }
    public void setTopmargin(@Nullable java.lang.Integer Topmargin) {
        this.mTopmargin = Topmargin;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.topmargin);
        super.requestRebind();
    }
    public void setTotalDuration(@Nullable java.lang.Long TotalDuration) {
        this.mTotalDuration = TotalDuration;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.totalDuration);
        super.requestRebind();
    }
    public void setPlaylist(@Nullable org.videolan.medialibrary.media.MediaLibraryItem Playlist) {
        this.mPlaylist = Playlist;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.playlist);
        super.requestRebind();
    }
    public void setReleaseYear(@Nullable java.lang.String ReleaseYear) {
        this.mReleaseYear = ReleaseYear;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.releaseYear);
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
        java.lang.String talkbackUtilINSTANCEGetDurationContextTotalDuration = null;
        java.lang.String talkbackUtilINSTANCEGetArtistContextPlaylistDescription = null;
        int textUtilsIsEmptyPlaylistDescriptionViewGONEViewVISIBLE = 0;
        java.lang.String playlistDescription = null;
        android.graphics.drawable.BitmapDrawable cover = mCover;
        boolean textUtilsIsEmptyPlaylistDescription = false;
        int androidxDatabindingViewDataBindingSafeUnboxTopmargin = 0;
        java.lang.Integer topmargin = mTopmargin;
        java.lang.Long totalDuration = mTotalDuration;
        java.lang.String playlistTitle = null;
        java.lang.String talkbackUtilINSTANCEGetReleaseDateContextReleaseYear = null;
        java.lang.String toolsMillisToTextLargeTotalDuration = null;
        org.videolan.medialibrary.media.MediaLibraryItem playlist = mPlaylist;
        java.lang.String talkbackUtilINSTANCEGetAlbumTitleContextPlaylistTitle = null;
        long androidxDatabindingViewDataBindingSafeUnboxTotalDuration = 0;
        java.lang.String releaseYear = mReleaseYear;

        if ((dirtyFlags & 0x21L) != 0) {
        }
        if ((dirtyFlags & 0x22L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(topmargin)
                androidxDatabindingViewDataBindingSafeUnboxTopmargin = androidx.databinding.ViewDataBinding.safeUnbox(topmargin);
        }
        if ((dirtyFlags & 0x24L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(totalDuration)
                androidxDatabindingViewDataBindingSafeUnboxTotalDuration = androidx.databinding.ViewDataBinding.safeUnbox(totalDuration);


                // read TalkbackUtil.INSTANCE.getDuration(context, androidx.databinding.ViewDataBinding.safeUnbox(totalDuration))
                talkbackUtilINSTANCEGetDurationContextTotalDuration = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getDuration(getRoot().getContext(), androidxDatabindingViewDataBindingSafeUnboxTotalDuration);
                // read Tools.millisToTextLarge(androidx.databinding.ViewDataBinding.safeUnbox(totalDuration))
                toolsMillisToTextLargeTotalDuration = org.videolan.medialibrary.Tools.millisToTextLarge(androidxDatabindingViewDataBindingSafeUnboxTotalDuration);
        }
        if ((dirtyFlags & 0x28L) != 0) {



                if (playlist != null) {
                    // read playlist.description
                    playlistDescription = playlist.getDescription();
                    // read playlist.title
                    playlistTitle = playlist.getTitle();
                }


                // read TalkbackUtil.INSTANCE.getArtist(context, playlist.description)
                talkbackUtilINSTANCEGetArtistContextPlaylistDescription = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getArtist(getRoot().getContext(), playlistDescription);
                // read TextUtils.isEmpty(playlist.description)
                textUtilsIsEmptyPlaylistDescription = android.text.TextUtils.isEmpty(playlistDescription);
                // read TalkbackUtil.INSTANCE.getAlbumTitle(context, playlist.title)
                talkbackUtilINSTANCEGetAlbumTitleContextPlaylistTitle = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getAlbumTitle(getRoot().getContext(), playlistTitle);
            if((dirtyFlags & 0x28L) != 0) {
                if(textUtilsIsEmptyPlaylistDescription) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read TextUtils.isEmpty(playlist.description) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyPlaylistDescriptionViewGONEViewVISIBLE = ((textUtilsIsEmptyPlaylistDescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x30L) != 0) {



                // read TalkbackUtil.INSTANCE.getReleaseDate(context, releaseYear)
                talkbackUtilINSTANCEGetReleaseDateContextReleaseYear = com.dewords.pope.gui.helpers.TalkbackUtil.INSTANCE.getReleaseDate(getRoot().getContext(), releaseYear);
        }
        // batch finished
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.collapsingToolbar.setTitle(playlistTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerListArtist, playlistDescription);
            this.headerListArtist.setVisibility(textUtilsIsEmptyPlaylistDescriptionViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.headerListTitle, playlistTitle);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.headerListArtist.setContentDescription(talkbackUtilINSTANCEGetArtistContextPlaylistDescription);
                this.headerListTitle.setContentDescription(talkbackUtilINSTANCEGetAlbumTitleContextPlaylistTitle);
            }
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.duration, toolsMillisToTextLargeTotalDuration);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.duration.setContentDescription(talkbackUtilINSTANCEGetDurationContextTotalDuration);
            }
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            com.dewords.pope.util.KextensionsKt.setLayoutMarginTop(this.playlistCover, androidxDatabindingViewDataBindingSafeUnboxTopmargin);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playlistCover, cover);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseDate, releaseYear);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.releaseDate.setContentDescription(talkbackUtilINSTANCEGetReleaseDateContextReleaseYear);
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
        flag 0 (0x1L): cover
        flag 1 (0x2L): topmargin
        flag 2 (0x3L): totalDuration
        flag 3 (0x4L): playlist
        flag 4 (0x5L): releaseYear
        flag 5 (0x6L): null
        flag 6 (0x7L): TextUtils.isEmpty(playlist.description) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): TextUtils.isEmpty(playlist.description) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}