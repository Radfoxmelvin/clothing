package com.example.clothing.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clothing.R
import com.example.clothing.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}