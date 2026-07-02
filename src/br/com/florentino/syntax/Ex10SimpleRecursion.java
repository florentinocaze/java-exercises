package br.com.florentino.syntax;

import java.util.Scanner;

// Calcule fatorial e Fibonacci de forma recursiva.

public class Ex10SimpleRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
            scanner.close();
            return;
        }

        System.out.print("Sequência de Fibonacci de " + number + ": ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println("Fatorial de " + number + ": " + factorial(number));

        scanner.close();
    }

    private static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    private static long fibonacci(int number) {
        if (number < 2) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
