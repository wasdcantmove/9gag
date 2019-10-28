package com.test.gag.api

import com.test.gag.BuildConfig
import com.test.gag.api.models.ApiContent
import io.reactivex.Single
import retrofit2.http.GET

interface ContentRetrofitApi {

    companion object {

        val url = if (BuildConfig.DEBUG) {
            "http://mock-api.9gaginc.com"
        } else {
            //live environment
            ""
        }
    }

    @GET(" ")
    fun getContent(): Single<ApiContent>

    @GET("next_page")
    fun getContentNext(): Single<ApiContent>

}