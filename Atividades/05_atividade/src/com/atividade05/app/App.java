package com.atividade05.app;

import java.util.Scanner;
import com.atividade05.models.Aluno;
import com.atividade05.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Utilizando os conceitos básicos de orientação a objetos, crie um programa que
         * um aluno informa seus dados (nome, idade e email)
         * e pede para um professor (dados : nome e maricula)
         * calcular para ele as seguintes formulas : area do triângulo, área do circulo
         * e equação do 1º grau e exibe o resultado na tela.
         */

        // Variáveis de decisão
        double x, y, pi, raio, b, a;
        int opcao = 0;

        // Instanciar classes
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();

        // Entrada de dados Aluno
        System.out.println("Informe o seu nome");
        aluno.nome = sc.nextLine();
        System.out.println("Informe a sua idade");
        aluno.idade = sc.nextInt();
        
        sc.nextLine(); 

        System.out.println("Informe seu email");
        aluno.email = sc.nextLine();



        System.out.println(aluno.alunoInforma());
        System.out.println(aluno.submitAlunoInforma());

        // Entrada de dados Professor
        System.out.println("Informe o nome do professor");
        prof.profnome = sc.nextLine();
        System.out.println("Informe a matricula do professor");
        prof.profmatricula = sc.nextLong();

        // Condicional de verificação
        if (prof.profnome.equals("Alex") && prof.profmatricula == 24325562) {

            System.out.println("Acesso permitido, escolha a opção de 1 até 3 de calculo desejado\n");
            System.out.println("1 - Área do Triângulo");
            System.out.println("2 - Área do Círculo");
            System.out.println("3 - Equação de 1º Grau");
            
            opcao = sc.nextInt();

            System.out.println(prof.ApresentaProf() + "\n");

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor de X");
                    x = sc.nextDouble();
                    System.out.println("Informe o valor de Y");
                    y = sc.nextDouble();
                    System.out.println("A área do triângulo é: " + prof.areaDoTriângulo(x, y));
                    break;

                case 2:
                    System.out.println("Informe o valor de pi (ex: 3,14)");
                    pi = sc.nextDouble();
                    System.out.println("Informe o valor de raio");
                    raio = sc.nextDouble();
                    System.out.println("A área do circulo é: " + prof.areaDoCirculo(pi, raio));
                    break;

                case 3:
                    System.out.println("informe o valor de b");
                    b = sc.nextDouble();
                    System.out.println("Informe o valor de a");
                    a = sc.nextDouble();
                    System.out.println("Resultado da equação: " + prof.equacaoPrimeiroGrau(a, b));
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } else {
            System.out.println("Credenciais inválidas");
        }

        sc.close();
    }
}