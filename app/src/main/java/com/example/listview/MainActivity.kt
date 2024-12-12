package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Revise Adapter")
        taskList.add("Revise ListView")
        taskList.add("Revise RecyclerView")
        taskList.add("Revise Fragments")
        taskList.add("Revise RoomDb")

        //now set adapter for setup connection between listview and data

        val adapterForMyListView = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)

        listView.adapter = adapterForMyListView

        //??Logic for perform some action on listView

        listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked Action :  " + (view as TextView).text.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }

    }
}