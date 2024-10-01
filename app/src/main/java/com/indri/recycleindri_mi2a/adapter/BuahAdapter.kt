package com.indri.recycleindri_mi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.indri.recycleindri_mi2a.DetailBuah
import com.indri.recycleindri_mi2a.R
import com.indri.recycleindri_mi2a.RecycleBuahActivity
import com.indri.recycleindri_mi2a.model.ModelBuah

class BuahAdapter (
    val itemList: ArrayList<ModelBuah>,
    val getActivity: RecycleBuahActivity
) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemName : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemName = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahAdapter.MyViewHolder {
        // manggil layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: BuahAdapter.MyViewHolder, position: Int) {
        // set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemName.setText(itemList[position].nama)

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailBuah::class.java)
            intent.putExtra( "image", itemList[position].image)
            intent.putExtra( "nama", itemList[position].nama)
            intent.putExtra( "nama", itemList[position].nama)
            intent.putExtra( "lokasi", itemList[position].lokasi)
            intent.putExtra( "deskripsi", itemList[position].deskripsi.toString())


            getActivity.startActivity(intent)
        }
    }


}