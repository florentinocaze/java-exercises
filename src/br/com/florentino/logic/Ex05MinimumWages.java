package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia o salário do usuário. Calcule quantos salários mínimos representa.
 */

public class Ex05MinimumWages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o valor do seu salário: ");
        double wage = scanner.nextDouble();

        double minWage = 1621.00;

        double wagesAmount = wage / minWage;

        System.out.println("Você ganha " + df.format(wagesAmount) + " salários mínimos.");
    }
}
