package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class starterpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starterpage);
    }
    public void pcr(View view) {
        Intent i = new Intent(starterpage.this, pcr.class);
        startActivity(i);
    }
    public void lipid(View view) {
        Intent i = new Intent(starterpage.this, lipid.class);
        startActivity(i);
    }
    public void bt(View view) {
        Intent i = new Intent(starterpage.this, bt.class);
        startActivity(i);
    }
    public void fc(View view) {
        Intent i = new Intent(starterpage.this, fc.class);
        startActivity(i);
    }
    public void mammo(View view) {
        Intent i = new Intent(starterpage.this, mammo.class);
        startActivity(i);
    }
    public void echo(View view) {
        Intent i = new Intent(starterpage.this, echo.class);
        startActivity(i);
    }
    public void userinfo(View view) {
        Intent i = new Intent(starterpage.this, userinfo.class);
        startActivity(i);
    }

}