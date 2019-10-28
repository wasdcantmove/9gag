package com.test.gag.util.extensions

import com.test.gag.util.runner.RxRunner
import io.reactivex.*

fun <T> Observable<T>.runWith(runner: RxRunner) = runner.run(this)

fun <T> Flowable<T>.runWith(runner: RxRunner) = runner.run(this)

fun <T> Single<T>.runWith(runner: RxRunner) = runner.run(this)

fun <T> Maybe<T>.runWith(runner: RxRunner) = runner.run(this)

fun Completable.runWith(runner: RxRunner) = runner.run(this)

fun <T> Single<T>.errorIf(predicate: (T) -> Boolean): Single<T> =
    flatMap { if (predicate.invoke(it)) Single.error(Exception()) else Single.just(it) }