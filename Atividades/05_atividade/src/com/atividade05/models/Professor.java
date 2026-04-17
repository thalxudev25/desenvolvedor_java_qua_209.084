package com.atividade05.models;

public class Professor {
    public String profnome = "Alex, alex";
    public long profmatricula = 24325562;

    public String ApresentaProf(){
        return "Olá professor, seus dados foram confirmados, vamos começar!\n";
    }
    

    public double areaDoTriângulo( double x, double y){
        return x * y / 2;
    }

    public double areaDoCirculo (double pi, double raio){
        return  pi * (raio * raio);
    }
    public double equacaoPrimeiroGrau(double b, double a){
        return -b / a;
    }
}

    

