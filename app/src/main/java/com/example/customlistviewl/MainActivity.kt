package com.example.customlistviewl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView= findViewById<ListView>(R.id.listView)
        var list= mutableListOf<model>()

        list.add(model("Charge electric mustang","This is the $350,000 productiion-ready charge electic mustang",R.drawable.mustang1))
        list.add(model("","New and used Ford mustangs",R.drawable.mustang2))
        list.add(model("","2022 Ford Mustang prices",R.drawable.mustang3))
        list.add(model("","The FOrd Mustang was the world's best selling sports car of 2019",R.drawable.mustang4))
        list.add(model("","Ford has 14 different Mustang models.Can you name them all?",R.drawable.mustang5))
        list.add(model("","Ford Mustang prices,colors and types",R.drawable.mustang6))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{adapterView, view, position, l ->

            if (position ==0){
                Toast.makeText(this@MainActivity,"You have clicked on car1", Toast.LENGTH_LONG)
            }
            if (position ==1){
                Toast.makeText(this@MainActivity,"You have clicked on car2", Toast.LENGTH_LONG)
            }
            if (position ==2){
                Toast.makeText(this@MainActivity, "You have clicked on car3", Toast.LENGTH_LONG)
            }
            if (position ==3){
                Toast.makeText(this@MainActivity, "You have clicked on car4",Toast.LENGTH_LONG)
            }
            if (position ==4){
                Toast.makeText(this@MainActivity, "You have clicked on car5", Toast.LENGTH_LONG)
            }
            if (position ==5){
                Toast.makeText(this@MainActivity, "You have clicked on car6", Toast.LENGTH_LONG)
            }
        }
    }
}