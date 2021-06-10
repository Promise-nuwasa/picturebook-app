package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()


    }
    fun castView(){
        btnnext=findViewById(R.id.btnnext)
    }
    fun onClick(){
        val next=Intent(baseContext,flagActivity::class.java)
        startActivity(next)
    }
}