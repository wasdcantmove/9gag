package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0018\u00010\bH\u0016J \u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/test/gag/feature/home/backend/LocalContentRepositoryImpl;", "Lcom/test/gag/feature/home/backend/LocalContentRepository;", "db", "Lcom/test/gag/db/ContentDatabase;", "(Lcom/test/gag/db/ContentDatabase;)V", "deleteContent", "Lio/reactivex/Completable;", "loadContentPaging", "Lio/reactivex/Observable;", "", "Lcom/test/gag/db/models/Gag;", "loadSingleImage", "selectedImage", "", "storeContent", "content", "app_debug"})
public final class LocalContentRepositoryImpl implements com.test.gag.feature.home.backend.LocalContentRepository {
    private final com.test.gag.db.ContentDatabase db = null;
    
    public LocalContentRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.test.gag.db.ContentDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadSingleImage(long selectedImage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadContentPaging() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable storeContent(@org.jetbrains.annotations.Nullable()
    java.util.List<com.test.gag.db.models.Gag> content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable deleteContent() {
        return null;
    }
}