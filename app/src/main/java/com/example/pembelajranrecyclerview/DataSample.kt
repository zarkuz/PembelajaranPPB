package com.example.pembelajranrecyclerview

object DataSample {
    private val namaSampel= arrayOf(
        "Baturaden",
        "Small World",
        "Watu Jajar",
        "Small World",
        "Watu Jajar"
    )
    private val deskripsiSampel= arrayOf(
        "Desa Wisata yang ada di Banyumas",
        "Miniatur Dunia",
        "Pemandangan indah dari atas bukit",
        "Miniatur Dunia",
        "Pemandangan indah dari atas bukit"
    )
    private val gambarSampel= intArrayOf(
        R.drawable.baturaden_1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1
    )
    private val latSampel= arrayOf(
        "-7.3181132",
        "-7.3181132",
        "-7.3181132",
        "-7.3181132",
        "-7.3181132"
    )
    private val longSampel= arrayOf(
        "109.2360728",
        "109.2360728",
        "109.2360728",
        "109.2360728",
        "109.2360728"
    )
    val listData: ArrayList<DataClassWisata>
    get(){
        val listDataku = arrayListOf<DataClassWisata>()
        for (position in namaSampel.indices){
            val data = DataClassWisata()
            data.namaWisata = namaSampel[position]
            data.deskripsi = deskripsiSampel[position]
            data.sampleImage = gambarSampel[position]
            data.lat = latSampel[position]
            data.long = longSampel[position]
            listDataku.add(data)
        }
        return listDataku
    }

}