package com.encapsulamento.models;

public final class Moto extends Veiculo {

    // O construtor espera: String, String, String, int, String
    public Moto(String fabricante, String modelo, String cor, int ano, String placa) {
       
        super(fabricante, modelo, cor, ano, placa, "Moto"); 
    }

    public void exibirDados() {
        System.out.println("\n === DADOS DA MOTO ===");
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo()); // Corrigido de getFabricante para getModelo
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Categoria: " + getCategoria());
    }
}