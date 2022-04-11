package com.example.layoutingtutorial

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExplicitBundleIntentActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_bundle_intent)
        val tv_tampildata: TextView = findViewById(R.id.tv_ebi_terima_data)
        val bundle = intent.extras
        val nama = bundle?.getString("value_nama")
        val nomor = bundle?.getString("value_nomor")
        tv_tampildata.setText("Nama= $nama, Nomor= $nomor")
    }
}