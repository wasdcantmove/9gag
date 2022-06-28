package com.test.gag.api.models

import com.test.gag.db.models.Content
import com.test.gag.db.models.Data
import com.test.gag.db.models.Gag
import com.test.gag.db.models.Meta


object ContentConverter {

    fun fromApiModel(content: ApiContent): Content =
        Content(
            toData(content.data),
            toMeta(content.meta)
        )

    private fun toMeta(meta: ApiMeta?): Meta =
        Meta(meta?.code)

    private fun toData(data: ApiData?): Data =
        Data(
            toGags(data?.gags),
            data?.has_next,
            data?.next_page
        )

    private fun toGags(gags: List<ApiGag?>?): List<Gag>? =
        gags?.map {
            Gag(
                it?._id,
                it?.height,
                it?.nsfw,
                it?.title,
                it?.type,
                formatUrl(it?.url),
                it?.width
            )
        }

    private fun formatUrl(url: String?): String? =
        url?.replace("http", "https")


}