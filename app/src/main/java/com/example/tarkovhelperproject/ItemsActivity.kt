package com.example.tarkovhelperproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.tarkovhelperproject.adapter.ItemAdapter
import com.example.tarkovhelperproject.data.Datasource

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val myDataSet = Datasource().loadItems()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)
    }
}