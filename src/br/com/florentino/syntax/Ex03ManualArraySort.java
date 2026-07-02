package br.com.florentino.syntax;

import java.util.Scanner;

// Ordene um array de inteiros em ordem crescente sem usar Arrays.sort().

public class Ex03ManualArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insira o valor do " + (i + 1) + "º valor da lista: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        System.out.println("Lista em ordem crescente:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        scanner.close();
    }
}
