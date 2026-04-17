package com.atividade7.models;

import com.atividade7.repository.IConta;

public abstract class Conta implements IConta {
    private String nAgencia;
    private String nConta;
    private double saldo;

    public Conta(String nAgencia, String nConta, double saldoInicial) {
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.saldo = saldoInicial;
    }

    public String getnAgencia() {
        return nAgencia;
    }

    public void setnAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double fazerDeposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso. Novo saldo: R$%.2f\n", valor, this.saldo);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
        return this.saldo;
    }

    @Override
    public abstract double fazerSaque(double valor);

    @Override
    public void exibirDados() {
        System.out.printf("Agência: %s\n", this.nAgencia);
        System.out.printf("Conta: %s\n", this.nConta);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }
}
