package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0018\u00010\u000bH&J \u0010\u000e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\tH&J\u001a\u0010\u0010\u001a\u00020\u00032\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH&\u00a8\u0006\u0012"}, d2 = {"Lcom/test/gag/feature/home/backend/ContentUseCase;", "", "deleteAll", "Lio/reactivex/Completable;", "loadContent", "Lio/reactivex/Single;", "Lcom/test/gag/db/models/Content;", "loadContentNext", "page", "", "loadLocalContentPaging", "Lio/reactivex/Observable;", "", "Lcom/test/gag/db/models/Gag;", "loadLocalRepo", "selectedImage", "saveContentPaging", "items", "app_debug"})
public abstract interface ContentUseCase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable saveContentPaging(@org.jetbrains.annotations.Nullable()
    java.util.List<com.test.gag.db.models.Gag> items);
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadLocalContentPaging();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadLocalRepo(long selectedImage);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.test.gag.db.models.Content> loadContent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.test.gag.db.models.Content> loadContentNext(long page);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable deleteAll();
}