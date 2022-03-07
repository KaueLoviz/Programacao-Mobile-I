package com.example.odontologia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void btnAgendar(View view) {
        Intent goagendar= new Intent (home.this,Agendamento.class);
        startActivity(goagendar);

    }

    public void btnAtendimentos(View view) {
        Intent goconsulta= new Intent (home.this,Consultas.class);
        startActivity(goconsulta);

    }

    public void btnValorTotal(View view) {
        Intent goganho= new Intent (home.this,GanhoMensal.class);
        startActivity(goganho);


    }
}
