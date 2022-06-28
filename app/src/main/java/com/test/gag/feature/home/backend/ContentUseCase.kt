package com.test.gag.feature.home.backend

import com.test.gag.db.models.Content
import com.test.gag.db.models.Gag
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface ContentUseCase {
    fun saveContentPaging(items: List<Gag?>?): Completable
    fun loadLocalContentPaging(): Observable<List<Gag?>?>?
    fun loadLocalRepo(selectedImage: Long): Observable<List<Gag?>>?
    fun loadContent(): Single<Content?>
    fun loadContentNext(page: Long): Single<Content?>
    fun deleteAll(): Completable
}

class ContentUseCaseImpl(
    private val remoteRepo: ContentRepository,
    private val localRepo: LocalContentRepository
) : ContentUseCase {

    override fun loadLocalContentPaging(): Observable<List<Gag?>?>? =
        localRepo.loadContentPaging()

    override fun loadContentNext(page: Long): Single<Content?> =
        remoteRepo.getContentNext(page)
            .doAfterSuccess { it?.data?.gags?.let { it1 -> saveContentPaging(it1) } }

    override fun deleteAll(): Completable =
        localRepo.deleteContent()

    override fun saveContentPaging(items: List<Gag?>?): Completable =
        localRepo.storeContent(items)

    override fun loadLocalRepo(selectedImage: Long): Observable<List<Gag?>>? =
        localRepo.loadSingleImage(selectedImage)

    override fun loadContent(): Single<Content?> =
        remoteRepo.getContent()
            .doAfterSuccess { it?.data?.gags?.let { it1 -> saveContentPaging(it1) } }
}

