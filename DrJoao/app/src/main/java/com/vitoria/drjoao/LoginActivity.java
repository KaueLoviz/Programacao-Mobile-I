package com.vitoria.drjoao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    CheckBox chkNewsLetter;
    EditText etEmail, etSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void entrar(View view) {
        find();

        for(User users: CadastroActivity.users){
            //foreach
            if (etEmail.getText().length()== 0) {
                etEmail.setError("Campo Email Vazio");
            }else if(etSenha.getText().length()== 0) {
                etSenha.setError("Campo senha vazio");
            }else if(etEmail.getText().toString().equals(users.getEtEmail())){
                if(etSenha.getText().toString().equals(users.getEtSenha())){
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                }
            }
        }

        String result;
        chkNewsLetter = (CheckBox) findViewById(R.id.chkNewsLetter);

        if (chkNewsLetter.isChecked()) {
            result = "Você aceitou receber a NewsLetter ";

            Toast.makeText(this, result , Toast.LENGTH_LONG).show();

        }

    }

    private void find() {
        etEmail=findViewById(R.id.etEmail);
        etSenha=findViewById(R.id.etSenha);
    }


}