package com.example.virtuallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b1 = (Button) findViewById(R.id.signUp);
        EditText s1,s2;
        s1 = (EditText)findViewById(R.id.email1);
        s2 = (EditText) findViewById(R.id.pwd1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Class.class);
                startActivity(i);
            }
        });
        b2 = (Button) findViewById(R.id.login);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s1.getText().length() == 0) {
                    s1.setError("Enter a email Address");
                }
                else if(s2.getText().length() == 0 )
                {
                    s2.setError("Enter a password");
                }
                else if(s2.getText().length() <8)
                {
                    s2.setError("Enter more than 8 characters");
                }
                else
                {
                    Intent i = new Intent(Login.this, Home.class);
                    startActivity(i);
                }
            }
        });
    }
}