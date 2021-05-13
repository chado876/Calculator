package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View){
        Toast.makeText(this,"Button works",Toast.LENGTH_SHORT).show()
    }

    fun addListeners(){
        btn7.setOnClickListener { onDigit(btn7) }
    }
}