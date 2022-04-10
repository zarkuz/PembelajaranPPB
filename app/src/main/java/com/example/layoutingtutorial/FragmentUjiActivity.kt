package com.example.layoutingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FragmentUjiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_uji)
        val mFramentManager = supportFragmentManager
        val mFirstFragment = FragmentSatu()
        val fragment = mFramentManager.findFragmentByTag(FragmentUjiActivity::class.java.simpleName)
        if (fragment !is FragmentSatu){
            Log.d("My Flexible", "Fragment Name" + FragmentUjiActivity::class.java.simpleName)
            mFramentManager
                .beginTransaction()
                .add(R.id.frame_ini, mFirstFragment, FragmentUjiActivity::class.java.simpleName)
                .commit()
        }

    }
}