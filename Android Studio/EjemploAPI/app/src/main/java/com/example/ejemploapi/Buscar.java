package com.example.ejemploapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Buscar extends AppCompatActivity {
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private String url = "http://192.168.137.1/androidusers/buscar.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        Intent primero01 = new Intent(this, MainActivity.class);


        EditText MostrarNombre = (EditText) findViewById(R.id.MostrarNombre);

        EditText MostrarMail = (EditText) findViewById(R.id.MostrarMail);

        EditText MostrarFechaCreacion = (EditText) findViewById(R.id.MostrarFecha);
        EditText BuscarID = (EditText) findViewById(R.id.MostrarNombre);
        Button Buscar = (Button) findViewById(R.id.Busco);
        Button Regresar = (Button) findViewById(R.id.Regresar);

            Buscar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sendAndRequestResponse();
                }
            });

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(primero01);
            }
        });

    }
    private void sendAndRequestResponse(){
        mRequestQueue = Volley.newRequestQueue(this);

        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("HttpClient", "succes!response: " + response.toString());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG,"ERROR: " + error.toString());
            }
        })
        {
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String,String>();
                params.put ("id","25");

                return params;
            }
            @Override
            public Map<String,String> getHeaders() throws AuthFailureError{
                Map<String,String> params = new HashMap<String,String>();
                params.put("Content-Type","application/x-www-form-urlencoded");
                return params;
            }
        };

        mRequestQueue.add(mStringRequest);
    }
}