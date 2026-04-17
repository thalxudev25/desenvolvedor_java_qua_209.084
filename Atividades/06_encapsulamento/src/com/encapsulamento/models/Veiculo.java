package com.encapsulamento.models;

public abstract class Veiculo {

    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    private String placa;
    private String categoria;

    public Veiculo(String fabricante, String modelo, String cor, int ano, String placa, String categoria) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.categoria = categoria;
    }


    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

public abstract void exibirDados();

public String toString() {
    return "Detalhes do Veículo:\n " +
    "Modelo: " + modelo + "\n" +
    "Cor: " + cor + "\n" +
    "Ano: " + ano + "\n" +
    "Placa: " + placa + "\n" +
    "Categoria: " + categoria;


}


}
