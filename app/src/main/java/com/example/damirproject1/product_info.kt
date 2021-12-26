package com.example.damirproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class product_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_info)

        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener{
            val intent = Intent(this, products::class.java)
            startActivity(intent)
    }}
}