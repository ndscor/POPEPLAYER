package com.dewords.pope.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dewords.pope.database.models.MediaPersonJoin;
import com.dewords.pope.database.models.Person;
import com.dewords.pope.database.models.PersonType;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MediaPersonJoinDao_Impl implements MediaPersonJoinDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MediaPersonJoin> __insertionAdapterOfMediaPersonJoin;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfRemoveAllFor;

  public MediaPersonJoinDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMediaPersonJoin = new EntityInsertionAdapter<MediaPersonJoin>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `media_person_join` (`mediaId`,`personId`,`type`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaPersonJoin value) {
        if (value.getMediaId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMediaId());
        }
        if (value.getPersonId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPersonId());
        }
        final int _tmp = __converters.personTypeToKey(value.getType());
        stmt.bindLong(3, _tmp);
      }
    };
    this.__preparedStmtOfRemoveAllFor = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM media_person_join WHERE mediaId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertPerson(final MediaPersonJoin person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMediaPersonJoin.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertPersons(final List<MediaPersonJoin> persons) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMediaPersonJoin.insert(persons);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void removeAllFor(final String moviepediaId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveAllFor.acquire();
    int _argIndex = 1;
    if (moviepediaId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, moviepediaId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveAllFor.release(_stmt);
    }
  }

  @Override
  public List<MediaPersonJoin> getAll() {
    final String _sql = "SELECT * FROM media_person_join";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
      final int _cursorIndexOfPersonId = CursorUtil.getColumnIndexOrThrow(_cursor, "personId");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final List<MediaPersonJoin> _result = new ArrayList<MediaPersonJoin>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final MediaPersonJoin _item;
        final String _tmpMediaId;
        if (_cursor.isNull(_cursorIndexOfMediaId)) {
          _tmpMediaId = null;
        } else {
          _tmpMediaId = _cursor.getString(_cursorIndexOfMediaId);
        }
        final String _tmpPersonId;
        if (_cursor.isNull(_cursorIndexOfPersonId)) {
          _tmpPersonId = null;
        } else {
          _tmpPersonId = _cursor.getString(_cursorIndexOfPersonId);
        }
        final PersonType _tmpType;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfType);
        _tmpType = __converters.personTypeFromKey(_tmp);
        _item = new MediaPersonJoin(_tmpMediaId,_tmpPersonId,_tmpType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Person>> getActorsForMediaLive(final String moviepediaId,
      final PersonType type) {
    final String _sql = "\n"
            + "           SELECT * FROM media_metadata_person\n"
            + "           INNER JOIN media_person_join\n"
            + "           ON media_metadata_person.moviepedia_id=media_person_join.personId\n"
            + "           WHERE media_person_join.mediaId=? AND media_person_join.type=?\n"
            + "           ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (moviepediaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, moviepediaId);
    }
    _argIndex = 2;
    final int _tmp = __converters.personTypeToKey(type);
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[]{"media_metadata_person","media_person_join"}, false, new Callable<List<Person>>() {
      @Override
      public List<Person> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<Person> _result = new ArrayList<Person>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Person _item;
            final String _tmpMoviepediaId;
            if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
              _tmpMoviepediaId = null;
            } else {
              _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new Person(_tmpMoviepediaId,_tmpName,_tmpImage);
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
  public List<Person> getActorsForMedia(final String moviepediaId, final PersonType type) {
    final String _sql = "\n"
            + "           SELECT * FROM media_metadata_person\n"
            + "           INNER JOIN media_person_join\n"
            + "           ON media_metadata_person.moviepedia_id=media_person_join.personId\n"
            + "           WHERE media_person_join.mediaId=? AND media_person_join.type=?\n"
            + "           ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (moviepediaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, moviepediaId);
    }
    _argIndex = 2;
    final int _tmp = __converters.personTypeToKey(type);
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMoviepediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "moviepedia_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final List<Person> _result = new ArrayList<Person>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Person _item;
        final String _tmpMoviepediaId;
        if (_cursor.isNull(_cursorIndexOfMoviepediaId)) {
          _tmpMoviepediaId = null;
        } else {
          _tmpMoviepediaId = _cursor.getString(_cursorIndexOfMoviepediaId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getString(_cursorIndexOfImage);
        }
        _item = new Person(_tmpMoviepediaId,_tmpName,_tmpImage);
        _result.add(_item);
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
