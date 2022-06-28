package com.test.gag.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.test.gag.db.models.DbContent
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface ContentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContent(content: DbContent)

    @Query("SELECT * FROM content ORDER BY id")
    fun loadContent(): Observable<DbContent>

    @Query("SELECT * FROM content ORDER BY id")
    fun loadContentSingle(): Single<DbContent>

    @Query("DELETE FROM content")
    fun deleteAll()

}
