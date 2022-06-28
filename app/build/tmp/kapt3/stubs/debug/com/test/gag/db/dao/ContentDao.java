package com.test.gag.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/test/gag/db/dao/ContentDao;", "", "deleteAll", "", "insertContent", "content", "Lcom/test/gag/db/models/DbContent;", "loadContent", "Lio/reactivex/Observable;", "loadContentSingle", "Lio/reactivex/Single;", "app_debug"})
public abstract interface ContentDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertContent(@org.jetbrains.annotations.NotNull()
    com.test.gag.db.models.DbContent content);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM content ORDER BY id")
    public abstract io.reactivex.Observable<com.test.gag.db.models.DbContent> loadContent();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM content ORDER BY id")
    public abstract io.reactivex.Single<com.test.gag.db.models.DbContent> loadContentSingle();
    
    @androidx.room.Query(value = "DELETE FROM content")
    public abstract void deleteAll();
}