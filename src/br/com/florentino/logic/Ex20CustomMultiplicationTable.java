package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia um número e imprima sua tabuada.
 */

public class Ex20CustomMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número para imprimir a tabuada dele: ");
        int number = scanner.nextInt();

        System.out.println("Tabuada do " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
