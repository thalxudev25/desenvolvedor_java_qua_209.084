package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 03
        // Recrie o programa da calculadora feito no dia 18/03/2026, mas dessa vez
        // acrescentando a opção de encerrar o programa quando o usuário quiser
        Scanner sc = new Scanner(System.in);
        // D v
        double valor1;
        double valor2;
        double result = 0;
        String operador;
        int user;

        System.out.println("Informe o 1º número: ");
        valor1 = sc.nextDouble();
        System.out.println("Informe o 2º número: ");
        valor2 = sc.nextDouble();
        // Limpeza de buffer
        sc.nextLine();
        System.out.println("Informe a operação desejada");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5 - Você deseja encerrar o programa?");
        operador = sc.nextLine();
        user = sc.nextInt();
        do {
            switch (operador) {
                case "1":
                    result = valor1 + valor2;
                    System.out.println("O valor da soma é: " + result);
                    break;
                case "2":
                    result = valor1 = valor2;
                    System.out.println("O valor da subitração é: " + result);
                    break;
                case "3":
                    result = valor1 * valor2;
                    System.out.println("O valor da multiplicação é: " + result);
                    break;
                case "4":
                    result = valor1 / valor2;
                    System.out.println(" O valor da divisão é: " + result);
                    break;
                case "5":
                    if (user == 5) {
                        break;
                    } else {
                    }
                default:
                    
            }
        } while ( user > 0); 
    
        sc.close();
    }
}
