package com.example.layoutingtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnR3 = btn_r3
        btnR3.setOnClickListener {
            startActivity(Intent(this, FragmentUjiActivity::class.java))
        }
    }
}