package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginpage extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        b = (Button) findViewById(R.id.button2);
    }
    public void starterpage(View view) {
        Intent i = new Intent(loginpage.this, starterpage.class);
        startActivity(i);
    }
}