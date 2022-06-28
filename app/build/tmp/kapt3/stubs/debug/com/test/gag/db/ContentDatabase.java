package com.test.gag.db;

import java.lang.System;

@androidx.room.Database(entities = {com.test.gag.db.models.DbContent.class}, version = 1)
@androidx.room.TypeConverters(value = {com.test.gag.db.converters.DataConverter.class, com.test.gag.db.converters.MetaConverter.class, com.test.gag.db.converters.GagConverter.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/gag/db/ContentDatabase;", "Landroidx/room/RoomDatabase;", "()V", "contentDao", "Lcom/test/gag/db/dao/ContentDao;", "Companion", "app_debug"})
public abstract class ContentDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.test.gag.db.ContentDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "content-database";
    
    public ContentDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.test.gag.db.dao.ContentDao contentDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/test/gag/db/ContentDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
    }
}