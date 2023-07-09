package com.dewords.pope.databinding;
import com.dewords.pope.R;
import com.dewords.pope.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchActivityBindingImpl extends SearchActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_edit_layout, 21);
        sViewsWithIds.put(R.id.search_edit_text, 22);
        sViewsWithIds.put(R.id.results_container, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.view.View mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.view.View mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.view.View mboundView17;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView20;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.view.View mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.view.View mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlerOnBackAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public SearchActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private SearchActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (android.widget.LinearLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[21]
            , (android.widget.EditText) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            );
        this.albumsResults.setTag(null);
        this.artistsResults.setTag(null);
        this.genresResults.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.view.View) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView14 = (android.view.View) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (android.view.View) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (androidx.core.widget.NestedScrollView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.view.View) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.view.View) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.othersResults.setTag(null);
        this.playlistsResults.setTag(null);
        this.songsResults.setTag(null);
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
        if (BR.searchAggregate == variableId) {
            setSearchAggregate((org.videolan.medialibrary.media.SearchAggregate) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.dewords.pope.gui.SearchActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearchAggregate(@Nullable org.videolan.medialibrary.media.SearchAggregate SearchAggregate) {
        this.mSearchAggregate = SearchAggregate;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.searchAggregate);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.dewords.pope.gui.SearchActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        int toolsIsArrayEmptySearchAggregateTracksViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.media.SearchAggregate searchAggregate = mSearchAggregate;
        int toolsIsArrayEmptySearchAggregateArtistsViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.interfaces.media.Playlist[] searchAggregatePlaylists = null;
        boolean searchAggregateIsEmpty = false;
        boolean toolsIsArrayEmptySearchAggregateAlbums = false;
        org.videolan.medialibrary.interfaces.media.MediaWrapper[] searchAggregateTracks = null;
        int searchAggregateIsEmptyViewGONEViewVISIBLE = 0;
        boolean toolsIsArrayEmptySearchAggregateGenres = false;
        boolean toolsIsArrayEmptySearchAggregateArtists = false;
        android.view.View.OnClickListener handlerOnBackAndroidViewViewOnClickListener = null;
        int toolsIsArrayEmptySearchAggregatePlaylistsViewGONEViewVISIBLE = 0;
        com.dewords.pope.gui.SearchActivity.ClickHandler handler = mHandler;
        boolean toolsIsArrayEmptySearchAggregateVideos = false;
        int toolsIsArrayEmptySearchAggregateVideosViewGONEViewVISIBLE = 0;
        int toolsIsArrayEmptySearchAggregateGenresViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.interfaces.media.MediaWrapper[] searchAggregateVideos = null;
        int toolsIsArrayEmptySearchAggregateAlbumsViewGONEViewVISIBLE = 0;
        org.videolan.medialibrary.interfaces.media.Artist[] searchAggregateArtists = null;
        org.videolan.medialibrary.interfaces.media.Genre[] searchAggregateGenres = null;
        org.videolan.medialibrary.interfaces.media.Album[] searchAggregateAlbums = null;
        int searchAggregateIsEmptyViewVISIBLEViewGONE = 0;
        boolean toolsIsArrayEmptySearchAggregateTracks = false;
        boolean toolsIsArrayEmptySearchAggregatePlaylists = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (searchAggregate != null) {
                    // read searchAggregate.playlists
                    searchAggregatePlaylists = searchAggregate.getPlaylists();
                    // read searchAggregate.isEmpty
                    searchAggregateIsEmpty = searchAggregate.isEmpty();
                    // read searchAggregate.tracks
                    searchAggregateTracks = searchAggregate.getTracks();
                    // read searchAggregate.videos
                    searchAggregateVideos = searchAggregate.getVideos();
                    // read searchAggregate.artists
                    searchAggregateArtists = searchAggregate.getArtists();
                    // read searchAggregate.genres
                    searchAggregateGenres = searchAggregate.getGenres();
                    // read searchAggregate.albums
                    searchAggregateAlbums = searchAggregate.getAlbums();
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(searchAggregateIsEmpty) {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read Tools.isArrayEmpty(searchAggregate.playlists)
                toolsIsArrayEmptySearchAggregatePlaylists = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregatePlaylists);
                // read searchAggregate.isEmpty ? View.GONE : View.VISIBLE
                searchAggregateIsEmptyViewGONEViewVISIBLE = ((searchAggregateIsEmpty) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read searchAggregate.isEmpty ? View.VISIBLE : View.GONE
                searchAggregateIsEmptyViewVISIBLEViewGONE = ((searchAggregateIsEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read Tools.isArrayEmpty(searchAggregate.tracks)
                toolsIsArrayEmptySearchAggregateTracks = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregateTracks);
                // read Tools.isArrayEmpty(searchAggregate.videos)
                toolsIsArrayEmptySearchAggregateVideos = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregateVideos);
                // read Tools.isArrayEmpty(searchAggregate.artists)
                toolsIsArrayEmptySearchAggregateArtists = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregateArtists);
                // read Tools.isArrayEmpty(searchAggregate.genres)
                toolsIsArrayEmptySearchAggregateGenres = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregateGenres);
                // read Tools.isArrayEmpty(searchAggregate.albums)
                toolsIsArrayEmptySearchAggregateAlbums = org.videolan.medialibrary.Tools.isArrayEmpty(searchAggregateAlbums);
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregatePlaylists) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregateTracks) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregateVideos) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregateArtists) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregateGenres) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(toolsIsArrayEmptySearchAggregateAlbums) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read Tools.isArrayEmpty(searchAggregate.playlists) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregatePlaylistsViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregatePlaylists) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read Tools.isArrayEmpty(searchAggregate.tracks) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregateTracksViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregateTracks) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read Tools.isArrayEmpty(searchAggregate.videos) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregateVideosViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregateVideos) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read Tools.isArrayEmpty(searchAggregate.artists) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregateArtistsViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregateArtists) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read Tools.isArrayEmpty(searchAggregate.genres) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregateGenresViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregateGenres) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read Tools.isArrayEmpty(searchAggregate.albums) ? View.GONE : View.VISIBLE
                toolsIsArrayEmptySearchAggregateAlbumsViewGONEViewVISIBLE = ((toolsIsArrayEmptySearchAggregateAlbums) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (handler != null) {
                    // read handler::onBack
                    handlerOnBackAndroidViewViewOnClickListener = (((mHandlerOnBackAndroidViewViewOnClickListener == null) ? (mHandlerOnBackAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlerOnBackAndroidViewViewOnClickListener).setValue(handler));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.albumsResults.setVisibility(toolsIsArrayEmptySearchAggregateAlbumsViewGONEViewVISIBLE);
            this.artistsResults.setVisibility(toolsIsArrayEmptySearchAggregateArtistsViewGONEViewVISIBLE);
            this.genresResults.setVisibility(toolsIsArrayEmptySearchAggregateGenresViewGONEViewVISIBLE);
            this.mboundView11.setVisibility(toolsIsArrayEmptySearchAggregateArtistsViewGONEViewVISIBLE);
            this.mboundView12.setVisibility(toolsIsArrayEmptySearchAggregateArtistsViewGONEViewVISIBLE);
            this.mboundView14.setVisibility(toolsIsArrayEmptySearchAggregateGenresViewGONEViewVISIBLE);
            this.mboundView15.setVisibility(toolsIsArrayEmptySearchAggregateGenresViewGONEViewVISIBLE);
            this.mboundView17.setVisibility(toolsIsArrayEmptySearchAggregatePlaylistsViewGONEViewVISIBLE);
            this.mboundView18.setVisibility(toolsIsArrayEmptySearchAggregatePlaylistsViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(searchAggregateIsEmptyViewGONEViewVISIBLE);
            this.mboundView20.setVisibility(searchAggregateIsEmptyViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(toolsIsArrayEmptySearchAggregateVideosViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(toolsIsArrayEmptySearchAggregateTracksViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(toolsIsArrayEmptySearchAggregateTracksViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(toolsIsArrayEmptySearchAggregateAlbumsViewGONEViewVISIBLE);
            this.mboundView9.setVisibility(toolsIsArrayEmptySearchAggregateAlbumsViewGONEViewVISIBLE);
            this.othersResults.setVisibility(toolsIsArrayEmptySearchAggregateVideosViewGONEViewVISIBLE);
            this.playlistsResults.setVisibility(toolsIsArrayEmptySearchAggregatePlaylistsViewGONEViewVISIBLE);
            this.songsResults.setVisibility(toolsIsArrayEmptySearchAggregateTracksViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(handlerOnBackAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.dewords.pope.gui.SearchActivity.ClickHandler value;
        public OnClickListenerImpl setValue(com.dewords.pope.gui.SearchActivity.ClickHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onBack(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchAggregate
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
        flag 3 (0x4L): Tools.isArrayEmpty(searchAggregate.tracks) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): Tools.isArrayEmpty(searchAggregate.tracks) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): Tools.isArrayEmpty(searchAggregate.artists) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): Tools.isArrayEmpty(searchAggregate.artists) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): searchAggregate.isEmpty ? View.GONE : View.VISIBLE
        flag 8 (0x9L): searchAggregate.isEmpty ? View.GONE : View.VISIBLE
        flag 9 (0xaL): Tools.isArrayEmpty(searchAggregate.playlists) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): Tools.isArrayEmpty(searchAggregate.playlists) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): Tools.isArrayEmpty(searchAggregate.videos) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): Tools.isArrayEmpty(searchAggregate.videos) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): Tools.isArrayEmpty(searchAggregate.genres) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): Tools.isArrayEmpty(searchAggregate.genres) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): Tools.isArrayEmpty(searchAggregate.albums) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): Tools.isArrayEmpty(searchAggregate.albums) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): searchAggregate.isEmpty ? View.VISIBLE : View.GONE
        flag 18 (0x13L): searchAggregate.isEmpty ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}