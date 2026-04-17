package com.metodos.app;

import java.util.Scanner; 

import com.metodos.models.Professor;
import com.metodos.models.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciar a classe Scanner 

        Scanner sc = new Scanner(System.in);

        //Instanciar a classe professor

        Professor prof = new Professor();
        prof.nome = "Hello Kitty";
        prof.materia = "Matemática";

        // Instanciar a clase aluno 

        Aluno aluno = new Aluno();
        // Variavel para área 

        double x;
        double y;

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        // Apresentar Aluno
        System.out.println(aluno.apresentar());

    
        prof.darBoasVindas();

        System.out.println("Informe o valor da base: ");
        x = sc.nextDouble();
        System.out.println("Informe o valor da altura: ");
        y = sc.nextDouble();

        System.out.println("A área do quadrilatero é:" + prof.areaQuadrilatero(x, y));




        System.out.println(prof.darBoasVindas());

        sc.close();
    }
}
