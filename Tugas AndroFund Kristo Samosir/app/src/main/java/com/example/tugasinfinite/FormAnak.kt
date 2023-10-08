package com.example.tugasinfinite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

lateinit var nama : EditText
lateinit var umur : EditText
lateinit var berat : EditText

class FormAnak : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_anak)

        nama = findViewById(R.id.editNama)
        umur = findViewById(R.id.editUmur)
        berat = findViewById(R.id.editBerat)



        var btnConfirm :Button = findViewById(R.id.btnConfirm)

        btnConfirm.setOnClickListener(this)


    }

    override fun onClick(b: View) {
        when (b.id){
            R.id.btnConfirm ->{

                if (nama.text.toString().isEmpty()){
                    nama.error = "Nama anda kosong, Tolong masukkan nama!"
                    nama.requestFocus()
                }
                if (umur.text.toString().isEmpty()){
                    umur.error = "Umur anda kosong, Tolong masukkan umur!"
                    umur.requestFocus()
                }
                if (berat.text.toString().isEmpty()){
                    berat.error = "Berat anda kosong, Tolong masukkan berat!"
                    berat.requestFocus()
                }



                var intent2 = Intent(this@FormAnak, MainActivity::class.java)
                intent2.putExtra("data",Data(nama.text.toString(),
                    umur.text.toString(), berat.text.toString()))
                startActivity(intent2)


            }
        }
    }

}