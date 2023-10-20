package com.example.clothing.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import android.widget.ArrayAdapter
import com.example.clothing.Adapters.CategoryAdapter
//import com.example.clothing.R
import com.example.clothing.Services.DataServices
import com.example.clothing.databinding.ActivityMainBinding
//import com.example.clothing.model.Category
//import com.example.clothing.model.bindo

class MainActivity : AppCompatActivity() {
    //lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val tione = binding.root
        setContentView(tione)


//        adapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1, DataServices.categories
//        )
        adapter=CategoryAdapter(this,DataServices.categories)
         setContentView(binding.root)
         binding.categoryListView.adapter=adapter

        binding.categoryListView.setOnItemClickListener{adapterView,view,i,l->

            val category = DataServices.categories[i]
            Toast.makeText(this,"You have clicked on ${category.title} cell",Toast.LENGTH_SHORT).show()
        }//(Iyi inondzi LIST VIEW method, but iyihayizi prefered method over RECYCLER VIEW METHOD

        }

    }



