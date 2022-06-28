package com.test.gag.db.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.test.gag.db.converters.GagConverter;
import com.test.gag.db.models.DbContent;
import com.test.gag.db.models.Gag;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ContentDao_Impl implements ContentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DbContent> __insertionAdapterOfDbContent;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ContentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDbContent = new EntityInsertionAdapter<DbContent>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Content` (`id`,`gags`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbContent value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final String _tmp = GagConverter.INSTANCE.listToJson(value.getGags());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM content";
        return _query;
      }
    };
  }

  @Override
  public void insertContent(final DbContent content) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDbContent.insert(content);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public Observable<DbContent> loadContent() {
    final String _sql = "SELECT * FROM content ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createObservable(__db, false, new String[]{"content"}, new Callable<DbContent>() {
      @Override
      public DbContent call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGags = CursorUtil.getColumnIndexOrThrow(_cursor, "gags");
          final DbContent _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final List<Gag> _tmpGags;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGags)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGags);
            }
            _tmpGags = GagConverter.INSTANCE.jsonToList(_tmp);
            _result = new DbContent(_tmpId,_tmpGags);
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
  public Single<DbContent> loadContentSingle() {
    final String _sql = "SELECT * FROM content ORDER BY id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<DbContent>() {
      @Override
      public DbContent call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfGags = CursorUtil.getColumnIndexOrThrow(_cursor, "gags");
          final DbContent _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final List<Gag> _tmpGags;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfGags)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfGags);
            }
            _tmpGags = GagConverter.INSTANCE.jsonToList(_tmp);
            _result = new DbContent(_tmpId,_tmpGags);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
