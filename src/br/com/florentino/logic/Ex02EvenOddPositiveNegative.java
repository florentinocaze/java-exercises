package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia um número. Mostre se é par/ímpar e positivo/negativo.
 */

public class Ex02EvenOddPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = scanner.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " é positivo e par.");
            } else {
                System.out.println(num + " é positivo e ímpar.");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " é negativo e par.");
            } else {
                System.out.println(num + " é negativo e ímpar.");
            }
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
