package com.example.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

//    deklarasi komponen
    lateinit var etNama: EditText
    lateinit var etNim : EditText
    lateinit var btnSubmit : Button
    lateinit var btnSubmitDua : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        inisiasi
        etNama = findViewById(R.id.etNama)
        etNim = findViewById(R.id.etNim)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmitDua = findViewById(R.id.btnSubmitDua)

//        tanpa bundle
        btnSubmit.setOnClickListener {
            val intent = Intent(
                this,
                SecondActivity::class.java
            )
            intent.putExtra(
                "Nama",
                etNama.text.toString()
            )
            intent.putExtra("Nim", etNim.text.toString())
            startActivity(intent)
        }

//        dengan bundle
        btnSubmitDua.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("Nama", etNama.text.toString())
            bundle.putString("Nim", etNim.text.toString())
            val intent = Intent(this,
                SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}