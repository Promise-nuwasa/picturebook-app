package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class currencyActivity : AppCompatActivity() {
    lateinit var btnprev4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency)
        castView4()
        onClick4()

    }
    fun castView4(){
        btnprev4=findViewById(R.id.btnprev4)
    }
    fun onClick4(){
        val preview4= Intent(baseContext,cortofarmActivity::class.java)
        startActivity(preview4)
    }
}