package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Configuracao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);
    }

    public void btnSair(View view) {
        Intent gosair= new Intent (Configuracao.this,login.class);
        startActivity(gosair);
    }

    public void btnVoltarsair(View view) {
        Intent gosairvoltis= new Intent (Configuracao.this,login.class);
        startActivity(gosairvoltis);
    }

    public void btnSairTrocar(View view) {
        Intent gosairtrocar= new Intent (Configuracao.this,login.class);
        startActivity(gosairtrocar);
    }
}
