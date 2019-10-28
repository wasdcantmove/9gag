package com.test.gag.util.runner

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RxRunnerImpl(
    private val subscribeOn: Scheduler = Schedulers.io(),
    private val observeOn: Scheduler = AndroidSchedulers.mainThread()
) : RxRunner {
    override fun <T> run(observable: Observable<T>): Observable<T> = observable
        .subscribeOn(subscribeOn)
        .observeOn(observeOn)

    override fun <T> run(flowable: Flowable<T>): Flowable<T> = flowable
        .subscribeOn(subscribeOn)
        .observeOn(observeOn)

    override fun <T> run(single: Single<T>): Single<T> = single
        .subscribeOn(subscribeOn)
        .observeOn(observeOn)

    override fun <T> run(maybe: Maybe<T>): Maybe<T> = maybe
        .subscribeOn(subscribeOn)
        .observeOn(observeOn)

    override fun run(completable: Completable): Completable = completable
        .subscribeOn(subscribeOn)
        .observeOn(observeOn)

}