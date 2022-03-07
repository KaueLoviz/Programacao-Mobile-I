package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Depositar extends AppCompatActivity {

    EditText valorzinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depositar);
        valorzinho = findViewById(R.id.valorzinho);
    }

    public void btnVoltarII(View view) {
        Intent gomenu= new Intent (Depositar.this,Menu.class);
        startActivity(gomenu);
    }

    public void btnConluir(View view) {
        Intent gosucesso= new Intent (Depositar.this,Menu.class);
        startActivity(gosucesso);
        Menu.continha.setSaldo(Double.parseDouble(valorzinho.getText().toString()));
        Toast.makeText(this, "Seu saldo atual é : "+Menu.continha.getSaldo(), Toast.LENGTH_SHORT).show();

    }
}
