package com.atividade7.models;

public class PessoaJuridica extends Pessoa {
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String email) {
        super(email, razaoSocial);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
