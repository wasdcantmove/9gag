package com.test.gag.home.backend

import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import com.test.gag.api.ContentRetrofitApi
import com.test.gag.api.models.ApiContent
import com.test.gag.api.models.ApiData
import com.test.gag.api.models.ApiGag
import com.test.gag.api.models.ApiMeta
import com.test.gag.db.models.Content
import com.test.gag.db.models.Data
import com.test.gag.db.models.Gag
import com.test.gag.db.models.Meta
import com.test.gag.feature.home.backend.ContentRepositoryImpl
import io.reactivex.Single
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class ContentRepositoryImplTests {

    private lateinit var repo: ContentRepositoryImpl

    @Mock
    private lateinit var api: ContentRetrofitApi


    @Before
    fun setUp() {
        repo = ContentRepositoryImpl(api)
    }

    @Test
    fun `on load calls api for Content`() {
        whenever(api.getContent()).thenReturn(
            Single.just(
                ApiContent(
                    ApiData(
                        listOf(
                            ApiGag(1, 400, "1", "title", "type", "url", 400),
                            ApiGag(2, 400, "1", "title", "type", "url", 400),
                            ApiGag(3, 400, "1", "title", "type", "url", 400)
                        ),
                        true,
                        "1"
                    ),
                    ApiMeta(200)
                )
            )
        )

        repo.getContent()

        verify(api).getContent()
    }

    @Test
    fun `on success return converted models`() {
        val expected =
            listOf(
                Content(
                    Data(
                        listOf(
                            Gag(1, 400, "1", "title", "type", "url", 400),
                            Gag(2, 400, "1", "title", "type", "url", 400),
                            Gag(3, 400, "1", "title", "type", "url", 400)
                        ),
                        true,
                        "1"
                    ),
                    Meta(200)
                )
            )

        whenever(api.getContent()).thenReturn(
            Single.just(
                ApiContent(
                    ApiData(
                        listOf(
                            ApiGag(1, 400, "1", "title", "type", "url", 400),
                            ApiGag(2, 400, "1", "title", "type", "url", 400),
                            ApiGag(3, 400, "1", "title", "type", "url", 400)
                        ),
                        true,
                        "1"
                    ),
                    ApiMeta(200)
                )
            )
        )

        repo.getContent().test().assertValue(expected.getOrNull(0))

    }
}