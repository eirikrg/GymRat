package com.eirikrg.gymrat

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GymRatApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}