package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declarar variavel 

        String nome;
        double peso;
        double altura;
        double imc;
        //Instanciar a classe Scanner 

        Scanner sc = new Scanner(System.in);

        //pegar dados usuario
        System.out.println("Informe o seu nome");
        nome = sc.nextLine();
        System.out.println("Informe o seu peso");
        peso = sc.nextDouble();
        System.out.println("Informe a sua altura");
        altura = sc.nextDouble();


        // condicionais 

        imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println(nome + "está abaixo do peso");
        }

        else if (imc >= 18.5 && imc < 25){
            System.out.println(nome + " está peso ideal");
        }
        else if (imc >= 25 && imc < 30){

            System.out.println(nome + " está acima do peso");}
        else if (imc >= 30 && imc < 35){

            System.out.println(nome + " está obeso");


        }
         else if (imc >= 35 && imc <=40){

            System.out.println(nome + "está com obesidade nivel 2");}
        
         else if (imc > 40){

            System.out.println(nome + "está com obesidade mórbida");}

        // imprimit 

        System.out.println(imc);

        sc.close();
    }
}
