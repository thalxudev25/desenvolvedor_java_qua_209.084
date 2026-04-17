package com.atividade05.models;

public class Aluno {
    // atributos
    public String nome;
    public int idade;
    public String email;

public String alunoInforma(){
    return  "Olá, bem vindo, por favor, informe seu " + this.nome + "você tem" + this.idade + "e esse é o seu email: " + this.email; 


}

public String submitAlunoInforma(){
    return "Muito bem, agora aguarde o professor";
}
    
}

