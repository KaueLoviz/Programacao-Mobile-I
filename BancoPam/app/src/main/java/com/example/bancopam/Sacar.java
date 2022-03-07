package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sacar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sacar);
    }

    public void btnVoltarII(View view) {
    }

    public void btnConluirII(View view) {
        Intent gosucessoII= new Intent (Sacar.this,SucessoII.class);
        startActivity(gosucessoII);
    }
}
