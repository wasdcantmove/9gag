package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/test/gag/feature/home/backend/ContentRepositoryImpl;", "Lcom/test/gag/feature/home/backend/ContentRepository;", "retrofitApi", "Lcom/test/gag/api/ContentRetrofitApi;", "(Lcom/test/gag/api/ContentRetrofitApi;)V", "getContent", "Lio/reactivex/Single;", "Lcom/test/gag/db/models/Content;", "getContentNext", "page", "", "app_debug"})
public final class ContentRepositoryImpl implements com.test.gag.feature.home.backend.ContentRepository {
    private final com.test.gag.api.ContentRetrofitApi retrofitApi = null;
    
    public ContentRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.test.gag.api.ContentRetrofitApi retrofitApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.test.gag.db.models.Content> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.test.gag.db.models.Content> getContentNext(long page) {
        return null;
    }
}