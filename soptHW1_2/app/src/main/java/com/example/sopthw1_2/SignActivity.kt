package com.example.sopthw1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_activity.*

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_activity)

        button.setOnClickListener {
            val inputEmail = editText1.text.toString()
            val inputPassword = editText2.text.toString()

            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("email",inputEmail)
            nextIntent.putExtra("password",inputPassword)

            startActivityForResult(nextIntent)

        }
    }
}
