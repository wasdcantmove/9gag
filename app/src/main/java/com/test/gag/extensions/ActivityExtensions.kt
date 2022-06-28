package com.test.gag.extensions

import androidx.appcompat.app.AppCompatActivity
import com.test.gag.app.App

fun AppCompatActivity.component() = (this.application as App).appComponent