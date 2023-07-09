package com.dewords.pope.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MoviePediaDatabase_Impl extends MoviePediaDatabase {
  private volatile MediaMetadataDao _mediaMetadataDao;

  private volatile PersonDao _personDao;

  private volatile MediaPersonJoinDao _mediaPersonJoinDao;

  private volatile MediaMetadataDataFullDao _mediaMetadataDataFullDao;

  private volatile MediaImageDao _mediaImageDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media_metadata` (`moviepedia_id` TEXT NOT NULL, `ml_id` INTEGER, `type` INTEGER NOT NULL, `title` TEXT NOT NULL, `summary` TEXT NOT NULL, `genres` TEXT NOT NULL, `releaseDate` INTEGER, `countries` TEXT NOT NULL, `season` INTEGER, `episode` INTEGER, `current_poster` TEXT NOT NULL, `current_backdrop` TEXT NOT NULL, `show_id` TEXT, `has_cast` INTEGER NOT NULL, `insertDate` INTEGER NOT NULL, PRIMARY KEY(`moviepedia_id`), FOREIGN KEY(`show_id`) REFERENCES `media_metadata`(`moviepedia_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media_metadata_person` (`moviepedia_id` TEXT NOT NULL, `name` TEXT NOT NULL, `image` TEXT, PRIMARY KEY(`moviepedia_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media_person_join` (`mediaId` TEXT NOT NULL, `personId` TEXT NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`mediaId`, `personId`, `type`), FOREIGN KEY(`mediaId`) REFERENCES `media_metadata`(`moviepedia_id`) ON UPDATE NO ACTION ON DELETE NO ACTION , FOREIGN KEY(`personId`) REFERENCES `media_metadata_person`(`moviepedia_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media_metadata_image` (`url` TEXT NOT NULL, `media_id` TEXT NOT NULL, `image_type` INTEGER NOT NULL, `image_language` TEXT NOT NULL, PRIMARY KEY(`url`, `media_id`), FOREIGN KEY(`media_id`) REFERENCES `media_metadata`(`moviepedia_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '365a57b9404bfdf5a9d854f7c7639e8d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `media_metadata`");
        _db.execSQL("DROP TABLE IF EXISTS `media_metadata_person`");
        _db.execSQL("DROP TABLE IF EXISTS `media_person_join`");
        _db.execSQL("DROP TABLE IF EXISTS `media_metadata_image`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMediaMetadata = new HashMap<String, TableInfo.Column>(15);
        _columnsMediaMetadata.put("moviepedia_id", new TableInfo.Column("moviepedia_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("ml_id", new TableInfo.Column("ml_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("summary", new TableInfo.Column("summary", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("genres", new TableInfo.Column("genres", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("releaseDate", new TableInfo.Column("releaseDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("countries", new TableInfo.Column("countries", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("season", new TableInfo.Column("season", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("episode", new TableInfo.Column("episode", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("current_poster", new TableInfo.Column("current_poster", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("current_backdrop", new TableInfo.Column("current_backdrop", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("show_id", new TableInfo.Column("show_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("has_cast", new TableInfo.Column("has_cast", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadata.put("insertDate", new TableInfo.Column("insertDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMediaMetadata = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysMediaMetadata.add(new TableInfo.ForeignKey("media_metadata", "NO ACTION", "NO ACTION",Arrays.asList("show_id"), Arrays.asList("moviepedia_id")));
        final HashSet<TableInfo.Index> _indicesMediaMetadata = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMediaMetadata = new TableInfo("media_metadata", _columnsMediaMetadata, _foreignKeysMediaMetadata, _indicesMediaMetadata);
        final TableInfo _existingMediaMetadata = TableInfo.read(_db, "media_metadata");
        if (! _infoMediaMetadata.equals(_existingMediaMetadata)) {
          return new RoomOpenHelper.ValidationResult(false, "media_metadata(com.dewords.pope.database.models.MediaMetadata).\n"
                  + " Expected:\n" + _infoMediaMetadata + "\n"
                  + " Found:\n" + _existingMediaMetadata);
        }
        final HashMap<String, TableInfo.Column> _columnsMediaMetadataPerson = new HashMap<String, TableInfo.Column>(3);
        _columnsMediaMetadataPerson.put("moviepedia_id", new TableInfo.Column("moviepedia_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadataPerson.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadataPerson.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMediaMetadataPerson = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMediaMetadataPerson = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMediaMetadataPerson = new TableInfo("media_metadata_person", _columnsMediaMetadataPerson, _foreignKeysMediaMetadataPerson, _indicesMediaMetadataPerson);
        final TableInfo _existingMediaMetadataPerson = TableInfo.read(_db, "media_metadata_person");
        if (! _infoMediaMetadataPerson.equals(_existingMediaMetadataPerson)) {
          return new RoomOpenHelper.ValidationResult(false, "media_metadata_person(com.dewords.pope.database.models.Person).\n"
                  + " Expected:\n" + _infoMediaMetadataPerson + "\n"
                  + " Found:\n" + _existingMediaMetadataPerson);
        }
        final HashMap<String, TableInfo.Column> _columnsMediaPersonJoin = new HashMap<String, TableInfo.Column>(3);
        _columnsMediaPersonJoin.put("mediaId", new TableInfo.Column("mediaId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaPersonJoin.put("personId", new TableInfo.Column("personId", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaPersonJoin.put("type", new TableInfo.Column("type", "INTEGER", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMediaPersonJoin = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysMediaPersonJoin.add(new TableInfo.ForeignKey("media_metadata", "NO ACTION", "NO ACTION",Arrays.asList("mediaId"), Arrays.asList("moviepedia_id")));
        _foreignKeysMediaPersonJoin.add(new TableInfo.ForeignKey("media_metadata_person", "NO ACTION", "NO ACTION",Arrays.asList("personId"), Arrays.asList("moviepedia_id")));
        final HashSet<TableInfo.Index> _indicesMediaPersonJoin = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMediaPersonJoin = new TableInfo("media_person_join", _columnsMediaPersonJoin, _foreignKeysMediaPersonJoin, _indicesMediaPersonJoin);
        final TableInfo _existingMediaPersonJoin = TableInfo.read(_db, "media_person_join");
        if (! _infoMediaPersonJoin.equals(_existingMediaPersonJoin)) {
          return new RoomOpenHelper.ValidationResult(false, "media_person_join(com.dewords.pope.database.models.MediaPersonJoin).\n"
                  + " Expected:\n" + _infoMediaPersonJoin + "\n"
                  + " Found:\n" + _existingMediaPersonJoin);
        }
        final HashMap<String, TableInfo.Column> _columnsMediaMetadataImage = new HashMap<String, TableInfo.Column>(4);
        _columnsMediaMetadataImage.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadataImage.put("media_id", new TableInfo.Column("media_id", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadataImage.put("image_type", new TableInfo.Column("image_type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMediaMetadataImage.put("image_language", new TableInfo.Column("image_language", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMediaMetadataImage = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysMediaMetadataImage.add(new TableInfo.ForeignKey("media_metadata", "NO ACTION", "NO ACTION",Arrays.asList("media_id"), Arrays.asList("moviepedia_id")));
        final HashSet<TableInfo.Index> _indicesMediaMetadataImage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMediaMetadataImage = new TableInfo("media_metadata_image", _columnsMediaMetadataImage, _foreignKeysMediaMetadataImage, _indicesMediaMetadataImage);
        final TableInfo _existingMediaMetadataImage = TableInfo.read(_db, "media_metadata_image");
        if (! _infoMediaMetadataImage.equals(_existingMediaMetadataImage)) {
          return new RoomOpenHelper.ValidationResult(false, "media_metadata_image(com.dewords.pope.database.models.MediaImage).\n"
                  + " Expected:\n" + _infoMediaMetadataImage + "\n"
                  + " Found:\n" + _existingMediaMetadataImage);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "365a57b9404bfdf5a9d854f7c7639e8d", "bca5384c7a2d285a8efab5e68fe21614");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "media_metadata","media_metadata_person","media_person_join","media_metadata_image");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `media_person_join`");
      _db.execSQL("DELETE FROM `media_metadata_image`");
      _db.execSQL("DELETE FROM `media_metadata`");
      _db.execSQL("DELETE FROM `media_metadata_person`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MediaMetadataDao.class, MediaMetadataDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PersonDao.class, PersonDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MediaPersonJoinDao.class, MediaPersonJoinDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MediaMetadataDataFullDao.class, MediaMetadataDataFullDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MediaImageDao.class, MediaImageDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MediaMetadataDao mediaMetadataDao() {
    if (_mediaMetadataDao != null) {
      return _mediaMetadataDao;
    } else {
      synchronized(this) {
        if(_mediaMetadataDao == null) {
          _mediaMetadataDao = new MediaMetadataDao_Impl(this);
        }
        return _mediaMetadataDao;
      }
    }
  }

  @Override
  public PersonDao personDao() {
    if (_personDao != null) {
      return _personDao;
    } else {
      synchronized(this) {
        if(_personDao == null) {
          _personDao = new PersonDao_Impl(this);
        }
        return _personDao;
      }
    }
  }

  @Override
  public MediaPersonJoinDao mediaPersonActorJoinDao() {
    if (_mediaPersonJoinDao != null) {
      return _mediaPersonJoinDao;
    } else {
      synchronized(this) {
        if(_mediaPersonJoinDao == null) {
          _mediaPersonJoinDao = new MediaPersonJoinDao_Impl(this);
        }
        return _mediaPersonJoinDao;
      }
    }
  }

  @Override
  public MediaMetadataDataFullDao mediaMedataDataFullDao() {
    if (_mediaMetadataDataFullDao != null) {
      return _mediaMetadataDataFullDao;
    } else {
      synchronized(this) {
        if(_mediaMetadataDataFullDao == null) {
          _mediaMetadataDataFullDao = new MediaMetadataDataFullDao_Impl(this);
        }
        return _mediaMetadataDataFullDao;
      }
    }
  }

  @Override
  public MediaImageDao mediaImageDao() {
    if (_mediaImageDao != null) {
      return _mediaImageDao;
    } else {
      synchronized(this) {
        if(_mediaImageDao == null) {
          _mediaImageDao = new MediaImageDao_Impl(this);
        }
        return _mediaImageDao;
      }
    }
  }
}
