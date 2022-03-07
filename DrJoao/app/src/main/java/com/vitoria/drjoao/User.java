package com.vitoria.drjoao;

public class User {
    private String etEmail, etSenha;
    public  User(String etEmail, String etSenha){

        this.etEmail = etEmail;
        this.etSenha = etSenha;
    }

    public String getEtEmail(){
        return etEmail;
    }
    public String getEtSenha(){
        return etSenha;
    }
}
