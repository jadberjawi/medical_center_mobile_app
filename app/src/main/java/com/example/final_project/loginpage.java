package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class loginpage extends AppCompatActivity {
    Button b;
    EditText usern,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        b = (Button) findViewById(R.id.button2);
        usern=(EditText) findViewById(R.id.editTextTextPersonName7);
        pass=(EditText) findViewById(R.id.editTextTextPassword);
    }

    public void starterpage(View view) {

        DownloadName task = new DownloadName();
        String link = "http://192.168.0.103/Medical_center/login.php?username="
                +usern.getText().toString()+"&pass="+pass.getText().toString();


        task.execute(link);

    }

    public class DownloadName extends AsyncTask<String, Void, String> {

        protected String doInBackground(String... urls) {
            String result = "";
            URL url;
            HttpURLConnection urlConnection;
            try {
                url = new URL(urls[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                int data = reader.read();
                while (data != -1) {

                    result = result + reader.readLine();
                    data = reader.read();
                }
                //Toast.makeText(MainActivity.this,"reached 1", Toast.LENGTH_LONG).show();

                return result;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            try {
                JSONArray jsonarray = new JSONArray(s);

                for(int i=0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    String access    = jsonobject.getString("access");
                    if(access.equalsIgnoreCase("YES")){
                        Intent intent = new Intent(loginpage.this, starterpage.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(loginpage.this,access.toString(), Toast.LENGTH_SHORT).show();
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}