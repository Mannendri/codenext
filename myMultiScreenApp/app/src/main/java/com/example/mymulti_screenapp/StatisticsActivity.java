package com.example.mymulti_screenapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StatisticsActivity extends AppCompatActivity {

    TextView numberInfected;
    TextView numberDeaths;
    TextView numberRecovered;
    private final String URL = "https://api.thevirustracker.com/free-api?global=stats";
    private RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        numberInfected = findViewById(R.id.numberInfected);
        numberDeaths = findViewById(R.id.numberDeaths);
        numberRecovered = findViewById(R.id.numberRecovered);

        queue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject obj= new JSONObject(response);
                    JSONArray info = obj.getJSONArray("results");

                    String infectedData = info.getJSONObject(0).getString("total_cases");
                    numberInfected.setText(infectedData);
                    String deathData = info.getJSONObject(0).getString("total_deaths");
                    numberDeaths.setText(deathData);
                    String recoveredData = info.getJSONObject(0).getString("total_recovered");
                    numberRecovered.setText(recoveredData);
                }
                catch(JSONException e){
                    Toast message = Toast.makeText(getApplicationContext(),"Response failed!",Toast.LENGTH_SHORT);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);
    }
}
