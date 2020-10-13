package com.atulyadav.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*
import java.util.Date.from
import java.util.zip.Inflater

class ExampleAdapter(private val examplelistItem: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item, parent, false)
        return ExampleHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleHolder, position: Int) {
        val currentitem = examplelistItem[position]

        holder.imageView.setImageResource(currentitem.ImageResource)
        holder.textView1.text = currentitem.Text1
        holder.textView2.text = currentitem.Text2
    }

    override fun getItemCount() = examplelistItem.size

    class ExampleHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.iv_android
        val textView1: TextView = itemView.tv1
        val textView2: TextView = itemView.tv2

    }
}