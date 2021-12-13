package com.example.virtuallab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.content.Intent;

public class Class extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        b1 = (Button) findViewById(R.id.b11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Class.this,SignIn.class);
                startActivity(i);
            }
        });
        b2 = (Button) findViewById(R.id.b12);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Class.this,SignIn.class);
                startActivity(i);
            }
        });
    }
}