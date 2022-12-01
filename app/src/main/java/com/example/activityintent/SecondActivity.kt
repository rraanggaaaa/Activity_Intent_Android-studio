package com.example.activityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    
//    deklarasi
    lateinit var tvNama : TextView
    lateinit var tvNim : TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        
//        inisiasi
        tvNama = findViewById(R.id.tvNama)
        tvNim = findViewById(R.id.tvNim)
        
        if(intent.extras != null) {
//            Menangkap data bundle
            val bundle = intent.extras
            tvNama.setText(bundle?.getString("Nama"))
            tvNim.setText(bundle?.getString("Nim"))
        }else{
            tvNama.setText(intent.getStringExtra("Nama"))
            tvNim.setText(intent.getStringExtra("Nim"))
        }
    }
}