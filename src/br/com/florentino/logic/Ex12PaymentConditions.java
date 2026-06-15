package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia o valor de um produto e o modo de pagamento. Calcule o valor final.
 */

public class Ex12PaymentConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o valor do produto que você quer comprar: ");
        double price = scanner.nextDouble();

        System.out.println("--- Métodos de pagamento disponíveis ---");
        System.out.println("1 – À vista em dinheiro ou PIX (15% de desconto);");
        System.out.println("2 – À vista no cartão de crédito (10% de desconto);");
        System.out.println("3 – Parcelado no cartão em 2x (sem juros);");
        System.out.println("4 – Parcelado no cartão em 3x ou mais (juros de 10%).");
        System.out.print("Escolha o método de pagamento: ");

        int paymentMethod = scanner.nextInt();

        switch (paymentMethod) {
            case 1 -> System.out.println("O preço final do produto é R$" + df.format(price - (price * 0.15)) + ".");
            case 2 -> System.out.println("O preço final do produto é R$" + df.format(price - (price * 0.10)) + ".");
            case 3 -> System.out.println("O preço final do produto é R$" + df.format(price) + ".");
            case 4 -> System.out.println("O preço final do produto é R$" + df.format(price + (price * 0.10)) + ".");
        }

        scanner.close();
    }
}
