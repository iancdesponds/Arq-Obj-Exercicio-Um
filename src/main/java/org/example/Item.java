package org.example;

public class Item {
    String nome;
    String preco;

    public Item(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void getNome() {
        System.out.println("Nome: " + nome);
    }
}