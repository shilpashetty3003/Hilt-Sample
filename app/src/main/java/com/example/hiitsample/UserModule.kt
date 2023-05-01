package com.example.hiitsample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Named("SQL")
    @Provides
    fun getSQLService():UserService{
        return  SQLService()
    }


    @Named("Firebase")
    @Provides
    fun getFirebaseService():UserService{
        return  FirebaseService()
    }
}