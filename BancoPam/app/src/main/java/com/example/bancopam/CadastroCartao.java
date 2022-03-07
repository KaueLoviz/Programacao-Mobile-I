package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CadastroCartao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cartao);
    }

    public void btnVoltarCadastroII(View view) {
        Intent govoltis= new Intent (CadastroCartao.this,Menu.class);
        startActivity(govoltis);

    }

    public void btnconclusao(View view) {
        Intent gocadastrarcartao= new Intent (CadastroCartao.this,Menu.class);
        startActivity(gocadastrarcartao);
    }
}
