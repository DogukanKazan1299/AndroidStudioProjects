package com.dogukankazan.footballteamproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenTakimAdi = intent.getStringExtra("takimlarismi")
        textView.text=secilenTakimAdi

        val secilenTakim=SingletonClass.SecilenTakim
        val secilenGorsel = secilenTakim.gorsel
        imageView.setImageBitmap(secilenGorsel)
    }
}