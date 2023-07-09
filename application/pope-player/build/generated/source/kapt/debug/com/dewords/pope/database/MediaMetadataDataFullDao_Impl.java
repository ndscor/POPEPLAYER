package com.dewords.pope.database;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.dewords.pope.database.models.MediaImage;
import com.dewords.pope.database.models.MediaImageType;
import com.dewords.pope.database.models.MediaMetadata;
import com.dewords.pope.database.models.MediaMetadataType;
import com.dewords.pope.database.models.MediaMetadataWithImages;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MediaMetadataDataFullDao_Impl implements MediaMetadataDataFullDao {
  private final RoomDatabase __db;

  private final Converters __converters = new Converters();

  public MediaMetadataDataFullDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public LiveData<MediaMetadataWithImages> getMetadataLiveByML(final long id) {
    final String _sql = "select * from media_metadata where ml_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<MediaMetadataWithImages>() {
      @Override
      public MediaMetadataWithImages call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final MediaMetadataWithImages _result;
          if(_cursor.moveToFirst()) {
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _result = new MediaMetadataWithImages();
            _result.metadata = _tmpMetadata;
            _result.show = _tmpShow;
            _result.setImages(_tmpImagesCollection_1);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<MediaMetadataWithImages> getMediaLive(final String id) {
    final String _sql = "select * from media_metadata where moviepedia_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<MediaMetadataWithImages>() {
      @Override
      public MediaMetadataWithImages call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final MediaMetadataWithImages _result;
          if(_cursor.moveToFirst()) {
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _result = new MediaMetadataWithImages();
            _result.metadata = _tmpMetadata;
            _result.show = _tmpShow;
            _result.setImages(_tmpImagesCollection_1);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MediaMetadataWithImages>> getEpisodesLive(final String showId) {
    final String _sql = "select * from media_metadata where show_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (showId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, showId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<List<MediaMetadataWithImages>>() {
      @Override
      public List<MediaMetadataWithImages> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaMetadataWithImages _item;
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _item = new MediaMetadataWithImages();
            _item.metadata = _tmpMetadata;
            _item.show = _tmpShow;
            _item.setImages(_tmpImagesCollection_1);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public MediaMetadataWithImages getMedia(final long id) {
    final String _sql = "select * from media_metadata where ml_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
      final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
      final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
      final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
      final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
      final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
      final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
      final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
      while (_cursor.moveToNext()) {
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
          _collectionShow.put(_tmpKey, null);
        }
        final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
        ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
        if (_tmpImagesCollection == null) {
          _tmpImagesCollection = new ArrayList<MediaImage>();
          _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
        }
      }
      _cursor.moveToPosition(-1);
      __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
      __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
      final MediaMetadataWithImages _result;
      if(_cursor.moveToFirst()) {
        final MediaMetadata _tmpMetadata;
        if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
          final String _tmpMoviepediaId;
          if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
            _tmpMoviepediaId = null;
          } else {
            _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
          }
          final Long _tmpMlId;
          if (_cursor.isNull(_cursorIndexOfMlId)) {
            _tmpMlId = null;
          } else {
            _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
          }
          final MediaMetadataType _tmpType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfType);
          _tmpType = __converters.mediaTypeFromKey(_tmp);
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSummary;
          if (_cursor.isNull(_cursorIndexOfSummary)) {
            _tmpSummary = null;
          } else {
            _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
          }
          final String _tmpGenres;
          if (_cursor.isNull(_cursorIndexOfGenres)) {
            _tmpGenres = null;
          } else {
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
          }
          final Date _tmpReleaseDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
          }
          _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
          final String _tmpCountries;
          if (_cursor.isNull(_cursorIndexOfCountries)) {
            _tmpCountries = null;
          } else {
            _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
          }
          final Integer _tmpSeason;
          if (_cursor.isNull(_cursorIndexOfSeason)) {
            _tmpSeason = null;
          } else {
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
          }
          final Integer _tmpEpisode;
          if (_cursor.isNull(_cursorIndexOfEpisode)) {
            _tmpEpisode = null;
          } else {
            _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
          }
          final String _tmpCurrentPoster;
          if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
            _tmpCurrentPoster = null;
          } else {
            _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
          }
          final String _tmpCurrentBackdrop;
          if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
            _tmpCurrentBackdrop = null;
          } else {
            _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
          }
          final String _tmpShowId;
          if (_cursor.isNull(_cursorIndexOfShowId)) {
            _tmpShowId = null;
          } else {
            _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
          }
          final boolean _tmpHasCast;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
          _tmpHasCast = _tmp_2 != 0;
          final Date _tmpInsertDate;
          final Long _tmp_3;
          if (_cursor.isNull(_cursorIndexOfInsertDate)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
          }
          _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
          _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
        }  else  {
          _tmpMetadata = null;
        }
        MediaMetadata _tmpShow = null;
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
          _tmpShow = _collectionShow.get(_tmpKey_2);
        }
        ArrayList<MediaImage> _tmpImagesCollection_1 = null;
        final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
        _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
        if (_tmpImagesCollection_1 == null) {
          _tmpImagesCollection_1 = new ArrayList<MediaImage>();
        }
        _result = new MediaMetadataWithImages();
        _result.metadata = _tmpMetadata;
        _result.show = _tmpShow;
        _result.setImages(_tmpImagesCollection_1);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MediaMetadataWithImages getMediaById(final String id) {
    final String _sql = "select * from media_metadata where moviepedia_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
      final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
      final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
      final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
      final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
      final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
      final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
      final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
      while (_cursor.moveToNext()) {
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
          _collectionShow.put(_tmpKey, null);
        }
        final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
        ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
        if (_tmpImagesCollection == null) {
          _tmpImagesCollection = new ArrayList<MediaImage>();
          _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
        }
      }
      _cursor.moveToPosition(-1);
      __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
      __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
      final MediaMetadataWithImages _result;
      if(_cursor.moveToFirst()) {
        final MediaMetadata _tmpMetadata;
        if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
          final String _tmpMoviepediaId;
          if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
            _tmpMoviepediaId = null;
          } else {
            _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
          }
          final Long _tmpMlId;
          if (_cursor.isNull(_cursorIndexOfMlId)) {
            _tmpMlId = null;
          } else {
            _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
          }
          final MediaMetadataType _tmpType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfType);
          _tmpType = __converters.mediaTypeFromKey(_tmp);
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSummary;
          if (_cursor.isNull(_cursorIndexOfSummary)) {
            _tmpSummary = null;
          } else {
            _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
          }
          final String _tmpGenres;
          if (_cursor.isNull(_cursorIndexOfGenres)) {
            _tmpGenres = null;
          } else {
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
          }
          final Date _tmpReleaseDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
          }
          _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
          final String _tmpCountries;
          if (_cursor.isNull(_cursorIndexOfCountries)) {
            _tmpCountries = null;
          } else {
            _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
          }
          final Integer _tmpSeason;
          if (_cursor.isNull(_cursorIndexOfSeason)) {
            _tmpSeason = null;
          } else {
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
          }
          final Integer _tmpEpisode;
          if (_cursor.isNull(_cursorIndexOfEpisode)) {
            _tmpEpisode = null;
          } else {
            _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
          }
          final String _tmpCurrentPoster;
          if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
            _tmpCurrentPoster = null;
          } else {
            _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
          }
          final String _tmpCurrentBackdrop;
          if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
            _tmpCurrentBackdrop = null;
          } else {
            _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
          }
          final String _tmpShowId;
          if (_cursor.isNull(_cursorIndexOfShowId)) {
            _tmpShowId = null;
          } else {
            _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
          }
          final boolean _tmpHasCast;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
          _tmpHasCast = _tmp_2 != 0;
          final Date _tmpInsertDate;
          final Long _tmp_3;
          if (_cursor.isNull(_cursorIndexOfInsertDate)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
          }
          _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
          _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
        }  else  {
          _tmpMetadata = null;
        }
        MediaMetadata _tmpShow = null;
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
          _tmpShow = _collectionShow.get(_tmpKey_2);
        }
        ArrayList<MediaImage> _tmpImagesCollection_1 = null;
        final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
        _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
        if (_tmpImagesCollection_1 == null) {
          _tmpImagesCollection_1 = new ArrayList<MediaImage>();
        }
        _result = new MediaMetadataWithImages();
        _result.metadata = _tmpMetadata;
        _result.show = _tmpShow;
        _result.setImages(_tmpImagesCollection_1);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<MediaMetadataWithImages> getMediaByIdLive(final String id) {
    final String _sql = "select * from media_metadata where moviepedia_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<MediaMetadataWithImages>() {
      @Override
      public MediaMetadataWithImages call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final MediaMetadataWithImages _result;
          if(_cursor.moveToFirst()) {
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _result = new MediaMetadataWithImages();
            _result.metadata = _tmpMetadata;
            _result.show = _tmpShow;
            _result.setImages(_tmpImagesCollection_1);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getMovieCount() {
    final String _sql = "select count(moviepedia_id) from media_metadata where type = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getTvshowsCount() {
    final String _sql = "select count(moviepedia_id) from media_metadata where type = 2";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MediaMetadataWithImages>> getAllLive() {
    final String _sql = "select * from media_metadata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<List<MediaMetadataWithImages>>() {
      @Override
      public List<MediaMetadataWithImages> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaMetadataWithImages _item;
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _item = new MediaMetadataWithImages();
            _item.metadata = _tmpMetadata;
            _item.show = _tmpShow;
            _item.setImages(_tmpImagesCollection_1);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public MediaMetadataWithImages findNextEpisode(final String showId, final int season,
      final int episode) {
    final String _sql = "SELECT * FROM media_metadata WHERE show_id = ? AND ((season = ? AND episode > ?) OR (season > ?)) ORDER BY season, episode ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (showId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, showId);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, season);
    _argIndex = 3;
    _statement.bindLong(_argIndex, episode);
    _argIndex = 4;
    _statement.bindLong(_argIndex, season);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
      final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
      final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
      final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
      final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
      final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
      final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
      final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
      while (_cursor.moveToNext()) {
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
          _collectionShow.put(_tmpKey, null);
        }
        final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
        ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
        if (_tmpImagesCollection == null) {
          _tmpImagesCollection = new ArrayList<MediaImage>();
          _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
        }
      }
      _cursor.moveToPosition(-1);
      __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
      __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
      final MediaMetadataWithImages _result;
      if(_cursor.moveToFirst()) {
        final MediaMetadata _tmpMetadata;
        if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
          final String _tmpMoviepediaId;
          if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
            _tmpMoviepediaId = null;
          } else {
            _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
          }
          final Long _tmpMlId;
          if (_cursor.isNull(_cursorIndexOfMlId)) {
            _tmpMlId = null;
          } else {
            _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
          }
          final MediaMetadataType _tmpType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfType);
          _tmpType = __converters.mediaTypeFromKey(_tmp);
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSummary;
          if (_cursor.isNull(_cursorIndexOfSummary)) {
            _tmpSummary = null;
          } else {
            _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
          }
          final String _tmpGenres;
          if (_cursor.isNull(_cursorIndexOfGenres)) {
            _tmpGenres = null;
          } else {
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
          }
          final Date _tmpReleaseDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
          }
          _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
          final String _tmpCountries;
          if (_cursor.isNull(_cursorIndexOfCountries)) {
            _tmpCountries = null;
          } else {
            _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
          }
          final Integer _tmpSeason;
          if (_cursor.isNull(_cursorIndexOfSeason)) {
            _tmpSeason = null;
          } else {
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
          }
          final Integer _tmpEpisode;
          if (_cursor.isNull(_cursorIndexOfEpisode)) {
            _tmpEpisode = null;
          } else {
            _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
          }
          final String _tmpCurrentPoster;
          if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
            _tmpCurrentPoster = null;
          } else {
            _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
          }
          final String _tmpCurrentBackdrop;
          if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
            _tmpCurrentBackdrop = null;
          } else {
            _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
          }
          final String _tmpShowId;
          if (_cursor.isNull(_cursorIndexOfShowId)) {
            _tmpShowId = null;
          } else {
            _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
          }
          final boolean _tmpHasCast;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
          _tmpHasCast = _tmp_2 != 0;
          final Date _tmpInsertDate;
          final Long _tmp_3;
          if (_cursor.isNull(_cursorIndexOfInsertDate)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
          }
          _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
          _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
        }  else  {
          _tmpMetadata = null;
        }
        MediaMetadata _tmpShow = null;
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
          _tmpShow = _collectionShow.get(_tmpKey_2);
        }
        ArrayList<MediaImage> _tmpImagesCollection_1 = null;
        final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
        _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
        if (_tmpImagesCollection_1 == null) {
          _tmpImagesCollection_1 = new ArrayList<MediaImage>();
        }
        _result = new MediaMetadataWithImages();
        _result.metadata = _tmpMetadata;
        _result.show = _tmpShow;
        _result.setImages(_tmpImagesCollection_1);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MediaMetadataWithImages>> getByIds(final List<Long> mlids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("select * from media_metadata where ml_id IN (");
    final int _inputSize = mlids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") LIMIT 10");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Long _item : mlids) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<List<MediaMetadataWithImages>>() {
      @Override
      public List<MediaMetadataWithImages> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaMetadataWithImages _item_1;
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _item_1 = new MediaMetadataWithImages();
            _item_1.metadata = _tmpMetadata;
            _item_1.show = _tmpShow;
            _item_1.setImages(_tmpImagesCollection_1);
            _result.add(_item_1);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MediaMetadataWithImages>> getRecentlyAdded() {
    final String _sql = "select * from media_metadata ORDER BY insertDate DESC LIMIT 10";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata","media_metadata_image"}, false, new Callable<List<MediaMetadataWithImages>>() {
      @Override
      public List<MediaMetadataWithImages> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
          final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
          final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
          final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
          final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
          final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
          final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
          final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
          final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
          final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
          while (_cursor.moveToNext()) {
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
              _collectionShow.put(_tmpKey, null);
            }
            final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
            ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
            if (_tmpImagesCollection == null) {
              _tmpImagesCollection = new ArrayList<MediaImage>();
              _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
            }
          }
          _cursor.moveToPosition(-1);
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
          final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MediaMetadataWithImages _item;
            final MediaMetadata _tmpMetadata;
            if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
              final String _tmpMoviepediaId;
              if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
                _tmpMoviepediaId = null;
              } else {
                _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
              }
              final Long _tmpMlId;
              if (_cursor.isNull(_cursorIndexOfMlId)) {
                _tmpMlId = null;
              } else {
                _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
              }
              final MediaMetadataType _tmpType;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfType);
              _tmpType = __converters.mediaTypeFromKey(_tmp);
              final String _tmpTitle;
              if (_cursor.isNull(_cursorIndexOfTitle)) {
                _tmpTitle = null;
              } else {
                _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              }
              final String _tmpSummary;
              if (_cursor.isNull(_cursorIndexOfSummary)) {
                _tmpSummary = null;
              } else {
                _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
              }
              final String _tmpGenres;
              if (_cursor.isNull(_cursorIndexOfGenres)) {
                _tmpGenres = null;
              } else {
                _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
              }
              final Date _tmpReleaseDate;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
              }
              _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
              final String _tmpCountries;
              if (_cursor.isNull(_cursorIndexOfCountries)) {
                _tmpCountries = null;
              } else {
                _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
              }
              final Integer _tmpSeason;
              if (_cursor.isNull(_cursorIndexOfSeason)) {
                _tmpSeason = null;
              } else {
                _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
              }
              final Integer _tmpEpisode;
              if (_cursor.isNull(_cursorIndexOfEpisode)) {
                _tmpEpisode = null;
              } else {
                _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
              }
              final String _tmpCurrentPoster;
              if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
                _tmpCurrentPoster = null;
              } else {
                _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
              }
              final String _tmpCurrentBackdrop;
              if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                _tmpCurrentBackdrop = null;
              } else {
                _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
              }
              final String _tmpShowId;
              if (_cursor.isNull(_cursorIndexOfShowId)) {
                _tmpShowId = null;
              } else {
                _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
              }
              final boolean _tmpHasCast;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
              _tmpHasCast = _tmp_2 != 0;
              final Date _tmpInsertDate;
              final Long _tmp_3;
              if (_cursor.isNull(_cursorIndexOfInsertDate)) {
                _tmp_3 = null;
              } else {
                _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
              }
              _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
              _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            }  else  {
              _tmpMetadata = null;
            }
            MediaMetadata _tmpShow = null;
            if (!_cursor.isNull(_cursorIndexOfShowId)) {
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
              _tmpShow = _collectionShow.get(_tmpKey_2);
            }
            ArrayList<MediaImage> _tmpImagesCollection_1 = null;
            final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
            _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
            if (_tmpImagesCollection_1 == null) {
              _tmpImagesCollection_1 = new ArrayList<MediaImage>();
            }
            _item = new MediaMetadataWithImages();
            _item.metadata = _tmpMetadata;
            _item.show = _tmpShow;
            _item.setImages(_tmpImagesCollection_1);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<MediaMetadataWithImages> searchMedia(final String sanitizedQuery) {
    final String _sql = "select * from media_metadata WHERE title LIKE ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sanitizedQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sanitizedQuery);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
      final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
      final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
      final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
      final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
      final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
      final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
      final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
      while (_cursor.moveToNext()) {
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
          _collectionShow.put(_tmpKey, null);
        }
        final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
        ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
        if (_tmpImagesCollection == null) {
          _tmpImagesCollection = new ArrayList<MediaImage>();
          _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
        }
      }
      _cursor.moveToPosition(-1);
      __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
      __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
      final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MediaMetadataWithImages _item;
        final MediaMetadata _tmpMetadata;
        if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
          final String _tmpMoviepediaId;
          if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
            _tmpMoviepediaId = null;
          } else {
            _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
          }
          final Long _tmpMlId;
          if (_cursor.isNull(_cursorIndexOfMlId)) {
            _tmpMlId = null;
          } else {
            _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
          }
          final MediaMetadataType _tmpType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfType);
          _tmpType = __converters.mediaTypeFromKey(_tmp);
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSummary;
          if (_cursor.isNull(_cursorIndexOfSummary)) {
            _tmpSummary = null;
          } else {
            _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
          }
          final String _tmpGenres;
          if (_cursor.isNull(_cursorIndexOfGenres)) {
            _tmpGenres = null;
          } else {
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
          }
          final Date _tmpReleaseDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
          }
          _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
          final String _tmpCountries;
          if (_cursor.isNull(_cursorIndexOfCountries)) {
            _tmpCountries = null;
          } else {
            _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
          }
          final Integer _tmpSeason;
          if (_cursor.isNull(_cursorIndexOfSeason)) {
            _tmpSeason = null;
          } else {
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
          }
          final Integer _tmpEpisode;
          if (_cursor.isNull(_cursorIndexOfEpisode)) {
            _tmpEpisode = null;
          } else {
            _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
          }
          final String _tmpCurrentPoster;
          if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
            _tmpCurrentPoster = null;
          } else {
            _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
          }
          final String _tmpCurrentBackdrop;
          if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
            _tmpCurrentBackdrop = null;
          } else {
            _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
          }
          final String _tmpShowId;
          if (_cursor.isNull(_cursorIndexOfShowId)) {
            _tmpShowId = null;
          } else {
            _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
          }
          final boolean _tmpHasCast;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
          _tmpHasCast = _tmp_2 != 0;
          final Date _tmpInsertDate;
          final Long _tmp_3;
          if (_cursor.isNull(_cursorIndexOfInsertDate)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
          }
          _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
          _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
        }  else  {
          _tmpMetadata = null;
        }
        MediaMetadata _tmpShow = null;
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
          _tmpShow = _collectionShow.get(_tmpKey_2);
        }
        ArrayList<MediaImage> _tmpImagesCollection_1 = null;
        final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
        _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
        if (_tmpImagesCollection_1 == null) {
          _tmpImagesCollection_1 = new ArrayList<MediaImage>();
        }
        _item = new MediaMetadataWithImages();
        _item.metadata = _tmpMetadata;
        _item.show = _tmpShow;
        _item.setImages(_tmpImagesCollection_1);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MediaMetadataWithImages> getTvShowEpisodes(final String tvshowId) {
    final String _sql = "select * from media_metadata WHERE show_id = ? ORDER by season, episode";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (tvshowId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, tvshowId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfMlId = CursorUtil.getColumnIndexOrThrow(_cursor, "ml_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
      final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "countries");
      final int _cursorIndexOfSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "season");
      final int _cursorIndexOfEpisode = CursorUtil.getColumnIndexOrThrow(_cursor, "episode");
      final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndexOrThrow(_cursor, "current_poster");
      final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndexOrThrow(_cursor, "current_backdrop");
      final int _cursorIndexOfShowId = CursorUtil.getColumnIndexOrThrow(_cursor, "show_id");
      final int _cursorIndexOfHasCast = CursorUtil.getColumnIndexOrThrow(_cursor, "has_cast");
      final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndexOrThrow(_cursor, "insertDate");
      final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
      final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
      while (_cursor.moveToNext()) {
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfShowId);
          _collectionShow.put(_tmpKey, null);
        }
        final String _tmpKey_1 = _cursor.getString(_cursorIndexOfMoviepediaId);
        ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
        if (_tmpImagesCollection == null) {
          _tmpImagesCollection = new ArrayList<MediaImage>();
          _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
        }
      }
      _cursor.moveToPosition(-1);
      __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
      __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
      final List<MediaMetadataWithImages> _result = new ArrayList<MediaMetadataWithImages>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MediaMetadataWithImages _item;
        final MediaMetadata _tmpMetadata;
        if (! (_cursor.isNull(_cursorIndexOfMoviepediaId) && _cursor.isNull(_cursorIndexOfMlId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfSummary) && _cursor.isNull(_cursorIndexOfGenres) && _cursor.isNull(_cursorIndexOfReleaseDate) && _cursor.isNull(_cursorIndexOfCountries) && _cursor.isNull(_cursorIndexOfSeason) && _cursor.isNull(_cursorIndexOfEpisode) && _cursor.isNull(_cursorIndexOfCurrentPoster) && _cursor.isNull(_cursorIndexOfCurrentBackdrop) && _cursor.isNull(_cursorIndexOfShowId) && _cursor.isNull(_cursorIndexOfHasCast) && _cursor.isNull(_cursorIndexOfInsertDate))) {
          final String _tmpMoviepediaId;
          if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
            _tmpMoviepediaId = null;
          } else {
            _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
          }
          final Long _tmpMlId;
          if (_cursor.isNull(_cursorIndexOfMlId)) {
            _tmpMlId = null;
          } else {
            _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
          }
          final MediaMetadataType _tmpType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfType);
          _tmpType = __converters.mediaTypeFromKey(_tmp);
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpSummary;
          if (_cursor.isNull(_cursorIndexOfSummary)) {
            _tmpSummary = null;
          } else {
            _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
          }
          final String _tmpGenres;
          if (_cursor.isNull(_cursorIndexOfGenres)) {
            _tmpGenres = null;
          } else {
            _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
          }
          final Date _tmpReleaseDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
          }
          _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
          final String _tmpCountries;
          if (_cursor.isNull(_cursorIndexOfCountries)) {
            _tmpCountries = null;
          } else {
            _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
          }
          final Integer _tmpSeason;
          if (_cursor.isNull(_cursorIndexOfSeason)) {
            _tmpSeason = null;
          } else {
            _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
          }
          final Integer _tmpEpisode;
          if (_cursor.isNull(_cursorIndexOfEpisode)) {
            _tmpEpisode = null;
          } else {
            _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
          }
          final String _tmpCurrentPoster;
          if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
            _tmpCurrentPoster = null;
          } else {
            _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
          }
          final String _tmpCurrentBackdrop;
          if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
            _tmpCurrentBackdrop = null;
          } else {
            _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
          }
          final String _tmpShowId;
          if (_cursor.isNull(_cursorIndexOfShowId)) {
            _tmpShowId = null;
          } else {
            _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
          }
          final boolean _tmpHasCast;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
          _tmpHasCast = _tmp_2 != 0;
          final Date _tmpInsertDate;
          final Long _tmp_3;
          if (_cursor.isNull(_cursorIndexOfInsertDate)) {
            _tmp_3 = null;
          } else {
            _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
          }
          _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
          _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
        }  else  {
          _tmpMetadata = null;
        }
        MediaMetadata _tmpShow = null;
        if (!_cursor.isNull(_cursorIndexOfShowId)) {
          final String _tmpKey_2 = _cursor.getString(_cursorIndexOfShowId);
          _tmpShow = _collectionShow.get(_tmpKey_2);
        }
        ArrayList<MediaImage> _tmpImagesCollection_1 = null;
        final String _tmpKey_3 = _cursor.getString(_cursorIndexOfMoviepediaId);
        _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
        if (_tmpImagesCollection_1 == null) {
          _tmpImagesCollection_1 = new ArrayList<MediaImage>();
        }
        _item = new MediaMetadataWithImages();
        _item.metadata = _tmpMetadata;
        _item.show = _tmpShow;
        _item.setImages(_tmpImagesCollection_1);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public DataSource.Factory<Integer, MediaMetadataWithImages> getAllPaged(
      final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return new DataSource.Factory<Integer, MediaMetadataWithImages>() {
      @Override
      public LimitOffsetDataSource<MediaMetadataWithImages> create() {
        return new LimitOffsetDataSource<MediaMetadataWithImages>(__db, _internalQuery, false, true , "media_metadata", "media_metadata_image") {
          @Override
          protected List<MediaMetadataWithImages> convertRows(Cursor cursor) {
            final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndex(cursor, "moviepedia_id");
            final int _cursorIndexOfMlId = CursorUtil.getColumnIndex(cursor, "ml_id");
            final int _cursorIndexOfType = CursorUtil.getColumnIndex(cursor, "type");
            final int _cursorIndexOfTitle = CursorUtil.getColumnIndex(cursor, "title");
            final int _cursorIndexOfSummary = CursorUtil.getColumnIndex(cursor, "summary");
            final int _cursorIndexOfGenres = CursorUtil.getColumnIndex(cursor, "genres");
            final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndex(cursor, "releaseDate");
            final int _cursorIndexOfCountries = CursorUtil.getColumnIndex(cursor, "countries");
            final int _cursorIndexOfSeason = CursorUtil.getColumnIndex(cursor, "season");
            final int _cursorIndexOfEpisode = CursorUtil.getColumnIndex(cursor, "episode");
            final int _cursorIndexOfCurrentPoster = CursorUtil.getColumnIndex(cursor, "current_poster");
            final int _cursorIndexOfCurrentBackdrop = CursorUtil.getColumnIndex(cursor, "current_backdrop");
            final int _cursorIndexOfShowId = CursorUtil.getColumnIndex(cursor, "show_id");
            final int _cursorIndexOfHasCast = CursorUtil.getColumnIndex(cursor, "has_cast");
            final int _cursorIndexOfInsertDate = CursorUtil.getColumnIndex(cursor, "insertDate");
            final ArrayMap<String, MediaMetadata> _collectionShow = new ArrayMap<String, MediaMetadata>();
            final ArrayMap<String, ArrayList<MediaImage>> _collectionImages = new ArrayMap<String, ArrayList<MediaImage>>();
            while (cursor.moveToNext()) {
              if (!cursor.isNull(_cursorIndexOfShowId)) {
                final String _tmpKey = cursor.getString(_cursorIndexOfShowId);
                _collectionShow.put(_tmpKey, null);
              }
              final String _tmpKey_1 = cursor.getString(_cursorIndexOfMoviepediaId);
              ArrayList<MediaImage> _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
              if (_tmpImagesCollection == null) {
                _tmpImagesCollection = new ArrayList<MediaImage>();
                _collectionImages.put(_tmpKey_1, _tmpImagesCollection);
              }
            }
            cursor.moveToPosition(-1);
            __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_collectionShow);
            __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_collectionImages);
            final List<MediaMetadataWithImages> _res = new ArrayList<MediaMetadataWithImages>(cursor.getCount());
            while(cursor.moveToNext()) {
              final MediaMetadataWithImages _item;
              final MediaMetadata _tmpMetadata;
              if (! (( _cursorIndexOfMoviepediaId == -1 || cursor.isNull(_cursorIndexOfMoviepediaId)) && ( _cursorIndexOfMlId == -1 || cursor.isNull(_cursorIndexOfMlId)) && ( _cursorIndexOfType == -1 || cursor.isNull(_cursorIndexOfType)) && ( _cursorIndexOfTitle == -1 || cursor.isNull(_cursorIndexOfTitle)) && ( _cursorIndexOfSummary == -1 || cursor.isNull(_cursorIndexOfSummary)) && ( _cursorIndexOfGenres == -1 || cursor.isNull(_cursorIndexOfGenres)) && ( _cursorIndexOfReleaseDate == -1 || cursor.isNull(_cursorIndexOfReleaseDate)) && ( _cursorIndexOfCountries == -1 || cursor.isNull(_cursorIndexOfCountries)) && ( _cursorIndexOfSeason == -1 || cursor.isNull(_cursorIndexOfSeason)) && ( _cursorIndexOfEpisode == -1 || cursor.isNull(_cursorIndexOfEpisode)) && ( _cursorIndexOfCurrentPoster == -1 || cursor.isNull(_cursorIndexOfCurrentPoster)) && ( _cursorIndexOfCurrentBackdrop == -1 || cursor.isNull(_cursorIndexOfCurrentBackdrop)) && ( _cursorIndexOfShowId == -1 || cursor.isNull(_cursorIndexOfShowId)) && ( _cursorIndexOfHasCast == -1 || cursor.isNull(_cursorIndexOfHasCast)) && ( _cursorIndexOfInsertDate == -1 || cursor.isNull(_cursorIndexOfInsertDate)))) {
                final String _tmpMoviepediaId;
                if (_cursorIndexOfMoviepediaId == -1) {
                  _tmpMoviepediaId = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfMoviepediaId)) {
                    _tmpMoviepediaId = null;
                  } else {
                    _tmpMoviepediaId = cursor.getString(_cursorIndexOfMoviepediaId);
                  }
                }
                final Long _tmpMlId;
                if (_cursorIndexOfMlId == -1) {
                  _tmpMlId = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfMlId)) {
                    _tmpMlId = null;
                  } else {
                    _tmpMlId = cursor.getLong(_cursorIndexOfMlId);
                  }
                }
                final MediaMetadataType _tmpType;
                if (_cursorIndexOfType == -1) {
                  _tmpType = null;
                } else {
                  final int _tmp;
                  _tmp = cursor.getInt(_cursorIndexOfType);
                  _tmpType = __converters.mediaTypeFromKey(_tmp);
                }
                final String _tmpTitle;
                if (_cursorIndexOfTitle == -1) {
                  _tmpTitle = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfTitle)) {
                    _tmpTitle = null;
                  } else {
                    _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                  }
                }
                final String _tmpSummary;
                if (_cursorIndexOfSummary == -1) {
                  _tmpSummary = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfSummary)) {
                    _tmpSummary = null;
                  } else {
                    _tmpSummary = cursor.getString(_cursorIndexOfSummary);
                  }
                }
                final String _tmpGenres;
                if (_cursorIndexOfGenres == -1) {
                  _tmpGenres = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfGenres)) {
                    _tmpGenres = null;
                  } else {
                    _tmpGenres = cursor.getString(_cursorIndexOfGenres);
                  }
                }
                final Date _tmpReleaseDate;
                if (_cursorIndexOfReleaseDate == -1) {
                  _tmpReleaseDate = null;
                } else {
                  final Long _tmp_1;
                  if (cursor.isNull(_cursorIndexOfReleaseDate)) {
                    _tmp_1 = null;
                  } else {
                    _tmp_1 = cursor.getLong(_cursorIndexOfReleaseDate);
                  }
                  _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
                }
                final String _tmpCountries;
                if (_cursorIndexOfCountries == -1) {
                  _tmpCountries = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfCountries)) {
                    _tmpCountries = null;
                  } else {
                    _tmpCountries = cursor.getString(_cursorIndexOfCountries);
                  }
                }
                final Integer _tmpSeason;
                if (_cursorIndexOfSeason == -1) {
                  _tmpSeason = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfSeason)) {
                    _tmpSeason = null;
                  } else {
                    _tmpSeason = cursor.getInt(_cursorIndexOfSeason);
                  }
                }
                final Integer _tmpEpisode;
                if (_cursorIndexOfEpisode == -1) {
                  _tmpEpisode = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfEpisode)) {
                    _tmpEpisode = null;
                  } else {
                    _tmpEpisode = cursor.getInt(_cursorIndexOfEpisode);
                  }
                }
                final String _tmpCurrentPoster;
                if (_cursorIndexOfCurrentPoster == -1) {
                  _tmpCurrentPoster = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfCurrentPoster)) {
                    _tmpCurrentPoster = null;
                  } else {
                    _tmpCurrentPoster = cursor.getString(_cursorIndexOfCurrentPoster);
                  }
                }
                final String _tmpCurrentBackdrop;
                if (_cursorIndexOfCurrentBackdrop == -1) {
                  _tmpCurrentBackdrop = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
                    _tmpCurrentBackdrop = null;
                  } else {
                    _tmpCurrentBackdrop = cursor.getString(_cursorIndexOfCurrentBackdrop);
                  }
                }
                final String _tmpShowId;
                if (_cursorIndexOfShowId == -1) {
                  _tmpShowId = null;
                } else {
                  if (cursor.isNull(_cursorIndexOfShowId)) {
                    _tmpShowId = null;
                  } else {
                    _tmpShowId = cursor.getString(_cursorIndexOfShowId);
                  }
                }
                final boolean _tmpHasCast;
                if (_cursorIndexOfHasCast == -1) {
                  _tmpHasCast = false;
                } else {
                  final int _tmp_2;
                  _tmp_2 = cursor.getInt(_cursorIndexOfHasCast);
                  _tmpHasCast = _tmp_2 != 0;
                }
                final Date _tmpInsertDate;
                if (_cursorIndexOfInsertDate == -1) {
                  _tmpInsertDate = null;
                } else {
                  final Long _tmp_3;
                  if (cursor.isNull(_cursorIndexOfInsertDate)) {
                    _tmp_3 = null;
                  } else {
                    _tmp_3 = cursor.getLong(_cursorIndexOfInsertDate);
                  }
                  _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
                }
                _tmpMetadata = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
              }  else  {
                _tmpMetadata = null;
              }
              MediaMetadata _tmpShow = null;
              if (!cursor.isNull(_cursorIndexOfShowId)) {
                final String _tmpKey_2 = cursor.getString(_cursorIndexOfShowId);
                _tmpShow = _collectionShow.get(_tmpKey_2);
              }
              ArrayList<MediaImage> _tmpImagesCollection_1 = null;
              final String _tmpKey_3 = cursor.getString(_cursorIndexOfMoviepediaId);
              _tmpImagesCollection_1 = _collectionImages.get(_tmpKey_3);
              if (_tmpImagesCollection_1 == null) {
                _tmpImagesCollection_1 = new ArrayList<MediaImage>();
              }
              _item = new MediaMetadataWithImages();
              _item.metadata = _tmpMetadata;
              _item.show = _tmpShow;
              _item.setImages(_tmpImagesCollection_1);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(
      final ArrayMap<String, MediaMetadata> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, MediaMetadata> _tmpInnerMap = new ArrayMap<String, MediaMetadata>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), null);
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_tmpInnerMap);
          _map.putAll((Map<String, MediaMetadata>) _tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, MediaMetadata>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipmediaMetadataAscomDewordsPopeDatabaseModelsMediaMetadata(_tmpInnerMap);
        _map.putAll((Map<String, MediaMetadata>) _tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `moviepedia_id`,`ml_id`,`type`,`title`,`summary`,`genres`,`releaseDate`,`countries`,`season`,`episode`,`current_poster`,`current_backdrop`,`show_id`,`has_cast`,`insertDate` FROM `media_metadata` WHERE `moviepedia_id` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "moviepedia_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfMoviepediaId = 0;
      final int _cursorIndexOfMlId = 1;
      final int _cursorIndexOfType = 2;
      final int _cursorIndexOfTitle = 3;
      final int _cursorIndexOfSummary = 4;
      final int _cursorIndexOfGenres = 5;
      final int _cursorIndexOfReleaseDate = 6;
      final int _cursorIndexOfCountries = 7;
      final int _cursorIndexOfSeason = 8;
      final int _cursorIndexOfEpisode = 9;
      final int _cursorIndexOfCurrentPoster = 10;
      final int _cursorIndexOfCurrentBackdrop = 11;
      final int _cursorIndexOfShowId = 12;
      final int _cursorIndexOfHasCast = 13;
      final int _cursorIndexOfInsertDate = 14;
      while(_cursor.moveToNext()) {
        if (!_cursor.isNull(_itemKeyIndex)) {
          final String _tmpKey = _cursor.getString(_itemKeyIndex);
          if (_map.containsKey(_tmpKey)) {
            final MediaMetadata _item_1;
            final String _tmpMoviepediaId;
            if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
              _tmpMoviepediaId = null;
            } else {
              _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
            }
            final Long _tmpMlId;
            if (_cursor.isNull(_cursorIndexOfMlId)) {
              _tmpMlId = null;
            } else {
              _tmpMlId = _cursor.getLong(_cursorIndexOfMlId);
            }
            final MediaMetadataType _tmpType;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfType);
            _tmpType = __converters.mediaTypeFromKey(_tmp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Date _tmpReleaseDate;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfReleaseDate);
            }
            _tmpReleaseDate = __converters.fromTimestamp(_tmp_1);
            final String _tmpCountries;
            if (_cursor.isNull(_cursorIndexOfCountries)) {
              _tmpCountries = null;
            } else {
              _tmpCountries = _cursor.getString(_cursorIndexOfCountries);
            }
            final Integer _tmpSeason;
            if (_cursor.isNull(_cursorIndexOfSeason)) {
              _tmpSeason = null;
            } else {
              _tmpSeason = _cursor.getInt(_cursorIndexOfSeason);
            }
            final Integer _tmpEpisode;
            if (_cursor.isNull(_cursorIndexOfEpisode)) {
              _tmpEpisode = null;
            } else {
              _tmpEpisode = _cursor.getInt(_cursorIndexOfEpisode);
            }
            final String _tmpCurrentPoster;
            if (_cursor.isNull(_cursorIndexOfCurrentPoster)) {
              _tmpCurrentPoster = null;
            } else {
              _tmpCurrentPoster = _cursor.getString(_cursorIndexOfCurrentPoster);
            }
            final String _tmpCurrentBackdrop;
            if (_cursor.isNull(_cursorIndexOfCurrentBackdrop)) {
              _tmpCurrentBackdrop = null;
            } else {
              _tmpCurrentBackdrop = _cursor.getString(_cursorIndexOfCurrentBackdrop);
            }
            final String _tmpShowId;
            if (_cursor.isNull(_cursorIndexOfShowId)) {
              _tmpShowId = null;
            } else {
              _tmpShowId = _cursor.getString(_cursorIndexOfShowId);
            }
            final boolean _tmpHasCast;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfHasCast);
            _tmpHasCast = _tmp_2 != 0;
            final Date _tmpInsertDate;
            final Long _tmp_3;
            if (_cursor.isNull(_cursorIndexOfInsertDate)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getLong(_cursorIndexOfInsertDate);
            }
            _tmpInsertDate = __converters.fromTimestamp(_tmp_3);
            _item_1 = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
            _map.put(_tmpKey, _item_1);
          }
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(
      final ArrayMap<String, ArrayList<MediaImage>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<MediaImage>> _tmpInnerMap = new ArrayMap<String, ArrayList<MediaImage>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<MediaImage>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipmediaMetadataImageAscomDewordsPopeDatabaseModelsMediaImage(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `url`,`media_id`,`image_type`,`image_language` FROM `media_metadata_image` WHERE `media_id` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "media_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfUrl = 0;
      final int _cursorIndexOfMediaId = 1;
      final int _cursorIndexOfImageType = 2;
      final int _cursorIndexOfLanguage = 3;
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<MediaImage> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final MediaImage _item_1;
          final String _tmpUrl;
          if (_cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
          }
          final String _tmpMediaId;
          if (_cursor.isNull(_cursorIndexOfMediaId)) {
            _tmpMediaId = null;
          } else {
            _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
          }
          final MediaImageType _tmpImageType;
          final int _tmp;
          _tmp = _cursor.getInt(_cursorIndexOfImageType);
          _tmpImageType = __converters.mediaImageTypeFromKey(_tmp);
          final String _tmpLanguage;
          if (_cursor.isNull(_cursorIndexOfLanguage)) {
            _tmpLanguage = null;
          } else {
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
          }
          _item_1 = new MediaImage(_tmpUrl,_tmpMediaId,_tmpImageType,_tmpLanguage);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
