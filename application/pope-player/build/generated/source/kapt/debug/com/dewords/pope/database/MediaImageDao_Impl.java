package com.dewords.pope.database;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dewords.pope.database.models.MediaImage;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MediaImageDao_Impl implements MediaImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MediaImage> __insertionAdapterOfMediaImage;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<MediaImage> __deletionAdapterOfMediaImage;

  public MediaImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMediaImage = new EntityInsertionAdapter<MediaImage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `media_metadata_image` (`url`,`media_id`,`image_type`,`image_language`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaImage value) {
        if (value.getUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUrl());
        }
        if (value.getMediaId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMediaId());
        }
        final int _tmp = __converters.mediaImageTypeToKey(value.getImageType());
        stmt.bindLong(3, _tmp);
        if (value.getLanguage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLanguage());
        }
      }
    };
    this.__deletionAdapterOfMediaImage = new EntityDeletionOrUpdateAdapter<MediaImage>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `media_metadata_image` WHERE `url` = ? AND `media_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MediaImage value) {
        if (value.getUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUrl());
        }
        if (value.getMediaId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMediaId());
        }
      }
    };
  }

  @Override
  public void insert(final MediaImage mediaImage) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMediaImage.insert(mediaImage);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(final List<MediaImage> mediaImages) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMediaImage.insert(mediaImages);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll(final List<MediaImage> mediaImages) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMediaImage.handleMultiple(mediaImages);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
