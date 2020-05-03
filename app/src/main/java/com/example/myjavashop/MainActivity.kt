package com.example.myjavashop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsubmit =findViewById<Button>(R.id.btnsubmit)

        btnsubmit.setOnClickListener {

            val intent=Intent(this,Map::class.java)

            startActivity(intent)

        }


    }
}
