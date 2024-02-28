package com.example.tarkovhelperproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MapSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_select)
    }

    fun mapLabs(view: View) {
        val intent = Intent(this, LabsActivity::class.java)
        startActivity(intent)
    }

    fun mapWoods(view: View) {
        val intent = Intent(this, WoodsActivity::class.java)
        startActivity(intent)
    }

    fun mapReserve(view: View) {
        val intent = Intent(this, ReserveActivity::class.java)
        startActivity(intent)
    }

    fun mapLighthouse(view: View) {
        val intent = Intent(this, LighthouseActivity::class.java)
        startActivity(intent)
    }

    fun mapShoreline(view: View) {
        val intent = Intent(this, ShorelineActivity::class.java)
        startActivity(intent)
    }


    fun mapStreets(view: View) {
        val intent = Intent(this, StreetsActivity::class.java)
        startActivity(intent)
    }

    fun mapInterchange(view: View) {
        val intent = Intent(this, InterchangeActivity::class.java)
        startActivity(intent)
    }

    fun mapCustoms(view: View) {
        val intent = Intent(this, CustomsActivity::class.java)
        startActivity(intent)
    }

    fun mapFactory(view: View) {
        val intent = Intent(this, FactoryActivity::class.java)
        startActivity(intent)
    }

}