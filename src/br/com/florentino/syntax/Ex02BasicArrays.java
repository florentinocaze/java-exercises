package br.com.florentino.syntax;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Preencha um array de 10 inteiros, encontre o maior, menor e calcule a média.
 */

public class Ex02BasicArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int[] numbers = new int[10];

        System.out.print("Insira o número 1 da lista: ");
        numbers[0] = scanner.nextInt();

        int max = numbers[0];
        int min = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < 10; i++) {
            System.out.print("Insira o número " + (i + 1) + " da lista: ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }

            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Maior número: " + max + ";");
        System.out.println("Menor número: " + min + ";");
        System.out.println("Média: " + df.format(average) + ".");

        scanner.close();
    }
}
