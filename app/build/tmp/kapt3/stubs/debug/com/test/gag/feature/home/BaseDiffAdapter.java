package com.test.gag.feature.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u000bB\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/test/gag/feature/home/BaseDiffAdapter;", "T", "ViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/ListAdapter;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getItemViewType", "", "position", "defaultCallback", "app_debug"})
public abstract class BaseDiffAdapter<T extends java.lang.Object, ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.ListAdapter<T, ViewHolder> {
    
    public BaseDiffAdapter() {
        super(null);
    }
    
    public BaseDiffAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/test/gag/feature/home/BaseDiffAdapter$defaultCallback;", "", "()V", "defaultDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "T", "app_debug"})
    public static final class defaultCallback {
        @org.jetbrains.annotations.NotNull()
        public static final com.test.gag.feature.home.BaseDiffAdapter.defaultCallback INSTANCE = null;
        
        private defaultCallback() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>androidx.recyclerview.widget.DiffUtil.ItemCallback<T> defaultDiffCallback() {
            return null;
        }
    }
}