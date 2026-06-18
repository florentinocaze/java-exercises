package br.com.florentino.logic;

import java.util.Scanner;

// Leia A, B, C. Mostre a soma de A+B e se é menor que C.

public class Ex01SumAndComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Insira o valor de C: ");
        int C = scanner.nextInt();

        int sum = A + B;
        System.out.println("A soma de A e B é " + sum + ".");

        if (sum > C) {
            System.out.println(sum + " é maior que C.");
        } else {
            System.out.println(sum + " é menor que C.");
        }

        scanner.close();
    }
}
