package com.maioridade.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // declaração de variável
    String nome;
    int idade; 

    // preparar o input, instanciar scanner 
    Scanner sc = new Scanner(System.in);

        //  pegar nome e idade 

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        // condicional verificar a maioridade (idade)

        if (idade >=18) {
            System.out.println(nome + " é maior de idade");

        }
        else {
            System.out.println(nome + " é menor de idade");
        }

sc.close();
    }
}
