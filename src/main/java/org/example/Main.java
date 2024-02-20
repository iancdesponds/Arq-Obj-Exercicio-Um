package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurante> restaurantes = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o nome do restaurante: ");
                scanner.nextLine();
                String nomeRestaurante = scanner.nextLine();

                System.out.println("Digite a avaliacao do restaurante: ");
                double avaliacao = scanner.nextDouble();
                Restaurante restaurante = new Restaurante(nomeRestaurante, avaliacao);
                restaurantes.add(restaurante);
                System.out.println("Restaurante " + nomeRestaurante + " cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Restaurantes cadastrados:");
                for (int id = 0; id < restaurantes.size(); id++) {
                    Restaurante restaurante = restaurantes.get(id);
                    System.out.println(id + ": " + restaurante.nome);
                    System.out.println("Avaliação: " + restaurante.avaliacao + "★");
                    System.out.println("Menu:");
                    restaurante.imprimirMenu();
                    System.out.println("---------------");
                }
            } else if (opcao == 3) {
                System.out.println("Escolha o número do restaurante para adicionar um item ao menu: ");
                int escolhaRestaurante = scanner.nextInt();
                System.out.println("Digite o nome do item: ");
                scanner.nextLine();
                String nomeItem = scanner.nextLine();
                System.out.println("Digite o preco do item: ");
                String precoItem = scanner.nextLine();
                Item item = new Item(nomeItem, precoItem);
                Restaurante restauranteEscolhido = restaurantes.get(escolhaRestaurante);
                restauranteEscolhido.adicionarItem(nomeItem);
            } else if (opcao == 4) {
                System.out.println("Obrigado por utilizar o sistema de cadastro de restaurantes!");
                break;
            }
        }
        scanner.close();
    }
}