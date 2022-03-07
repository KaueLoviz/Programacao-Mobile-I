package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Boleto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boleto);
    }

    public void btnVoltarsairboleto(View view) {
        Intent gosairboleto= new Intent (Boleto.this,Menu.class);
        startActivity(gosairboleto);
    }
}
