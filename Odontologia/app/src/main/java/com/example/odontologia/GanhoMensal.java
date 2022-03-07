package com.example.odontologia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GanhoMensal extends AppCompatActivity {
    ListView listona;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganho_mensal);
        listona = findViewById(R.id.listona);
        resultado = findViewById(R.id.resultado);
        ArrayList<String> lista;
        lista = new ArrayList<>();
        double result = 0;
        for (int i = 0; i < Agendamento.pacientes.size();i++){
            lista.add(Agendamento.pacientes.get(i).toValor());
            result += Agendamento.pacientes.get(i).getValor();

        }
        resultado.setText("Ganho Mensal: "+result);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
        listona.setAdapter(arrayAdapter);
    }


    public void btnVoltarGanhoMensal(View view) {
        Intent govoltarganhomensal= new Intent (GanhoMensal.this,home.class);
        startActivity(govoltarganhomensal);
    }
}
