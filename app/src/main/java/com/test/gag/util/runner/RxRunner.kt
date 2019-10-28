package com.test.gag.util.runner

import io.reactivex.*

interface RxRunner {
    fun <T> run(observable: Observable<T>): Observable<T>

    fun <T> run(flowable: Flowable<T>): Flowable<T>

    fun <T> run(single: Single<T>): Single<T>

    fun <T> run(maybe: Maybe<T>): Maybe<T>

    fun run(completable: Completable): Completable
}