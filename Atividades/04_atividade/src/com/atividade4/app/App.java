package com.atividade4.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // ✅ Desenvolva um programa que crie um objeto da classe veículo
        // ✅ (pode ser qualquer veiculo) com os atributos:
        // ✅ fabricante
        // ✅ modelo
        // ✅ placa
        // ✅ ano
        // ✅ cor
        // ✅ o programa deverá mostrar os dados do veículo
        // ✅ (veículo não mostra dados internamente, mostrado no main)
        // ✅ usuário deverá informar os dados do veículo

        Scanner sc = new Scanner(System.in);

        Userinput user = new Userinput();

        System.out.println("Informe o nome do fabricante: ");
        user.fabricante = sc.nextLine();

        System.out.println("Informe o modelo: ");
 
        user.modelo = sc.nextLine();

        System.out.println("Informe o numero da placa: ");
       
        user.placa = sc.nextLine();

        System.out.println("Informe o ano: ");
        user.ano = sc.nextInt();
        
        
        sc.nextLine(); 
      

        System.out.println("Informe a cor do carro: ");
        user.cor = sc.nextLine();

      
        System.out.println("\n--- Dados do Veículo ---\n");
        System.out.println("Fabricante: " + user.fabricante);
        System.out.println("Modelo: " + user.modelo);
        System.out.println("Placa: " + user.placa);
        System.out.println("Ano: " + user.ano);
        System.out.println("Cor: " + user.cor);

        sc.close();

        
    }
}


