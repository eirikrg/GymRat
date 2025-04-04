package com.eirikrg.gymrat.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.eirikrg.gymrat.data.local.dao.WeekdayTranslationDao
import com.eirikrg.gymrat.data.local.entity.Weekday
import com.eirikrg.gymrat.data.local.entity.WeekdayTranslation

@Database(
    version = 1,
    entities = [
        Weekday::class,
        WeekdayTranslation::class
    ],
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        fun build(context: Context) = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "gymrat.db"
        ).addCallback(seedDataCallback).fallbackToDestructiveMigration().build()

        private val seedDataCallback = object : Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)

                // Insert into 'weekday' table
                for (id in 1..7) {
                    db.execSQL("INSERT INTO weekday (id) VALUES ($id)")
                }

                // English Translations
                val enNames = listOf(
                    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
                )
                enNames.forEachIndexed { index, name ->
                    db.execSQL("INSERT INTO weekday_translation (weekday_id, language_code, name) VALUES (${index + 1}, 'en', '$name')")
                }

                // Spanish Translations
                val esNames = listOf(
                    "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
                )
                esNames.forEachIndexed { index, name ->
                    db.execSQL("INSERT INTO weekday_translation (weekday_id, language_code, name) VALUES (${index + 1}, 'es', '$name')")
                }
            }
        }
    }

    abstract val weekdayTranslationDao: WeekdayTranslationDao
}