package com.atividade7.app;

import com.atividade7.models.Conta;
import com.atividade7.models.ContaPF;
import com.atividade7.models.ContaPJ;
import com.atividade7.models.PessoaFisica;
import com.atividade7.models.PessoaJuridica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = null;

        System.out.println("Bem-vindo ao Banco!");
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
        System.out.print("Opção: ");
        int tipoConta = scanner.nextInt();
        scanner.nextLine(); 

        if (tipoConta == 1) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            PessoaFisica pf = new PessoaFisica(nome, cpf, email);
            conta = new ContaPF("0001", "12345-6", 0.0, pf);
        } else if (tipoConta == 2) {
            System.out.print("Razão Social: ");
            String razaoSocial = scanner.nextLine();
            System.out.print("Nome Fantasia: ");
            String nomeFantasia = scanner.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            PessoaJuridica pj = new PessoaJuridica(razaoSocial, nomeFantasia, cnpj, email);
            conta = new ContaPJ("0001", "98765-4", 0.0, pj);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar dados da conta");
            System.out.println("2 - Fazer depósito");
            System.out.println("3 - Fazer saque");
            System.out.println("4 - Sair do programa");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    conta.fazerDeposito(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    conta.fazerSaque(valorSaque);
                    break;
                case 4:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
