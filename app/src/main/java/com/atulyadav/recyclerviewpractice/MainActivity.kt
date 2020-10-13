package com.atulyadav.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val examplelist = generatedummylist(500)

        rv_main.adapter = ExampleAdapter(examplelist)
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.setHasFixedSize(true)
    }

    private fun generatedummylist (size:Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem> ()

        for (i in 0 until size) {
            val drawable = when(i % 3){
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_alert
                else -> R.drawable.ic_car
            }
            val item = ExampleItem(drawable, "Item $i", "Line 2" )
            list += item
        }
        return list
    }
}