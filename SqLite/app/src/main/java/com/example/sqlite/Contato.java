package com.example.sqlite;

public class Contato {

    private long idContato;
    private String nome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public long getIdContato() {
        return idContato;
    }

    public void setIdContato(long idContato) {
        this.idContato = idContato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    @Override
    public String toString(){
        String todosContatos = String.format("ID: %d\nNome: %s\nE-mail: %s\nTelefone: %s\nAssunto: %s\nMensagem: %s",idContato,nome,email,telefone,assunto,mensagem);
        return todosContatos;
    }

}
