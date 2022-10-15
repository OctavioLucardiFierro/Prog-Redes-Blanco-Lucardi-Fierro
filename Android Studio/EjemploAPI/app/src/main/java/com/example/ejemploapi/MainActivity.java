package com.example.ejemploapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent tercero = new Intent(this, Buscar.class);
        Intent segundo = new Intent(this, Crear.class);
        Intent muestreme = new Intent (this, Mostrar.class);


        Button Mostrar = (Button) findViewById(R.id.Mostrar);
        Button Buscar = (Button) findViewById(R.id.buttonbuscar);
        Button BuscarCrear = (Button) findViewById(R.id.buttoncrear);


        Mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(muestreme);
            }
        });

        Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tercero);
            }
        });

        BuscarCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(segundo);
            }
        });
    }
}