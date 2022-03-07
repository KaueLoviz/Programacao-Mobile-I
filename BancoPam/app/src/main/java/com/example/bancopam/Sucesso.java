package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sucesso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucesso);
    }

    public void btnMenuII(View view) {
        Intent gomenuII= new Intent (Sucesso.this,Menu.class);
        startActivity(gomenuII);
    }
}
