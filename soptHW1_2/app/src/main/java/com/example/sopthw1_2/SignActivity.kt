package com.example.sopthw1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.sign_activity.*

class SignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_activity)

        button.setOnClickListener {
            val email = editText1.text.toString()
            val password = editText2.text.toString()

            val nextIntent = Intent(this, MainActivity::class.java)
            nextIntent.putExtra("email",email)
            nextIntent.putExtra("password",password)

            startActivity(nextIntent)

        }
    }
}
