package com.example.hiitsample

import android.util.Log
import javax.inject.Inject

interface UserService {
    fun send()
}

class SQLService @Inject constructor():UserService{
    override fun send() {
        Log.d("TAG", "SQLServicesend: ")
    }
}

class FirebaseService():UserService{
    override fun send() {
        Log.d("TAG", "FirebaseServicesend: ")
    }

}