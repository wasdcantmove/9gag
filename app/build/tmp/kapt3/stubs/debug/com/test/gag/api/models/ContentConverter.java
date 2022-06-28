package com.test.gag.api.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/test/gag/api/models/ContentConverter;", "", "()V", "formatUrl", "", "url", "fromApiModel", "Lcom/test/gag/db/models/Content;", "content", "Lcom/test/gag/api/models/ApiContent;", "toData", "Lcom/test/gag/db/models/Data;", "data", "Lcom/test/gag/api/models/ApiData;", "toGags", "", "Lcom/test/gag/db/models/Gag;", "gags", "Lcom/test/gag/api/models/ApiGag;", "toMeta", "Lcom/test/gag/db/models/Meta;", "meta", "Lcom/test/gag/api/models/ApiMeta;", "app_debug"})
public final class ContentConverter {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.gag.api.models.ContentConverter INSTANCE = null;
    
    private ContentConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.test.gag.db.models.Content fromApiModel(@org.jetbrains.annotations.NotNull()
    com.test.gag.api.models.ApiContent content) {
        return null;
    }
    
    private final com.test.gag.db.models.Meta toMeta(com.test.gag.api.models.ApiMeta meta) {
        return null;
    }
    
    private final com.test.gag.db.models.Data toData(com.test.gag.api.models.ApiData data) {
        return null;
    }
    
    private final java.util.List<com.test.gag.db.models.Gag> toGags(java.util.List<com.test.gag.api.models.ApiGag> gags) {
        return null;
    }
    
    private final java.lang.String formatUrl(java.lang.String url) {
        return null;
    }
}