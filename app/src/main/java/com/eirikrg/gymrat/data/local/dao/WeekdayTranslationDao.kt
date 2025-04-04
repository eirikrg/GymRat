package com.eirikrg.gymrat.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.eirikrg.gymrat.data.local.entity.WeekdayTranslation

@Dao
interface WeekdayTranslationDao {

    @Insert
    suspend fun insert(weekdayTranslation: WeekdayTranslation)

    @Insert
    suspend fun insertAll(weekdayTranslations: List<WeekdayTranslation>)

    @Update
    suspend fun update(weekdayTranslation: WeekdayTranslation)

    @Delete
    suspend fun delete(weekdayTranslation: WeekdayTranslation)

    @Query("SELECT * FROM weekday_translation WHERE id = :id")
    suspend fun getTranslationById(id: Int): WeekdayTranslation?

    @Query("SELECT * FROM weekday_translation WHERE weekday_id = :weekdayId")
    suspend fun getTranslationsByWeekdayId(weekdayId: Int): List<WeekdayTranslation>

    @Query("SELECT * FROM weekday_translation WHERE weekday_id = :weekdayId AND language_code = :languageCode")
    fun getTranslationByWeekdayIdAndLanguageCode(weekdayId: Int, languageCode: String): WeekdayTranslation?
}
