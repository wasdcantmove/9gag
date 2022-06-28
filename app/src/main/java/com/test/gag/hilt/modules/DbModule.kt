package com.test.gag.hilt.modules

import android.content.Context
import androidx.room.Room
import com.test.gag.db.ContentDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DbModule {

    @Singleton
    @Provides
    fun provideContentDatabase(
        @ApplicationContext app: Context
    ): ContentDatabase = Room.databaseBuilder(
        app,
        ContentDatabase::class.java,
        ContentDatabase.DATABASE_NAME
    )
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideContentDao(db: ContentDatabase) = db.contentDao()

}