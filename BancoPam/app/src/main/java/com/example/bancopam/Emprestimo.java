package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Emprestimo extends AppCompatActivity {
    EditText valorzinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emprestimo);
        valorzinho = findViewById(R.id.valorzinhoempy);
    }

    public void btnVoltarIIII(View view) {
        Intent gomenu= new Intent (Emprestimo.this,Menu.class);
        startActivity(gomenu);
    }
    public void btnConluir(View view) {
        Intent gosucesso= new Intent (Emprestimo.this,Menu.class);
        startActivity(gosucesso);
        Menu.continha.setSaldo(Double.parseDouble(valorzinho.getText().toString()));
        Toast.makeText(this, "Seu empréstimo foi de : "+valorzinho.getText(), Toast.LENGTH_SHORT).show();

    }
}
