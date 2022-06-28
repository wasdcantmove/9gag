package com.test.gag.feature.home.backend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/test/gag/feature/home/backend/ContentRepository;", "", "getContent", "Lio/reactivex/Single;", "Lcom/test/gag/db/models/Content;", "getContentNext", "page", "", "app_debug"})
public abstract interface ContentRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.test.gag.db.models.Content> getContent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.test.gag.db.models.Content> getContentNext(long page);
}