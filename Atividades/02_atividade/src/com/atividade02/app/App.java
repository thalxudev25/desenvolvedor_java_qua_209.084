package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // crie um programa que receba do usuário o nome e a idade (1x)
        // e depois exiba uma lista de filmes
        // Sala 01: a roda quadrada - livre
        // Sala 02: a volta dos que não foram- 12 anos
        // Sala 03: poeira em alto mar- 14 anos
        // Sala 04: as tranças do rei careca - 16 anos
        // Sala 05: a vingança do peixe frito - 18 anos
        // o usuarui deverar escolher o filme desejado, se tiver a idade minima
        // se tiver a idade minima para ver o filme, o programa imprime o ingresso e
        // encerra
        // se o usuário não tiver a idade mínima, o programa bloqueia a entrada e
        // re-exibe a lista de filmes para o usuário escolher outro
        // d v
        // minha versão :
        // String nome;
        // int idade;
        // int opcao;
        // int user;

        // // Instanciar a classe Scanner
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Informe seu nome");
        // nome = sc.nextLine();

        // sc.nextLine();

        // System.out.println("Informe a sua idade");
        // idade = sc.nextInt();

        // // entrada (lista de filmes)
        // do {

        // System.out.println("Bem vindo! escolha um dos filmes abaixo");
        // System.out.println(" Sala 01: a roda quadrada - livre");
        // System.out.println(" Sala 02: a volta dos que não foram- 12 anos");
        // System.out.println(" Sala 03: poeira em alto mar- 14 anos");
        // System.out.println("Sala 04: as tranças do rei careca - 16 anos");
        // System.out.println( "Você deseja continuar? 1- Sim // 2- Não");
        // user = sc.nextInt();
        // System.out.println("Sala 05: a vingança do peixe frito - 18 anos");
        // opcao = sc.nextInt();

        // if (opcao == 1) {
        // System.out.println("Ingresso para 'A roda quadrada'.");
        // } else if (opcao == 2 && idade >= 12) {
        // System.out.println("Ingresso para 'A volta dos que não foram'.");
        // } else if (opcao == 3 && idade >= 14) {
        // System.out.println("Ingresso para poeira em alto mar");
        // } else if (opcao == 4 && idade>= 16) {
        // System.out.println("Ingresso para as tranças do rei careca ");

        // } else if (opcao == 5 && idade >=18) {
        // System.out.println("Ingresso para 'A vingança do peixe frito");
        // }

        // else{

        // System.out.println("Você não tem a idade mínima para esse filme, tente
        // novamente.");
        // }
        // if(opcao == 2){

        // }
        // } while (opcao != 0);

// Versão do professor:

        // Instanciar o Scanner
        Scanner sc = new Scanner(System.in);
        // d v
        String nome;
        int idade;
        int idade_mimina = 0;
        String sala;
        String filme = null;

        // entrada de dados
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade");
        idade = sc.nextInt();

        // Limpeza de buffer
        sc.nextLine();

        // loop para o usuário puder fazer várias entradas

        do {
            System.out.println("Bem vindo! escolha um dos filmes abaixo pelo seu numero ex: 1 /n");
            System.out.println(" 1 - Sala 01: a roda quadrada - livre");
            System.out.println(" 2-  Sala 02: a volta dos que não foram- 12 anos");
            System.out.println(" 3-  Sala 03: poeira em alto mar- 14 anos");
            System.out.println(" 4 - Sala 04: as tranças do rei careca - 16 anos");
            System.out.println(" 5 - Sala 05: a vingança do peixe frito - 18 anos");
            sala = sc.nextLine();
        switch (sala) {
            case "1":
                filme = "A roda quadrada";
                break;
            case "2":
                filme = "A volta dos que não foram";
                idade_mimina = 12;
                break;
            case "3":
                filme = "Poeira em alto mar";
                idade_mimina =14;
            case "4":
                filme = "As tranças do rei careca";
                idade_mimina = 16;
                break;
            case "5":
                filme = "A vingança do peixe frito";
                idade_mimina =18;
            default:
                System.out.println("Essa Sala não , tente novamente.");
                idade_mimina = idade + 1;

        }
        if(idade >= idade_mimina){
            System.out.println("Ingresso comprado por" + nome + ".");
            System.out.println("Filme: " + filme + nome + ".");
            System.out.println("Tenha um bom filme" + "!");
        }
        else{
            System.out.println("Entrada não liberada" + nome + "Idade inadequada! Por favor, Escolha outro filme");
        }
        } while (idade <= idade_mimina);

        sc.close();
    }
}
