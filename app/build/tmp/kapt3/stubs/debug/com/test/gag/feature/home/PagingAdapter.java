package com.test.gag.feature.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\'()B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u001c\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0017H\u0016J\u0014\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u001fH\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/test/gag/feature/home/PagingAdapter;", "Lcom/test/gag/feature/home/BaseDiffAdapter;", "Lcom/test/gag/db/models/Gag;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clickListener", "Lkotlin/Function1;", "", "context", "Landroid/content/Context;", "(Lkotlin/jvm/functions/Function1;Landroid/content/Context;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getContext", "()Landroid/content/Context;", "videoList", "", "Landroid/widget/VideoView;", "getVideoList", "()Ljava/util/List;", "setVideoList", "(Ljava/util/List;)V", "bindAdContent", "position", "", "holder", "bindContent", "bindVideoContent", "glideWith", "contentImage", "Landroid/widget/ImageView;", "imageUrl", "", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNsfwTag", "nsfw", "AdViewHolder", "MainViewHolder", "VideoViewHolder", "app_debug"})
public final class PagingAdapter extends com.test.gag.feature.home.BaseDiffAdapter<com.test.gag.db.models.Gag, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.test.gag.db.models.Gag, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<android.widget.VideoView> videoList;
    
    public PagingAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.test.gag.db.models.Gag, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.test.gag.db.models.Gag, kotlin.Unit> getClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.widget.VideoView> getVideoList() {
        return null;
    }
    
    public final void setVideoList(@org.jetbrains.annotations.NotNull()
    java.util.List<android.widget.VideoView> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    private final void bindContent(int position, androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    private final void bindAdContent(int position, androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    private final void bindVideoContent(int position, androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
    }
    
    private final java.lang.String setNsfwTag(java.lang.String nsfw) {
        return null;
    }
    
    private final void glideWith(android.widget.ImageView contentImage, java.lang.String imageUrl) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/test/gag/feature/home/PagingAdapter$VideoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "contentCard", "Landroidx/cardview/widget/CardView;", "getContentCard", "()Landroidx/cardview/widget/CardView;", "contentCard$delegate", "Lkotlin/Lazy;", "contentId", "Landroid/widget/TextView;", "getContentId", "()Landroid/widget/TextView;", "contentId$delegate", "nsfwTag", "getNsfwTag", "nsfwTag$delegate", "title", "getTitle", "title$delegate", "videoView", "Landroid/widget/VideoView;", "getVideoView", "()Landroid/widget/VideoView;", "videoView$delegate", "app_debug"})
    public static final class VideoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy videoView$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy nsfwTag$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy title$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentCard$delegate = null;
        
        public VideoViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.VideoView getVideoView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNsfwTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getContentCard() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\u000eR\u001b\u0010\u0018\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/test/gag/feature/home/PagingAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "contentCard", "Landroidx/cardview/widget/CardView;", "getContentCard", "()Landroidx/cardview/widget/CardView;", "contentCard$delegate", "Lkotlin/Lazy;", "contentId", "Landroid/widget/TextView;", "getContentId", "()Landroid/widget/TextView;", "contentId$delegate", "contentImage", "Landroid/widget/ImageView;", "getContentImage", "()Landroid/widget/ImageView;", "contentImage$delegate", "nsfwTag", "getNsfwTag", "nsfwTag$delegate", "title", "getTitle", "title$delegate", "app_debug"})
    public static final class MainViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentImage$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy nsfwTag$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy title$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentCard$delegate = null;
        
        public MainViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getContentImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNsfwTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getContentCard() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u0013R\u001b\u0010\u001d\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/test/gag/feature/home/PagingAdapter$AdViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdView", "()Lcom/google/android/gms/ads/AdView;", "adView$delegate", "Lkotlin/Lazy;", "contentCard", "Landroidx/cardview/widget/CardView;", "getContentCard", "()Landroidx/cardview/widget/CardView;", "contentCard$delegate", "contentId", "Landroid/widget/TextView;", "getContentId", "()Landroid/widget/TextView;", "contentId$delegate", "contentImage", "Landroid/widget/ImageView;", "getContentImage", "()Landroid/widget/ImageView;", "contentImage$delegate", "nsfwTag", "getNsfwTag", "nsfwTag$delegate", "title", "getTitle", "title$delegate", "app_debug"})
    public static final class AdViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentImage$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy nsfwTag$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy title$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentId$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy contentCard$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy adView$delegate = null;
        
        public AdViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getContentImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNsfwTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getContentCard() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.ads.AdView getAdView() {
            return null;
        }
    }
}