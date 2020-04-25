package com.example.apidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView idTextView;
    TextView infoTextView;
    Button nextBtn;
    private static final String URL = "https://cat-fact.herokuapp.com/Facts";
    private RequestQueue queue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idTextView = findViewById(R.id.idTextView);
        infoTextView = findViewById(R.id.infoTextView);
        nextBtn = findViewById(R.id.nextBtn);

    }

    public void nextData(View view) {
        queue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONObject obj= new JSONObject(response);
                    JSONArray info = obj.getJSONArray("all");
                    String catInfo = info.getJSONObject(0).getString("text");
                    String catID = info.getJSONObject(0).getString("_id");
                    idTextView.setText(catID);
                    infoTextView.setText(catInfo);
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
