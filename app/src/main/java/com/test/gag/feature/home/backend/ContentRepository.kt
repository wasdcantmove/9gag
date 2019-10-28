package com.test.gag.feature.home.backend

import com.test.gag.db.models.Content
import io.reactivex.Single

interface ContentRepository {
    fun getContent(): Single<Content?>
    fun getContentNext(): Single<Content?>
}