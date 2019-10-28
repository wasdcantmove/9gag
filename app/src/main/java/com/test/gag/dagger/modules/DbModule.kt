package com.test.gag.dagger.modules

import android.content.Context
import com.google.gson.Gson
import com.test.gag.dagger.scopes.AppScope
import com.test.gag.db.ContentDatabase
import dagger.Module
import dagger.Provides

@Module
class DbModule {

    @Provides
    @AppScope
    fun provideContentDatabase(context: Context, gson: Gson): ContentDatabase =
        ContentDatabase.getInstance(context, gson)

}