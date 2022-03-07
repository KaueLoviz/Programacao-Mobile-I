package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText telefone;
    private EditText assunto;
    private EditText mensagem;

    private ContatoDAO contatoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        telefone = findViewById(R.id.telefone);
        assunto = findViewById(R.id.assunto);
        mensagem = findViewById(R.id.mensagem);
        contatoDAO = new ContatoDAO(this);



    }

    public void btnsalvar(View view) {

        Contato contato = new Contato();
        contato.setNome(nome.getText().toString());
        contato.setEmail(email.getText().toString());
        contato.setTelefone(telefone.getText().toString());
        contato.setAssunto(assunto.getText().toString());
        contato.setMensagem(mensagem.getText().toString());

        long Id = contatoDAO.inserir(contato);

        String result = String.format("ID: %s",Id);
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();

    }

    public void btnexibir(View view) {

        Intent goexibir = new Intent(this,Listar.class);
        startActivity(goexibir);
    }
}
