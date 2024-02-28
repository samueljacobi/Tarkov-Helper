package com.example.tarkovhelperproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mapSelectScreen(view: View) {
        val intent = Intent(this, MapSelect::class.java)
        startActivity(intent)
    }

    fun itemScreen(view: View) {
        val intent = Intent(this, ItemsActivity::class.java)
        startActivity(intent)
    }
}