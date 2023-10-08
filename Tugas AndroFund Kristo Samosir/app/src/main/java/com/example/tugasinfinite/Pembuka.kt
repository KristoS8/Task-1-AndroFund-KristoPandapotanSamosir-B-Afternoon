package com.example.tugasinfinite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pembuka : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembuka)

        var Letsgo : Button = findViewById(R.id.lets)
        Letsgo.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.lets -> {
                var intent = Intent(this@Pembuka, FormAnak::class.java)
                startActivity(intent)
            }
        }
    }
}