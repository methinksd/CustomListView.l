package com.example.customlistviewl

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter(var mCtx:Context,var resources:Int,var items:List<model>):ArrayAdapter<model>(mCtx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
         val layoutInflater:LayoutInflater=LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageview:ImageView=view.findViewById(R.id.image)
        val titleTextView:TextView=view.findViewById(R.id.textview1)
        val descriptiontextView:TextView=view.findViewById(R.id.textview2)

        var mitems:model=items[position]
        imageview.setImageDrawable(mCtx.resources.getDrawable(mitems.image))
        titleTextView.text=mitems.title
        descriptiontextView.text=mitems.description
        return view
    }
}