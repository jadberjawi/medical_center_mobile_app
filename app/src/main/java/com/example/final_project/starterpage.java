package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class starterpage extends AppCompatActivity {
String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starterpage);
        Intent intent = getIntent();
        str = intent.getStringExtra("logged_user");
    }
    public void pcr(View view) {
        Intent i = new Intent(starterpage.this, pcr.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void lipid(View view) {
        Intent i = new Intent(starterpage.this, lipid.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void bt(View view) {
        Intent i = new Intent(starterpage.this, bt.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void fc(View view) {
        Intent i = new Intent(starterpage.this, fc.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void mammo(View view) {
        Intent i = new Intent(starterpage.this, mammo.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void echo(View view) {
        Intent i = new Intent(starterpage.this, echo.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }
    public void userinfo(View view) {
        Intent i = new Intent(starterpage.this, userinfo.class);
        i.putExtra("logged_user", str);

        startActivity(i);
    }

}