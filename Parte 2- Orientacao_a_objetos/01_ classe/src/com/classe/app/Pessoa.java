package com.classe.app;

public class Pessoa {
    // atributos 
    public String nome;
    public String email; 
    public int idade;
    public double altura;

    public void Cumprimentar(){
        System.out.println("Olá boa noite ");

    }

    public void Apresentar(){
        System.out.println("meu nome é" + this.nome + ", meu email é" + this.email + "tenho" + this.idade + "anos, e" + this.altura + "metros de altura." );
    }

}
