package com.example.hiitsample.hilt_mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiitsample.hilt_mvvm.model.Products
import com.example.hiitsample.hilt_mvvm.repo.ProductRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(var productRepo: ProductRepo) :ViewModel() {

    val productList:LiveData<List<Products>>
    get() = productRepo.productList_

    fun getProductList(){
        viewModelScope.launch {
            productRepo.getServiceList()
        }

    }
}