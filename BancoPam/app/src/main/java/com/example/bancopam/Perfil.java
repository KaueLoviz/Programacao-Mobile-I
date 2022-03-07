package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void btnVoltarCadastroP(View view) {
        Intent gologin= new Intent (Perfil.this,Menu.class);
        startActivity(gologin);
    }

    public void btnhomeP(View view) {
        Intent gohomeofice= new Intent (Perfil.this,Menu.class);
        startActivity(gohomeofice);
    }

    public void btnhomePerfilvoltar(View view) {
        Intent gohomeperfilvoltis= new Intent (Perfil.this,Perfil.class);
        startActivity(gohomeperfilvoltis);
    }

    public void btnhomeConfigir(View view) {

        Intent gohomeperfilvoltis= new Intent (Perfil.this,Configuracao.class);
        startActivity(gohomeperfilvoltis);

    }
}
