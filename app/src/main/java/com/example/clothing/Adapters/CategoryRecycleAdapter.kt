package com.example.clothing.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clothing.R
import com.example.clothing.model.Category

class CategoryRecycleAdapter(val context: Context,val categories:List<Category>):RecyclerView.Adapter<CategoryRecycleAdapter.holder>() {

    inner class holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category,context: Context){
           val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.category_list_item,parent,false)
        return holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

     override fun onBindViewHolder(holder: holder, position: Int) {

           holder?.bindCategory(categories[position],context)
    }
}