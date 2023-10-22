package com.example.clothing.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
//import android.widget.ArrayAdapter
import com.example.clothing.Adapters.CategoryAdapter
import com.example.clothing.Adapters.CategoryRecycleAdapter
//import com.example.clothing.R
import com.example.clothing.Services.DataServices
import com.example.clothing.Utilities.EXTRA_CATEGORY
import com.example.clothing.databinding.ActivityMainBinding
//import com.example.clothing.model.Category
//import com.example.clothing.model.bindo

class MainActivity : AppCompatActivity() {
    //(1)lateinit var adapter: ArrayAdapter<Category>
//  (2)  lateinit var adapter: CategoryAdapter
    lateinit var adapter: CategoryRecycleAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val tione = binding.root
        setContentView(tione)


// (1)       adapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1, DataServices.categories
//        )
//   (2)     adapter=CategoryAdapter(this,DataServices.categories)
//         setContentView(binding.root)
//         binding.categoryListView.adapter=adapter

        adapter= CategoryRecycleAdapter(this,DataServices.categories){category ->
            //println(category.title)
            val productIntent=Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        setContentView(binding.root)
        binding.categoryListView.adapter=adapter

        val layoutManager = LinearLayoutManager(this)
            binding.categoryListView.layoutManager = layoutManager
            binding.categoryListView.setHasFixedSize(true)

//  (1)      binding.categoryListView.setOnItemClickListener{adapterView,view,i,l->
//
//            val category = DataServices.categories[i]
//            Toast.makeText(this,"You have clicked on ${category.title} cell",Toast.LENGTH_SHORT).show()
//        }//(Iyi inondzi LIST VIEW method, but iyihayizi prefered method over RECYCLER VIEW METHOD

        }

    }



