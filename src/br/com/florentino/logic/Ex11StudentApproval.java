package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia quatro notas, calcule a média e mostre se o aluno foi aprovado.
 */

public class Ex11StudentApproval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int i = 0;
        double average = 0;

        while (i < 4) {
            System.out.print("Insira sua nota " + (i + 1) + ": ");
            double grade = scanner.nextDouble();

            average += grade;

            i++;
        }

        average /= 4;

        if (average >= 7) {
            System.out.println("Aluno aprovado com média " + df.format(average) + ".");
        }
        else {
            System.out.println("Aluno reprovado com média " + df.format(average) + ".");
        }
    }
}
