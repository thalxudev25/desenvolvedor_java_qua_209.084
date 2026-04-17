package com.polimorfismo.models;

// Corrigido de Judirica para Juridica
final public class PessoaJuridica extends Pessoa {
    // Atributos
    public String nomeFantasia;
    public String cnpj;

    // O nome do construtor deve ser igual ao da classe
    public PessoaJuridica(String email, String nomeFantasia, String cnpj, String telefone) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirDados() {
        System.out.println("Nome da empresa: " + this.nomeFantasia);
        System.out.println("CNPJ da empresa: " + this.cnpj);
        super.exibirDados();
    }
}
