package com.example.layoutingtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_read.*

class ReadFragment : Fragment() {

    companion object{
        var EXTRA_NAMA=""
        var EXTRA_ANGKA=""
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments!=null){
            val huruf=arguments?.getString(EXTRA_NAMA)
            val angka=arguments?.getString(EXTRA_ANGKA)
            fm_read_data.text = "Teks yang dikirim=$huruf dan angka yang di kirim=$angka"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_read, container, false)
    }

}