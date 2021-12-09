package com.example.final_project;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class reservations extends AppCompatActivity {
    /*
    Image Credit:
    Images in this tutorial are originally made by Konpa (under MIT License)
    Link for download: https://devicons.github.io/devicon/
    License: https://github.com/devicons/devicon/blob/master/LICENSE
     */

    // Create a ListView object reference
    ListView lvProgram;
    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programName = {"pcr","pcr","pcr","pcr",
            "blood test","blood test","blood test","blood test",
            "mammography", "mammography","mammography","mammography",
            "full checkup ", "full checkup ","full checkup ","full checkup ",
            "lipid panel", "lipid panel","lipid panel","lipid panel",
            "echography","echography","echography","echography"};
    String[] programDescription ;
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.coronavirus,R.drawable.coronavirus,R.drawable.coronavirus,R.drawable.coronavirus,
            R.drawable.blood_test,R.drawable.blood_test,R.drawable.blood_test,R.drawable.blood_test,
            R.drawable.mammography,R.drawable.mammography,R.drawable.mammography,R.drawable.mammography,
            R.drawable.testing,R.drawable.testing,R.drawable.testing,R.drawable.testing,
            R.drawable.blood_cell,R.drawable.blood_cell,R.drawable.blood_cell,R.drawable.blood_cell,
            R.drawable.ultrasonography,R.drawable.ultrasonography,R.drawable.ultrasonography,R.drawable.ultrasonography};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the handle for ListView
        lvProgram = findViewById(R.id.lvProgram);



























        // Specify an adapter and pass context along with all the arrays in constructor
        ProgramAdapter programAdapter = new ProgramAdapter(reservations.this, programName, programImages, programDescription);
        //ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription, urls);

        // Set the adapter with the ListView
        lvProgram.setAdapter(programAdapter);
    }
}