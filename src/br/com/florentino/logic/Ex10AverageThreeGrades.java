package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia três notas e imprima a média.
 */

public class Ex10AverageThreeGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira sua primeira nota: ");
        double grade01 = scanner.nextDouble();
        System.out.print("Insira sua segunda nota: ");
        double grade02 = scanner.nextDouble();
        System.out.print("Insira sua terceira nota: ");
        double grade03 = scanner.nextDouble();

        double average = (grade01 + grade02 + grade03) / 3;

        System.out.println("A média das suas três notas é " + df.format(average) + ".");
    }
}
