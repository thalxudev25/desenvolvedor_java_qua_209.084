package com.encapsulamento.models;

public final class Caminhao extends Veiculo {

    public Caminhao(String fabricante, String modelo, String cor, int ano, String placa) {
        super(fabricante, modelo, cor, ano, placa, "Caminhão");
    }

    
    public void exibirDados() {
        System.out.println("--- DADOS DO CAMINHÃO ---");
        System.out.println(toString());
    }
}