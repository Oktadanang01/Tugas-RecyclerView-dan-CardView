package com.example.danangbelajarrecyclerviewdancardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KalimatAdapter:RecyclerView.Adapter<KalimatAdapter.ViewHolder>() {
    //deklarasikan terlebih dahulu apa yang akan kita tampilkan pada recyclerview
    private var kalimat = arrayOf("“Kadang kita terlalu sibuk memikirkan kesulitan-kesulitan sehingga kita tidak punya waktu untuk mensyukuri rahmat Tuhan” – Jenderal Soedirman", "“Jangan pernah menyerah jika kamu masih ingin mencoba. Jangan biarkan penyesalan datang karena kamu selangkah lagi untuk menang” – R. A. Kartini", "“Pada waktu kita khawatir, kita terkadang lebih percaya pada masalah kita dari pada janji Allah” – Cut Nyak Dhien", "“Gagal bukan berarti tak ada harapan. Gagal bukan berarti tak ada masa depan” – Wirda Mansur", "“Barang siapa belum merasakan pahitnya belajar walau sebentar, maka akan merasakan hinanya kebodohan sepanjang hidupnya” – Imam Syafi’i", "“Menyesali nasib tidak akan mengubah keadaan. Terus berkarya dan bekerjalah yang membuat kita berharga” – Gus Dur")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var kalimat:TextView

        init {
            kalimat = itemView.findViewById(R.id.item_kalimat)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.halaman_cardview, parent, false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.kalimat.text = kalimat[position]
    }

    override fun getItemCount(): Int {
        return kalimat.size
    }
}