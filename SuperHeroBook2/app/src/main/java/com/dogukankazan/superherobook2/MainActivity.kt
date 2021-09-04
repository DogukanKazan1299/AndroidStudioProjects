package com.dogukankazan.superherobook2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tanitim.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Verileri Hazırlamak
        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Witcher")


        //Verimsiz Tanımlama ->Bitmap
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val witcherBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.witcher)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(witcherBitmap)


        val layoutManager = LinearLayoutManager(this)
        recyclerView2.layoutManager=layoutManager


        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanGorselleri)
        recyclerView2.adapter = adapter
    }
}