package com.example.hiitsample.hilt_mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hiitsample.R
import com.example.hiitsample.hilt_mvvm.viewmodel.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Hilt_Mvvm : AppCompatActivity() {

    lateinit var productViewModel: ProductViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_mvvm)

        productViewModel=ViewModelProvider(this).get(ProductViewModel::class.java)

        productViewModel.getProductList()
        productViewModel.productList.observe(this, Observer {
            Log.d("TAG", "onCreate: $it ")
        })

    }
}