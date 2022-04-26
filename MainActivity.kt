package com.example.danangbelajarrecyclerviewdancardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<KalimatAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting layout menjadi lenear layout
        layoutManager = LinearLayoutManager(this)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        //set layout untuk recyclerview
        recyclerView.layoutManager = layoutManager

        //call class adapter dan set recyclerview sesuai dengan adapter yang telah kita dibuat sebelumnya
        adapter = KalimatAdapter()
        recyclerView.adapter = adapter
    }

}