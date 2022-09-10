package com.example.ejemploapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Buscar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

        Intent primero01 = new Intent(this, MainActivity.class);

        TextView cartelBuscar  = (TextView) findViewById(R.id.cartelbuscar);
        Button Buscar = (Button) findViewById(R.id.Busco);
        Button Regresar = (Button) findViewById(R.id.Regresar);

        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(primero01);
            }
        });

    }
}