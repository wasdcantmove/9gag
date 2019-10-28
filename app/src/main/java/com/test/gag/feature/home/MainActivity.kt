package com.test.gag.feature.home

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.test.gag.R
import com.test.gag.app.BaseActivity
import com.test.gag.extensions.component

class MainActivity : BaseActivity() {

    override val navController: NavController get() = findNavController(R.id.navHostMain)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        component().inject(this)
    }

    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()
        .also { if (!it) finish() }

    override fun onBackPressed() {
        if (!onSupportNavigateUp()) super.onBackPressed()
    }
}