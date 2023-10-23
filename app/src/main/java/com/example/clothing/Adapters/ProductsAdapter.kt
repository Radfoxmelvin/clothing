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
import com.example.clothing.model.Product

class ProductsAdapter(val context:Context,val products:List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {


    inner class ProductHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(products: Product, context: Context){
            val resourceId = context.resources.getIdentifier(products.image,"drawable",context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = products.title
            productPrice?.text = products.price
            //itemView.setOnClickListener{itemClick(category)}
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder?.bindProduct(products[position],context)
    }
}