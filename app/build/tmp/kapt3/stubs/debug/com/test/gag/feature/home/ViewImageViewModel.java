package com.test.gag.feature.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/test/gag/feature/home/ViewImageViewModel;", "Landroidx/lifecycle/ViewModel;", "localContentRepository", "Lcom/test/gag/feature/home/backend/LocalContentRepository;", "(Lcom/test/gag/feature/home/backend/LocalContentRepository;)V", "_gag", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/gag/util/Event;", "Lcom/test/gag/db/models/Gag;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "gag", "Landroidx/lifecycle/LiveData;", "getGag", "()Landroidx/lifecycle/LiveData;", "getLocalContentRepository", "()Lcom/test/gag/feature/home/backend/LocalContentRepository;", "imageId", "", "selectedImage", "", "loadComments", "", "", "app_debug"})
public final class ViewImageViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.test.gag.feature.home.backend.LocalContentRepository localContentRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<com.test.gag.db.models.Gag>> _gag = null;
    
    @javax.inject.Inject()
    public ViewImageViewModel(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.LocalContentRepository localContentRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.gag.feature.home.backend.LocalContentRepository getLocalContentRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.test.gag.util.Event<com.test.gag.db.models.Gag>> getGag() {
        return null;
    }
    
    public final void imageId(long selectedImage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> loadComments() {
        return null;
    }
}