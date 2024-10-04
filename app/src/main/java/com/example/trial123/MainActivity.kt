package com.example.trial123

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//    val arrayList= arrayOf(
//        "hello",
//        "hi",
//        "world"
//    )
//    val spin=findViewById<Spinner>(R.id.spin)
//    spin.adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayList)
//
        val listview=findViewById<ListView>(R.id.listview)
        val arrayview= arrayOf(
            Contact("131","84376726","Gunjan","Patel","Goa","mahesana"),
            Contact("122","84376726","Farid","Mandli","Goa","mahesana"),
            Contact("140","84376726","Gunjan","Patel","Goa","mahesana")
        )

        listview.adapter=ContactAdapter(this,arrayview)
    }

}

