package com.test.gag.app

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController

abstract class BaseActivity : AppCompatActivity() {
    abstract val navController: NavController
}