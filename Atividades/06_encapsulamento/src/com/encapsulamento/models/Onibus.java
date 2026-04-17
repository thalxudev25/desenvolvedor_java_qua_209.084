package com.encapsulamento.models;

public final class Onibus extends Veiculo {

    public Onibus(String fabricante, String modelo, String cor, int ano, String placa){
        super(fabricante,modelo,cor,ano,placa,"Ônibus");
    }

    public void exibirDados(){
        System.out.println("\n DADOS DO ÔNIBUS");
        System.out.println("Fabricante:" + getFabricante());
        System.out.println("Modelo:" + getModelo());
        System.out.println("Cor:" + getCor());
        System.out.println("Ano:" + getAno());
        System.out.println("Categoria:" + getCategoria());
    }

}
