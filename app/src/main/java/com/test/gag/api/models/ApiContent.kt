package com.test.gag.api.models

import com.google.gson.annotations.SerializedName


data class ApiContent(
    @SerializedName("data") val data: ApiData?,
    @SerializedName("meta") val meta: ApiMeta?
)

data class ApiData(
    @SerializedName("gags") val gags: List<ApiGag?>?,
    @SerializedName("has_next") val has_next: Boolean?,
    @SerializedName("next_page") val next_page: String?
)

data class ApiGag(
    @SerializedName("_id") val _id: Long?,
    @SerializedName("height") val height: Int?,
    @SerializedName("nsfw") val nsfw: String?,
    @SerializedName("title") val title: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("width") val width: Int?
)

data class ApiMeta(
    @SerializedName("code") val code: Int?
)