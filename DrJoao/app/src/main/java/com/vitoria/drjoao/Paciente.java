package com.vitoria.drjoao;

public class Paciente {
    double valorConsulta;
    String etNomePaciente;
    double etData;
    double etHora;

    public Paciente(double valorConsulta, String etNomePaciente, double etData, double etHora){
        this.valorConsulta = valorConsulta;
        this.etNomePaciente = etNomePaciente;
        this.etData = etData;
        this.etHora = etHora;
    }

    public double getValorConsulta(){
        return valorConsulta;
    }
    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getEtNomePaciente() {
        return etNomePaciente;
    }
    public void setEtNomePaciente(String etNomePaciente) {
        this.etNomePaciente = etNomePaciente;
    }

    public double getEtData() {
        return etData;
    }
    public void setEtData(double etData) {
        this.etData = etData;
    }

    public double getEtHora() {
        return etHora;
    }

    public void setEtHora(double etHora) {
        this.etHora = etHora;
    }

    public String toString(){
        return "Nome: " + this.getEtNomePaciente() + "\nData: " + this.getEtData() + "\nHora: " + this.getEtHora() +"\nPreço: R$"
                + this.getValorConsulta() + "\n";
    }
}
