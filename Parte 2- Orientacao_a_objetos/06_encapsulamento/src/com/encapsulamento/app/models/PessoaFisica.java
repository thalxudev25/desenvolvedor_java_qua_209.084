package com.encapsulamento.app.models;



final public class PessoaFisica extends Pessoa {
    // atributos
    private String nome;
    private String cpf;

    public PessoaFisica(String email, String telefone) {
        super(email, telefone);
    }


    public PessoaFisica(String nome, String cpf, String email, String telefone) {   
        super(email,telefone);
        setNome(nome);
        setCpf(cpf);
       
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
