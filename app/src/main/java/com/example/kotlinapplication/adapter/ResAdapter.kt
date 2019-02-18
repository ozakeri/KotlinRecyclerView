package com.example.kotlinapplication.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinapplication.R
import kotlinx.android.synthetic.main.item_list.view.*

class ResAdapter(val items: ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<ResAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        p0.item.text = items.get(p1)
    }

    public class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val item = view.txt_cell;
    }

}