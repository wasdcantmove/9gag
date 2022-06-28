package com.test.gag.hilt

import android.content.Context
import com.test.gag.app.BaseActivity
import com.test.gag.app.BaseFragment
import com.test.gag.feature.home.FreshFragment
import com.test.gag.feature.home.HotFragment
import com.test.gag.feature.home.TrendingFragment
import com.test.gag.feature.home.dagger.MainModule
import com.test.gag.hilt.modules.DbModule
import com.test.gag.hilt.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MainModule::class,
        DbModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: BaseActivity)
    fun inject(fragment: BaseFragment)
    fun inject(fragment: HotFragment)
    fun inject(fragment: FreshFragment)
    fun inject(fragment: TrendingFragment)
}
