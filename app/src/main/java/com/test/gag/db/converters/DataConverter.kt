package com.test.gag.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.test.gag.db.models.Data

object DataConverter {

    @JvmStatic
    @TypeConverter
    fun listToJson(value: Data?): String {
        return Gson().toJson(value)
    }

    @JvmStatic
    @TypeConverter
    fun jsonToList(value: String): Data {
        return Gson()
            .fromJson(value, Data::class.java)
            .let { it as Data }

    }
}

