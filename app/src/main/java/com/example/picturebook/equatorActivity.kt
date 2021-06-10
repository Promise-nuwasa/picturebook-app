package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class equatorActivity : AppCompatActivity() {
    lateinit var btnprev2: Button
    lateinit var btnnext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equator)
        castView2()
        onClick2()
    }
    fun castView2(){
        btnprev2=findViewById(R.id.btnprev2)
        btnnext3=findViewById(R.id.btnnext3)
    }
    fun onClick2(){
        var next3= Intent(baseContext,cortofarmActivity::class.java)
        startActivity(next3)
        var preview2= Intent(baseContext,flagActivity::class.java)
        startActivity(preview2)
    }
}