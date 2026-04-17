package com.atividade7.models;

public class ContaPF extends Conta {
    private PessoaFisica pf;

    public ContaPF(String nAgencia, String nConta, double saldoInicial, PessoaFisica pf) {
        super(nAgencia, nConta, saldoInicial);
        this.pf = pf;
    }

    public PessoaFisica getPf() {
        return pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    @Override
    public double fazerSaque(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$%.2f realizado com sucesso. Novo saldo: R$%.2f\n", valor, getSaldo());
        } else if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        return getSaldo();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Titular: %s\n", this.pf.getNome());
        System.out.printf("CPF: %s\n", this.pf.getCpf());
    }
}
