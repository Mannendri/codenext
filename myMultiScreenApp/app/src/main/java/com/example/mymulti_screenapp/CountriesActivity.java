package com.example.mymulti_screenapp;

import android.os.Bundle;
import android.widget.ListView;
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

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity {
    ArrayList<CountryItem> countries;
    private final String URL = "https://api.covid19api.com/summary";
    private RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        countries = new ArrayList<>();
        //API STUFF
        queue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject obj= new JSONObject(response);
                    JSONArray countriesAPI = obj.getJSONArray("Countries");
                    for (int i=0;i<countriesAPI.length();i++){
                        JSONObject country = countriesAPI.getJSONObject(i);
                        String name = country.getString("Country");
                        int infected = Integer.parseInt(country.getString("TotalConfirmed"));
                        int deaths = Integer.parseInt(country.getString("TotalDeaths"));
                        int recovered = Integer.parseInt(country.getString("TotalRecovered"));
                        countries.add(new CountryItem(name,infected,deaths,recovered));

                    }
                }
                catch(JSONException e){
                    Toast message = Toast.makeText(getApplicationContext(),"Response failed!",Toast.LENGTH_SHORT);
                    message.show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);

        //Adapter STUFF
        ListView countryListView = findViewById(R.id.countryListView);
        CountryAdapter countryAdapter = new CountryAdapter(this, countries);
        countryListView.setAdapter(countryAdapter);

    }
}
