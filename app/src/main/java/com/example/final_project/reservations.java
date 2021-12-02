package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.lights.LightsManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class reservations extends AppCompatActivity {
ListView l;
List list=new ArrayList();
ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);
        l=(ListView) findViewById(R.id.list);
        list.add("--PCR--");
        list.add("(12, dec 21)8:00 am");
        list.add("(11, dec 21)12:00 pm");
        list.add("(10, dec 21)9:00 am");

        list.add("--Full Checkups--");
        list.add("(01, jan 21)3:00 pm");
        list.add("(21, dec 21)11:00 am");
        list.add("(12, mar 21)8:00 am");

        list.add("--Blood type tests--");
        list.add("(03, nov 21)9:00 am");
        list.add("(11, nov 21)4:00 pm");
        list.add("(24, jul 21)1:00 pm");

        list.add("--Lipid Panel--");
        list.add("(09, dec 21)9:00 am");
        list.add("(17, dec 21)10:00 am");
        list.add("(05, dec 21)3:00 am");

        list.add("--Mammography--");
        list.add("(12, dec 21)8:00 am");
        list.add("(10, nov 21)6:00 pm");
        list.add("(10, nov 21)5:30 pm");

        list.add("--Echocardiography--");
        list.add("(01, dec 21)8:00 am");
        list.add("(08, aug 21)3:00 pm");
        list.add("(11, jun 21)7:00 am");
adapter =new ArrayAdapter(reservations.this, android.R.layout.simple_list_item_1,list);
l.setAdapter(adapter);
    }



}