package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    TextView nomeusermenu;

    public static Conta continha = new Conta();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        nomeusermenu = findViewById(R.id.usuariomenu);
        Bundle extra = getIntent().getExtras();
        if (extra != null){
            String username = extra.getString("username");
            nomeusermenu.setText(username);
        }
    }

    public void btnpoupança(View view) {
    }

    public void btncadastrarcartao(View view) {
        Intent gocadastrarcartao= new Intent (Menu.this,CadastroCartao.class);
        startActivity(gocadastrarcartao);
    }


    public void btnemprestimo(View view) {
        Intent goemprestimo= new Intent (Menu.this,Emprestimo.class);
        startActivity(goemprestimo);
    }

    public void btntranferencia(View view) {
        Intent gotransferencia= new Intent (Menu.this,Transferencia.class);
        startActivity(gotransferencia);
    }

    public void btnpagarboleto(View view) {
        Intent goirboleto= new Intent (Menu.this,Boleto.class);
        startActivity(goirboleto);
    }

    public void btnqrcode(View view) {
        Intent goirqrcode= new Intent (Menu.this,qrcode.class);
        startActivity(goirqrcode);
    }

    public void btnhome(View view) {
        Intent gohomecasinha= new Intent (Menu.this,Menu.class);
        startActivity(gohomecasinha);
    }

    public void btndepositar(View view) {
        Intent godepositar= new Intent (Menu.this,Depositar.class);
        startActivity(godepositar);
    }

    public void btnhomePerfil(View view) {
        Intent goPerfil= new Intent (Menu.this,Perfil.class);
        startActivity(goPerfil);
    }

    public void btnhomeConfig(View view) {
        Intent goconfig= new Intent (Menu.this,Configuracao.class);
        startActivity(goconfig);
    }
}
