package com.example.sopthw1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView3.setOnClickListener {


            val nextIntent = Intent(this, SignActivity::class.java)
            if(intent.hasExtra("email")) {
                TextView_get.text = intent.getStringExtra("email")

                    if(intent.hasExtra("password")) {
                        TextView_get.text = intent.getStringExtra("password")
                    }
            } else {
                Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
            }
            startActivity(intent)
        }
    }
}
