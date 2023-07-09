package com.dewords.pope.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dewords.pope.database.models.MediaMetadata;
import com.dewords.pope.database.models.MediaMetadataType;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MediaMetadataDao_Impl implements MediaMetadataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MediaMetadata> __insertionAdapterOfMediaMetadata;

  private final Converters __converters = new Converters();

  public MediaMetadataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMediaMetadata = new EntityInsertionAdapter<MediaMetadata>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `media_metadata` (`moviepedia_id`,`ml_id`,`type`,`title`,`summary`,`genres`,`releaseDate`,`countries`,`season`,`episode`,`current_poster`,`current_backdrop`,`show_id`,`has_cast`,`insertDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaMetadata value) {
        if (value.getMoviepediaId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMoviepediaId());
        }
        if (value.getMlId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getMlId());
        }
        final int _tmp = __converters.mediaTypeToKey(value.getType());
        stmt.bindLong(3, _tmp);
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getSummary() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSummary());
        }
        if (value.getGenres() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getGenres());
        }
        final Long _tmp_1 = __converters.dateToTimestamp(value.getReleaseDate());
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        if (value.getCountries() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCountries());
        }
        if (value.getSeason() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getSeason());
        }
        if (value.getEpisode() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getEpisode());
        }
        if (value.getCurrentPoster() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getCurrentPoster());
        }
        if (value.getCurrentBackdrop() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getCurrentBackdrop());
        }
        if (value.getShowId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getShowId());
        }
        final int _tmp_2 = value.getHasCast() ? 1 : 0;
        stmt.bindLong(14, _tmp_2);
        final Long _tmp_3 = __converters.dateToTimestamp(value.getInsertDate());
        if (_tmp_3 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, _tmp_3);
        }
      }
    };
  }

  @Override
  public long insert(final MediaMetadata mediaMetadata) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfMediaMetadata.insertAndReturnId(mediaMetadata);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public MediaMetadata getForMedia(final long id) {
    final String _sql = "SELECT * from media_metadata where ml_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
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
      final MediaMetadata _result;
      if(_cursor.moveToFirst()) {
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
        _result = new MediaMetadata(_tmpMoviepediaId,_tmpMlId,_tmpType,_tmpTitle,_tmpSummary,_tmpGenres,_tmpReleaseDate,_tmpCountries,_tmpSeason,_tmpEpisode,_tmpCurrentPoster,_tmpCurrentBackdrop,_tmpShowId,_tmpHasCast,_tmpInsertDate);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
