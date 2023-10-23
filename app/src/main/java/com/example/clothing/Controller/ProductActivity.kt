package com.example.clothing.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.clothing.Adapters.ProductsAdapter
import com.example.clothing.R
import com.example.clothing.Services.DataServices
import com.example.clothing.Utilities.EXTRA_CATEGORY
import com.example.clothing.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter
    private lateinit var binding: ActivityProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        binding = ActivityProductBinding.inflate(layoutInflater)
        val hona = binding.root
        setContentView(hona)

        val productType = intent.getStringExtra(EXTRA_CATEGORY)
        //println(categoryType)
       adapter = ProductsAdapter(this,DataServices.getProducts(productType))

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation== Configuration.ORIENTATION_LANDSCAPE){

            spanCount = 4
        }
        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720){

        }

        val layoutManager = GridLayoutManager(this,spanCount)
        binding.productListView.layoutManager=layoutManager
       binding.productListView.adapter=adapter

    }
}