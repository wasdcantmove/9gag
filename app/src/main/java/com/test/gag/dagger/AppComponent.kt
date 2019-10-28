package com.test.gag.dagger

import com.test.gag.app.App
import com.test.gag.app.BaseActivity
import com.test.gag.app.BaseFragment
import com.test.gag.dagger.modules.AppModule
import com.test.gag.dagger.modules.DbModule
import com.test.gag.dagger.modules.NetworkModule
import com.test.gag.dagger.modules.UtilModule
import com.test.gag.dagger.scopes.AppScope
import com.test.gag.feature.home.FreshFragment
import com.test.gag.feature.home.HotFragment
import com.test.gag.feature.home.TrendingFragment
import com.test.gag.feature.home.ViewImageFragment
import com.test.gag.feature.home.dagger.MainModule
import dagger.Component

@AppScope
@Component(
    modules = [
        AppModule::class,
        DbModule::class,
        UtilModule::class,
        MainModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    fun inject(app: App)
    fun inject(activity: BaseActivity)
    fun inject(fragment: BaseFragment)
    fun inject(fragment: HotFragment)
    fun inject(fragment: FreshFragment)
    fun inject(fragment: TrendingFragment)
    fun inject(fragment: ViewImageFragment)


}