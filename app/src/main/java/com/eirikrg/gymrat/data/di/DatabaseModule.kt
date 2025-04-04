package com.eirikrg.gymrat.data.di

import android.content.Context
import com.eirikrg.gymrat.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Provides
    @Singleton
    fun providesGymRatDatabase(
        @ApplicationContext context: Context,
    ): AppDatabase = AppDatabase.build(context)

    @Provides
    @Singleton
    fun providesWeekdayDao(
        database: AppDatabase
    ) = database.weekdayTranslationDao
}