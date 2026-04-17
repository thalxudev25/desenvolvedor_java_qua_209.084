package com.polimorfismo.models;

public class Pessoa {
    // atributos 
    public String email;
    public String telefone; 
// construtor 
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }
// void para usar um sout dentro do ...
    public void exibirDados(){
        System.out.println("Email" + this.email);
        System.out.println("Telefone" + this.telefone);
    }

}
