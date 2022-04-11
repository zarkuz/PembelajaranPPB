package com.example.layoutingtutorial.TutorialFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.layoutingtutorial.HomeActivity
import com.example.layoutingtutorial.R
import com.example.layoutingtutorial.TutorialFragmentActivity
import kotlinx.android.synthetic.main.fragment_tutorial_kirim.*


class TutorialKirimFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_ftk_kirim.setOnClickListener {
            val nama = et_ftk_teks1.text.toString()
            val nomor = et_ftk_teks2.text.toString()
            val terimaFragment = TutorialTerimaFragment()
            val bundle = Bundle()
            bundle.putString("tekspertama", nama)
            bundle.putString("tekskedua", nomor)
            terimaFragment.arguments = bundle

            val fragmentMan = fragmentManager as FragmentManager
            fragmentMan.beginTransaction()
                .replace(R.id.tf_fragmentku, terimaFragment, TutorialFragmentActivity::class.java.simpleName)
                .addToBackStack(null)
                .commit()
        }
        btn_ftk_back.setOnClickListener {
            val intent = Intent(activity,HomeActivity::class.java)
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