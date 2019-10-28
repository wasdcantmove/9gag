package com.test.gag.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.google.gson.Gson
import com.test.gag.db.converters.DataConverter
import com.test.gag.db.converters.GagConverter
import com.test.gag.db.converters.MetaConverter
import com.test.gag.db.dao.ContentDao
import com.test.gag.db.models.DbContent

const val DB_NAME = "content-database"
const val DB_VERSION = 1

@Database(
    entities = [
        DbContent::class
    ],
    version = DB_VERSION
)


@TypeConverters(
    DataConverter::class,
    MetaConverter::class,
    GagConverter::class
)

abstract class ContentDatabase : RoomDatabase() {

    abstract fun ContentDao(): ContentDao

    companion object {

        @Volatile
        private var INSTANCE: ContentDatabase? = null

        fun getInstance(context: Context, gson: Gson): ContentDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context, gson).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context, gson: Gson) =
            Room.databaseBuilder(
                context.applicationContext,
                ContentDatabase::class.java, DB_NAME
            ).allowMainThreadQueries().build()
    }
}