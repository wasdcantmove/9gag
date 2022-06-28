package com.test.gag.hilt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/test/gag/hilt/AppComponent;", "", "inject", "", "activity", "Lcom/test/gag/app/BaseActivity;", "fragment", "Lcom/test/gag/app/BaseFragment;", "Lcom/test/gag/feature/home/FreshFragment;", "Lcom/test/gag/feature/home/HotFragment;", "Lcom/test/gag/feature/home/TrendingFragment;", "Factory", "app_debug"})
@dagger.Component(modules = {com.test.gag.feature.home.dagger.MainModule.class, com.test.gag.hilt.modules.DbModule.class, com.test.gag.hilt.modules.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.test.gag.app.BaseActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.test.gag.app.BaseFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.HotFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.FreshFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.test.gag.feature.home.TrendingFragment fragment);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/gag/hilt/AppComponent$Factory;", "", "create", "Lcom/test/gag/hilt/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.test.gag.hilt.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}