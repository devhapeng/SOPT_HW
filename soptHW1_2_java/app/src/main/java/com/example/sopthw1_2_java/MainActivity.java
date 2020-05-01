package com.example.sopthw1_2_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edit1;
    EditText edit2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.editText_email);
        edit2 = (EditText) findViewById(R.id.editText_pw);
        text = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button);

        Intent intent2 = getIntent();
        String email = intent2.getStringExtra("email");
        String password = intent2.getStringExtra("password");


        edit1.setText(email);
        edit2.setText(password);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SubActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "회원가입을 합니다.", Toast.LENGTH_SHORT).show();

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
