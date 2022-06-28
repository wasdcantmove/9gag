package com.test.gag.feature.home.dagger;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/test/gag/feature/home/dagger/MainModule;", "", "()V", "provideContentUseCase", "Lcom/test/gag/feature/home/backend/ContentUseCase;", "contentRepository", "Lcom/test/gag/feature/home/backend/ContentRepository;", "localContentRepository", "Lcom/test/gag/feature/home/backend/LocalContentRepository;", "providesContentRepository", "api", "Lcom/test/gag/api/ContentRetrofitApi;", "providesLocalContentRepository", "database", "Lcom/test/gag/db/ContentDatabase;", "app_debug"})
@dagger.Module()
public final class MainModule {
    
    public MainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.gag.feature.home.backend.LocalContentRepository providesLocalContentRepository(@org.jetbrains.annotations.NotNull()
    com.test.gag.db.ContentDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.gag.feature.home.backend.ContentRepository providesContentRepository(@org.jetbrains.annotations.NotNull()
    com.test.gag.api.ContentRetrofitApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.test.gag.feature.home.backend.ContentUseCase provideContentUseCase(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.ContentRepository contentRepository, @org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.LocalContentRepository localContentRepository) {
        return null;
    }
}