package br.com.florentino.logic;

import java.util.Scanner;

// Leia três inteiros e imprima em ordem decrescente.

public class Ex08DescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intList = new int[3];

        System.out.print("Insira o primeiro valor: ");
        intList[0] = scanner.nextInt();
        System.out.print("Insira o segundo valor: ");
        intList[1] = scanner.nextInt();
        System.out.print("Insira o terceiro valor: ");
        intList[2] = scanner.nextInt();

        for (int i = 0; i < intList.length - 1; i++) {
            for (int j = 0; j < intList.length - 1 - i; j++) {

                if (intList[j] < intList[j + 1]) {
                    int holdValue = intList[j];
                    intList[j] = intList[j + 1];
                    intList[j + 1] = holdValue;
                }
            }
        }

        System.out.println("Ordem decrescente:");
        for (int item : intList) {
            System.out.print(item + " ");
        }

        scanner.close();
    }
}
