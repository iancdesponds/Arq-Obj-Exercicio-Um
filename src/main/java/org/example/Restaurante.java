package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;
    double avaliacao;
    ArrayList<String> cardapio;

    public Restaurante(String nome, double avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = new ArrayList<>();
    }

    public void getNome() {
        System.out.println("Nome: " + nome);
    }

    public void adicionarItem(String item) {
        this.cardapio.add(item);
    }

    public void imprimirMenu() {
        for (String item : cardapio) {
            System.out.println(item);
        }
    }
}