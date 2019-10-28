package com.test.gag.app

import android.app.Application
import com.test.gag.dagger.AppComponent
import com.test.gag.dagger.DaggerAppComponent
import com.test.gag.dagger.modules.AppModule

class App : Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()

        component.inject(this)

    }

    fun component() = component

}
