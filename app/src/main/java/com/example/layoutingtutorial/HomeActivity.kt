package com.example.layoutingtutorial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val edit_nama: EditText = findViewById(R.id.et_nama)
        val edit_nomor: EditText = findViewById(R.id.et_nomor)
        val button_explicit: Button = findViewById(R.id.btn_explicit)
        val button_explicitbundle: Button = findViewById(R.id.btn_explicitbundle)
        val button_implicit: Button = findViewById(R.id.btn_implicit)
        val button_fragment: Button = findViewById(R.id.btn_fragment)

        button_fragment.setOnClickListener {
            val intent = Intent(this, FragmentTutorialActivity::class.java)
            startActivity(intent)
        }

        button_explicit.setOnClickListener {
            val intent = Intent(this, ExplicitIntentActivity::class.java)
            intent.putExtra("value_nama", edit_nama.text.toString())
            intent.putExtra("value_nomor", edit_nomor.text.toString())
            startActivity(intent)
        }

        button_explicitbundle.setOnClickListener {
            val bundle = Bundle()
            val intent = Intent(this, ExplicitBundleIntentActivity::class.java)
            bundle.putString("value_nama", edit_nama.text.toString())
            bundle.putString("value_nomor", edit_nomor.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }

        button_implicit.setOnClickListener {
            val panggil_nomor =  edit_nomor.text.toString()
            val Dial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$panggil_nomor"))
            startActivity(Dial)
        }
    }
}