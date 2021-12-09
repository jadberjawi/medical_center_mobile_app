package com.example.final_project;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
    String[] programDescription= {"12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021",
            "12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021",
            "12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021",
            "12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021",
            "12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021",
            "12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021","12:00 am-12,dec,2021"
    };
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.hnet_com_image,R.drawable.hnet_com_image,R.drawable.hnet_com_image, R.drawable.hnet_com_image,
            R.drawable.hnet_com_image__1_,R.drawable.hnet_com_image__1_,R.drawable.hnet_com_image__1_, R.drawable.hnet_com_image__1_,
            R.drawable.hnet_com_image__2_,R.drawable.hnet_com_image__2_,R.drawable.hnet_com_image__2_, R.drawable.hnet_com_image__2_,
            R.drawable.testing,R.drawable.testing,R.drawable.testing,R.drawable.testing,
            R.drawable.hnet_com_image3,R.drawable.hnet_com_image3,R.drawable.hnet_com_image3, R.drawable.hnet_com_image3,
            R.drawable.hnet_com_imageecho, R.drawable.hnet_com_imageecho,R.drawable.hnet_com_imageecho,R.drawable.hnet_com_imageecho};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);
        // Get the handle for ListView
        lvProgram = findViewById(R.id.lvProgram);



//        DownloadName task = new DownloadName();
//        String link = "http://192.168.0.103/Medical_center/getresrvations.php";
//
//
//        task.execute(link);



        // Specify an adapter and pass context along with all the arrays in constructor
        ProgramAdapter programAdapter = new ProgramAdapter(reservations.this, programName, programImages, programDescription);
        //ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription, urls);

        // Set the adapter with the ListView
        lvProgram.setAdapter(programAdapter);
    }


//
//
//public class DownloadName extends AsyncTask<String, Void, String> {
//
//    protected String doInBackground(String... urls) {
//        String result = "";
//        URL url;
//        HttpURLConnection urlConnection;
//        try {
//            url = new URL(urls[0]);
//            urlConnection = (HttpURLConnection) url.openConnection();
//            InputStream in = urlConnection.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//            int data = reader.read();
//            while (data != -1) {
//
//                result = result + reader.readLine();
//                data = reader.read();
//            }
//            //Toast.makeText(MainActivity.this,"reached 1", Toast.LENGTH_LONG).show();
//
//            return result;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    protected void onPostExecute(String s) {
//        super.onPostExecute(s);
//
//        try {
//            JSONArray jsonarray = new JSONArray(s);
//
//            for(int i=0; i < jsonarray.length(); i++) {
//                JSONObject jsonobject = jsonarray.getJSONObject(i);
//                String access    = jsonobject.getString("access");
//                if(access.equalsIgnoreCase("YES")){
//                    Toast.makeText(reservations.this,access.toString(), Toast.LENGTH_SHORT).show();
//
//                }
//                else{
//                    Toast.makeText(reservations.this,access.toString(), Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
}