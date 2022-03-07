package com.vitoria.drjoao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class AgendarActivity extends AppCompatActivity {
    Button btnDataAgenda, btnHoraAgenda;
    EditText etData, etHora,etnomePaciente;

    RadioGroup radioGroup;
    RadioButton eletro50, eco100, teste150;
     private Double valorConsulta;

    private int dia, mes, ano, hora, min;

    public static ArrayList<Paciente>paciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar);

        btnDataAgenda = (Button) findViewById(R.id.btnDataAgenda);
        btnHoraAgenda = (Button) findViewById(R.id.btnHoraAgenda);

        etData = (EditText) findViewById(R.id.etData);
        etHora = (EditText) findViewById(R.id.etHora);
        etnomePaciente = (EditText) findViewById(R.id.etNomePaciente);

        eletro50 = (RadioButton) findViewById(R.id.eletro50);
        eco100 = (RadioButton) findViewById(R.id.eco100);
        teste150 = (RadioButton) findViewById(R.id.teste150);


        if (Verificado.isPrimeiravez()){
            paciente = new ArrayList<>();
            Verificado.setPrimeiravez(false);


        }


        //verificando vez

    }
    public void DataAgenda(View view) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    etData.setText(dayOfMonth + "/"+(month + 1) + "/" + year);
                }
            }
                    , dia, mes, ano);
            datePickerDialog.show();

    }

    public void HoraAgenda(View view) {
            final Calendar c = Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            min = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    etHora.setText(hourOfDay+":"+min);
                }
            },hora,min, false);
            timePickerDialog.show();

    }

    public void Agendar(View view) {
        if(eletro50.isChecked()){
            valorConsulta = 50.0;
        }else if(eco100.isChecked()){
            valorConsulta = 100.0;
        }else if(teste150.isChecked()){
            valorConsulta = 150.0;
        }

        String nome = etnomePaciente.getText().toString();
        int hora = Integer.parseInt(etHora.getText().toString());
        int data = Integer.parseInt(etData.getText().toString());
        double valorConsul = Double.parseDouble(valorConsulta.toString());//aqui
        paciente.add(new Paciente(valorConsul, nome, data, hora));

        Intent intent = new Intent (AgendarActivity.this, MainActivity.class);
        startActivity(intent);

    }


    public void VoltarAgendar(View view) {
        Intent intent = new Intent (this,MainActivity.class);
        startActivity(intent);
    }
}
