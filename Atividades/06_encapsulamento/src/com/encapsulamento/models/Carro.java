package com.encapsulamento.models;

public final class Carro extends Veiculo {

    public Carro( String fabricante, String modelo, String cor, int ano, String placa){
        super(fabricante,modelo,cor,ano,placa,"Carro");
    }

    public void exibirDados() {
        System.out.println("Exibindo dados do Carro:");
        System.out.println(toString());
    }

}
