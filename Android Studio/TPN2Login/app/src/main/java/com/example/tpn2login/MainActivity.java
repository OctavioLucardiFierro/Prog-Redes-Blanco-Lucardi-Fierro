package com.example.tpn2login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String contraseña = "TLOU2";
    private String enail = "Lucardini@gmail.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent tercero = new Intent(this, Buscar.class);
        Intent segundo = new Intent(this, ACTIVITI2.class);

        TextView usuario = (TextView) findViewById(R.id.usuario);
        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        TextView contraseñacartel = (TextView) findViewById(R.id.contraseñacartel);
        EditText Contraseña = (EditText) findViewById(R.id.editTextTextPassword);
        Button Login = (Button) findViewById(R.id.button);
        Button Buscar = (Button) findViewById(R.id.buscar);
        TextView Advertencia = (TextView) findViewById(R.id.textView3);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("HIGH GRAUND", "i HAVE");
                if ((Contraseña.getText().toString()).equals(contraseña)  && (email.getText().toString()).equals(enail))
                {
                    Log.d("", "Estoy dentro");
                    startActivity(segundo);
                }
            }
        });

        Buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tercero);
            }
        });



    }



}