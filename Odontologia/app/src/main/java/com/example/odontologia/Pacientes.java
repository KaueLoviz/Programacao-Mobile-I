package com.example.odontologia;

public class Pacientes {
    String nome;
    String hora;
    String data;
    int termino;
    double valor;

    public Pacientes(String nome, String hora, String data, int termino, double valor) {
        this.valor = valor;
        this.nome = nome;
        this.hora = hora;
        this.data = data;
        this.termino = termino;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTermino() {
        return termino;
    }

    public void setTermino(int termino) {
        this.termino = termino;
    }

    public String toString(){
        return "Nome Paciente: " + this.getNome() + "\nData Atendimento: " + this.getData() +  "\nHorário Atendimento: " + this.getHora() + "\nTermino Atendimento: " + this.getTermino() + "\nPreço Consulta: R$"
                + this.getValor() + "\n";
    }
    public String toValor(){
        return "Nome Paciente: " + this.getNome() + "\nPreço Consulta: R$"
                + this.getValor() + "\n";
    }
}
