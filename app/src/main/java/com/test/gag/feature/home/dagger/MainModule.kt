package com.test.gag.feature.home.dagger

import androidx.lifecycle.ViewModel
import com.test.gag.api.ContentRetrofitApi
import com.test.gag.dagger.modules.ViewModelKey
import com.test.gag.db.ContentDatabase
import com.test.gag.feature.home.MainViewModel
import com.test.gag.feature.home.ViewImageViewModel
import com.test.gag.feature.home.backend.*
import com.test.gag.util.runner.RxRunner
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


@Module
class MainModule {

    @Provides
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainFragmentViewModel(
        runner: RxRunner,
        useCase: ContentUseCase
    ): ViewModel =
        MainViewModel(
            runner,
            useCase
        )

    @Provides
    @IntoMap
    @ViewModelKey(ViewImageViewModel::class)
    fun provideViewImageViewModel(
        localContentRepository: LocalContentRepository,
        runner: RxRunner
    ): ViewModel = ViewImageViewModel(
        localContentRepository,
        runner
    )

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
