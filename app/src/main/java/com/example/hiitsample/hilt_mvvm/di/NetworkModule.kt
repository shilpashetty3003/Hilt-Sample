package com.example.hiitsample.hilt_mvvm.di

import com.example.hiitsample.hilt_mvvm.CONSTANTS
import com.example.hiitsample.hilt_mvvm.api.ProductsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(CONSTANTS.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build()
    }

    @Provides
    fun getProductService(retrofit: Retrofit):ProductsService{
        return retrofit.create(ProductsService::class.java)
    }
}