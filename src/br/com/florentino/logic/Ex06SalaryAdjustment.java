package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia um valor e imprima com reajuste de 5%.
 */

public class Ex06SalaryAdjustment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o valor do seu salário: ");
        double salary = scanner.nextInt();

        double adjustedSalary = salary + (salary * 0.05);

        System.out.println("Seu salário, com ajustes, equivale a R$" + df.format(adjustedSalary) + ".");

        scanner.close();
    }
}
