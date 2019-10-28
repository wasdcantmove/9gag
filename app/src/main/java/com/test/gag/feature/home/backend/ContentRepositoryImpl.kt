package com.test.gag.feature.home.backend

import com.test.gag.api.ContentRetrofitApi
import com.test.gag.api.models.ContentConverter
import com.test.gag.db.models.Content
import io.reactivex.Single

class ContentRepositoryImpl(private val retrofitApi: ContentRetrofitApi) :
    ContentRepository {

    override fun getContent(): Single<Content?> =
        retrofitApi.getContent().map(ContentConverter::fromApiModel)

    override fun getContentNext(): Single<Content?> =
        retrofitApi.getContentNext().map(ContentConverter::fromApiModel)

}