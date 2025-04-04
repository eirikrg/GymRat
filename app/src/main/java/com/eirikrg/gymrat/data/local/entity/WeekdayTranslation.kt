package com.eirikrg.gymrat.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "weekday_translation",
    foreignKeys = [
        ForeignKey(
            entity = Weekday::class,
            parentColumns = ["id"],
            childColumns = ["weekday_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["weekday_id"])]
)
data class WeekdayTranslation(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "weekday_id") val weekdayId: Int,
    @ColumnInfo(name = "language_code") val languageCode: String,
    @ColumnInfo(name = "name") val name: String
)
