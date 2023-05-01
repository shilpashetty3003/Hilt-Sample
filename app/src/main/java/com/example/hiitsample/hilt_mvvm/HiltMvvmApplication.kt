package com.example.hiitsample.hilt_mvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class HiltMvvmApplication :Application() {

    override fun onCreate() {
        super.onCreate()
    }
}