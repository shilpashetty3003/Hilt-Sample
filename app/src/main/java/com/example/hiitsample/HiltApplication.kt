package com.example.hiitsample

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


class HiltApplication :Application() {
    override fun onCreate() {
        super.onCreate()

//        userService.send()
    }
}