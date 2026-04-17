package com.atividade7.repository;

public interface IConta {
    void exibirDados();
    double fazerDeposito(double valor);
    double fazerSaque(double valor);
}
