package com.vitoria.drjoao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Agendar(View view) {
        Intent intent = new Intent(this, AgendarActivity.class);
        startActivity(intent);
    }

    public void Consultas(View view) {
        Intent intent = new Intent (this, ConsultasActivity.class);
        startActivity(intent);
    }

    public void GanhoMensal(View view) {
        Intent intent = new Intent(this, ganhoMensalActivity.class);
        startActivity(intent);
    }
}
