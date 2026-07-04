package br.com.florentino.oop.ex10inventorysystem;

/*
Mini-sistema de estoque integrando os conceitos anteriores.
Crie a classe Inventory que gerencia uma lista de Product.
Implemente as operações: cadastrar produto, listar todos, buscar por nome,
registrar venda (reduz quantidade em estoque) e gerar um relatório simples
com total de produtos e valor total em estoque.
No Main, ofereça um menu de navegação entre as operações.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("--- Menu do Estoque ---");

            System.out.println("Selecione uma das opções abaixo:");
            System.out.println("1. Cadastrar produto;");
            System.out.println("2. Vender produto;");
            System.out.println("3. Buscar produto por nome;");
            System.out.println("4. Listar todos os produtos.");
            System.out.println("5. Gerar relatório simples.");
            System.out.println("6. Sair do programa.");

            System.out.print("Digite a opção desejada: ");
            int option = scanner.nextInt();

            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    while (true) {
                        System.out.print("Nome do produto a ser cadastrado: ");
                        String productName = scanner.nextLine();

                        System.out.print("Preço do produto (em R$): ");
                        double productPrice = scanner.nextDouble();

                        System.out.print("Quantidade a ser adicionada ao estoque: ");
                        int productQuantity = scanner.nextInt();

                        inventory.registerProduct(productName, productPrice, productQuantity);

                        System.out.print("Deseja adicionar outro produto? Digite \"1\" para \"SIM\" ou \"2\" para \"NÃO\": ");
                        option = scanner.nextInt();

                        scanner.nextLine();

                        if (option == 1) {
                            continue;
                        }

                        break;
                    }
                }
                case 2 -> {
                    while (true) {
                        System.out.print("Nome do produto a ser vendido: ");
                        String productName = scanner.nextLine();

                        System.out.print("Quantidade a ser vendida: ");
                        int productQuantity = scanner.nextInt();

                        inventory.sellProduct(productName, productQuantity);

                        System.out.print("Deseja vender outro produto? Digite \"1\" para \"SIM\" ou \"2\" para \"NÃO\": ");
                        option = scanner.nextInt();

                        scanner.nextLine();

                        if (option == 1) {
                            continue;
                        }

                        break;
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.print("Digite o nome do produto que deseja buscar no estoque: ");
                        String productName = scanner.nextLine();

                        inventory.searchProductByName(productName);

                        System.out.print("Deseja buscar por outro produto? Digite \"1\" para \"SIM\" ou \"2\" para \"NÃO\": ");
                        option = scanner.nextInt();

                        scanner.nextLine();

                        if (option == 1) {
                            continue;
                        }

                        break;
                    }
                }
                case 4 -> {
                    inventory.listProducts();
                }
                case 5 -> inventory.generateReport();
                case 6 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
