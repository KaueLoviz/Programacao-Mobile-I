package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CodigoRecuperar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_recuperar);
    }

    public void btnconfirmar(View view) {
        Intent gogo= new Intent (CodigoRecuperar.this,login.class);
        startActivity(gogo);
    }
}
