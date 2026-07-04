package br.com.florentino.oop.ex08productlist;

/*
Reutilize a classe Product do exercício 01.
No Main, gerencie uma lista de produtos: adicione ao menos cinco, remova um por nome,
filtre e exiba apenas os produtos com preço abaixo de um valor informado pelo usuário,
e exiba a lista completa ordenada por nome.
*/

import br.com.florentino.oop.ex01productclass.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos que você quer adicionar à lista: ");
        int productsQuantity = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < productsQuantity; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Preço do produto " + (i + 1) + ": ");
            double price = scanner.nextDouble();

            System.out.print("Quantidade do produto " + (i + 1) + ": ");
            int quantity = scanner.nextInt();

            scanner.nextLine();

            products.add(new Product(name, price, quantity));
        }

        System.out.println("--- Lista de Produtos ---");
        int index = 1;
        for (Product product : products) {
            System.out.println(index++ + ". " + product.getName());
        }

        System.out.print("Indique o índice do produto que você quer remover: ");
        int idToRemove = scanner.nextInt();

        if (idToRemove >= 1 && idToRemove <= products.size()) {
            products.remove(idToRemove - 1);

            System.out.println("--- Lista de Produtos Atualizada ---");
            index = 1;
            for (Product product : products) {
                System.out.println(index++ + ". " + product.getName());
            }
        } else {
            System.out.println("Índice inválido.");
        }

        System.out.print("Informe o valor para filtrar a lista de produtos: ");
        double valueToFilter = scanner.nextDouble();

        System.out.println("--- Lista de Produtos Filtrada ---");
        for (Product product : products) {
            if (product.getPrice() < valueToFilter) {
                System.out.println(product.getName() + " – Preço: R$" + decimalFormat.format(product.getPrice()));
            }
        }

        products.sort(Comparator.comparing(Product::getName));

        System.out.println("--- Lista de Produtos Ordenada por Nome ---");
        index = 1;
        for (Product product : products) {
            System.out.println(index++ + ". " + product.getName());
        }

        scanner.close();
    }
}
