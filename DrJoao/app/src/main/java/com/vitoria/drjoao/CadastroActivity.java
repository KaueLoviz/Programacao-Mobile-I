package com.vitoria.drjoao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

public class CadastroActivity extends AppCompatActivity {

    EditText etEmail, etSenha, etNome, etSenhaConfirmar ;

    public static ArrayList<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void Cadastrar(View view) {
            find();

            users.add(new User(etEmail.getText().toString(),etSenha.getText().toString()));

            if (etEmail.getText().length()== 0) {
                etEmail.setError("Campo Email Vazio");
            }else if(etSenha.getText().length()== 0){
                etSenha.setError("Campo senha vazio");
            }else if(etSenha.equals(etSenha)) {

                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            }
        }
        private void find(){
            etEmail = findViewById(R.id.etEmail);
            etSenha = findViewById(R.id.etSenha);
        }


    }


