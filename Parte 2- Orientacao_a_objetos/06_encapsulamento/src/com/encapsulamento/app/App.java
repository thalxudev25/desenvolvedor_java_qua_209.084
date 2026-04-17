package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.app.models.PessoaFisica;
import com.encapsulamento.app.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {


        PessoaFisica usuario = new PessoaFisica(null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null); 
        
        // 2. Preparando a entrada de dados
        Scanner sc = new Scanner(System.in);

        empresa.setNomeFantasia("Funerária Você é o Próximo ");
        empresa.setCnpj("09.780.602/0001-83");
        empresa.setEmail("funeraria@contato.com.br");
        empresa.setTelefone("(61) 98765-4321");


        System.out.println("Informar o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF: ");
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o e-mail");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone: ");
        usuario.setTelefone(sc.nextLine());
        
        // saida de dados 
        System.out.println("Nome do usuario" + usuario.getNome());
        System.out.println("CPF" + usuario.getCpf());
        System.out.println("E-mail" + usuario.getEmail());
        System.out.println("Telefone:" + usuario.getTelefone());

        System.out.println("DADOS DA EMPRESA\n" );
        System.out.println("NOME FANTASIA DA EMPRESA\n" + empresa.getNomeFantasia());
        System.out.println("CNPJ DA EMPRESA\n" + empresa.getCnpj());
        System.out.println("EMAIL DA EMPRESA\n" + empresa.getEmail());
        System.out.println("TELEFONE DA EMPRESA\n" + empresa.getTelefone());

        
        // Fechando o scanner no final de tudo
        sc.close();
    }
}
