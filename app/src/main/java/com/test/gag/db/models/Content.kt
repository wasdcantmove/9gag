package com.test.gag.db.models

data class Content(
    val data: Data,
    val meta: Meta
)

data class Data(
    val gags: List<Gag>?,
    val has_next: Boolean?,
    val next_page: String?
)

data class Gag(
    val _id: Long?,
    val height: Int?,
    val nsfw: String?,
    val title: String?,
    val type: String?,
    val url: String?,
    val width: Int?
)

data class Meta(
    val code: Int?
)