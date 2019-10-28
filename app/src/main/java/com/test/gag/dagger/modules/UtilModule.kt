package com.test.gag.dagger.modules

import com.test.gag.dagger.qualifiers.IoRunner
import com.test.gag.util.runner.RxRunner
import com.test.gag.util.runner.RxRunnerImpl
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
class UtilModule {

    @Provides
    fun provideRxRunner(): RxRunner = RxRunnerImpl(Schedulers.io(), AndroidSchedulers.mainThread())

    @Provides
    @IoRunner
    fun provideIoRunner(): RxRunner = RxRunnerImpl(Schedulers.io(), Schedulers.io())


}