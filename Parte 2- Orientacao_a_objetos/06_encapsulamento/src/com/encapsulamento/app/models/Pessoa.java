package com.encapsulamento.app.models;


abstract public class Pessoa {
    // atributos
    private String email; 
    private String telefone; 

    // construtor 
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    // métodos de acesso (getters e setters)
    public String getEmail(){
        return this.email;

    }
    // set sempre será void 
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void  setTelefone (String telefone){
        this.telefone = telefone;
    }

}
