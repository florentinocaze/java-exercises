package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia um inteiro. Imprima seu antecessor e seu sucessor.
 */

public class Ex04PredecessorSuccessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int A = scanner.nextInt();

        int pred = A - 1;
        int succ = A + 1;

        System.out.println("O antecessor de " + A + " é " + pred + ", enquanto o sucessor é " + succ + ".");

        scanner.close();
    }
}
