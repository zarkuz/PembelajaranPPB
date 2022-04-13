package com.example.layoutingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity
import com.example.layoutingtutorial.tutorialfragment.FragmentTutorialKirim

class FragmentTutorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_tutorial)
        val mFragmentManager = supportFragmentManager
        val mFragmentKirim = FragmentTutorialKirim()
        val mFragment = mFragmentManager.findFragmentByTag(FragmentTutorialActivity::class.java.simpleName)
        if (mFragment !is FragmentTutorialKirim){
            Log.d("Contoh Fragment", "Fragment terattach: "+FragmentTutorialActivity::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.fta_fragmentku, mFragmentKirim, FragmentTutorialActivity::class.java.simpleName)
                .commit()
        }
    }
}