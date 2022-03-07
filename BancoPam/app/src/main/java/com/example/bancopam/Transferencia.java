package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Transferencia extends AppCompatActivity {

    EditText valorzinhotranf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferencia);
        valorzinhotranf = findViewById(R.id.valorzinhotransf);
    }
    public void btnvoltarIIIIII(View view) {
        Intent gomenu= new Intent (Transferencia.this,Menu.class);
        startActivity(gomenu);
    }

    public void btnConluir(View view) {
        Intent gosucesso= new Intent (Transferencia.this,Menu.class);
        startActivity(gosucesso);
        Menu.continha.setSaldo(Menu.continha.getSaldo() - Double.parseDouble(valorzinhotranf.getText().toString()));
        Toast.makeText(this, "Sua transferência foi de : "+valorzinhotranf.getText(), Toast.LENGTH_SHORT).show();

    }
}
