package com.test.gag.feature.home.backend

import com.test.gag.db.ContentDatabase
import com.test.gag.db.models.DbContent
import com.test.gag.db.models.Gag
import io.reactivex.Completable
import io.reactivex.Observable
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LocalContentRepositoryImpl(private val db: ContentDatabase) :
    LocalContentRepository {

    override fun loadSingleImage(selectedImage: Long): Observable<List<Gag?>>? =
        db.contentDao().loadContent().map {
            it.gags?.filter { it?._id == selectedImage }
        }

    override fun loadContentPaging(): Observable<List<Gag?>?>? =
        db.contentDao().loadContent().map { it.gags }

    override fun storeContent(content: List<Gag?>?): Completable {
        GlobalScope.launch {
            db.contentDao().insertContent(DbContent(1, content))
        }
        return Completable.complete()
    }

    override fun deleteContent(): Completable {
        GlobalScope.launch {
            db.contentDao().deleteAll()
        }
        return Completable.complete()
    }

}

