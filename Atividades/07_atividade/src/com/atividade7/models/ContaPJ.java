package com.atividade7.models;

public class ContaPJ extends Conta {
    private PessoaJuridica pj;
    private static final double TAXA_SAQUE = 0.0001; // 0.01%

    public ContaPJ(String nAgencia, String nConta, double saldoInicial, PessoaJuridica pj) {
        super(nAgencia, nConta, saldoInicial);
        this.pj = pj;
    }

    public PessoaJuridica getPj() {
        return pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }

    @Override
    public double fazerSaque(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
            return getSaldo();
        }

        double taxa = valor * TAXA_SAQUE;
        double valorTotal = valor + taxa;

        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            System.out.printf("Saque de R$%.2f realizado com sucesso. Taxa cobrada: R$%.2f. Novo saldo: R$%.2f\n", valor, taxa, getSaldo());
        } else {
            System.out.printf("Saldo insuficiente para realizar o saque (incluindo taxa de R$%.2f). Saldo atual: R$%.2f\n", taxa, getSaldo());
        }
        return getSaldo();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Razão Social: %s\n", this.pj.getRazaoSocial());
        System.out.printf("CNPJ: %s\n", this.pj.getCnpj());

        /*Aqui, o professor adicionou o getCnpj e o getEmail  o cpf e o email. O que pode alterar se eu tivesse colocado os 4 e um super.exibir dados()?  Não é para fazer isso para a classe abstrata conta, por que é especifico da ContaPJ
        
        código do professor:


        public void exibirDados(){
            sout("Razão social" + this.pj.getRazãoSocial());
            sout("Nome fantasia :" + this.pj.getNomeFantasia());
            sout("CNPJ:" + this.pj.getCnpj);
            sout("E-mail " + this.pj.getEmail());
            super.exibirDados(); 
        }

        public double fazerSaque(double valor){
           this.setSaldo(this.getSaldo() - valor - (this.getSaldo() - 0.01/100));
           return novoSaldo;
        }
        
        */ 
    }
}
