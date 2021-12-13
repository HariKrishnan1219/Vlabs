package com.example.virtuallab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.content.DialogInterface;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button b1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.getStarted);
        b1.setBackgroundColor(0xFF024941);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });
    }
        @Override
        public void onBackPressed() {
            AlertDialog builder = new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Closing Activity").setMessage("Are you sure you want to close this activity?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            Toast.makeText(MainActivity.this, "Activity closed",Toast.LENGTH_SHORT).show();
                        }
                    }).setNegativeButton("No", null).show();
    }
}