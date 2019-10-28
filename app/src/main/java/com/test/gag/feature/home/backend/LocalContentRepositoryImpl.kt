package com.test.gag.feature.home.backend

import com.test.gag.db.ContentDatabase
import com.test.gag.db.models.DbContent
import com.test.gag.db.models.Gag
import io.reactivex.Completable
import io.reactivex.Observable

class LocalContentRepositoryImpl(private val db: ContentDatabase) :
    LocalContentRepository {

    override fun loadSingleImage(selectedImage: Long): Observable<List<Gag?>>? =
        db.ContentDao().loadContent().map {
            it.gags?.filter { it?._id == selectedImage }
        }

    override fun loadContentPaging(): Observable<List<Gag?>?>? =
        db.ContentDao().loadContent().map { it.gags }

    override fun storeContent(content: List<Gag?>?): Completable {
        db.ContentDao().insertContent(DbContent(1, content))
        return Completable.complete()
    }

}

