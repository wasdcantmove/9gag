package com.test.gag.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.test.gag.db.converters.DataConverter
import com.test.gag.db.converters.GagConverter
import com.test.gag.db.converters.MetaConverter
import com.test.gag.db.dao.ContentDao
import com.test.gag.db.models.DbContent

const val DB_VERSION = 1

@TypeConverters(
    DataConverter::class,
    MetaConverter::class,
    GagConverter::class
)

@Database(
    entities = [DbContent::class], version = DB_VERSION
)
abstract class ContentDatabase : RoomDatabase() {

    abstract fun contentDao(): ContentDao

    companion object {
        val DATABASE_NAME: String = "content-database"
    }
}