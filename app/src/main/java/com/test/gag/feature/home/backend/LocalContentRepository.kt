package com.test.gag.feature.home.backend

import com.test.gag.db.models.Gag
import io.reactivex.Completable
import io.reactivex.Observable

interface LocalContentRepository {

    fun storeContent(content: List<Gag?>?): Completable
    fun deleteContent(): Completable
    fun loadContentPaging(): Observable<List<Gag?>?>?
    fun loadSingleImage(selectedImage: Long): Observable<List<Gag?>>?

}