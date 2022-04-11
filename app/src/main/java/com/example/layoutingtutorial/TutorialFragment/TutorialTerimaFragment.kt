package com.example.layoutingtutorial.TutorialFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.layoutingtutorial.R
import com.example.layoutingtutorial.TutorialFragmentActivity
import kotlinx.android.synthetic.main.fragment_tutorial_terima.*


class TutorialTerimaFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments!=null){
            val nama = arguments?.getString("tekspertama")
            val nomor = arguments?.getString("tekskedua")
            tv_ftt_terima.text = "Teks Satu adalah $nama dan Teks 2 adalah $nomor"
        }
        btn_ftt_back.setOnClickListener {
            val kirimFragment = TutorialKirimFragment()
            val fragmentMan = fragmentManager as FragmentManager
            fragmentMan.beginTransaction()
                .replace(R.id.tf_fragmentku, kirimFragment, TutorialFragmentActivity::class.java.simpleName)
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