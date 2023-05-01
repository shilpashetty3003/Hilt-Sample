package com.example.hiitsample.hilt_mvvm.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.hiitsample.hilt_mvvm.api.ProductsService
import com.example.hiitsample.hilt_mvvm.model.Products
import javax.inject.Inject

class ProductRepo @Inject constructor(var productsService: ProductsService) {

    private val productList=MutableLiveData<List<Products>>()

    val productList_:LiveData<List<Products>>
    get() = productList

   suspend fun getServiceList(){
        var result=productsService.getUsers()
        if(result!=null){
            productList.postValue(result)
        }
    }
}