package com.encapsulamento.app;

import java.util.Scanner;
import com.encapsulamento.models.Veiculo;
import com.encapsulamento.models.Carro;
import com.encapsulamento.models.Moto;
import com.encapsulamento.models.Onibus;
import com.encapsulamento.models.Caminhao;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String tipoVeiculo;

        System.out.println("Informe o tipo de veiculo que deseja cadastrar");
        tipoVeiculo = scanner.nextLine();
        System.out.println("A- Moto");
        System.out.println("B- Carro");
        System.out.println("C -Caminhão");
        System.out.println("D - Ônibus");
        tipoVeiculo = scanner.nextLine();


        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, "A", null);
                
                break;
        
            default:
                break;
        }
       
        scanner.close();
        System.out.println("\n=== Fim do Programa ===");
    }
}