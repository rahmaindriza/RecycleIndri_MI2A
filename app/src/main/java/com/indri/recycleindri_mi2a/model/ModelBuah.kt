package com.indri.recycleindri_mi2a.model

import com.indri.recycleindri_mi2a.R

data class ModelBuah(
    val image : Int,
    val nama : String
)
//kita mock data untuk array

object MockList{
    fun getModel() : List<ModelBuah>{
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            "Apple"
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val itemModel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk"
        )
        val itemModel4 = ModelBuah(
            R.drawable.pear,
            "Pear"
        )
        val itemModel5 = ModelBuah(
            R.drawable.strawberry,
            "Strowbery"
        )
        val itemModel6 = ModelBuah(
            R.drawable.orange,
            "Orange"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}