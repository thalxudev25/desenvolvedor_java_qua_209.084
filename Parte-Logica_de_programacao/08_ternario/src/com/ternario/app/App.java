package com.ternario.app;

import java.util.Scanner;

// melhore programa verificar (método) maioridade (variavel)

// ternário ou operador ternário : forma simplificada de fazer o if e else 

public class App {
    public static void main(String[] args) throws Exception {
//   fase embrionária

        // d v
        String nome;
        int idade;
        String result;

// fase inicial 

        // instanciar a classe Scanner 
        Scanner sc = new Scanner(System.in);

        // entrada dados
        System.out.println("Informe seu nome");
        nome = sc.nextLine();
        System.out.println("Informe sua idade");
        idade = sc.nextInt();

// fase meio
// é quando é colocado os métodos 
        // verificar idade usuário

//ANTIGO MÉTODO
        // if (idade > 18)
        //     System.out.println(nome + " é maior de idade");
        // else{

        // }
// NOVO MÉTODO - ternário 

        result = (idade >=18) ? "e maior de idade" : "é menor de idade";

// fase final
    //  saída de dados 

        System.out.println(nome + result);

        sc.close();
    }
}
