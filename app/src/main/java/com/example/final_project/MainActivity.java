package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button2);

    }

    public void login(View view) {
        Intent i = new Intent(MainActivity.this, loginpage.class);
        startActivity(i);
    }

    public void Signup(View view) {
        Intent i = new Intent(MainActivity.this, signuppage.class);
        startActivity(i);
    }
}