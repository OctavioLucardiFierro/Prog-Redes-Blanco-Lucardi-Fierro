package com.example.tpn2login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String contraseña = "TLOU2";
    String enail = "Lucardini@gmail.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent segundo = new Intent(this, ACTIVITI2.class);
        TextView usuario = (TextView) findViewById(R.id.usuario);
        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        TextView contraseñacartel = (TextView) findViewById(R.id.contraseñacartel);
        EditText Contraseña = (EditText) findViewById(R.id.editTextTextPassword);
        Button Login = (Button) findViewById(R.id.button);
        TextView Advertencia = (TextView) findViewById(R.id.textView3);

        String Email2 = (email.getText().toString());
        String contraseña2 = (Contraseña.getText().toString());


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (contraseña2 == contraseña && Email2 == enail)
                {

                    startActivity(segundo);
                }
            }
        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}