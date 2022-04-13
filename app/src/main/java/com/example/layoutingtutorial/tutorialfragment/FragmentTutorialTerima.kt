package com.example.layoutingtutorial.tutorialfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.layoutingtutorial.FragmentTutorialActivity
import com.example.layoutingtutorial.R
import kotlinx.android.synthetic.main.fragment_tutorial_terima.*

class FragmentTutorialTerima : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments!=null){
            val tekspertama = arguments?.getString("idtekspertama")
            val tekskedua = arguments?.getString("idtekskedua")
            ftt_tv_teksku.text = "Ini teks pertama($tekspertama) dan ini teks kedua($tekskedua)"
        }
        ftt_btn_kembali.setOnClickListener {
            val kirimFragment = FragmentTutorialKirim()
            val mFragmentManager = fragmentManager as FragmentManager
            mFragmentManager.beginTransaction()
                .replace(R.id.fta_fragmentku, kirimFragment, FragmentTutorialActivity::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorial_terima, container, false)
    }

}