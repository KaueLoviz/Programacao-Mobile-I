package com.example.bussolapam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class introduz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduz);
    }

    public void proseguir(View view) {
        Intent goproseguir= new Intent (introduz.this,MainActivity.class);
        startActivity(goproseguir);

    }
}
