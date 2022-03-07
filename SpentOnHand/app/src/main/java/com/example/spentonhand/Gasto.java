package com.example.spentonhand;
import java.io.Serializable;

public class Gasto implements Serializable {

    private int idGasto;
    private double valor;
    private String produto;
    private String site;
    private String data;

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString(){
        // apresentando todos os gastos(dados inseridos)
        String todosGastos = String.format("ID: %d\nProduto: %s\nValor: R$ %.2f\nSite ou Loja: %s\nData da Compra: %s",idGasto,produto,valor,site,data);
        return todosGastos;
    }
}