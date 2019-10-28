package com.test.gag.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.test.gag.db.models.Meta

object MetaConverter {

    @JvmStatic
    @TypeConverter
    fun listToJson(value: Meta?): String {
        return Gson().toJson(value)
    }

    @JvmStatic
    @TypeConverter
    fun jsonToList(value: String): Meta {
        return Gson()
            .fromJson(value, Meta::class.java)
            .let { it as Meta }

    }
}

