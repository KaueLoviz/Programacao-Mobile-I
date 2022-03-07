package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SucessoII extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso_ii);
    }

    public void btnMenuIII(View view) {
        Intent gomenuIII= new Intent (SucessoII.this,Menu.class);
        startActivity(gomenuIII);
    }
}
