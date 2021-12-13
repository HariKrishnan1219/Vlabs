package com.example.virtuallab;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = (Button) findViewById(R.id.b01);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://vlab.amrita.edu/index.php?sub=1&brch=281&sim=1508&cnt=4")); startActivity(Getintent);

            }
        });
        b2 = (Button) findViewById(R.id.b);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://vlab.amrita.edu/index.php?sub=1&brch=281&sim=1524&cnt=4")); startActivity(Getintent);

            }
        });
        b3 = (Button) findViewById(R.id.b2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://vlab.amrita.edu/index.php?sub=1&brch=280&sim=1518&cnt=4")); startActivity(Getintent);

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
                        Toast.makeText(Home.this, "Activity closed",Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("No", null).show();
    }
}