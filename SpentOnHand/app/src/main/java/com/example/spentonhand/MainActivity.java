package com.example.spentonhand;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btndefinir(View view) {
        Intent godefinir = new Intent(this,Definir.class);
        startActivity(godefinir);
    }

    public void btnadicionar(View view) {
        Intent goadicionar = new Intent(this,AdicionarGastos.class);
        startActivity(goadicionar);
    }

    public void btnmensal(View view) {
        Intent gomensal = new Intent(this,GastoMensal.class);
        startActivity(gomensal);
    }

    public void btnexibirgastos(View view) {
        Intent goexibir = new Intent(this,lista.class);
        startActivity(goexibir);
    }

}