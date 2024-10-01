package com.indri.recycleindri_mi2a

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var lv_listview : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_listview = findViewById(R.id.lv_data)

        //arrayadapter
        val arrayAdapter: ArrayAdapter<*>
        val listHewan = arrayOf(
            "Semut", //index 0
            "Kucing",//index 1
            "Gajah",
            "Kelinci",
            "Ular",
            "Ikan",
            "Paus",
            "Panda"//index 7
        )

        //tampilkan ke dalam listview
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listHewan)
        lv_listview.adapter = arrayAdapter

        //untuk bisa klik item dari list nya
        lv_listview.setOnItemClickListener{
                parent, view, position, id ->
            // munculkan dalam toast
            Toast.makeText(this, "Anda klik : ${listHewan[position]}",
                Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}