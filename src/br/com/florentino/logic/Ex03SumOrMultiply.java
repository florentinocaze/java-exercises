package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia A e B. Se iguais, some; caso contrário, multiplique. Imprima C.
 */

public class Ex03SumOrMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        if (A == B) {
            int sum = A + B;
            System.out.println("A soma de A e B é " + sum + ".");
        } else {
            int mult = A * B;
            System.out.println("O produto de A e B é " + mult + ".");
        }
    }
}
