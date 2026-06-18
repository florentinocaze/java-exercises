package br.com.florentino.logic;

import java.util.Scanner;

// Leia dois booleanos e determine se ambos são verdadeiros ou falsos.

public class Ex07LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira V ou F para comparar com o segundo valor: ");
        char A = scanner.next().charAt(0);

        System.out.print("Insira V ou F para comparar com o primeiro valor: ");
        char B = scanner.next().charAt(0);

        if (A == 'V' && A == B) {
            System.out.println("Ambos os valores são verdadeiros.");
        } else if (A == 'F' && A == B ) {
            System.out.println("Ambos os valores são falsos.");
        } else {
            System.out.println("Os valores são diferentes.");
        }

        scanner.close();
    }
}
