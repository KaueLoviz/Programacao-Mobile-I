package com.example.odontologia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Consultas extends AppCompatActivity {
    ListView listinha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);
        listinha = findViewById(R.id.listinha);
        ArrayList<String>lista;
        lista = new ArrayList<>();
        for (int i = 0; i < Agendamento.pacientes.size();i++){
            lista.add(Agendamento.pacientes.get(i).toString());

        }
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        listinha.setAdapter(arrayAdapter);
    }

    public void btnVoltarConsultas(View view) {
        Intent govoltarconsultas= new Intent (Consultas.this,home.class);
        startActivity(govoltarconsultas);

    }
}
