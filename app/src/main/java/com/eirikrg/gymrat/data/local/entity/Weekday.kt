package com.eirikrg.gymrat.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weekday")
data class Weekday(
    @PrimaryKey val id: Int
)
