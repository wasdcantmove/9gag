package com.test.gag.db.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Content")
data class DbContent(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = false) val id: Int? = 1,
    @ColumnInfo(name = "gags") val gags: List<Gag?>?
)
