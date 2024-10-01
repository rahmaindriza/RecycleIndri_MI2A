package com.indri.recycleindri_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnListView : Button
    private lateinit var btnRecycleview : Button
    private lateinit var btnRecycleBuah : Button
    private lateinit var btnMovie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnListView = findViewById(R.id.btnListView)
        btnRecycleview = findViewById(R.id.btnRecycleView)
        btnRecycleBuah = findViewById(R.id.btnRecycleBuah)
        btnMovie = findViewById(R.id.btnMovie)


        //untuk 1 screen --> terdiri dari 1 activity dan 1 xml layout
        //untuk bisa widget kita pakai, kita deklarasi dlu
        //kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnListView.setOnClickListener(){
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intentMenu2)
        }

        btnRecycleview.setOnClickListener(){
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@MainActivity, RecycleViewActivity::class.java)
            startActivity(intentMenu2)
        }

        btnRecycleBuah.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, RecycleBuahActivity::class.java)
            startActivity(intentMenu)
        }
        btnMovie.setOnClickListener() {
            val intentMenu = Intent(this@MainActivity, RecycleMovieActivity::class.java)
            startActivity(intentMenu)
        }

    }
}