package com.example.kotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.kotlinapplication.adapter.ResAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addItems()
        recyclerView.layoutManager = LinearLayoutManager(this);
        // recyclerView.layoutManager = GridLayoutManager(this,2);
        recyclerView.adapter = ResAdapter(list, this)
    }

    fun addItems() {
        list.add("one")
        list.add("two")
        list.add("three")
        list.add("four")
        list.add("five")
        list.add("six")
        list.add("seven")
        list.add("eight")
        list.add("nine")
        list.add("ten")
    }
}
