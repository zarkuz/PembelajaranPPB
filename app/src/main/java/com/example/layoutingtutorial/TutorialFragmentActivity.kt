package com.example.layoutingtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.layoutingtutorial.TutorialFragment.TutorialKirimFragment

class TutorialFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial_fragment)
        val mFragmentManager = supportFragmentManager
        val mFragmentKirim = TutorialKirimFragment()
        val fragment = mFragmentManager.findFragmentByTag(TutorialFragmentActivity::class.java.simpleName)
        if (fragment !is TutorialKirimFragment){
            Log.d("My Flexible", "Fragment Name = " +TutorialFragmentActivity::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.tf_fragmentku, mFragmentKirim, TutorialFragmentActivity::class.java.simpleName)
                .commit()
        }
    }
}