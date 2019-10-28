package com.test.gag.home.backend

import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import com.test.gag.db.ContentDatabase
import com.test.gag.db.dao.ContentDao
import com.test.gag.db.models.DbContent
import com.test.gag.db.models.Gag
import com.test.gag.feature.home.backend.LocalContentRepositoryImpl
import io.reactivex.Observable
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class LocalContentsRepositoryImplTests {

    private lateinit var repo: LocalContentRepositoryImpl

    @Mock
    private lateinit var db: ContentDatabase

    @Mock
    private lateinit var contentDao: ContentDao

    @Before
    fun setUp() {
        repo = LocalContentRepositoryImpl(db)

        whenever(db.ContentDao()).thenReturn(contentDao)
    }

    @Test
    fun `loadContents calls database for Deliveries`() {
        whenever(contentDao.loadContent())
            .thenReturn(
                Observable.just(
                    DbContent(
                        1,
                        listOf(
                            Gag(1, 400, "1", "title", "type", "url", 400),
                            Gag(2, 400, "1", "title", "type", "url", 400),
                            Gag(3, 400, "1", "title", "type", "url", 400)
                        )
                    )
                )
            )

        repo.loadContentPaging()

        verify(contentDao).loadContent()
    }

    @Test
    fun `retrieved deliveries returned is correctly converted`() {
        whenever(contentDao.loadContent())
            .thenReturn(
                Observable.just(
                    DbContent(
                        1,
                        listOf(
                            Gag(1, 400, "1", "title", "type", "url", 400),
                            Gag(2, 400, "1", "title", "type", "url", 400),
                            Gag(3, 400, "1", "title", "type", "url", 400)
                        )
                    )
                )
            )


        val expected =
            listOf(
                Gag(1, 400, "1", "title", "type", "url", 400),
                Gag(2, 400, "1", "title", "type", "url", 400),
                Gag(3, 400, "1", "title", "type", "url", 400)
            )

        repo.loadContentPaging()?.test()?.assertValue(expected)
    }

    @Test
    fun `storeContent calls db to store items`() {

        repo.storeContent(
            listOf(
                Gag(1, 400, "1", "title", "type", "url", 400),
                Gag(2, 400, "1", "title", "type", "url", 400),
                Gag(3, 400, "1", "title", "type", "url", 400)
            )
        )

        verify(contentDao).insertContent(
            DbContent(
                1,
                listOf(
                    Gag(1, 400, "1", "title", "type", "url", 400),
                    Gag(2, 400, "1", "title", "type", "url", 400),
                    Gag(3, 400, "1", "title", "type", "url", 400)

                )
            )
        )
    }

}
