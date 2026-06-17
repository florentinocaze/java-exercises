package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia três lados. Valide o triângulo e determine seu tipo.
 */

public class Ex16TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do lado A do triângulo: ");
        double sideA = scanner.nextDouble();
        System.out.print("Insira o valor do lado B do triângulo: ");
        double sideB = scanner.nextDouble();
        System.out.print("Insira o valor do lado C do triângulo: ");
        double sideC = scanner.nextDouble();

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Os lados informados não formam um triângulo.");
        } else if (sideA == sideB && sideB == sideC) {
            System.out.println("O triângulo é equilátero.");
        } else if (sideA != sideB && sideA != sideC && sideB != sideC) {
            System.out.println("O triângulo é escaleno.");
        } else {
            System.out.println("O triângulo é isósceles.");
        }

        scanner.close();
    }
}
