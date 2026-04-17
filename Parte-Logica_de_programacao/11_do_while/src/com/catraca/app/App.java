package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Vamos decidir o 2º programa da noite : ele quer uma outra versão do programa
        // que fizemos (catraca) , ele percebeu, quando ele implementou o programa da
        // catraca, ele encerrava, ele tem que se manter aberto após a entrada do
        // pagante, maior que 1.25m e peso <=125 = liberado, só será encerrado se o
        // usuário disser "Encerrado".

        // d v

        double peso;
        double altura;
        String nome;
        int user;

        // instanciar a classe Scanner
        Scanner sc = new Scanner(System.in);
        

        do {
            // entrada de dados
            
            System.out.print("Escolha uma opção: 1- Registrar nova entrada 2- Sair do programa \n \n");
            user = sc.nextInt();

            
            sc.nextLine(); // Limpar o buffer
            

            if (user == 1) {

                System.out.println("Insira o seu nome\n");
                nome = sc.nextLine();
                System.out.println("Insira o seu peso em kilogramas (kg):\n ");
                peso = sc.nextDouble();
                System.out.println("Insira a altura em metros:\n  ");
                altura = sc.nextDouble();

                // catraca
                if (altura > 1.25 && peso <= 125) {
                    System.out.println("Entrada liberada para:\n " + nome);
                    System.out.println("Deseja registra nova entrada?\n");
                } else {
                    System.out.println("Entrada bloqueada para: " + nome);
                    System.out.println("Deseja registra nova entrada?\n");
                }

            } else if (user == 2) {
                System.out.println("Obrigado pela preferência.\n");

            } else {
                System.out.println("Opção inválida\n");
            }

        } while (user != 2);

        sc.close();
    }
}
