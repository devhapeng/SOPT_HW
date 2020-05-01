package com.example.sopthw1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3.setOnClickListener {

            val nextIntent = Intent(this@MainActivity, SignActivity::class.java)

            editText_email.setText(nextIntent.getStringExtra("email"))
            editText_pw.setText(nextIntent.getStringExtra("password"))


            startActivity(nextIntent)


        }
    }
}
