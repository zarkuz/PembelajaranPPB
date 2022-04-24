package com.example.pembelajranrecyclerview

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(private val listData:ArrayList<DataClassWisata>) : RecyclerView.Adapter<WisataAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_namawisata)
        var tvDeskripsi: TextView = itemView.findViewById(R.id.tv_deskripsiwisata)
        var ivGambar: ImageView = itemView.findViewById(R.id.iv_gambarwisata)
        var btnLihat: Button = itemView.findViewById(R.id.btn_lihatlokasi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val dataku = listData[position]
        holder.ivGambar.setImageResource(dataku.sampleImage)
        holder.tvNama.text = dataku.namaWisata
        holder.tvDeskripsi.text = dataku.deskripsi
        holder.btnLihat.setOnClickListener{
            val bundle = Bundle()
            val intent = Intent(holder.itemView.context, MapsActivity::class.java)
            bundle.putString("lat", dataku.lat)
            bundle.putString("long", dataku.long)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return listData.size
    }


}