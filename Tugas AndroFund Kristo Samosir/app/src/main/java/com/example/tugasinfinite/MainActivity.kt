package com.example.tugasinfinite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

lateinit var textView : TextView
lateinit var back : Button
lateinit var gelap : Button
lateinit var terang : Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gelap = findViewById(R.id.gelap)
        terang = findViewById(R.id.terang)

        gelap.setOnClickListener { replaceFragment(Fragment1()) }
        terang.setOnClickListener { replaceFragment2(LightFragment()) }

        textView = findViewById(R.id.text)
        back = findViewById(R.id.back)

        back.setOnClickListener(this)

        var Nama = intent.getParcelableExtra<Data>("data")?.nama
        var Umur = intent.getParcelableExtra<Data>("data")?.umur
        var Berat = intent.getParcelableExtra<Data>("data")?.berat

        textView.text = "Nama Anda adalah $Nama \nUmur Anda adalah $Umur \nBerat Anda Adalah $Berat"

    }

    private fun replaceFragment2(fragment2: LightFragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.containerFrag, fragment2)
        fragmentTransition.commit()
    }

    private fun replaceFragment(fragment1: Fragment1) {
        val fragmentManager = supportFragmentManager
        val fragmentTransition = fragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.containerFrag, fragment1)
        fragmentTransition.commit()
    }

    override fun onClick(a: View) {
        when (a.id){
            R.id.back -> {
                var intent = Intent(this@MainActivity, FormAnak::class.java)
                startActivity(intent)
            }
        }
    }
}