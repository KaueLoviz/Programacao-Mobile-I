package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NovoCadstro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_cadstro);
    }

    public void btnCadastrar(View view) {
        Intent gologin= new Intent (NovoCadstro.this,login.class);
        startActivity(gologin);
    }

    public void btnVoltarCadastro(View view) {
        Intent gologin= new Intent (NovoCadstro.this,login.class);
        startActivity(gologin);
    }
}
