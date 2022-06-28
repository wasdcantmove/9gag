package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011\u0018\u00010\u0010H\u0016J \u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\b2\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/test/gag/feature/home/backend/ContentUseCaseImpl;", "Lcom/test/gag/feature/home/backend/ContentUseCase;", "remoteRepo", "Lcom/test/gag/feature/home/backend/ContentRepository;", "localRepo", "Lcom/test/gag/feature/home/backend/LocalContentRepository;", "(Lcom/test/gag/feature/home/backend/ContentRepository;Lcom/test/gag/feature/home/backend/LocalContentRepository;)V", "deleteAll", "Lio/reactivex/Completable;", "loadContent", "Lio/reactivex/Single;", "Lcom/test/gag/db/models/Content;", "loadContentNext", "page", "", "loadLocalContentPaging", "Lio/reactivex/Observable;", "", "Lcom/test/gag/db/models/Gag;", "loadLocalRepo", "selectedImage", "saveContentPaging", "items", "app_debug"})
public final class ContentUseCaseImpl implements com.test.gag.feature.home.backend.ContentUseCase {
    private final com.test.gag.feature.home.backend.ContentRepository remoteRepo = null;
    private final com.test.gag.feature.home.backend.LocalContentRepository localRepo = null;
    
    public ContentUseCaseImpl(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.ContentRepository remoteRepo, @org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.LocalContentRepository localRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadLocalContentPaging() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.test.gag.db.models.Content> loadContentNext(long page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable deleteAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable saveContentPaging(@org.jetbrains.annotations.Nullable()
    java.util.List<com.test.gag.db.models.Gag> items) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadLocalRepo(long selectedImage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.test.gag.db.models.Content> loadContent() {
        return null;
    }
}