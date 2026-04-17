package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar a classe 

        Scanner sc = new Scanner (System.in);

        // 

        // Vamos criar mais um programa hoje : CALCULADORA , ele vai informar dois números e escolher a operação que ele vai fazer soma, subitração, divisão e multiplicação.

        // D v

        double valor1;
        double valor2;
        double result = 0;
        String operador; 

        // Entrada de dados 

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
        operador = sc.nextLine();

        // Verfiq

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
                System.out.println(" O valor da divisão é: " + result  );
                break; 
            default:
                System.out.println("Operação invalida.");
        }



        // Fechar o objeto  
        sc.close();
    }
}
