package com.test.gag.feature.home.dagger

import com.test.gag.api.ContentRetrofitApi
import com.test.gag.db.ContentDatabase
import com.test.gag.feature.home.backend.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class MainModule {

    @Provides
    fun providesLocalContentRepository(
        database: ContentDatabase
    ): LocalContentRepository =
        LocalContentRepositoryImpl(database)

    @Provides
    fun providesContentRepository(
        api: ContentRetrofitApi
    ): ContentRepository =
        ContentRepositoryImpl(api)

    @Provides
    fun provideContentUseCase(
        contentRepository: ContentRepository,
        localContentRepository: LocalContentRepository
    ): ContentUseCase =
        ContentUseCaseImpl(
            contentRepository,
            localContentRepository
        )


}
