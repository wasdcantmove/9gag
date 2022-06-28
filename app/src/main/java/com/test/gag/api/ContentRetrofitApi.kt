package com.test.gag.api

import com.test.gag.BuildConfig
import com.test.gag.api.models.ApiContent
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ContentRetrofitApi {

    companion object {

        val url = if (BuildConfig.DEBUG) {
            "https://mock-api.9gaginc.com/"
        } else {
            //live environment
            ""
        }
    }

    @GET("0")
    fun getContent(): Single<ApiContent>

    @GET("{page}")
    fun getContentNext(@Path("page") page: Long): Single<ApiContent>

}