package com.pizzaria.ultimoPedaco.model;

public class Cliente {
    String email;
    int cpf;
    String nome;
    String enderecoEntrega;
    int telefone;
    
    public Cliente(String email, int cpf, String nome, String enderecoEntrega, int telefone) {
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.enderecoEntrega = enderecoEntrega;
        this.telefone = telefone;
    }
}
