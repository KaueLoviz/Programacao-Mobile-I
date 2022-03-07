package com.example.spentonhand;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Definir extends AppCompatActivity {

    private EditText meta;
    private TextView tvtotal;
    private MetaDao metaDao;
    // true -> soma
    // false -> subtração

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definir);
        meta = findViewById(R.id.meta);
        tvtotal = findViewById(R.id.tvtotal);
        metaDao = new MetaDao(this);
        if(metaDao.metaCount() > 0) tvtotal.setText(String.format("R$%.2f", metaDao.selectMeta()));
        else{
            Meta meta = new Meta();
            meta.setMeta(0);
            metaDao.inserir(meta);
        }
    }

    public void btnsalvardefinir(View view) {

        Intent gomenuI = new Intent(this, MainActivity.class);
        startActivity(gomenuI);

    }


    public void btnadicionar(View view) {
        double atual = Double.parseDouble(tvtotal.getText().toString().substring(2));
        tvtotal.setText("R$" + (atual + Double.parseDouble(meta.getText().toString())));
        meta.setText(null);
    }

    public void btnsubtrair(View view) {
        double atual = Double.parseDouble(tvtotal.getText().toString().substring(2));
        tvtotal.setText("R$" + (atual - Double.parseDouble(meta.getText().toString())));
        meta.setText(null);
    }

    public void btnvoltarmenudefinir(View view) {
        Intent gomenudefinir = new Intent(this, MainActivity.class);
        startActivity(gomenudefinir);
    }
}