package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //    declarar variavel 

    double peso;
    double altura;
    String nome;

    Scanner sc = new Scanner(System.in);

    // pegar dados peso, altura nome
    System.out.println("Informe seu nome");
    nome = sc.nextLine();
    System.out.println("Informe o seu peso em kg ( digite o peso usando virgula)");
    peso = sc.nextDouble();
    System.out.println("Informe a sua altura em metros (digite a altura usando virgula)");
    altura = sc.nextDouble();
    
    // condicional dupla

    if (altura >= 1.25 && peso <=120) {
        System.out.println(nome + "Acesso Liberado");

    }
    else {
        System.out.println(nome + " Acesso não Liberado");

        sc.close();
    }

    }
}
