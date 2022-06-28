package com.test.gag.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/test/gag/api/ContentRetrofitApi;", "", "getContent", "Lio/reactivex/Single;", "Lcom/test/gag/api/models/ApiContent;", "getContentNext", "page", "", "Companion", "app_debug"})
public abstract interface ContentRetrofitApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.gag.api.ContentRetrofitApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "0")
    public abstract io.reactivex.Single<com.test.gag.api.models.ApiContent> getContent();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "{page}")
    public abstract io.reactivex.Single<com.test.gag.api.models.ApiContent> getContentNext(@retrofit2.http.Path(value = "page")
    long page);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/test/gag/api/ContentRetrofitApi$Companion;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String url = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
    }
}