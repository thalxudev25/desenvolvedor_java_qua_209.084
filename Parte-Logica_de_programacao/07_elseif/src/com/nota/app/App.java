package com.nota.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // decl vr 

        String nome;
        double nota;


        // instanciar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //receber os dados (ENTRADA)

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua nota: ");
        nota = sc.nextDouble();
        
        // verificar se a nota é valido (impedir que saia do controle)
        if (nota >=0 && nota <=10){
        // condicional 
            if (nota >=7) {
                System.out.println( nome + " Está aprovado.");
            }
            else if (nota >= 5){
                System.out.println(nome + " Está de recuperação.");
            }
            else{
                System.out.println(nome + " Está reprovado.");
            }
        }
        else {
            System.out.println("Nota invalida.");
        }


        //fechar o app

        sc.close();
    }
}
