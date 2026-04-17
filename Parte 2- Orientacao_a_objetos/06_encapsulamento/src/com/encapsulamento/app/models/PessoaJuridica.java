package com.encapsulamento.app.models;

final public class PessoaJuridica extends Pessoa {
    // atributos 
    private String nomeFantasia;
    private String cnpj;

    // Agora com 4 parâmetros, batendo com o que você chamou no Main
    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone); // Passa os dados para a "mãe" Pessoa
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
