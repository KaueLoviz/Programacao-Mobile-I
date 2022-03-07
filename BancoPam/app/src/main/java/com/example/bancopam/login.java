package com.example.bancopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText usuario;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.user);
    }

    public void btnVoltar(View view) {
        Intent gohome= new Intent (login.this,MainActivity.class);
        startActivity(gohome);

    }

    public void btnAcessar(View view) {
        String usera = usuario.getText().toString();
        Intent gomenu= new Intent (login.this,Menu.class);
        gomenu.putExtra("username",usera);
        startActivity(gomenu);



    }

    public void txvIr(View view) {
        Intent gonewcadastro= new Intent (login.this,NovoCadstro.class);
        startActivity(gonewcadastro);

    }

    public void txvirsenha(View view) {
        Intent gorecuperarsenha= new Intent (login.this,Recuperar.class);
        startActivity(gorecuperarsenha);
    }
}
