package com.example.layoutingtutorial

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_satu.*


class FragmentSatu : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fm_satu_btn.setOnClickListener {
            val editSatu = fm_satue_edit.text.toString()
            val editAngka = fm_satue_angka.text.toString()
            val readDataFragment = ReadFragment()
            val bundle = Bundle()
            bundle.putString(ReadFragment.EXTRA_NAMA, editSatu)
            bundle.putString(ReadFragment.EXTRA_ANGKA, editAngka)
            readDataFragment.arguments = bundle

            val fragmentManag = fragmentManager as FragmentManager
            fragmentManag.beginTransaction()
                .replace(R.id.frame_ini, readDataFragment, ReadFragment::class.java.simpleName)
                .addToBackStack(null)
                .commit()


        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }


}