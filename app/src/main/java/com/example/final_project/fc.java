package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fc extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc);
        Intent intent = getIntent();
        str = intent.getStringExtra("logged_user");
    }public void reserv(View view){
        Intent i=new Intent(fc.this,reservations.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
}