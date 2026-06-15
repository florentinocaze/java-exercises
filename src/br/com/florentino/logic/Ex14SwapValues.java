package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Troque os valores de A e B sem usar variável auxiliar.
 */

public class Ex14SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("Após a inversão, o valor de A é " + A + " e o de B é " + B + ".");

        scanner.close();
    }
}
