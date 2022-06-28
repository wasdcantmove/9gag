package com.test.gag.feature.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010&\u001a\u00020\u000fJ\u0006\u0010\'\u001a\u00020\u000fJ\u0006\u0010(\u001a\u00020\u000fJ\u001a\u0010)\u001a\u00020\u000f2\u0010\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0002J\u0010\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u000fJ\u0006\u0010.\u001a\u00020/R$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\'\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n0\t0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/test/gag/feature/home/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/test/gag/feature/home/backend/ContentUseCase;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/test/gag/feature/home/backend/ContentUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_list", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/gag/util/Event;", "", "Lcom/test/gag/db/models/Gag;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "contentLoadFail", "", "getContentLoadFail", "()Landroidx/lifecycle/MutableLiveData;", "dataList", "", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "databaseClearedEvent", "getDatabaseClearedEvent", "list", "Landroidx/lifecycle/LiveData;", "getList", "()Landroidx/lifecycle/LiveData;", "page", "", "savedList", "getSavedList", "setSavedList", "(Landroidx/lifecycle/MutableLiveData;)V", "stopRefreshEvent", "getStopRefreshEvent", "callApiLoadNext", "clearAndReloadData", "loadLocalContent", "onLocalItemsLoaded", "items", "onObtainedItems", "Lcom/test/gag/db/models/Content;", "saveListState", "updateLocalData", "", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.test.gag.feature.home.backend.ContentUseCase useCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.test.gag.db.models.Gag>> savedList;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> stopRefreshEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> databaseClearedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> contentLoadFail = null;
    private long page = 0L;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.test.gag.db.models.Gag> dataList;
    private final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<java.util.List<com.test.gag.db.models.Gag>>> _list = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.test.gag.feature.home.MainViewModel.Companion Companion = null;
    private static final java.lang.String SAVED_GAG_LIST = "savedGagList";
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.backend.ContentUseCase useCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.test.gag.db.models.Gag>> getSavedList() {
        return null;
    }
    
    public final void setSavedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.test.gag.db.models.Gag>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> getStopRefreshEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> getDatabaseClearedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.gag.util.Event<kotlin.Unit>> getContentLoadFail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.test.gag.db.models.Gag> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.test.gag.db.models.Gag> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.test.gag.util.Event<java.util.List<com.test.gag.db.models.Gag>>> getList() {
        return null;
    }
    
    private final void onObtainedItems(com.test.gag.db.models.Content items) {
    }
    
    public final void loadLocalContent() {
    }
    
    private final void onLocalItemsLoaded(java.util.List<com.test.gag.db.models.Gag> items) {
    }
    
    public final void callApiLoadNext() {
    }
    
    public final void clearAndReloadData() {
    }
    
    public final boolean updateLocalData() {
        return false;
    }
    
    public final void saveListState() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/test/gag/feature/home/MainViewModel$Companion;", "", "()V", "SAVED_GAG_LIST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}