package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class qrcode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode);
    }

    public void btnVoltarsairqrcode(View view) {
        Intent gosairqrcode= new Intent (qrcode.this,Menu.class);
        startActivity(gosairqrcode);
    }
}
