package com.test.gag.dagger.modules

import com.google.gson.*
import com.test.gag.api.ContentRetrofitApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type


@Module
class NetworkModule {

    @Provides
    fun providesContentApi(okHttp: OkHttpClient.Builder, retrofit: Retrofit.Builder): ContentRetrofitApi =
        retrofit
            .client(okHttp.build())
            .build()
            .create(ContentRetrofitApi::class.java)

    @Provides
    fun providesOkHttpBuilder(): OkHttpClient.Builder =
        OkHttpClient.Builder()
            .retryOnConnectionFailure(true)

    @Provides
    fun providesRetrofit(gson: Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(ContentRetrofitApi.url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    }

    @Provides
    fun providesGson(): Gson {
        return GsonBuilder()
            .registerTypeAdapter(DateTime::class.java, DateTimeTypeAdapter())
            .create()
    }
}

class DateTimeTypeAdapter : JsonDeserializer<DateTime> {

    private val formatter = DateTimeFormat.forPattern("yyyy-MM-dd")

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): DateTime? =
        json.asString.let(formatter::parseDateTime)

}