package com.test.gag.db.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/test/gag/db/converters/MetaConverter;", "", "()V", "jsonToList", "Lcom/test/gag/db/models/Meta;", "value", "", "listToJson", "app_debug"})
public final class MetaConverter {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.gag.db.converters.MetaConverter INSTANCE = null;
    
    private MetaConverter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String listToJson(@org.jetbrains.annotations.Nullable()
    com.test.gag.db.models.Meta value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    @kotlin.jvm.JvmStatic()
    public static final com.test.gag.db.models.Meta jsonToList(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
}