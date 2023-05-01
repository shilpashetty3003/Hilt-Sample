package com.example.hiitsample.hilt_mvvm.api

import com.example.hiitsample.hilt_mvvm.model.Products
import retrofit2.http.GET


interface ProductsService {

    @GET("products")
   suspend fun getUsers():List<Products>
}