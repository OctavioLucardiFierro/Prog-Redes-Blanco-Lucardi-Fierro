package com.example.ejemploapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;

public class Crear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);


        Button Volver = (Button) findViewById(R.id.Volver);
        Button Insertar = (Button) findViewById(R.id.insertar);

        EditText Nombre = (EditText) findViewById(R.id.Nombre);
        EditText Email = (EditText) findViewById(R.id.Email);
        EditText Contraseña = (EditText) findViewById(R.id.Contraseña);
        EditText  FECHA= (EditText) findViewById(R.id.Fecha_y_hora);

        RequestQueue requestqueue;
        Intent primero = new Intent(this, MainActivity.class);

        Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(primero);
            }
        });

        Insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                String Mail;
                String contraseña;
                String Fecha;

                nombre = String.valueOf(Email.getText());
                Mail = String.valueOf(Email.getText());
                contraseña = String.valueOf(Email.getText());
                Fecha = String.valueOf(Email.getText());
            }
        });

    }
}