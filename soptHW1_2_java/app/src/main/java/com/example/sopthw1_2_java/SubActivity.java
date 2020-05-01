package com.example.sopthw1_2_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_activity);

        Button button;
        button = (Button) findViewById(R.id.button) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);

                String email = edit1.getText().toString();
                String password = edit2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "가입완료를 축하합니다.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
