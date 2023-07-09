package com.dewords.television.viewmodel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.videolan.medialibrary.interfaces.media.Playlist
import org.videolan.medialibrary.media.MediaLibraryItem
import com.dewords.poperesources.*
import com.dewords.pope.providers.medialibrary.*
import com.dewords.pope.viewmodels.MedialibraryViewModel
import com.dewords.pope.viewmodels.tv.TvBrowserModel


class MediaBrowserViewModel(context: Context, val category: Long, val parent : MediaLibraryItem?) : MedialibraryViewModel(context), TvBrowserModel<MediaLibraryItem> {


    override var nbColumns = 0
    override var currentItem: MediaLibraryItem? = parent

    override val provider = when (category) {
        CATEGORY_ALBUMS -> AlbumsProvider(parent, context, this)
        CATEGORY_ARTISTS -> ArtistsProvider(context, this, false)
        CATEGORY_GENRES -> GenresProvider(context, this)
        CATEGORY_VIDEOS -> VideosProvider(null, null, context, this)
        CATEGORY_PLAYLISTS -> PlaylistsProvider(context, this, Playlist.Type.All)
        else -> TracksProvider(null, context, this)
    }
    override val providers = arrayOf(provider)

    init {
        when(category){
            CATEGORY_ALBUMS -> watchAlbums()
            CATEGORY_ARTISTS -> watchArtists()
            CATEGORY_GENRES -> watchGenres()
            CATEGORY_PLAYLISTS -> watchPlaylists()
            else -> watchMedia()
        }
    }

    class Factory(private val context: Context, private val category: Long, private val parent : MediaLibraryItem?) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            @Suppress("UNCHECKED_CAST")
            return MediaBrowserViewModel(context.applicationContext, category, parent) as T
        }
    }
}

fun Fragment.getMediaBrowserModel(category: Long, parent : MediaLibraryItem? = null) = ViewModelProvider(requireActivity(), MediaBrowserViewModel.Factory(requireContext(), category, parent)).get(MediaBrowserViewModel::class.java)
