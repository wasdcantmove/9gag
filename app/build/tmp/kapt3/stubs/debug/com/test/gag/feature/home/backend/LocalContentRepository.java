package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0018\u00010\u0005H&J \u0010\b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH&J\u001a\u0010\u000b\u001a\u00020\u00032\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H&\u00a8\u0006\r"}, d2 = {"Lcom/test/gag/feature/home/backend/LocalContentRepository;", "", "deleteContent", "Lio/reactivex/Completable;", "loadContentPaging", "Lio/reactivex/Observable;", "", "Lcom/test/gag/db/models/Gag;", "loadSingleImage", "selectedImage", "", "storeContent", "content", "app_debug"})
public abstract interface LocalContentRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable storeContent(@org.jetbrains.annotations.Nullable()
    java.util.List<com.test.gag.db.models.Gag> content);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable deleteContent();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadContentPaging();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Observable<java.util.List<com.test.gag.db.models.Gag>> loadSingleImage(long selectedImage);
}