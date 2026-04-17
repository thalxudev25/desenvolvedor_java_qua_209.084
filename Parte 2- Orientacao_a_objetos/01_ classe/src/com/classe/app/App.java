package com.classe.app;

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner (System.in);

    //entrada de dados
    System.out.println("Informe o nome da pessoa: ");
    pessoa.nome = sc.nextLine();
    System.out.println("Informe sua idade");
    pessoa.idade = sc.nextInt();
    System.out.println("Informe a altura: ");
    pessoa.altura =sc.nextDouble();
    
    // Limpeza de buffer 
    sc.nextLine();

    System.out.println("Informe o seu email");
    pessoa.email = sc.nextLine();

    // valores aos atributos

    pessoa.nome = "Thyago";
    pessoa.email = "thyago123@gmail.com";
    pessoa.idade =  41;
    pessoa.altura = 1.72;

        //  imprimitr na tela
    // System.out.println("Atribuindo do objeto: ");
    // System.out.println("Nome:" + pessoa.nome);
    // System.out.println("Nome:" + pessoa.email);
    // System.out.println("Nome:" + pessoa.idade);
    // System.out.println("Nome:" + pessoa.altura);
        
        pessoa.Cumprimentar();
        pessoa.Apresentar();

    sc.close();
    }
    
    
    
    
}
