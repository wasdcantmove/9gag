package com.test.gag.hilt.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/test/gag/hilt/modules/NetworkModule;", "", "()V", "providesContentApi", "Lcom/test/gag/api/ContentRetrofitApi;", "okHttp", "Lokhttp3/OkHttpClient$Builder;", "retrofit", "Lretrofit2/Retrofit$Builder;", "providesGson", "Lcom/google/gson/Gson;", "providesOkHttpBuilder", "providesRetrofit", "gson", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.gag.api.ContentRetrofitApi providesContentApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient.Builder okHttp, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient.Builder providesOkHttpBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit.Builder providesRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson providesGson() {
        return null;
    }
}