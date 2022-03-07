package com.example.odontologia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.ArrayList;
import java.util.Calendar;

public class Agendamento extends AppCompatActivity {
    EditText nome,hora,data,termino;
    TextView valor;
    RadioButton limpeza,manutencao,clareamento;
    double valorConsulta = 0;
    public static ArrayList<Pacientes>pacientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);
        nome = findViewById(R.id.nome);
        hora = findViewById(R.id.hora);
        termino = findViewById(R.id.termino);
        valor = findViewById(R.id.valor);
        data = findViewById(R.id.data);

        limpeza = findViewById(R.id.limpeza);
        manutencao = findViewById(R.id.manutencao);
        clareamento = findViewById(R.id.clareamento);

        if (Verificado.isPrimeiravez()){
            pacientes = new ArrayList<>();
            Verificado.setPrimeiravez(false);
        }
    }

    public void btnconfirmar(View view) {

        if(limpeza.isChecked()){
            this.valorConsulta = 50;
        }else if(manutencao.isChecked()){
            this.valorConsulta = 100;
        }else if(clareamento.isChecked()){
            this.valorConsulta = 150;
        }


        String nominho = nome.getText().toString();
        String horinha = hora.getText().toString();
        String datinha = data.getText().toString();
        int termininho = Integer.parseInt(termino.getText().toString());
        pacientes.add(new Pacientes(nominho,horinha,datinha,termininho,this.valorConsulta));

        Intent goconfirma = new Intent (Agendamento.this,home.class);
        startActivity(goconfirma);

    }

    public void btnVoltarAgendamento(View view) {
        Intent govoltaragendamento = new Intent (Agendamento.this,home.class);
        startActivity(govoltaragendamento);

    }
}
