package com.test.gag.util;

import java.lang.System;

/**
 * Used as a wrapper for data that is exposed via LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\r\u0010\r\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000b\u0010\u0010\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/test/gag/util/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "hasBeenHandled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "equals", "", "other", "getContentIfNotHandled", "hashCode", "", "peek", "app_debug"})
public class Event<T extends java.lang.Object> {
    private final T content = null;
    private final java.util.concurrent.atomic.AtomicBoolean hasBeenHandled = null;
    
    public Event(T content) {
        super();
    }
    
    public final T getContent() {
        return null;
    }
    
    /**
     * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    public final T peek() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
}