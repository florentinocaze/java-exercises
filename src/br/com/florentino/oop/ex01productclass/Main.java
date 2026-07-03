package br.com.florentino.oop.ex01productclass;

/*
Crie a classe Product com atributos nome, preço e quantidade.
Implemente métodos para aplicar desconto ao preço e calcular o valor total em estoque.
No Main, instancie ao menos dois produtos e demonstre o uso dos métodos.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do primeiro produto: ");
        String name01 = scanner.nextLine();

        System.out.print("Insira o preço do primeiro produto: ");
        double price01 = scanner.nextDouble();

        System.out.print("Insira a quantidade do primeiro produto: ");
        int quantity01 = scanner.nextInt();

        System.out.print("Insira o desconto do primeiro produto: ");
        double discount01 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Insira o nome do segundo produto: ");
        String name02 = scanner.nextLine();

        System.out.print("Insira o preço do segundo produto: ");
        double price02 = scanner.nextDouble();

        System.out.print("Insira a quantidade do segundo produto: ");
        int quantity02 = scanner.nextInt();

        System.out.print("Insira o desconto do segundo produto: ");
        double discount02 = scanner.nextDouble();

        Product product01 = new Product(name01, price01, quantity01, discount01);
        Product product02 = new Product(name02, price02, quantity02, discount02);

        System.out.println(product01.getName() + ":");
        System.out.println("Preço final com desconto: R$" + decimalFormat.format(product01.applyDiscount()));
        System.out.println("Valor total em estoque: R$" + decimalFormat.format(product01.calculateTotalStockValue()));

        System.out.println(product02.getName() + ":");
        System.out.println("Preço final com desconto: R$" + decimalFormat.format(product02.applyDiscount()));
        System.out.println("Valor total em estoque: R$" + decimalFormat.format(product02.calculateTotalStockValue()));

        scanner.close();
    }
}
