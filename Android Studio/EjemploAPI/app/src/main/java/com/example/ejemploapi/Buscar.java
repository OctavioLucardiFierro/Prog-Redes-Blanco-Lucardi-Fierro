package com.example.ejemploapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Buscar extends AppCompatActivity {
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;

    private String url = "https://javierblanco.com.ar/androidusers/buscar.php"; //192.168.137.1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        Intent primero01 = new Intent(this, MainActivity.class);


        EditText MostrarNombre = (EditText) findViewById(R.id.MostrarNombre);

        EditText id_inser = (EditText) findViewById(R.id.iNSERTid);

        EditText MostrarMail = (EditText) findViewById(R.id.MostrarMail);
        EditText MostrarFechaCreacion = (EditText) findViewById(R.id.MostrarFecha);
        EditText Mostrarnombre = (EditText) findViewById(R.id.MostrarNombre);
        Button BuscarButon = (Button) findViewById(R.id.Busco);
        Button Regresar = (Button) findViewById(R.id.Regresar);

        BuscarButon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sendAndRequestResponse();
                }
            });

        //api collection github

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(primero01);
            }
        });

    }
    private void sendAndRequestResponse(){
        mRequestQueue = Volley.newRequestQueue(this);
        Toast.makeText(getApplicationContext(), "manda",Toast.LENGTH_LONG).show();
        mStringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //Toast.makeText(getApplicationContext(), "Entre al onResponse",Toast.LENGTH_LONG).show();
                Log.e("HttpClient", "succes!response: " + response.toString());
                Toast.makeText(getApplicationContext(), "Response: " + response.toString(),Toast.LENGTH_LONG).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("ERRORASO","ERROR: " + error.toString());
            }
        })
        {
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String,String>();
                EditText id_inser = (EditText) findViewById(R.id.iNSERTid);
                params.put ("id", id_inser.getText().toString());
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