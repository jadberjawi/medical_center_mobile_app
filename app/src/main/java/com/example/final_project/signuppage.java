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
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class signuppage extends AppCompatActivity {

    EditText usern, pass, phone, city, address, floor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
        usern = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
        phone = (EditText) findViewById(R.id.editTextTextPersonName7);
        city = (EditText) findViewById(R.id.editTextTextPersonName2);
        address = (EditText) findViewById(R.id.editTextTextPersonName3);
        floor = (EditText) findViewById(R.id.editTextTextPersonName4);

    }

    public void starterpage(View view) {

        Signingup task = new Signingup();
        String link = "http://192.168.43.183/Medical_center/signupApp.php?username="
                + usern.getText().toString() + "&pass=" + pass.getText().toString() + "&phone="
                + Integer.parseInt(phone.getText().toString()) + "&city="
                + city.getText().toString() + "&address=" + address.getText().toString()
                + "&floor=" + Integer.parseInt(floor.getText().toString());

        task.execute(link);

    }

    public class Signingup extends AsyncTask<String, Void, String> {

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
                //JSONObject json = new JSONObject(s);
                JSONArray jsonarray = new JSONArray(s);
//                JSONArray arr1 = new JSONArray("ERROR");

                for (int i = 0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    String access = jsonobject.getString("access");

                    if (access.equalsIgnoreCase("YES")) {
                        Intent intent = new Intent(signuppage.this, starterpage.class);
                        intent.putExtra("logged_user", usern.getText().toString());

                        startActivity(intent);
                    } else {
                        Toast.makeText(signuppage.this, access.toString(), Toast.LENGTH_SHORT).show();
                    }
                }

                } catch(JSONException jsonException){
                    jsonException.printStackTrace();
                }
            }

        }
    }

