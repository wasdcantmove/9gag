package com.test.gag.feature.home

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.test.gag.R
import com.test.gag.app.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    override val navController: NavController get() = findNavController(R.id.navHostMain)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initAdMobAdsSDK()
    }

    private fun initAdMobAdsSDK() {
        MobileAds.initialize(
            this
        ) { }
        MobileAds.setRequestConfiguration(
            RequestConfiguration.Builder()
                .setTestDeviceIds(listOf("16002BD5989C870B5FF0A52D3C426F79")).build()
        )
    }

    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()
        .also { if (!it) finish() }

    @Deprecated(
        "Deprecated in Java", ReplaceWith(
            "if (!onSupportNavigateUp()) super.onBackPressed()",
            "com.test.gag.app.BaseActivity"
        )
    )
    override fun onBackPressed() {
        if (!onSupportNavigateUp()) super.onBackPressed()
    }
}