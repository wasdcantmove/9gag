package com.test.gag.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.test.gag.db.models.Gag

object GagConverter {

    @JvmStatic
    @TypeConverter
    fun listToJson(value: List<Gag>?): String {
        return Gson().toJson(value)
    }

    @JvmStatic
    @TypeConverter
    fun jsonToList(value: String): List<Gag> {
        return Gson()
            .fromJson(value, Array<Gag>::class.java)
            .let { it as Array<Gag> }
            .toList()

    }
}

