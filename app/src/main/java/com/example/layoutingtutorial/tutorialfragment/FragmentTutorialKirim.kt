package com.example.layoutingtutorial.tutorialfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.layoutingtutorial.HomeActivity
import com.example.layoutingtutorial.R
import kotlinx.android.synthetic.main.fragment_tutorial_kirim.*

class FragmentTutorialKirim : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ftk_btn_kirim.setOnClickListener {
            val tekspertama = ftk_et_teks1.text.toString()
            val tekskedua = ftk_et_teks2.text.toString()
            val terimaFragment = FragmentTutorialTerima()
            val bundle = Bundle()
            bundle.putString("idtekspertama", tekspertama)
            bundle.putString("idtekskedua", tekskedua)
            terimaFragment.arguments = bundle

            val mFragmentManager = fragmentManager as FragmentManager
            mFragmentManager.beginTransaction()
                .replace(R.id.fta_fragmentku, terimaFragment, FragmentTutorialTerima::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
        ftk_btn_kembali.setOnClickListener {
            val intent = Intent(activity, HomeActivity::class.java)
            activity?.startActivity(intent)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorial_kirim, container, false)
    }

}