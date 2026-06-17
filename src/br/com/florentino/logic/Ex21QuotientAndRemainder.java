package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia A e B. Imprima o quociente e o resto da divisão inteira.
 */

public class Ex21QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        int quotient = A / B;
        int remainder = A % B;

        System.out.println("A divisão de A e B é " + quotient + ", com resto da divisão equivalente a " + remainder + ".");

        scanner.close();
    }
}
