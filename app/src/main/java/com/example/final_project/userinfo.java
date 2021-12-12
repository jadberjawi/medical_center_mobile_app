package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class userinfo extends AppCompatActivity {
    TextView u,ph,c,add,f,reserv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        u=(TextView)findViewById(R.id.textView11) ;
        ph=(TextView)findViewById(R.id.textView17) ;
        c=(TextView)findViewById(R.id.textView20) ;
        add=(TextView)findViewById(R.id.textView21) ;
        f=(TextView)findViewById(R.id.textView22) ;
        reserv=(TextView)findViewById(R.id.reserv) ;

//        Intent intent = getIntent();
//        String str = intent.getStringExtra("datails");
//        reserv.setText(str);

        getinfo task = new getinfo();
        String link = "http://192.168.0.106/Medical_center/userinfo.php";
        task.execute(link);

    }

    public class getinfo extends AsyncTask<String, Void, String> {

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
                    String user    = "Username: "+jsonobject.getString("username");
                    String phone    ="Phone: "+ jsonobject.getString("phone");
                    String city    = "City: "+jsonobject.getString("city");
                    String address  ="Address: "+ jsonobject.getString("address");
                    String floor    = "Floor: "+jsonobject.getString("Floor");
                    u.setText(user);
                    ph.setText(phone);
                    c.setText(city);
                    add.setText(address);
                    f.setText(floor);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

public void logout(View v){
    logoutt task = new logoutt();
    String link = "http://192.168.0.106/Medical_center/logout.php";
    task.execute(link);


}
    public class logoutt extends AsyncTask<String, Void, String> {

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
                JSONArray jsonarray = new JSONArray("[{"+s+"]");

                for(int i=0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    String strr    = jsonobject.getString("logged_out");
                    if(strr.equalsIgnoreCase("YES")){
                        Intent ii=new Intent(userinfo.this,MainActivity.class);
                        startActivity(ii);
                    }


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}