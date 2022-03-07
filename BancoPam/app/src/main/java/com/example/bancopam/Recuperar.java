package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recuperar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);
    }

    public void btnVoltarCadastroIII(View view) {
        Intent gologin= new Intent (Recuperar.this,login.class);
        startActivity(gologin);
    }
    public void btngo(View view) {
        Intent gogo= new Intent (Recuperar.this,CodigoRecuperar.class);
        startActivity(gogo);
    }
}
