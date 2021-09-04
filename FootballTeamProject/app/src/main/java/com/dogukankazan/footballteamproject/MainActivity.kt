package com.dogukankazan.footballteamproject

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veriler;
        var takimIsimleri = ArrayList<String>()
        takimIsimleri.add("Akhisar")
        takimIsimleri.add("Beşiktaş")
        takimIsimleri.add("Bursaspor")
        takimIsimleri.add("Eskişehirspor")
        takimIsimleri.add("Fenerbahçe")
        takimIsimleri.add("Galatasaray")
        takimIsimleri.add("Gençlerbirliği")
        takimIsimleri.add("Malatyaspor")
        takimIsimleri.add("Trabzonspor")

        //Verimsiz Tanımlamalar;
        val akhisarBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.akhisar)
        val besiktasBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.besiktas)
        val bursasporBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bursaspor)
        val eskisehirBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eskisehir)
        val fenerbahceBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.fenerbahce)
        val galatasarayBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.galatasaray)
        val genclerbirligiBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.genclerbirligi)
        val malatyaBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.malatya)
        val trabzonBitmap=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.trabzonspor)

        var takimGorselleri = ArrayList<Bitmap>()
        takimGorselleri.add(akhisarBitmap)
        takimGorselleri.add(besiktasBitmap)
        takimGorselleri.add(bursasporBitmap)
        takimGorselleri.add(eskisehirBitmap)
        takimGorselleri.add(fenerbahceBitmap)
        takimGorselleri.add(galatasarayBitmap)
        takimGorselleri.add(genclerbirligiBitmap)
        takimGorselleri.add(malatyaBitmap)
        takimGorselleri.add(trabzonBitmap)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager


        val adapter = RecyclerAdapter(takimIsimleri,takimGorselleri)
        recyclerView.adapter=adapter

    }
}