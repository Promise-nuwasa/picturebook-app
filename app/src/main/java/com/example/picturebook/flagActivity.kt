package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class flagActivity : AppCompatActivity() {
    lateinit var btnprev1:Button
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag)

        castView2()
        onClick2()
    }
    fun castView2(){
        btnprev1=findViewById(R.id.btnprev1)
        btnnext2=findViewById(R.id.btnnext2)
    }
    fun onClick2(){
        var next2=Intent(baseContext,equatorActivity::class.java)
        startActivity(next2)
        var preview=Intent(baseContext,MainActivity::class.java)
        startActivity(preview)
    }
}