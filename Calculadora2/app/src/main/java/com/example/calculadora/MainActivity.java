package com.example.calculadora;

import androidx.appcompat.app.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.*;
import android.widget.Toast;

import com.example.calculadora.R;

public class MainActivity extends AppCompatActivity {
    private EditText txtvalor1;
    private EditText txtvalor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvalor1=(EditText)findViewById(R.id.valor1);
        txtvalor2=(EditText)findViewById(R.id.valor2);



    }
    public void Somar(View somar){
        Double numero1 = Double.parseDouble(txtvalor1.getText().toString());
        Double numero2 = Double.parseDouble(txtvalor2.getText().toString());
        Double resultado;
        resultado = numero1 + numero2;
        Toast.makeText(this,String.valueOf(resultado),Toast.LENGTH_LONG).show();


    }
    public void Subtrair(View subtrair) {
        Double numero1 = Double.parseDouble(txtvalor1.getText().toString());
        Double numero2 = Double.parseDouble(txtvalor2.getText().toString());
        Double resultado;
        resultado = numero1 - numero2;
        Toast.makeText(this,String.valueOf(resultado),Toast.LENGTH_LONG).show();



    }
    public void Vezes(View vezes){
        Double numero1 = Double.parseDouble(txtvalor1.getText().toString());
        Double numero2 = Double.parseDouble(txtvalor2.getText().toString());
        Double resultado;
        resultado = numero1 * numero2;
        Toast.makeText(this,String.valueOf(resultado),Toast.LENGTH_LONG).show();

    }
    public void Dividir(View dividir) {
        Double numero1 = Double.parseDouble(txtvalor1.getText().toString());
        Double numero2 = Double.parseDouble(txtvalor2.getText().toString());
        Double resultado;
        resultado = numero1 / numero2;
        Toast.makeText(this,String.valueOf(resultado),Toast.LENGTH_LONG).show();

    }

}
