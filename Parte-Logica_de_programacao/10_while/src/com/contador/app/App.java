// minha versão
/*
package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero;

        // instanciar a classe Scanner 
        Scanner sc = new Scanner(System.in);

        // entrada de dados 
        System.out.println("Digite um número inteiro menor que 10 para começar: ");
        numero = sc.nextInt();

        // laço 
        while (numero > 0 && numero <=50) {
            System.out.println(numero); 
            numero--; 
        }
        
        System.out.println("Fim da contagem!");
        sc.close();
    }
}

*/
// versão do professor 

package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numero;

        // instanciar a classe Scanner 
        Scanner sc = new Scanner(System.in);

        // entrada de dados 
        System.out.println("Digite um número inteiro menor que 10 para começar: ");
        numero = sc.nextInt();  

        while(numero >= 0 ){
            System.out.println(numero);
            numero --;   //decréscimo 
        }

    sc.close();
    }
}