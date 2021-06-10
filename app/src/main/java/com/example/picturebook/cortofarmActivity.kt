package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cortofarmActivity : AppCompatActivity() {
    lateinit var btnprev3: Button
    lateinit var btnnext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cortofarm)
        castView3()
        onClick3()
    }
    fun castView3(){
        btnprev3=findViewById(R.id.btnprev3)
        btnnext4=findViewById(R.id.btnnext4)
    }
    fun onClick3(){
        var next4= Intent(baseContext,currencyActivity ::class.java)
        startActivity(next4)
        var preview3= Intent(baseContext,equatorActivity::class.java)
        startActivity(preview3)
    }
}