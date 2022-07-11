package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int resultado2;
int primero2;
int segundo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hacer esta estructura por cada elemento agregado
        TextView Texto = (TextView) findViewById(R.id.textView);
        EditText saludo = (EditText) findViewById(R.id.pepe);
        Button Botoncito = (Button) findViewById(R.id.button);

        Toast.makeText (this, "com", Toast. LENGTH_LONG).show();
        EditText primero = (EditText) findViewById(R.id.primern);
        EditText segundo = (EditText) findViewById(R.id.primern2);
        EditText resultado = (EditText) findViewById(R.id.primern3);
        Button Sumar = (Button) findViewById(R.id.button2);


        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                primero2 = Integer.parseInt(primero.getText().toString());
                segundo2 = Integer.parseInt(segundo.getText().toString());

                resultado2 = primero2+segundo2;
                resultado.setText(toString(resultado2));
            }
        });

        Texto.setText("hola");
        Botoncito.setText("salir");
        Botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saludo.setText("El primer REMAKE del primer Remmaster del primer The Last of Us");
            }
        });



    }

}